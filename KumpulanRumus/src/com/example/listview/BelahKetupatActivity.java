package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BelahKetupatActivity extends Activity {

	EditText editSisi, editDiagonal1, editDiagonal2;
	TextView textKeliling;
	TextView textLuas;
	Button tombolKeliling;
	Button tombolLuas;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.belah_ketupat);
		
		editSisi = (EditText) findViewById(R.id.editTextSisi);
		editDiagonal1 = (EditText) findViewById(R.id.editTextDiagonal1);
		editDiagonal2 = (EditText) findViewById(R.id.editTextDiagonal2);
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
				
				double keliling = 4 * sisi ;
				
				textKeliling.setText("Keliling = " + 
				                     String.valueOf(keliling)); 
			}
		});
		
		tombolLuas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double diagonal1 = Double.parseDouble(
						editDiagonal1.getText().toString());
				double diagonal2 = Double.parseDouble(
						editDiagonal2.getText().toString());;
				
				double Luas = 0.5 * diagonal1 * diagonal2;
				
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
