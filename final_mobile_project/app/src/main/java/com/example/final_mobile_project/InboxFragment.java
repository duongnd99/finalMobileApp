package com.example.final_mobile_project;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class InboxFragment extends Fragment {
    boolean isColor = true;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ScrollView view = (ScrollView) inflater.inflate(R.layout.inbox_fragment, container, false);
        LinearLayout inboxFragment = view.findViewById(R.id.inbox_fragment_layout);


        for(int i=1; i<=3; i++){
            final LinearLayout inboxRow = (LinearLayout)inflater.inflate(R.layout.inbox_row, container, false);

            LinearLayout inboxRowInfoLayout = inboxRow.findViewById(R.id.inbox_row_info_layout);
            ImageView userImage = inboxRow.findViewById(R.id.user_image);
            userImage.setImageResource(R.drawable.ic_user_account);

            TextView userAccountName = inboxRowInfoLayout.findViewById(R.id.user_account_name);
            userAccountName.setText("abc");

            TextView inboxTopic = inboxRowInfoLayout.findViewById(R.id.inbox_topic);
            inboxTopic.setText("anc123");

            TextView inboxDate = inboxRowInfoLayout.findViewById(R.id.inbox_date);
            inboxDate.setText("12321312");


            inboxFragment.addView(inboxRow);
//            inboxRow.setClickable(true);
            inboxRow.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    // TODO Auto-generated method stub
                    switch(event.getAction())
                    {
                        case MotionEvent.ACTION_DOWN:
                            inboxRow.setBackgroundColor(Color.GRAY);
                            break;
                        case MotionEvent.ACTION_UP:
                            //set color back to default
                            inboxRow.setBackgroundColor(Color.WHITE);
                            break;
                    }
                    Intent i = new Intent(getActivity().getApplicationContext(), MessageDetail.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(i);
                    return true;
                }
            });
//            inboxRow.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    Intent i = new Intent(getActivity().getApplicationContext(), MessageDetail.class);
//                    startActivity(i);
//                }
//
//            });
        }



        return view;
    }
}
