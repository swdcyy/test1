package com.kuaishou.live.bottombar.component.widget.view.PressableTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.TextView;

public class PressableTextView extends AppCompatTextView	// class@000d4f
{
    public float f;
    public boolean g;

    public void PressableTextView(Context p0){
       super(p0);
       this.f = 0x3f000000;
    }
    public void PressableTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = 0x3f000000;
    }
    public void PressableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = 0x3f000000;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressableTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressableTextView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.g != null) {
          PressableTextView tf = (p0)? this.f: 0x3f800000;
          this.setAlpha(tf);
       }
       return;
    }
    public void setPressedAlpha(float p0){
       this.f = p0;
    }
    public void setPressedEnable(boolean p0){
       this.g = p0;
    }
}
