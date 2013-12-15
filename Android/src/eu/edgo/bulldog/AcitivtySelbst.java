package eu.edgo.bulldog;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Client programming code idea from: Nikos Maravitsas 
 * http://examples.javacodegeeks.com/android/core/socket-core/android-socket-example/
 */

public class AcitivtySelbst extends Activity implements SensorEventListener {

	private Socket clientSocket;
	
	private static final int SERVERPORT = 5298;
	private static final String SERVER_IP = "192.168.42.1";
	
	private Sensor accelerometer;
	private SensorManager sm;
	private TextView acceleration;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selbst);
        
        new Thread(new ClientThread()).start();
        
        sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        
        acceleration =  (TextView)findViewById(R.id.acceleration);
    }
	
	public void forward(View view) {
    	try {
    		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);
    		out.println("f");
    		Toast.makeText(AcitivtySelbst.this, "forward", Toast.LENGTH_SHORT).show();
        } catch (UnknownHostException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public void backward(View view){
    	try {
    		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);
    		out.println("b");
    		Toast.makeText(AcitivtySelbst.this, "backward", Toast.LENGTH_SHORT).show();
        } catch (UnknownHostException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    public void left(View view){
    	try {
    		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);
    		out.println("l");
    		Toast.makeText(AcitivtySelbst.this, "left", Toast.LENGTH_SHORT).show();
        } catch (UnknownHostException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    public void right(View view){
    	try {
    		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);
    		out.println("r");
    		Toast.makeText(AcitivtySelbst.this, "right", Toast.LENGTH_SHORT).show();
        } catch (UnknownHostException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    @Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onSensorChanged(SensorEvent event) {
		acceleration.setText("X: "+ event.values[0]+ " \nY: " + event.values[1] + "\nZ: "+event.values[2]);
		
	}
    class ClientThread implements Runnable {
    		 
    	@Override
    	public void run() {
    		 
    		try {
    			InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
    		    clientSocket = new Socket(serverAddr, SERVERPORT);
    		 
    		} catch (UnknownHostException e1) {
    		                e1.printStackTrace();
    		} catch (IOException e1) {
    		                e1.printStackTrace();
    		}
    		 
    	}
    		 
    }
    
}
