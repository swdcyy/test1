package com.kwai.library.widget.layout.RoundedRelativeLayout;
import ekd.g0;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import ekd.n1;
import android.view.View;
import com.yxcorp.utility.RadiusStyle;
import android.content.res.Resources;

public class RoundedRelativeLayout extends RelativeLayout implements g0	// class@00095d
{
    public int b;

    public void RoundedRelativeLayout(Context p0){
       super(p0);
       this.b = 0;
    }
    public void RoundedRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.b = n1.e(p0, p1, 0);
    }
    public void RoundedRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.b = n1.e(p0, p1, 0);
    }
    public int getBackgroundRadius(){
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       RoundedRelativeLayout tb = this.b;
       if (tb <= null) {
          tb = n1.d(this.getMeasuredHeight());
       }
       n1.c(this, tb);
       return;
    }
    public void setBackgroundRadius(RadiusStyle p0){
       this.b = (int)this.getContext().getResources().getDimension(p0.radiusId);
    }
}
