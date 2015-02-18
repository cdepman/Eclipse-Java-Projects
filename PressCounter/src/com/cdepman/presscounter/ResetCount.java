package com.cdepman.presscounter;

import android.view.View;
import android.view.View.OnClickListener;

public class ResetCount implements OnClickListener {
	MainActivity caller;
	Counter counter;
	
	public ResetCount(MainActivity activity, Counter counter){
		this.counter = counter;
		this.caller = activity;
	}
	
	public void onClick(View view){
		this.counter.reset();
		caller.counterView.setText("" + this.counter.getCount());
	}
}
