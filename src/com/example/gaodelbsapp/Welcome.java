package com.example.gaodelbsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends Activity {
	private Button mShowButton;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.initialpaper);
		mShowButton = (Button)findViewById(R.id.showMapButton);
		mShowButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Welcome.this, MainActivity.class);
				startActivity(i);
				
			}
		});
	}
}
