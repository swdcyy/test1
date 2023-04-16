package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.FrameLayout;
import hmd.d;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import android.animation.AnimatorSet;

public class f$b extends AnimatorListenerAdapter	// class@000a91
{
    public final boolean a;
    public final f b;

    public void f$b(f p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("InteractStickerViewHelper", "onAnimationEnd isEndAnimation: "+this.b.q+", isHide: "+this.a, objArray);
       if (this.a != null) {
          this.b.h.setVisibility(4);
          f$b tb = this.b;
          f b = tb.b;
          if (b != null) {
             b.setImageResource(tb.v.b());
          }
          n.Y(this.b.b, 0, true);
       }
       this.b.m.removeAllListeners();
       return;
    }
}
