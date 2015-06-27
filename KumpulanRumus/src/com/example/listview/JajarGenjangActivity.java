package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjangActivity extends Activity {

	EditText editSisi1, editSisi2, editSisi3, editSisi4, editAlas, editTinggi;
	TextView textKeliling;
	TextView textLuas;
	Button tombolKeliling;
	Button tombolLuas;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jajar_genjang);
		
		editSisi1 = (EditText) findViewById(R.id.editTextSisi1);
		editSisi2 = (EditText) findViewById(R.id.editTextSisi2);
		editSisi3 = (EditText) findViewById(R.id.editTextSisi3);
		editSisi4 = (EditText) findViewById(R.id.editTextSisi4);
		editAlas = (EditText) findViewById(R.id.editTextAlas);
		editTinggi = (EditText) findViewById(R.id.editTextTinggi);
		textKeliling = (TextView) findViewById(R.id.textViewKeliling);
		textLuas = (TextView) findViewById(R.id.textViewLuas);
		tombolKeliling = (Button) findViewById(R.id.buttonKeliling);
		tombolLuas = (Button) findViewById(R.id.buttonLuas);
		
		tombolKeliling.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double sisi1 = Double.parseDouble(
						editSisi1.getText().toString());
				double sisi2 = Double.parseDouble(
						editSisi2.getText().toString());
				double sisi3 = Double.parseDouble(
						editSisi3.getText().toString());
				double sisi4 = Double.parseDouble(
						editSisi4.getText().toString());
				
				double keliling = sisi1 + sisi2 + sisi3 + sisi4;
				
				textKeliling.setText("Keliling = " + 
				                     String.valueOf(keliling)); 
			}
		});
		
		tombolLuas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double alas = Double.parseDouble(
						editAlas.getText().toString());
				double tinggi = Double.parseDouble(
						editTinggi.getText().toString());;
				
				double Luas = alas * tinggi;
				
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
