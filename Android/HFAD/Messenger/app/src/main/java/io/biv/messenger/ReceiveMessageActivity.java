package io.biv.messenger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MSG = "io.biv.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        TextView textView = (TextView)findViewById(R.id.message);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(msg);
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, ReceiveMessageActivity.class);
    }
}
