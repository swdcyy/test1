package com.cmcewen.blurview.BlurViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import eightbitlab.com.blurview.BlurView;
import android.content.Context;
import android.app.Activity;
import java.lang.Object;
import java.util.Objects;
import android.view.Window;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import aqd.a;
import aqd.d;
import aqd.h;
import aqd.e;
import java.lang.String;
import android.widget.FrameLayout;

public class BlurViewManager extends ViewGroupManager	// class@000f1a
{

    public void BlurViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public BlurView createViewInstance(n0 p0){
       BlurView uBlurView = new BlurView(p0);
       Activity currentActiv = p0.getCurrentActivity();
       Objects.requireNonNull(currentActiv);
       View decorView = currentActiv.getWindow().getDecorView();
       ViewGroup viewGroup = decorView.findViewById(0x1020002);
       a uoa = new a(uBlurView, viewGroup, uBlurView.c);
       uBlurView.b.destroy();
       uBlurView.b = uoa;
       uoa.p = decorView.getBackground();
       uoa.e = new h(p0);
       uoa.f(10.00f);
       uoa.h(false);
       return uBlurView;
    }
    public String getName(){
       return "BlurView";
    }
    public void setColor(BlurView p0,int p1){
       p0.c = p1;
       p0.b.c(p1);
       p0.invalidate();
    }
    public void setDownsampleFactor(BlurView p0,int p1){
    }
    public void setRadius(BlurView p0,int p1){
       p0.b.f((float)p1);
       p0.invalidate();
    }
}
