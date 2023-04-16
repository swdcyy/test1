package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$d;
import ekd.f$j;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGiftComboAnimationView$d extends f$j	// class@001176
{
    public final LiveGiftComboAnimationView a;

    public void LiveGiftComboAnimationView$d(LiveGiftComboAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftComboAnimationView$d.class, "1")) {
          return;
       }
       this.a.d();
       return;
    }
}
