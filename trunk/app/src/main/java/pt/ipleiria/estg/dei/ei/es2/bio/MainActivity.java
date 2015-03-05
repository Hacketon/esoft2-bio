package pt.ipleiria.estg.dei.ei.es2.bio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private boolean hasCheckIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_checkin) {
            checkin(item);
        }

        return super.onOptionsItemSelected(item);
    }

    private void checkin(MenuItem item) {
        if(hasCheckIn) {
            item.setIcon(R.drawable.ic_action_group);
            Intent intent = new Intent(getApplicationContext(), ParticipantsListActivity.class);
            startActivity(intent);
        }
        else
            item.setIcon(R.drawable.ic_action_name);
        hasCheckIn = !hasCheckIn;
    }
}
