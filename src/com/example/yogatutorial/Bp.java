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

public class Bp extends Activity{
	ArrayList<String> Bp_Asana = new ArrayList();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bp);
		bp_asanalistDisplay();
		final ListView dl = (ListView) findViewById(R.id.bp_asanalist);		
		dl.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			//@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"ItemClicked" , Toast.LENGTH_SHORT).show();
				Log.d("AsanaList","On Set ItemStarted");
				if (position == 0) {
		            Intent intent = new Intent(Bp.this,Suptavajrasana.class);
		            startActivity(intent);
		        } else if(position == 1){
		        	Intent intent = new Intent(Bp.this,Mandukasana.class);
		            startActivity(intent);
		        } else if(position == 2){
		        	Intent intent = new Intent(Bp.this,Shavasana.class);
		            startActivity(intent);
		        } 
		        else if(position == 3){
		        	Intent intent = new Intent(Bp.this,Shashankasana.class);
		            startActivity(intent);
		        } 
			
		}
		});
		}
		
	
	public void bp_asanalistDisplay()
	{
		Bp_Asana.add("Supta Vajrasana");
		Bp_Asana.add("Mandukasana");
		Bp_Asana.add("Shavasana");
		Bp_Asana.add("Shashankasana");
		
		
		
		ListView aal = (ListView) findViewById(R.id.bp_asanalist);
		if (!Bp_Asana.isEmpty())
		{
			ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Bp_Asana);
			aal.setAdapter(arrayAdapter);
		}
	}

	
}
