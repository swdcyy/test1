package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mState$3;
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

public final class AdDanmakuElement$mState$3 extends FunctionReferenceImpl implements l	// class@001705
{

    public void AdDanmakuElement$mState$3(AdDanmakuElement p0){
       super(1, p0, AdDanmakuElement.class, "hide", "hide\(I\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(AdDanmakuElement$mState$3.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdDanmakuElement$mState$3.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (!PatchProxy.isSupport(uAdDanmakuEl) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), treceiver, uAdDanmakuEl, "23") && treceiver.T != null)) {
          treceiver.y0("hide", "id = "+p0+", state = "+treceiver.O);
          AdDanmakuElement s = treceiver.S;
          if (s != null) {
             o oo = s.F();
             if (oo != null) {
                oo.n(false, false);
             }
          }
          treceiver.D().d(false);
       }
       return;
    }
}
