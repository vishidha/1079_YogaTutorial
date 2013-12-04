package com.example.yogatutorial;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class splash extends Activity {
	
	MediaPlayer oursong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash); 
		oursong= MediaPlayer.create(splash.this, R.raw.titanic_piano);
		
		
		SharedPreferences getprefs= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean music= getprefs.getBoolean("checkbox", true);
		
		if(music==true)
		oursong.start();
		
		Thread timer= new Thread(){
		public void run(){
			try {  
				sleep(8000); 
				
			} catch(InterruptedException e){
				e.printStackTrace();
				 
			}finally{ 
			
				Intent openstartingpiont= new Intent(splash.this, YogaHome.class);
				startActivity(openstartingpiont);
		
			}
			}
			
			
		}; 
		timer.start(); 
	}
	
	
	
	
	
	
	
	
	
	@Override
	protected void onPause() {
		super.onPause();
		finish();// to kill or destroy the splash activity
		oursong.release();
	}

}
