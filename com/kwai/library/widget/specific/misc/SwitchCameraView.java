package com.kwai.library.widget.specific.misc.SwitchCameraView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;

public class SwitchCameraView extends LinearLayout	// class@000a1b
{
    public View b;
    public boolean c;
    public int d;
    public ViewPropertyAnimator e;

    public void SwitchCameraView(Context p0){
       super(p0, null);
    }
    public void SwitchCameraView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SwitchCameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = a.c(LayoutInflater.from(p0), 0x7f0d159c, this, true).findViewById(0x7f0a0241);
    }
}
