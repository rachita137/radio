package tatastrive.application.radio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates://id find/link
                if (checked)
                {
                    // Male selected
                    showmsg(" Male selected");
                }


                break;
            case R.id.radio_ninjas:
                if (checked)
                {
                    // female selected
                    showmsg("Female Selected");

                }

                break;
        }
    }

    private void showmsg(String s)
    {

        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle(s);
        builder.setMessage(s);
        builder.show();





    }


}

