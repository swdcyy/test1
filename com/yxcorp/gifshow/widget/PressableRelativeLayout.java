package com.yxcorp.gifshow.widget.PressableRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class PressableRelativeLayout extends RelativeLayout	// class@00189c
{
    public float b;

    public void PressableRelativeLayout(Context p0){
       super(p0);
       this.b = 0x3f000000;
    }
    public void PressableRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0x3f000000;
    }
    public void PressableRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f000000;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressableRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressableRelativeLayout.class, "1")) {
          return;
       }
       super.setPressed(p0);
       PressableRelativeLayout tb = (p0)? this.b: 0x3f800000;
       this.setAlpha(tb);
       return;
    }
    public void setPressedAlpha(float p0){
       this.b = p0;
    }
}
