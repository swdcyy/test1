package com.google.android.material.tabs.NasaShootView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class NasaShootView extends FrameLayout	// class@0016bb
{

    public void NasaShootView(Context p0){
       super(p0);
    }
    public void NasaShootView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void setPressed(boolean p0){
       super.setPressed(p0);
       float f = (p0)? 0.40f: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
