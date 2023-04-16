package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$15;
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
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import kotlin.jvm.internal.a;
import l73.x;
import l73.y;
import l73.z;
import l73.a0;
import th1.c;
import l73.b0;
import z1.k;
import aq5.d;
import zg1.l;
import zg1.e;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import om1.e;
import th1.b;
import xh1.a;
import oh1.a;
import xg1.a;

public final class LiveLiteGiftManager$initManager$15 extends FunctionReferenceImpl implements a	// class@001da4
{

    public void LiveLiteGiftManager$initManager$15(LiveLiteGiftManager p0){
       super(0, p0, LiveLiteGiftManager.class, "tryInitComboManager", "tryInitComboManager\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftManager$initManager$15.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveLiteGiftManager.class, "10") && treceiver.w == null) {
          LifecycleOwner lifecycleOwn = treceiver.a();
          LiveLiteGiftManager n = treceiver.N;
          LiveLiteGiftManager h = treceiver.h;
          if (h == null) {
             a.S("userStatusServiceAdapter");
          }
          LiveLiteGiftManager c = treceiver.c;
          if (c == null) {
             a.S("dialogServiceAdapter");
          }
          x b = x.b;
          y oy = new y(treceiver);
          z b1 = z.b;
          LiveLiteGiftManager j = treceiver.j;
          if (j == null) {
             a.S("giftSendModel");
          }
          LiveComboManager liveComboMan = new LiveComboManager(lifecycleOwn, n, h, c, b, oy, b1, new a0(treceiver), j, treceiver.e1, new c(new b0(treceiver)), treceiver.x);
          treceiver.w = objArray;
          LiveLiteGiftManager f = treceiver.F;
          if (!PatchProxy.applyVoidOneRefs(f, objArray, LiveComboManager.class, "11")) {
             a.p(f, "listener");
             LiveComboManager b2 = objArray.b;
             Objects.requireNonNull(b2);
             if (!PatchProxy.applyVoidOneRefs(f, b2, a.class, "7")) {
                a.p(f, "listener");
                b2.a.b(f);
             }
          }
       }
    label_0092 :
       return;
    }
}
