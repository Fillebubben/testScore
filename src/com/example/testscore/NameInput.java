package com.example.testscore;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NameInput extends Activity {
	private Button Submit;
	private EditText inputName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nameinput);
		Submit = (Button) findViewById(R.id.button1);
		inputName= (EditText)findViewById(R.id.editText1);
		inputName.setText(" ");
		
		Submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String kuk =inputName.getText().toString();
				Intent i = new Intent(getBaseContext(), MainActivity.class);
				i.putExtra("kuk", kuk);
				startActivity(i);
			}
		});
	}
}
