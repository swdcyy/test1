package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGiftComboAnimationView$b extends AnimatorListenerAdapter	// class@001174
{
    public final LiveGiftComboAnimationView a;

    public void LiveGiftComboAnimationView$b(LiveGiftComboAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftComboAnimationView$b.class, "1")) {
          return;
       }
       this.a.f();
       return;
    }
}
