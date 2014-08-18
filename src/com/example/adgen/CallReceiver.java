package com.example.adgen;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CallReceiver extends BroadcastReceiver {
	
	@Override
	public void onReceive(final Context context, final Intent intent) {
	      //Write intent for yout page
		
		
		Toast.makeText(context, "Ringing", Toast.LENGTH_LONG);
		System.out.println("Ringing");
		
	  }
	
}
