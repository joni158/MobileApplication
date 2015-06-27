package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends Activity {

	EditText editSisi;
	TextView textKeliling;
	TextView textLuas;
	Button tombolKeliling;
	Button tombolLuas;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.persegi);
		
		editSisi = (EditText) findViewById(R.id.editTextSisi);
		textKeliling = (TextView) findViewById(R.id.textViewKeliling);
		textLuas = (TextView) findViewById(R.id.textViewLuas);
		tombolKeliling = (Button) findViewById(R.id.buttonKeliling);
		tombolLuas = (Button) findViewById(R.id.buttonLuas);
		
		tombolKeliling.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double sisi = Double.parseDouble(
						             editSisi.getText().toString());
				
				double keliling = 4 * sisi;
				
				textKeliling.setText("Keliling = " + 
				                     String.valueOf(keliling)); 
			}
		});
		
		tombolLuas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double sisi = Double.parseDouble(
						             editSisi.getText().toString());
				
				double Luas = sisi * sisi;
				
				textLuas.setText("Luas = " + 
				                     String.valueOf(Luas)); 
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
