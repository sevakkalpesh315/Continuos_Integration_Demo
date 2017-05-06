package kevalpatel2106.com.automated_test_and_ci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText emailEt = (EditText) findViewById(R.id.email_et);

        findViewById(R.id.btn_validate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!validateEmail(emailEt.getText().toString()))
                    Toast.makeText(MainActivity.this, "Enter valid email address.", Toast.LENGTH_LONG).show();
            }
        });
    }

    /**
     * Unit test for this function is at MainActivityTest
     *
     * @return true if the email address is validated.
     */
    public static boolean validateEmail(String emailToValidate) {
        return !(emailToValidate == null || emailToValidate.trim().isEmpty())
                && EMAIL_ADDRESS_PATTERN.matcher(emailToValidate).matches();
    }

    private static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );
}
