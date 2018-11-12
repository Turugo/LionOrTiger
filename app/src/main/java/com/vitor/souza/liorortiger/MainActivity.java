package com.vitor.souza.liorortiger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void imageClick(View imageView){

       ImageView tappedImageView = (ImageView) imageView;

       tappedImageView.animate().rotationBy(360).setDuration(2000);

    }

}
