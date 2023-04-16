package com.kuaishou.live.bottombar.component.widget.view.PressableKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;

public class PressableKwaiImageView extends KwaiImageView	// class@000d4e
{
    public float x;
    public boolean y;

    public void PressableKwaiImageView(Context p0){
       super(p0);
       this.x = 0x3f000000;
    }
    public void PressableKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = 0x3f000000;
    }
    public void PressableKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 0x3f000000;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(PressableKwaiImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressableKwaiImageView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (this.y != null) {
          PressableKwaiImageView tx = (p0)? this.x: 0x3f800000;
          this.setAlpha(tx);
       }
       return;
    }
    public void setPressedAlpha(float p0){
       this.x = p0;
    }
    public void setPressedEnable(boolean p0){
       this.y = p0;
    }
}
