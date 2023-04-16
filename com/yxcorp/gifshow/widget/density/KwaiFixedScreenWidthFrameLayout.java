package com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import azc.b;
import android.view.View;
import czc.b;

public class KwaiFixedScreenWidthFrameLayout extends FrameLayout	// class@001972
{
    public Context b;

    public void KwaiFixedScreenWidthFrameLayout(Context p0){
       super(p0, null);
    }
    public void KwaiFixedScreenWidthFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiFixedScreenWidthFrameLayout(Context p0,AttributeSet p1,int p2){
       super(b.g(p0, p1), p1, p2);
       this.b = p0;
       b.a(this);
    }
    public void KwaiFixedScreenWidthFrameLayout(Context p0,boolean p1){
       super(b.f(p0, 414, false, p1));
       this.b = p0;
       b.a(this);
    }
    public Context getRealContext(){
       return this.b;
    }
}
