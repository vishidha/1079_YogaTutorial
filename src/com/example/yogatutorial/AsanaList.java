package com.example.yogatutorial;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class AsanaList extends Activity{

	ArrayList<String> Asanas = new ArrayList<String>();
    String current=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_yoga_list);
		final EditText ed=(EditText)findViewById(R.id.myEditText);
		listDisplay();		
		
		final ListView al1 = (ListView) findViewById(R.id.listView1);		
		al1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			//@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"ItemClicked" , Toast.LENGTH_SHORT).show();
				Log.d("AsanaList","On Set ItemStarted");
		  current=(String)al1.getItemAtPosition(position);
		//current=
	     ed.setText(current);
			
		}
		});
		Button textButton=(Button)findViewById(R.id.text);
		Log.d("AsanaList","before click");
	    textButton.setOnClickListener(new View.OnClickListener()
	    {
	    	@Override
	    	public void onClick(View v)
	    	{
	    		//TODO Auto-generated method stub
	    		//Log.d("",ed.getText().toString()+"  "+Asanas.get(0).toString());
	    		if(current=="MANDUKASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Mandukasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="CHAKRASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Chakrasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="GARUDASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Garudasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="GOMUKHASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Gomukhasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SIDDHASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Siddhasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SARVANGASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Sarvangasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="BADDHA PADMASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,BaddhaPadmasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="BHUJANGASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Bhujangasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="DHANURASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Dhanurasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="HALASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Halasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MAKARASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Makarasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MATSYASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Matsyasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MAYURASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Mayurasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="PASCHIMOTHANASANA")
	    		{
	    			Intent intent=new Intent(AsanaList.this,Paschimothanasana.class);
	    			startActivity(intent);
	    		}
	    		
	    		if(current=="SHALABHASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Shalabhasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SHAVASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Shavasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="TADASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Tadasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SIRSASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Sirsasana.class);
	    			startActivity(intent);
	    		}
	    		if(current=="VAJRASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Vajrasana.class);
	    			startActivity(intent);
	    		}
	    	if(current=="KUKKUTASANA")
    		{
    			Intent intent=new Intent(AsanaList.this,Kukkutasana.class);
    			startActivity(intent);
    		}
	    	}
	    });
	    Button videoButton=(Button)findViewById(R.id.video);
	    videoButton.setOnClickListener(new View.OnClickListener()
	    {
	    	@Override
	    	public void onClick(View v)
	    	{
	    		//TODO Auto-generated method stub
	    		
	    		if(current=="SIDDHASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,SiddhasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		
	    		if(current=="BHUJANGASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,BhujangasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="BADDHA PADMASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,BaddhaPadmasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="CHAKRASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,chakrasanavideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="DHANURASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,DhanurasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="GARUDASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,GarudasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="GOMUKHASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Gomukhasanavideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="HALASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,HalasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="KUKKUTASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,KukkutasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MAKARASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,MakrasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MANDUKASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,MandukasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MAYURASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,MayurasnaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="MATSYASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,MatsyasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="PASCHIMOTHANASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,PaschimotthanasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SARVANGASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,Sarvangasanavideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SHALABHASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,ShalabhasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SIRSASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,SirsasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="SHAVASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,ShavasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="TADASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,TadasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		if(current=="VAJRASANA")
	    		{
	    			Log.d("AsanaList","after click");
	    			Intent intent=new Intent(AsanaList.this,VajrasanaVideo.class);
	    			startActivity(intent);
	    		}
	    		//Intent intent=new Intent(AsanaList.this,SiddhasanaVideo.class);
	    		//startActivity(intent);
	    	}
	    		
	    		
	    	
	    });
	}
	public void listDisplay()
	{
		Asanas.add("BADDHA PADMASANA");
		Asanas.add("BHUJANGASANA");
		Asanas.add("CHAKRASANA");
		Asanas.add("DHANURASANA");
		Asanas.add("GARUDASANA");
		Asanas.add("GOMUKHASANA");
		Asanas.add("HALASANA");
		Asanas.add("KUKKUTASANA");
		Asanas.add("MAKARASANA");
		Asanas.add("MANDUKASANA");
		Asanas.add("MATSYASANA");
		Asanas.add("MAYURASANA");
		Asanas.add("PASCHIMOTHANASANA");
		Asanas.add("SARVANGASANA");
		Asanas.add("SHALABHASANA");
		Asanas.add("SHAVASANA");
		Asanas.add("SIDDHASANA");
		Asanas.add("SIRSASANA");
		Asanas.add("TADASANA");
		Asanas.add("VAJRASANA");
		ListView al = (ListView) findViewById(R.id.listView1);
		if (!Asanas.isEmpty())
		{
			ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Asanas);
			al.setAdapter(arrayAdapter);
		}
	
	}
	
	

}	
	

