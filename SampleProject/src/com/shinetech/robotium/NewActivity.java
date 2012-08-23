package com.shinetech.robotium;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NewActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);
		
		final TextView example04TextView = (TextView) findViewById(R.id.example_04_text_view);
		final EditText example04EditText = (EditText) findViewById(R.id.example_04_edit_text);
		final Button example04Button = (Button) findViewById(R.id.example_04_button);
		example04Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				example04TextView.setText(example04EditText.getText().toString());
			}
		});
		
		String extra = getIntent().getStringExtra("example05");
		if (extra != null) {
			((TextView) findViewById(R.id.example_05_text_view)).setText(extra); 
		}
	}
}
