package com.yxcorp.gifshow.v3.widget.roundcornerprogress.RoundCornerProgressBar;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.graphics.drawable.GradientDrawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;

public class RoundCornerProgressBar extends BaseRoundCornerProgressBar	// class@00167b
{

    public void RoundCornerProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void RoundCornerProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void RoundCornerProgressBar(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void drawProgress(LinearLayout p0,GradientDrawable p1,float p2,float p3,float p4,int p5,int p6,boolean p7){
       object oobject = p0;
       object oobject1 = p1;
       int i = p5;
       int i1 = 7;
       int i2 = 8;
       if (PatchProxy.isSupport(RoundCornerProgressBar.class)) {
          Object[] objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Float.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[i1] = Boolean.valueOf(p7);
          if (PatchProxy.applyVoid(objArray, this, RoundCornerProgressBar.class, "1")) {
             return;
          }
       }else {
          int i4 = this;
       }
       float[] uofloatArray = new float[i2];
       float f = (float)(i - (p6 / 2));
       uofloatArray[0] = f;
       uofloatArray[1] = f;
       uofloatArray[2] = f;
       uofloatArray[3] = f;
       uofloatArray[4] = f;
       uofloatArray[5] = f;
       uofloatArray[6] = f;
       uofloatArray[i1] = f;
       oobject1.setCornerRadii(uofloatArray);
       p0.setBackground(p1);
       int i3 = (int)((p4 - (float)(p6 * 2)) / (p2 / p3));
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = i3;
       i3 = i3 / 2;
       if ((p6 + i3) < i) {
          i = Math.max((i - p6), 0) - i3;
          layoutParams.topMargin = i;
          layoutParams.bottomMargin = i;
       }else {
          layoutParams.topMargin = 0;
          layoutParams.bottomMargin = 0;
       }
       oobject.setLayoutParams(layoutParams);
       return;
    }
    public int initLayout(){
       return 0x7f0d089b;
    }
    public void initStyleable(Context p0,AttributeSet p1){
    }
    public void initView(){
    }
    public void onViewDraw(){
    }
}
