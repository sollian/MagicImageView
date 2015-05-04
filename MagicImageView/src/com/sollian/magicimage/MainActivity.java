package com.sollian.magicimage;

import com.sollian.magicimage.R;
import com.sollian.magicimage.MagicImageView.OnTransformListener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class MainActivity extends Activity implements OnClickListener,
        OnLongClickListener, OnTransformListener {
    private MagicImageView mMIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMIV = (MagicImageView) findViewById(R.id.miv);
        mMIV.setImageResource(R.drawable.a);
//        mMIV.disableRotate();
        mMIV.setMaxScale(10);
        mMIV.setOnClickListener(this);
        mMIV.setOnLongClickListener(this);
        mMIV.setOnTransformListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.e("click", "1");
    }

    @Override
    public boolean onLongClick(View v) {
        Log.e("longclick", "1");
        return false;
    }

    @Override
    public void onDrag(float deltaX, float deltaY) {
        Log.e("drag", deltaX + "," + deltaY);
    }

    @Override
    public void onScale(float scale) {
        Log.e("scale", scale + "");
    }

    @Override
    public void onRotate(float degree) {
        Log.e("rotate", degree + "");
    }

    @Override
    public void onFling(float deltaX, float deltaY) {
        Log.e("fling", deltaX + "," + deltaY);
    }
}
