package com.sdacademy.gieysztor.michal.chatlayout;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.support.v7.appcompat.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private TextView msgTextView;
    private Drawable myMsgBackground;
    private int textPadding;
    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.scrollLinear);
        msgTextView = (TextView) findViewById(R.id.textMessage);
        myMsgBackground = ContextCompat.getDrawable(this, R.drawable.message_backgroud);
        textPadding = getResources().getDimensionPixelSize(R.dimen.medium_padding);
        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

    }
    public void sendMessageOnClick (View view){

        TextView textView = new TextView(this);
        textView.setBackgroundResource(R.drawable.outgoing_message_backgroud);
        textView.setTextColor(ContextCompat.getColor(this,android.R.color.white));
        String message = findViewById(R.id.textMessage).toString();
        textView.setText(message);

        textView.setText(message);
        msgTextView.setText(null);

        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.RIGHT;
        layoutParams.setMargins(textPadding, textPadding, textPadding, textPadding);
        textView.setLayoutParams(layoutParams);

        linearLayout.addView(textView);





        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = findViewById(R.id.textMessage).toString();

            }
        });

    }
}
