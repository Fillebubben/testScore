package com.example.testscore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Sorry extends Activity {
	private ImageButton Restart;

	private TextView Sorry;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sorry);	
		Restart = (ImageButton) findViewById(R.id.Restart);
		
		Sorry = (TextView) findViewById(R.id.firstTxt);
		
		//String s2= getIntent().getExtras().getString("Sorry");
		Sorry.setText("Sorry your score wasn't enough to get a place on our top 10. Would you like to try again?");
		
}
	public void start (View v){
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	
	}
}