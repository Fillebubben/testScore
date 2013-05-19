package com.example.testscore;
import java.util.ArrayList;
import java.util.Collection;
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
import android.widget.Toast;

public class MainActivity extends Activity{
	private TableRow första,andra,tredje,fjärde,femte,sjätte,sjunde,åttonde,nionde,tionde;
	private TextView T1, T2, T3, T4, T5, T6, T7, T8, T9, T10;
	private Button submit;
	private EditText scoreinput;
	private ArrayList<Person> scoreList;
	
	private String N1, N2, N3, N4, N5, N6,N7,N8,N9,N10, newName;
	//int HighScore= 100000;
	int Score =1000;
	int S1= 100;
	int S2= 90;
	int S3= 80;
	int S4= 70;
	int S5= 60;
	int S6= 50;
	int S7= 40;
	int S8= 30;
	int S9= 20;
	int S10= 10;
	//private static final int REQUEST_CODE = 10;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		 scoreList = new ArrayList<Person>();// Skapa listan samt stoppa in lite folk
		 scoreList.add(new Person("Peter","1"));
		 scoreList.add(new Person("Peter","2"));
		 scoreList.add(new Person("Per","3"));
		 scoreList.add(new Person("Per","4"));
		 scoreList.add(new Person("Per","5"));
		 scoreList.add(new Person("Per","6"));
		 scoreList.add(new Person("Pelle","7"));
		 scoreList.add(new Person("Perla","8"));
		 scoreList.add(new Person("Kalle", "9"));
		 scoreList.add(new Person("Perka", "10"));
	
		
		//Vill få min Int Score (som ändras baserat på vad jag skriver i min textview och klickar submit att läggas i en arraylist 
		 //så den istället för att ändra det översta värdet får de "gamla" att hoppa neråt
		 //Vill sedan få listan att "uppdateras" och gamla hoppar neråt istället för att raderas
		
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
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if (R.id.testLars == item.getItemId()){
			Intent i = new Intent(this,TestActivityLars.class);
			startActivity(i);
			}
		return super.onOptionsItemSelected(item);
	}
	@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
String s = data.getExtras().getString("hej");
Log.i("filip", "hittar extras" + s );
	}
	

	public void GameOver(int Score){
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
		
		if(Score >S1){
			S1= Score;
			N1=newName;
			T1.setText("1. " + N1+ " Poäng: "+  S1);
		}else{
			T1.setText("1. " + N1 + " Poäng: "+  S1);
		}
		
		if(Score <S1 && Score >S2){
			S2=Score;
			N2=newName;
			T2.setText("2. "+ N2+ " Poäng: "+ S2);
		}else{
			T2.setText("2. "+ N2+ " Poäng: "+ S2);
		}
		
		if(Score <S2 && Score >S3){
			S3=Score;
			N3=newName;
			T3.setText("3. "+ N3+ " Poäng: "+ S3);
		}else{
			T3.setText("3. "+ N3+ " Poäng: "+ S3);
		}
		
		if(Score <S3 && Score >S4){
			S4=Score;
			N4=newName;
			T4.setText("4. "+ N4+ " Poäng: "+  S4);
		}else{
			T4.setText("4. "+ N4+ " Poäng: "+  S4);
		}
		
		if(Score <S4 && Score >S5){
			S5=Score;
			N5=newName;
			T5.setText("5. "+ N5+" Poäng: "+  S5);
		}else{
			T5.setText("5. "+ N5+" Poäng: "+  S5);
		}
		
		if(Score <S5 && Score >S6){
			S6=Score;
			N6=newName;
			T6.setText("6. "+ N6+ " Poäng: "+ S6);	
		}else{
			T6.setText("6. "+ N6+ " Poäng: "+ S6);
		}
		
		if(Score <S6 && Score >S7){
			S7=Score;
			N7=newName;
			T7.setText("7. "+ N7+" Poäng: "+  S7);
		}else{
			T7.setText("7. "+ N7+" Poäng: "+  S7);
		}
		
		if(Score <S7 && Score >S8 ){
			S8=Score;
			N8=newName;
			T8.setText("8. "+ N8+" Poäng: "+  S8);
			}else{
				T8.setText("8. "+ N8+" Poäng: "+  S8);
			}
		
		if(Score <S8 && Score >S9){
			S9=Score;
			N9=newName;
			T9.setText("9. "+ N9+" Poäng: "+  S9);
		}else{
			T9.setText("9. "+ N9+" Poäng: "+  S9);
		}
		
		if(Score<S9 && Score >S10){
			S10=Score;
			N10=newName;
			T10.setText("10. "+ N10+ " Poäng: "+ S10);
		}else{
			T10.setText("10. "+ N10+ " Poäng: "+ S10);
		}	
	}
	
	public void submit(View v){	
		int score=Integer.parseInt(scoreinput.getText().toString());
		GameOver(score);
		
	}
	    
	public void onClick(View v){
		Intent i = new Intent(this, NameInput.class);
		startActivity(i);
	
	}

}
