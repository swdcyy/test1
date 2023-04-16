package com.yxcorp.gifshow.widget.record.PressedDisableLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class PressedDisableLinearLayout extends LinearLayout	// class@0019bb
{

    public void PressedDisableLinearLayout(Context p0){
       super(p0);
    }
    public void PressedDisableLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PressedDisableLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(PressedDisableLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedDisableLinearLayout.class, "1")) {
          return;
       }
       super.setEnabled(p0);
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          this.getChildAt(i).setEnabled(p0);
       }
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressedDisableLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedDisableLinearLayout.class, "2")) {
          return;
       }
       super.setPressed(p0);
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          this.getChildAt(i).setPressed(p0);
       }
       return;
    }
}
