package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class Main extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 1000){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent(getApplicationContext(),Input.class));
                } 
                 
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                 
                finally{
                    finish();
                }
            }
        };
         
        logoTimer.start();
    }
}
