package com.shinetech.robotium;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Button example01Button = (Button) findViewById(R.id.example_01_button);
		example01Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((TextView) findViewById(R.id.example_01_text_view)).setText(R.string.after_click);
			}
		});
		
		final TextView example02TextView = (TextView)findViewById(R.id.example_02_text_view);
		example02TextView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				example02TextView.setText(R.string.touch_received);
			}
		});

	}
}
