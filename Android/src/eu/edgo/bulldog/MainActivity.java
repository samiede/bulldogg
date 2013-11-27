package eu.edgo.bulldog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	
	Button autonom;
	Button selbst;
	Button verbinden;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonAutonom();
        addListenerOnButtonSelbst();
        addListenerOnButtonConnect();
    }
    
    
    public void addListenerOnButtonAutonom() {
    	
    	final Context context = this;
    	
    	autonom = (Button) findViewById(R.id.btn_autonom);
    	
    	    	
    	autonom.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			
    			Intent intent = new Intent (context, autonom.class);
    			startActivity (intent);
    		}
    		
    		
    	});
    	
    }

    public void addListenerOnButtonSelbst() {
    	
	final Context context = this;
    	
    	selbst = (Button) findViewById(R.id.btn_selbst);
    	
    	    	
    	selbst.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			
    			Intent intent = new Intent (context, AcitivtySelbst.class);
    			startActivity (intent);
    		}
    		
    	});
    	
    	
    }

    public void addListenerOnButtonConnect() {
    	
 //   	final Context context = this;					//(noch) nicht benutzt, der Kontext der App wird ja nicht verändert
    	
    	verbinden = (Button) findViewById(R.id.btn_connect);
    	
    	verbinden.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			
    			//Verbindungsgedöns, muss nochmal nachgeschaut werden
    			// Wie man eine Verbindung aufbaut sowie aufrecht erhält
    			//wenn mann Screens switcht
    			
    			
    		}
    	});
    		
    }
    
    
}




