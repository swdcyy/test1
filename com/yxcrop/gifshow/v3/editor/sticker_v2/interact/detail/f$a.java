package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$c;

public class f$a implements Animation$AnimationListener	// class@000a90
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       f b = this.b.b;
       if (b != null) {
          b.setVisibility(4);
       }
       b = this.b.h;
       if (b != null) {
          b.setVisibility(0);
          f$a tb = this.b;
          tb.h(tb.h, tb.n, 0);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
