package com.example.final_mobile_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ComposeMail extends AppCompatActivity {
    EditText userEmail, receiverEmail, topic, content;
    ImageButton sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_mail);

        userEmail = (EditText)findViewById(R.id.user_email);
        receiverEmail = (EditText)findViewById(R.id.receiver_email);
        topic = (EditText)findViewById(R.id.topic);
        content = (EditText)findViewById(R.id.content);
        sendButton = (ImageButton)findViewById(R.id.send_button);

//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String from = userEmail.getText().toString();
//                String to = receiverEmail.getText().toString();
//                String messTopic = topic.getText().toString();
//                String messContent = content.getText().toString();
//
//                Intent i = new Intent(getApplicationContext(), SentFragment.class);
//                i.putExtra("userEmail", from);
//                i.putExtra("receiverEmail", to);
//                i.putExtra("messTopic", messTopic);
//                i.putExtra("messContent", messContent);
//
////                i.setType("message/rfc822");
//
//                startActivity(i);
//            }
//        });
    }
}
