package com.kuaishou.live.common.core.basic.widget.LivePressAlphaRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class LivePressAlphaRelativeLayout extends RelativeLayout	// class@000f20
{

    public void LivePressAlphaRelativeLayout(Context p0){
       super(p0);
    }
    public void LivePressAlphaRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LivePressAlphaRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       int i;
       if (PatchProxy.isSupport(LivePressAlphaRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePressAlphaRelativeLayout.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (p0) {
          for (i = 0; i < this.getChildCount(); i = i + 1) {
             this.getChildAt(i).setAlpha(0x3f000000);
          }
       }else {
          for (; i < this.getChildCount(); i = i + 1) {
             this.getChildAt(i).setAlpha(0x3f800000);
          }
       }
       return;
    }
}
