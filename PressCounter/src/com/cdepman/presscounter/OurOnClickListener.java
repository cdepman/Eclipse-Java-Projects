package com.cdepman.presscounter;

import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener {
	
	MainActivity caller;
	boolean increment = true;
	Counter counter;
	
	public OurOnClickListener(MainActivity activity, boolean incrementer, Counter counter){
		this.caller = activity;
		this.increment = incrementer;
		this.counter = counter;
	}
	
	public void onClick(View view){
		if (this.increment){
			this.counter.increment();
		} else {
			this.counter.decrement();
		}
		caller.counterView.setText(this.counter.getCount());
	}

}
