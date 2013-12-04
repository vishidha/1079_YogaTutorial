package com.example.yogatutorial;

import android.app.Activity;
import android.os.Bundle;
// now go to manifest to set new activity..n also copy the intent filter..it should be default.
//setup the name which we will use in making the intent//now we need to set up all dis stuff in menu class..when the about us item is selected
//open the menu class..go to switch case
public class AboutUs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
	}
	
	
	

}
