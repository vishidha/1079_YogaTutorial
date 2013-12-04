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

public class Obesity extends Activity{
	ArrayList<String> Obesity_Asana = new ArrayList();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_obesity);
		obesity_asanalistDisplay();
		final ListView dl = (ListView) findViewById(R.id.obesity_asanalist);		
		dl.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			//@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"ItemClicked" , Toast.LENGTH_SHORT).show();
				Log.d("AsanaList","On Set ItemStarted");
				if (position == 0) {
		            Intent intent = new Intent(Obesity.this,Dhanurasana.class);
		            startActivity(intent);
		        } else if(position == 1){
		        	Intent intent = new Intent(Obesity.this,Halasana.class);
		            startActivity(intent);
		        } else if(position == 2){
		        	Intent intent = new Intent(Obesity.this,Paschimothanasana.class);
		            startActivity(intent);
		        } 
		        else if(position == 3){
		        	Intent intent = new Intent(Obesity.this,Pavanmuktasana.class);
		            startActivity(intent);
		        } 
		        else if(position == 4){
		        	Intent intent = new Intent(Obesity.this,Shalabhasana.class);
		            startActivity(intent);
		        } 
			
			
		}
		});
		}
		
	
	public void obesity_asanalistDisplay()
	{
		Obesity_Asana.add("Dhanurasana");
		Obesity_Asana.add("Halasana");
		Obesity_Asana.add("Paschimothanasana");
		Obesity_Asana.add("Pavanmuktasana");
		Obesity_Asana.add("Shalabhasana");
		
		
		ListView aal = (ListView) findViewById(R.id.obesity_asanalist);
		if (!Obesity_Asana.isEmpty())
		{
			ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Obesity_Asana);
			aal.setAdapter(arrayAdapter);
		}
	}

	
}
