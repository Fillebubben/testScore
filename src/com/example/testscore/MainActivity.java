
package com.example.testscore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
	private TextView T1, T2, T3, T4, T5, T6, T7, T8, T9, T10;
	private Button submit;
	private EditText scoreinput;
	private ArrayList<Person> scoreList;
    int Score=100;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		 scoreList = new ArrayList<Person>();// Skapa listan samt stoppa in lite folk
		 scoreList.add(new Person("Peter","Pan"));
		 scoreList.add(new Person("Peter","Pin"));
		 scoreList.add(new Person("Per","Gurka"));
		 scoreList.add(new Person("Per","Skal"));
		 scoreList.add(new Person("Per","oPÂl"));
		 scoreList.add(new Person("Per","L‰rka"));
		 scoreList.add(new Person("Pelle","Erˆvrare"));
		 scoreList.add(new Person("Perla","Po"));
		 scoreList.add(new Person("Kalle", "Av"));
		 scoreList.add(new Person("Perka", "Lerka"));
		
		T1= (TextView) findViewById(R.id.textView1);
		T2= (TextView) findViewById(R.id.textView2);
		T3= (TextView) findViewById(R.id.textView3);
		T4= (TextView) findViewById(R.id.textView4);
		T5= (TextView) findViewById(R.id.textView5);
		T6= (TextView) findViewById(R.id.textView6);
		T7= (TextView) findViewById(R.id.textView7);
		T8= (TextView) findViewById(R.id.textView8);
		T9= (TextView) findViewById(R.id.textView9);
		T10= (TextView) findViewById(R.id.textView10);
		scoreinput= (EditText) findViewById(R.id.editText1);
		submit= (Button) findViewById(R.id.button1);
		updateScoreList();	//Uppdatera visning.
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			// TODO Auto-generated method stub
		String s = data.getExtras().getString("name");
		Log.i("filip", "hittar extras" + " "+ s );
		//Om man h‰r vill l‰gga till en ny post i listan sÂ h‰r 
		//Random r = new Random(); //Kˆr lite random sÂ det kan bli olika poster
		//int i = r.nextInt(100); //Ger ett random mellan 1 o 100;
		int i = Score;
		if(Score >= scoreList.get(9).getPoints()){
		Person p = new Person(s, "A" +i);
		p.addPoints(i);
		scoreList.add(p);
		updateScoreList();
		}
	}
		
	
	//Uppdaterar listan och skriver ut namnen på de som "platsar"
	public void updateScoreList(){
		
		Collections.sort(scoreList);
		T1.setText("1. "+ scoreList.get(0).getFirstname()+ " Poäng: "+scoreList.get(0).getPoints());
		T2.setText("2. "+ scoreList.get(1).getFirstname()+ " Poäng: "+scoreList.get(1).getPoints());
		T3.setText("3. "+ scoreList.get(2).getFirstname()+ " Poäng: "+scoreList.get(2).getPoints());
		T4.setText("4. "+ scoreList.get(3).getFirstname()+ " Poäng: "+scoreList.get(3).getPoints());
		T5.setText("5. "+ scoreList.get(4).getFirstname()+ " Poäng: "+scoreList.get(4).getPoints());
		T6.setText("6. "+ scoreList.get(5).getFirstname()+ " Poäng: "+scoreList.get(5).getPoints());
		T7.setText("7. "+ scoreList.get(6).getFirstname()+ " Poäng: "+scoreList.get(6).getPoints());
		T8.setText("8. "+ scoreList.get(7).getFirstname()+ " Poäng: "+scoreList.get(7).getPoints());
		T9.setText("9. "+ scoreList.get(8).getFirstname()+ " Poäng: "+scoreList.get(8).getPoints());
		T10.setText("10. "+scoreList.get(9).getFirstname()+" Poäng: "+scoreList.get(9).getPoints());
		
	
		}
    
	public void onClick(View v){
		Intent i = new Intent(this, NameInput.class);
		startActivityForResult(i, 0); //Det var fel metod denna gˆr att vi v‰ntar pÂ svar
	
	}

 }
