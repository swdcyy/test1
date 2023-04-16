package com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import azc.b;
import android.view.View;
import czc.b;

public class KwaiFixedScreenWidthLinearLayout extends LinearLayout	// class@001974
{
    public Context b;

    public void KwaiFixedScreenWidthLinearLayout(Context p0){
       super(p0, null);
    }
    public void KwaiFixedScreenWidthLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiFixedScreenWidthLinearLayout(Context p0,AttributeSet p1,int p2){
       super(b.g(p0, p1), p1, p2);
       this.b = p0;
       b.a(this);
    }
    public Context getRealContext(){
       return this.b;
    }
}
