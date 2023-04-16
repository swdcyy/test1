package com.yxcorp.gifshow.music.widget.PressedAlphaLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class PressedAlphaLinearLayout extends LinearLayout	// class@0020a6
{

    public void PressedAlphaLinearLayout(Context p0){
       super(p0);
    }
    public void PressedAlphaLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedAlphaLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedAlphaLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedAlphaLinearLayout.class, "1")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
