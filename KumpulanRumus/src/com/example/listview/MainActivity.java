package com.example.listview;

import com.example.listview.PersegiPanjangActivity;
import com.example.listview.PersegiActivity;
import com.example.listview.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView textViewHeader;
    ListView listViewBangun;
    
    String[] daftarBangun = {
    	"Persegi", "Persegi Panjang", "Segitiga", "Jajar Genjang", 
    	"Trapesium", "Layang-layang", "Belah Ketupat" 
    };
        
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    listViewBangun = (ListView) findViewById(R.id.listViewBangun);
	    
	    // Mengatur isi ListView
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
	    		android.R.layout.simple_list_item_1, daftarBangun);
	    listViewBangun.setAdapter(adapter);
	    
	    // Mengontrol klik pada item di ListView
	    listViewBangun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	    	@Override
	    	public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
	    		if (position == 0)
	    		{
	    			Intent intent = new Intent(MainActivity.this, PersegiActivity.class);
	    			startActivity(intent);
	    		}
	    		else if (position == 1)
	    		{
	    			Intent intent = new Intent(MainActivity.this, PersegiPanjangActivity.class);
	    			startActivity(intent);
	    		}
	    		else if (position == 2)
	    		{
	    			Intent intent = new Intent(MainActivity.this, SegitigaActivity.class);
	    			startActivity(intent);
	    		}
	    		else if (position == 3)
	    		{
	    			Intent intent = new Intent(MainActivity.this, JajarGenjangActivity.class);
	    			startActivity(intent);
	    		}
	    		else if (position == 4)
	    		{
	    			Intent intent = new Intent(MainActivity.this, TrapesiumActivity.class);
	    			startActivity(intent);
	    		}
	    		else if (position == 5)
	    		{
	    			Intent intent = new Intent(MainActivity.this, LayangLayangActivity.class);
	    			startActivity(intent);
	    		}
	    		else if (position == 6)
	    		{
	    			Intent intent = new Intent(MainActivity.this, BelahKetupatActivity.class);
	    			startActivity(intent);
	    		}
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
