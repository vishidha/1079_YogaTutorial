package com.example.yogatutorial;







import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class YogaHome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yoga_home);
		Button infoButton=(Button)findViewById(R.id.yasan);
        infoButton.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View v)
        	{
        		//TODO Auto-generated method stub
        		Intent intent=new Intent(YogaHome.this,AsanaList.class);
        		startActivity(intent);
        		
        	}
        });
        Button diseaseButton=(Button)findViewById(R.id.ydisease);
        diseaseButton.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View v)
        	{
        		//TODO Auto-generated method stub
        		Intent intent=new Intent(YogaHome.this,DiseaseList.class);
        		startActivity(intent);
        		
        	}
        	
        });
        Button aboutyogaButton=(Button)findViewById(R.id.yinfo);
        aboutyogaButton.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View v)
        	{
        		//TODO Auto-generated method stub
        		Intent intent=new Intent(YogaHome.this,AboutYoga.class);
        		startActivity(intent);
        		
        	}
        	
        });
        
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		MenuInflater blowup= getMenuInflater();
		
		blowup.inflate(R.menu.cool_menu, menu);
		
		
		return true;
	}
	
public boolean onOptionsItemSelected(MenuItem item) {// delete the return stmt// now we refer to which Menuitem is selected.. or prvide id of tht item
		
		switch (item.getItemId()) {// this method takes menuitem,,so we need to define the id about whiich item is clicked
		case R.id.aboutus:
			Intent i = new Intent("com.example.yogatutorial.ABOUT" );
			startActivity(i);
			// now do i get the theme going..we need to define tht in manifest...for dis open the manifest.. 
			//put  android:theme="@android:style/Theme.Dialog" under the Aboutus activity...@android means we r referncing to the android sdk
			// next is setting up the prefernces...open the cool-menu.xml..add the item as exit..n thn create a folder xml..n create prefs.xml
			break;

		case R.id.preferenes:
			Intent p = new Intent("com.example.yogatutorial.PREFS" );// it will open the prefs.java activity
			startActivity(p);
			
			break;
		case R.id.exit:
			finish();// it finishes the app..bcoz at this time..only menu class will be running..since our splash activity finish..
			          //n every time we hit back..those activities finishes as well..so we just want to close the app..RUN THE APP
			
			break;
		}
		return false;// since we r not returning any data// give no input back
	}// next is text activity with 
	
	
	
	
	
	
	

}
