package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$17;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.live.lite.adapter.component.gift.message.LiveLiteGiftMessageManager;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import ip3.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ah1.c;

public final class LiveLiteGiftManager$initManager$17 extends FunctionReferenceImpl implements a	// class@001da6
{

    public void LiveLiteGiftManager$initManager$17(LiveLiteGiftManager p0){
       super(0, p0, LiveLiteGiftManager.class, "tryInitGiftMessageManager", "tryInitGiftMessageManager\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftManager$initManager$17.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveLiteGiftManager.class, "11") && treceiver.B == null) {
          LifecycleOwner lifecycleOwn = treceiver.a();
          LiveLiteGiftManager r = treceiver.R;
          LiveLiteGiftManager z0 = treceiver.Z0;
          LiveLiteGiftManager j = treceiver.j;
          if (j == null) {
             a.S("giftSendModel");
          }
          LiveLiteGiftMessageManager liveLiteGift = new LiveLiteGiftMessageManager(lifecycleOwn, r, z0, j, treceiver.n);
          treceiver.B = objArray;
       }
       return;
    }
}
