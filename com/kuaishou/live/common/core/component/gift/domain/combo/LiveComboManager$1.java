package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import zh1.j;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.common.core.component.gift.base.inject.LiveDialogAdapterType;
import zg1.a;
import zg1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.StringBuilder;

public final class LiveComboManager$1 extends Lambda implements p	// class@001166
{
    public final LiveComboManager this$0;

    public void LiveComboManager$1(LiveComboManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(j p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveComboManager$1.class, "1")) {
          return;
       }
       a.p(p1, "source");
       LiveComboManager$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tthis$0, LiveComboManager.class, "7")) {
          if (a.g(tthis$0.e.a(), Boolean.TRUE)) {
             b.Z(LiveGiftTag.COMBO, "[LiveComboManager][showComboView], disableComboSend");
          }else {
             Lifecycle lifecycle = tthis$0.h.getLifecycle();
             a.o(lifecycle, "lifecycleOwner.lifecycle");
             if (lifecycle.getCurrentState() == Lifecycle$State.DESTROYED) {
                b.Z(LiveGiftTag.COMBO, "[LiveComboManager][showComboView], currentState is DESTROYED");
             }else if(p0 != null){
                LiveDialogAdapterType sendGiftButt = LiveDialogAdapterType.SendGiftButtonPanel;
                if (!tthis$0.k.c(sendGiftButt)) {
                   tthis$0.k.a(sendGiftButt, p0);
                   b.Z(LiveGiftTag.COMBO, "[LiveComboManager][showComboView] "+p1);
                }else {
                   b.Z(LiveGiftTag.COMBO, "[LiveComboManager][showComboView], "+p1+" ,"+"combo view isShowing");
                }
             }
          }
       }
       return;
    }
}
