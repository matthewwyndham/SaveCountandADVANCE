package combobreaker.savecountandadvance;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.prefs.Preferences;

public class mainschnitzel extends AppCompatActivity {
    int counter;
    SharedPreferences foobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainschnitzel);
        foobar = getSharedPreferences("content", 0);
        counter = foobar.getInt("theCount", 0);
        update();
    }

    public void update() {
        TextView t = (TextView) findViewById(R.id.textfieldofawesomeness);
        t.setText(counter+"");
    }

    public void increment(View v) {
        counter++;
        update();
    }

    public void saveNumba(View v) {
        SharedPreferences.Editor editor = foobar.edit();
        editor.putInt("theCount", counter);
        editor.apply();
    }
}
