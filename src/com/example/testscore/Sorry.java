/*package com.example.testscore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class Sorry extends Activity {
	
	private Button Restart;
	private TextView Sorry;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sorry);	
		Restart = (Button) findViewById(R.id.Restart);
		
		Sorry = (TextView) findViewById(R.id.sorry2);
		
		//String s2= i.getExtras().getString("Sorry");
		//Sorry.setText(s2);
		
}
	public void start (View v){
		Intent i = new Intent(this, MainActivity.class);
		finish();
	
	}
}*/