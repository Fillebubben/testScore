package com.example.testscore;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NameInput extends Activity {
	private Button Submit;
	private EditText inputName;
	private TextView score;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nameinput);
		Submit = (Button) findViewById(R.id.restart);
		inputName= (EditText)findViewById(R.id.editText1);
		inputName.setText(" ");
		score= (TextView) findViewById(R.id.sorry2);
		//F� in po�ngen p� n�got s�tt med put extras ist�llet f�r blablabla
		score.setText("Congratulations you scored:" +" blablabla" + " points. Enter your name below!");
		
		Submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String name =inputName.getText().toString();
				Intent data = new Intent();
				data.putExtra("name", name);
				setResult(Activity.RESULT_OK, data);
				finish();
			}
		});
	}
}
