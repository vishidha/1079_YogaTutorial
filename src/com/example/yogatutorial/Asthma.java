package com.example.yogatutorial;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Asthma extends Activity{
	ArrayList<String> Asthma_Asana = new ArrayList();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asthma);
		asthma_asanalistDisplay();
		final ListView dl = (ListView) findViewById(R.id.asthma_asanalist);		
		dl.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			//@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"ItemClicked" , Toast.LENGTH_SHORT).show();
				Log.d("AsanaList","On Set ItemStarted");
				if (position == 0) {
		            Intent intent = new Intent(Asthma.this,Halasana.class);
		            startActivity(intent);
		        } else if(position == 1){
		        	Intent intent = new Intent(Asthma.this,Suptavajrasana.class);
		            startActivity(intent);
		        } else if(position == 2){
		        	Intent intent = new Intent(Asthma.this,Ushtrasana.class);
		            startActivity(intent);
		        } 
			
		}
		});
		}
		
	
	public void asthma_asanalistDisplay()
	{
		Asthma_Asana.add("Halasana");
		Asthma_Asana.add("Supta Vajrasana");
		Asthma_Asana.add("Ushtrasana");
		
		
		ListView aal = (ListView) findViewById(R.id.asthma_asanalist);
		if (!Asthma_Asana.isEmpty())
		{
			ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Asthma_Asana);
			aal.setAdapter(arrayAdapter);
		}
	}

	
}
