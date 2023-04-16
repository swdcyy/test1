package com.kuaishou.live.common.core.basic.widget.LivePressableKwaiImageView;
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

public class LivePressableKwaiImageView extends KwaiImageView	// class@000f21
{

    public void LivePressableKwaiImageView(Context p0){
       super(p0, null);
    }
    public void LivePressableKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePressableKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LivePressableKwaiImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePressableKwaiImageView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
