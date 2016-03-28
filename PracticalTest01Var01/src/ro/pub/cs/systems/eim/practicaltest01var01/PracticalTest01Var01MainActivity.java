package ro.pub.cs.systems.eim.practicaltest01var01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PracticalTest01Var01MainActivity extends Activity {
	
	  private EditText numberText = null;
	  private TextView sumText = null;
	  private Button addButton = null;
	  private Button computeButton = null;
	  private static String sum = "";
	  private static int first = 0;
	  private ButtonClickListener buttonClickListener = new ButtonClickListener();
	  
	  private class ButtonClickListener implements View.OnClickListener {
	    @Override
	    public void onClick(View view) {
	      switch(view.getId()) {
	        case R.id.add_button:
	          int nr = Integer.parseInt(numberText.getText().toString());
	          if (first == 0) {
	        	  sum += nr;
	          	  first = 1;
	          }
	          else {
	        	  sum += "+" + nr;
	          }
	          sumText.setText(sum);
	          break;
	        case R.id.compute_button:
	          //int rightNumberOfClicks = Integer.parseInt(sumText.getText().toString());
	          //rightNumberOfClicks++;
	          //rightEditText.setText(String.valueOf(rightNumberOfClicks));
	          break;
	      }
	    }
	  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var01_main);
        
        numberText = (EditText)findViewById(R.id.number);
        sumText = (TextView)findViewById(R.id.sum);
        //numberText.setText(String.valueOf(0));
        //sumText.setText(String.valueOf(0));
     
        addButton = (Button)findViewById(R.id.add_button);
        computeButton = (Button)findViewById(R.id.compute_button);
        
        addButton.setOnClickListener(buttonClickListener);
        computeButton.setOnClickListener(buttonClickListener); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test01_var01_main, menu);
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
