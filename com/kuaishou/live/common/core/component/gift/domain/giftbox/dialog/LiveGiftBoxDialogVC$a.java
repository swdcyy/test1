package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.k;
import kotlin.jvm.internal.a;
import zg1.a;
import zg1.d;
import zg1.e;

public final class LiveGiftBoxDialogVC$a implements LiveGiftBoxPopupView$d	// class@0011e0
{
    public final LiveGiftBoxDialogVC a;

    public void LiveGiftBoxDialogVC$a(LiveGiftBoxDialogVC p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxDialogVC$a.class, "2")) {
          return;
       }
       if (this.a.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onDismissStart] vc is destroy");
          return;
       }else {
          LiveGiftBoxDialogVC$a ta = this.a;
          Object obj = ta.W2().get();
          a.o(obj, "dialogType.get\(\)");
          ta.s.b(obj);
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxDialogVC$a.class, "1")) {
          return;
       }
       if (this.a.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][onDismissEnd] vc is destroy");
          return;
       }else {
          LiveGiftBoxDialogVC$a ta = this.a;
          Object obj = ta.W2().get();
          a.o(obj, "dialogType.get\(\)");
          ta.t.e(obj);
          return;
       }
    }
}
