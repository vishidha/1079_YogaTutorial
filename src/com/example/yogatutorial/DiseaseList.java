package com.example.yogatutorial;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DiseaseList extends Activity{
	ArrayList<String> Disease = new ArrayList();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disease);
		dlistDisplay();
		final ListView dl = (ListView) findViewById(R.id.dlist);		
		dl.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			//@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"ItemClicked" , Toast.LENGTH_SHORT).show();
				Log.d("AsanaList","On Set ItemStarted");
				if (position == 0) {
		            Intent intent = new Intent(DiseaseList.this,Asthma.class);
		            startActivity(intent);
		        } else if(position == 1){
		        	Intent intent = new Intent(DiseaseList.this,Bp.class);
		            startActivity(intent);
		        } else if(position == 2){
		        	Intent intent = new Intent(DiseaseList.this,Cancer.class);
		            startActivity(intent);
		        } else if(position == 3){
		        	Intent intent = new Intent(DiseaseList.this,Cervical.class);
		            startActivity(intent);
		        } else if(position == 4){
		        	Intent intent = new Intent(DiseaseList.this,Diabetes.class);
		            startActivity(intent);
		        } else if(position == 5){
		        	Intent intent = new Intent(DiseaseList.this,Obesity.class);
		            startActivity(intent);
		        } else if(position == 6){
		        	Intent intent = new Intent(DiseaseList.this,Hernia.class);
		            startActivity(intent);
		        }
			
		}
		});
		}
	
	public void dlistDisplay()
	{
		Disease.add("ASTHMA");
		Disease.add("BLOOD PRESSURE");
		Disease.add("CANCER");
		Disease.add("CERVICAL");
		Disease.add("DIABETES");
		Disease.add("OBESITY");
		Disease.add("HERNIA");
		
		ListView dl = (ListView) findViewById(R.id.dlist);
		if (!Disease.isEmpty())
		{
			ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Disease);
			dl.setAdapter(arrayAdapter);
		}
	}
}

	