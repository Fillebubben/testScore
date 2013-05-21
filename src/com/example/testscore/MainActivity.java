
package com.example.testscore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity{
	private TextView T1, T2, T3, T4, T5, T6, T7, T8, T9, T10;
	private Button submit;
	private EditText scoreinput;
	private ArrayList<Person> scoreList;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		 scoreList = new ArrayList<Person>();// Skapa listan samt stoppa in lite folk
		 scoreList.add(new Person("Peter","Pan"));
		 scoreList.add(new Person("Peter","Pin"));
		 scoreList.add(new Person("Per","Gurka"));
		 scoreList.add(new Person("Per","Skal"));
		 scoreList.add(new Person("Per","oPål"));
		 scoreList.add(new Person("Per","Lärka"));
		 scoreList.add(new Person("Pelle","Erövrare"));
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
		updateScoreList(0);	//Uppdatera visning. Vad gör inparametern slängde dit en nolla
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if (R.id.testLars == item.getItemId()){
			Intent i = new Intent(this,TestActivityLars.class);
			startActivity(i);
			}
		return super.onOptionsItemSelected(item);
	}*/
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			// TODO Auto-generated method stub
		String s = data.getExtras().getString("hej");
		Log.i("filip", "hittar extras" + s );
		//Om man här vill lägga till en ny post i listan så här 
		Random r = new Random(); //Kör lite random så det kan bli olika poster
		int i = r.nextInt(100); //Ger ett random mellan 1 o 100;
		Person p = new Person("Per","A"+i);
		p.addPoints(i);
		scoreList.add(p);
		updateScoreList(0);
		//Sen kommer du vä även att behöva uppdatera score om det är samma spelare flera gånger.
	}
		
	
	//Döpte om denna metoden den är ju en update eller?
	public void updateScoreList(int Score){
		//€r det hŠr jag instansierar en ny person? Jag vill skapa honom/henne med hjŠlp av namnet frŒn NameInput och variabeln Score
		//scoreList.add(new Person(s).setPoints(Score));
		
		Collections.sort(scoreList);
		T1.setText("1. "+ scoreList.get(0).getFirstname()+ scoreList.get(0).getPoints());
		T2.setText("2. "+ scoreList.get(1).getFirstname()+ scoreList.get(1).getPoints());
		T3.setText("3. "+ scoreList.get(2).getFirstname()+ scoreList.get(2).getPoints());
		T4.setText("4. "+ scoreList.get(3).getFirstname()+ scoreList.get(3).getPoints());
		T5.setText("5. "+ scoreList.get(4).getFirstname()+ scoreList.get(4).getPoints());
		T6.setText("6. "+ scoreList.get(5).getFirstname()+ scoreList.get(5).getPoints());
		T7.setText("7. "+ scoreList.get(6).getFirstname()+ scoreList.get(6).getPoints());
		T8.setText("8. "+ scoreList.get(7).getFirstname()+ scoreList.get(7).getPoints());
		T9.setText("9. "+ scoreList.get(8).getFirstname()+ scoreList.get(8).getPoints());
		T10.setText("10. "+ scoreList.get(9).getFirstname()+ scoreList.get(9).getPoints());
		
	
		}

	public void submit(View v){
		try{ //Lite try catch här om man inte skriver ngt eller skriver fel
			int score=Integer.parseInt(scoreinput.getText().toString());
			updateScoreList(score); //Här måste du väl först leta upp vem det är som spelar så du kan uppdatera rätt person?
		}catch(Exception e){
			
		}	
	}

	    
	public void onClick(View v){
		Intent i = new Intent(this, NameInput.class);
		startActivityForResult(i, 0); //Det var fel metod denna gör att vi väntar på svar
	
	}

 }
