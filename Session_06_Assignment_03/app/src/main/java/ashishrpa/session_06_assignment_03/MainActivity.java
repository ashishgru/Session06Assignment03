package ashishrpa.session_06_assignment_03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.tv_subMenuXML);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.subOptionMenuRED: {
                Toast.makeText(MainActivity.this, "RED Option Selected", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "RED Option Selected");
                textView.setTextColor(Color.RED);
                return true;
            }
            case R.id.subOptionMenuGREEN: {
                Toast.makeText(MainActivity.this, "GREEN Option Selected", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "GREEN Option Selected");
                textView.setTextColor(Color.GREEN);
                return true;
            }
            case R.id.subOptionMenuBLUE: {
                Toast.makeText(MainActivity.this, "BLUE Option Selected", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "BLUE Option Selected");
                textView.setTextColor(Color.BLUE);
                return true;
            }
            case R.id.subOptionMenuBLACK: {
                Toast.makeText(MainActivity.this, "BLACK Option Selected", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "BLACK Option Selected");
                textView.setTextColor(Color.BLACK);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
