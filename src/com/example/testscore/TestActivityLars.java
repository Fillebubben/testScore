package com.example.testscore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TestActivityLars extends Activity {

	private ArrayList<Person> scoreList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_activity_lars);
		 scoreList = new ArrayList<Person>();// Skapa listan samt stoppa in lite folk
		 scoreList.add(new Person("Peter","1"));
		 scoreList.add(new Person("Peter","2"));
		 scoreList.add(new Person("Per","3"));
		 scoreList.add(new Person("Per","4"));
		 scoreList.add(new Person("Per","5"));
		 scoreList.add(new Person("Per","6"));
		 scoreList.add(new Person("Pelle","7"));
		 scoreList.add(new Person("Perla","8"));
		 //Du bör sen ha dina personer i enlista som i en av labbarna som du kan titta på
		 //Jag visar lite här hur man kan lägga till score samt sortera 
		 Random r = new Random();
		 for (Person p : scoreList) { //LÄgg till lite random score
			 int i = r.nextInt(100);
			 p.addPoints(i);
		 }
		 Collections.sort(scoreList);
		 drawInTextView();
	}

	private void drawInTextView() {
		TextView tv = (TextView) findViewById(R.id.testField);
		String s=""; 
		for (Person p : scoreList) { //LÄgg till lite random score
			 if(p != null){
				 s=s+p.toString()+"\n";
			 }
		 }
		tv.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test_activity_lars, menu);
		return true;
	}
	
	public void clickattt(View v){
		Random r = new Random();
		 for (Person p : scoreList) { //Lägg till lite random score
			 int i = r.nextInt(100);
			 p.addPoints(i);
		 }
		 Collections.sort(scoreList);
		 drawInTextView();
	}

}
