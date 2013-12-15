package eu.edgo.bulldog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public void autonom(View view) {
    	
    	final Context context = this;
    	
    	Intent intent = new Intent (context, autonom.class);
    	startActivity (intent);
    	
    }

    public void selbst(View view) {
    	
    	final Context context = this;
    	
    	Intent intent = new Intent (context, AcitivtySelbst.class);
    	startActivity (intent);	
    }

    public void connect(View view) {
    	
    	//   	final Context context = this;					//(noch) nicht benutzt, der Kontext der App wird ja nicht verändert
    			
    			//Verbindungsgedöns, muss nochmal nachgeschaut werden
    			// Wie man eine Verbindung aufbaut sowie aufrecht erhält
    			//wenn mann Screens switcht
    			
    			
    }
    
    
}




