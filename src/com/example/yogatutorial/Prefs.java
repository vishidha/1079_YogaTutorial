package com.example.yogatutorial;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Prefs extends PreferenceActivity {// we still have the access to the activity class

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);// instead of saying prefernce, we set our prefernces from the resourse.
		                                        //.it gonna accsess the prefs.xml...xml is the name of folder
		// noe we want to open dis activity...we go to the switch case under menu.java...under option selected method
	}
	
	

}
