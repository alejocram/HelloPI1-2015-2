package co.edu.eafit.hellopi1_2015_2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private TextView titleMain;
    private EditText usernameTxt;
    private EditText passwordTxt;
    private Button loginBt;

    public MainActivity(){

    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleMain = (TextView)findViewById(R.id.title_main);
        usernameTxt = (EditText)findViewById(R.id.username_txt);
        passwordTxt = (EditText)findViewById(R.id.password_txt);
        loginBt = (Button)findViewById(R.id.login_bt);

        titleMain.setText(usernameTxt.getText().toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_close){
            Toast.makeText(this, "Cerrar Sesion", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
