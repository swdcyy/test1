package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class LiveGiftComboAnimationView$a extends AnimatorListenerAdapter	// class@001173
{
    public final LiveGiftComboAnimationView a;

    public void LiveGiftComboAnimationView$a(LiveGiftComboAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftComboAnimationView$a.class, "1")) {
          return;
       }
       this.a.d.setVisibility(8);
       return;
    }
}
