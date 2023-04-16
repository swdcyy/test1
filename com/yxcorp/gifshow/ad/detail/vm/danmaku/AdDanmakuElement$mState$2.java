package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mState$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.StringBuilder;
import qm5.o;
import im5.d;
import qp7.g;
import qp7.b;
import lq7.d;

public final class AdDanmakuElement$mState$2 extends FunctionReferenceImpl implements l	// class@001704
{

    public void AdDanmakuElement$mState$2(AdDanmakuElement p0){
       super(1, p0, AdDanmakuElement.class, "show", "show\(I\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(AdDanmakuElement$mState$2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdDanmakuElement$mState$2.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (!PatchProxy.isSupport(uAdDanmakuEl) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), treceiver, uAdDanmakuEl, "21") && treceiver.T != null)) {
          treceiver.y0("show", "id = "+p0+", state = "+treceiver.O);
          AdDanmakuElement s = treceiver.S;
          if (s != null) {
             o oo = s.F();
             if (oo != null) {
                oo.n(true, false);
             }
          }
          treceiver.D().d(true);
       }
       return;
    }
}
