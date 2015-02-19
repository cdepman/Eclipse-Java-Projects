package com.cdepman.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	EditText operand1;
	EditText operand2;
	Button add;
	Button subtract;
	Button multiply;
	Button divide;
	TextView result;
	Button reset;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// set up text entry fields
		operand1 = (EditText) findViewById(R.id.editOperand1);
		operand2 = (EditText) findViewById(R.id.editOperand2);
		
		// associate buttons
		add = (Button) findViewById(R.id.btnAdd);
		subtract = (Button) findViewById(R.id.btnSubtract);
		multiply = (Button) findViewById(R.id.btnMultiply);
		divide = (Button) findViewById(R.id.btnDivide);
		reset = (Button) findViewById(R.id.btnReset);
		
		// associate output field
		result = (TextView) findViewById(R.id.textResult);
		
		
		// set up click listeners
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				float sum = oper1 + oper2;
				result.setText(Float.toString(sum));
			}
		});
		
		subtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				float difference = oper1 - oper2;
				result.setText(Float.toString(difference));
			}
		});
		
		multiply.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				float product = oper1 * oper2;
				result.setText(Float.toString(product));
			}
		});
		
		divide.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float oper1 = Float.parseFloat(operand1.getText().toString());
				float oper2 = Float.parseFloat(operand2.getText().toString());
				float quotient = oper1 / oper2;
				result.setText(Float.toString(quotient));
			}
		});
		
		reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				operand1.setText("");
				operand2.setText("");
			}
		});
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
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
