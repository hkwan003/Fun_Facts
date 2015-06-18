package calvin_kwan.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactActivity extends ActionBarActivity
{
    private FactBook mFactbook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        // Declare our View variables and assign View from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.FunFactTextView);
        final Button showFactButton = (Button) findViewById(R.id.FunFactbutton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativelLayout);


        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fact = mFactbook.getFact();
                //update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        Toast.makeText(this,"yay our activity was created!", Toast.LENGTH_LONG).show();
    }

}
