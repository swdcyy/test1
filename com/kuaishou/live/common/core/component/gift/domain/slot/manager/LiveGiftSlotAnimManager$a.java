package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yj1.a;

public class LiveGiftSlotAnimManager$a extends AnimatorListenerAdapter	// class@001265
{
    public final LiveGiftSlotAnimManager a;

    public void LiveGiftSlotAnimManager$a(LiveGiftSlotAnimManager p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotAnimManager$a.class, "1")) {
          return;
       }
       this.a.c.e();
       return;
    }
}
