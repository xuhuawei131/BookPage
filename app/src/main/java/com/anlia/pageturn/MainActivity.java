package com.anlia.pageturn;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anlia.pageturn.factory.PicturesPageFactory;
import com.anlia.pageturn.view.BasePageView;
import com.anlia.pageturn.view.CoverPageView;

public class MainActivity extends Activity {
    private int[] resArray = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BasePageView pageView=findViewById(R.id.coverPageView);
        if (pageView instanceof CoverPageView){
            PicturesPageFactory factory = new PicturesPageFactory(this, resArray);
            CoverPageView coverPageView = (CoverPageView) pageView;
            coverPageView.setPageFactory(factory);
        }

    }
}