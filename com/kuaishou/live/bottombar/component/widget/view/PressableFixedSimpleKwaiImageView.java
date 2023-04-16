package com.kuaishou.live.bottombar.component.widget.view.PressableFixedSimpleKwaiImageView;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;

public class PressableFixedSimpleKwaiImageView extends KwaiFixedSimpleDraweeView	// class@000d4d
{
    public boolean A;
    public float z;

    public void PressableFixedSimpleKwaiImageView(Context p0){
       super(p0);
       this.z = 0x3f000000;
    }
    public void PressableFixedSimpleKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.z = 0x3f000000;
    }
    public void PressableFixedSimpleKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.z = 0x3f000000;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressableFixedSimpleKwaiImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressableFixedSimpleKwaiImageView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.A != null) {
          PressableFixedSimpleKwaiImageView tz = (p0)? this.z: 0x3f800000;
          this.setAlpha(tz);
       }
       return;
    }
    public void setPressedAlpha(float p0){
       this.z = p0;
    }
    public void setPressedEnable(boolean p0){
       this.A = p0;
    }
}
