package calvin_kwan.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        // Declare our View variables and assign View from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.FunFactTextView);
        Button showFactButton = (Button) findViewById(R.id.FunFactbutton);
        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fact = "";
                //will randomly select fact
                Random randomGenerator = new Random();   //constuct a new number generator
                int randomNumber = randomGenerator.nextInt(3);

                /*convert random number to text fact
                0 = Ants stretch when they wake up in the morning.
                1 = Ostsriches can run faster than horses
                2 = Olympic gold medals are actually made mostly of silver
                */
                //update the label with our dynamic fact
                if(randomNumber == 0)
                {
                    fact = "Ants stretch when they wake up in the morning.";
                }
                else if(randomNumber == 1)
                {
                    fact = "Ostsriches can run faster than horses";
                }
                else if(randomNumber == 2)
                {
                    fact = "Olympic gold medals are actually made mostly of silver";
                }
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_fact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
