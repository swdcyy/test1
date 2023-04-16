package com.yxcorp.gifshow.detail.view.SlidePlayAlphaLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class SlidePlayAlphaLinearLayout extends LinearLayout	// class@001a60
{

    public void SlidePlayAlphaLinearLayout(Context p0){
       super(p0);
    }
    public void SlidePlayAlphaLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SlidePlayAlphaLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(SlidePlayAlphaLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidePlayAlphaLinearLayout.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (p0) {
          this.setAlpha(0x3f000000);
       }else {
          this.setAlpha(0x3f800000);
       }
       return;
    }
}
