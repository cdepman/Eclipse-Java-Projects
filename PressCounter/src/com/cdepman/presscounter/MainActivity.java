package com.cdepman.presscounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView counterView;
	Counter counter;
	Button resetCount;
	Button incrementRepeat;
	Button decrementRepeat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		counter = new Counter();
		System.out.println(counter.getCount());
		
		resetCount = (Button) findViewById(R.id.button3);
		resetCount.setOnClickListener((new ResetCount(this, counter)));
		
		incrementRepeat = (Button) findViewById(R.id.button1);
		incrementRepeat.setOnTouchListener(new AutoRepeatButton(400, 30, new OnClickListener() {
			  @Override
			  public void onClick(View view) {
			    counter.increment();
			    counterView.setText(counter.getCount());
			  }
			}));
		
		decrementRepeat = (Button) findViewById(R.id.button2);
		decrementRepeat.setOnTouchListener(new AutoRepeatButton(400, 30, new OnClickListener() {
			  @Override
			  public void onClick(View view) {
			    counter.decrement();
			    counterView.setText(counter.getCount());
			  }
			}));
		
		counterView = (TextView) findViewById(R.id.textView1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast msg = Toast.makeText(this, "Button Pressed", Toast.LENGTH_LONG);
			msg.show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
