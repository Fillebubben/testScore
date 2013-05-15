package com.example.testscore;





import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
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
	private ArrayList<Integer> scoreList;
	int HighScore= 100000;
	//int Score =1000;
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
		 scoreList = new ArrayList<Integer>();
		 //Vill få min Int Score (som ändras baserat på vad jag skriver i min textview och klickar submit att läggas i en arraylist 
		 //så den istället för att ändra det översta värdet får de "gamla" att hoppa neråt
		 //Vill sedan få listan att "uppdateras" och gamla hoppar neråt istället för att raderas
		 
		/*första = (TableRow)  findViewById(R.id.tableRow1);
		andra = (TableRow)  findViewById(R.id.tableRow2);
		tredje = (TableRow)  findViewById(R.id.tableRow3);
		fjärde = (TableRow)  findViewById(R.id.tableRow4);
		femte = (TableRow)  findViewById(R.id.tableRow5);
		sjätte = (TableRow)  findViewById(R.id.tableRow6);
		sjunde = (TableRow)  findViewById(R.id.tableRow7);
		åttonde = (TableRow)  findViewById(R.id.tableRow8);
		nionde= (TableRow)  findViewById(R.id.tableRow9);
		tionde = (TableRow)  findViewById(R.id.tableRow10);*/
		
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
public void GameOver(int Score){
		T1.setText("1. "+ "Ditt namn "+ S1);
		T2.setText("2. "+ "Ditt namn "+ S2);
		T3.setText("3. "+ "Ditt namn "+ S3);
		T4.setText("4. "+ "Ditt namn "+ S4);
		T5.setText("5. "+ "Ditt namn "+ S5);
		T6.setText("6. "+ "Ditt namn "+ S6);
		T7.setText("7. "+ "Ditt namn "+ S7);
		T8.setText("8. "+ "Ditt namn "+ S8);
		T9.setText("9. "+ "Ditt namn "+ S9);
		T10.setText("10. "+ "Ditt namn "+ S10);
		
		if(Score >S1){
			S1= Score;
			T1.setText("1. " + "Ditt namn "+ " Poäng: "+  S1);
		}else{
			T1.setText("1. " + "Ditt namn "+ " Poäng: "+  S1);
		}
		
		if(Score <S1 && Score >S2){
			S2=Score;
			T2.setText("2. "+ "Ditt namn "+ " Poäng: "+ S2);
		}else{
			T2.setText("2. "+ "Ditt namn "+ " Poäng: "+ S2);
		}
		
		if(Score <S2 && Score >S3){
			S3=Score;
			T3.setText("3. "+ "Ditt namn "+ " Poäng: "+ S3);
		}else{
			T3.setText("3. "+ "Ditt namn "+ " Poäng: "+ S3);
		}
		
		if(Score <S3 && Score >S4){
			S4=Score;
			T4.setText("4. "+ "Ditt namn "+ " Poäng: "+  S4);
		}else{
			T4.setText("4. "+ "Ditt namn "+ " Poäng: "+  S4);
		}
		
		if(Score <S4 && Score >S5){
			S5=Score;
			T5.setText("5. "+ "Ditt namn "+" Poäng: "+  S5);
		}else{
			T5.setText("5. "+ "Ditt namn "+" Poäng: "+  S5);
		}
		
		if(Score <S5 && Score >S6){
			S6=Score;
			T6.setText("6. "+ "Ditt namn "+ " Poäng: "+ S6);	
		}else{
			T6.setText("6. "+ "Ditt namn "+ " Poäng: "+ S6);
		}
		
		if(Score <S6 && Score >S7){
			S7=Score;
			T7.setText("7. "+ "Ditt namn "+" Poäng: "+  S7);
		}else{
			T7.setText("7. "+ "Ditt namn "+" Poäng: "+  S7);
		}
		
		if(Score <S7 && Score >S8 ){
			S8=Score;
			T8.setText("8. "+ "Ditt namn "+" Poäng: "+  S8);
			}else{
				T8.setText("8. "+ "Ditt namn "+" Poäng: "+  S8);
			}
		
		if(Score <S8 && Score >S9){
			S9=Score;
			T9.setText("9. "+ "Ditt namn "+" Poäng: "+  S9);
		}else{
			T9.setText("9. "+ "Ditt namn "+" Poäng: "+  S9);
		}
		
		if(Score<S9 && Score >S10){
			S10=Score;
			T10.setText("10. "+ "Ditt namn "+ " Poäng: "+ S10);
		}else{
			T10.setText("10. "+ "Ditt namn "+ " Poäng: "+ S10);
		}	
	}
	
	public void submit(View v){
		// HEJ Lars
		// HJÅLP!!! VILL FÅ KNAPPEN ATT TA FRÅN EDIT TEXT OCH LÄGGA TILL MIN SCORE INT
		
		int score=Integer.parseInt(scoreinput.getText().toString());
		GameOver(score);
	}
	    
	public void onClick(View v){
		Intent i = new Intent(this, NameInput.class);
		startActivity(i);
		//startActivityForResult(i, REQUEST_CODE);
	}
	
	/* @Override
	  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
	      if (data.hasExtra("returnKey1")) {
	        Toast.makeText(this, data.getExtras().getString("returnKey1"),
	            Toast.LENGTH_SHORT).show();
	      }
	    }
	  }*/

}
