package com.gozde.android;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	EditText ads;
	EditText pass;
	Button kaydet;
	Button sil;
	TextView txtGstr;
	TextView txtHata;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ads = (EditText) findViewById(R.id.jUser);
        pass = (EditText) findViewById(R.id.jPass);
        kaydet = (Button) findViewById(R.id.jKaydet);
        sil = (Button) findViewById(R.id.jSil);
        txtGstr = (TextView) findViewById(R.id.jGoster);
        txtHata = (TextView) findViewById(R.id.jHata);
        
        //buton kaydete týkladýðýmda adsyi alýp txt göstere atýp hoþgeldiniz yazdýrmasýný istiyorum.
        //ads veya pass boþ iken kaydet butonuna týklarsam txthata da lütfen id veya pass doldurunuz yazsýn istiyorum.
        //sil butonuna týkladýðýmda txtgösterdeki verinin silinmesini istiyorum.
        
        kaydet.setOnClickListener(new OnClickListener() {
			

			public void onClick(View v) {
				txtHata.setText("");
				txtGstr.setText("");
				if(ads.getText().toString().equals("") || pass.getText().toString().equals(""))
					txtHata.setText("Please enter your user name or your password.");
				else
				txtGstr.setText("Welcome "+ads.getText());
			}
		});
        
        sil.setOnClickListener(new OnClickListener() {
			

			public void onClick(View v) {
				txtGstr.setText("");
				txtHata.setText("");
			}
		});
    }


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
