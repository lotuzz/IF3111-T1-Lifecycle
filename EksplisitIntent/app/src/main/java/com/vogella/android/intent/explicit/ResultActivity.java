package com.vogella.android.intent.explicit;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Professor Aldo on 2/10/2015.
 */
public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString("yourkey");
        TextView view = (TextView) findViewById(R.id.displayintentextra);
        view.setText(inputString);
    }

    @Override
    public void finish() {

        // TODO 1 create new Intent
        // Intent intent = new Intent();
        Intent intent1 = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText editText= (EditText) findViewById(R.id.returnValue);

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String readData = editText.getText().toString();
        intent1.putExtra("returnkey", readData);


        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        setResult(RESULT_OK, intent1);

        super.finish();
    }
}