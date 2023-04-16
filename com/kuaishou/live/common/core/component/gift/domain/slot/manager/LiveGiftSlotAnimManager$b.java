package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import gk1.a;
import xj1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yj1.a;

public class LiveGiftSlotAnimManager$b extends AnimatorListenerAdapter	// class@001266
{
    public final boolean a;
    public final a b;
    public final a c;
    public final GiftSlotMessage d;
    public final LiveGiftSlotAnimManager e;

    public void LiveGiftSlotAnimManager$b(LiveGiftSlotAnimManager p0,boolean p1,a p2,a p3,GiftSlotMessage p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotAnimManager$b.class, "1")) {
          return;
       }
       this.e.c.d(this.a);
       LiveGiftSlotAnimManager$b tb = this.b;
       if (tb != null) {
          LiveGiftSlotAnimManager$b tc = this.c;
          if (tc != null) {
             LiveGiftSlotAnimManager$b td = this.d;
             if (td != null) {
                tb.a(td, tc);
             }
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotAnimManager$b.class, "2")) {
          return;
       }
       this.e.c.f();
       return;
    }
}
