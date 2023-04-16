package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initVC$2;
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
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import si1.d;
import l73.v;
import l73.w;
import ok.x;
import ok.h;
import kotlin.jvm.internal.a;
import si1.a;
import java.util.Map;

public final class LiveLiteGiftManager$initVC$2 extends FunctionReferenceImpl implements a	// class@001daa
{

    public void LiveLiteGiftManager$initVC$2(LiveLiteGiftManager p0){
       super(0, p0, LiveLiteGiftManager.class, "intTopBarChildVC", "intTopBarChildVC\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftManager$initVC$2.class, str)) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       String str1 = "15";
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveLiteGiftManager.class, str1)) {
          LiveGiftBoxManager liveGiftBoxM = treceiver.e();
          if (liveGiftBoxM != null) {
             d uod = new d(new v(treceiver), new w(treceiver));
             if (!PatchProxy.applyVoidTwoRefs("VIP_GRADE", uod, liveGiftBoxM, LiveGiftBoxManager.class, str1)) {
                String str2 = "bizType";
                a.p("VIP_GRADE", str2);
                a.p(uod, "bizTypeModel");
                liveGiftBoxM = liveGiftBoxM.f;
                Objects.requireNonNull(liveGiftBoxM);
                if (!PatchProxy.applyVoidTwoRefs("VIP_GRADE", uod, liveGiftBoxM, a.class, str)) {
                   a.p("VIP_GRADE", str2);
                   a.p(uod, "bizTypeModel");
                   liveGiftBoxM.a.put("VIP_GRADE", uod);
                }
             }
          }
       }
       return;
    }
}
