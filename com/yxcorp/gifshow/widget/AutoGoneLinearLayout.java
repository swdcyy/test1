package com.yxcorp.gifshow.widget.AutoGoneLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class AutoGoneLinearLayout extends LinearLayout	// class@0017ec
{

    public void AutoGoneLinearLayout(Context p0){
       super(p0);
    }
    public void AutoGoneLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AutoGoneLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AutoGoneLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AutoGoneLinearLayout.class, "1")) {
          return;
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i < childCount) {
             if (this.getChildAt(i).getVisibility() != 8) {
                childCount = 0;
             label_0035 :
                if (childCount) {
                   this.setMeasuredDimension(0, 0);
                   break ;
                }else {
                   super.onMeasure(p0, p1);
                   break ;
                }
             }else {
                i = i + 1;
             }
          }else {
             childCount = 1;
             goto label_0035 ;
          }
       }
       return;
    }
}
