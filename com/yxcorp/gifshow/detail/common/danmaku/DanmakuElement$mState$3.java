package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mState$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
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

public final class DanmakuElement$mState$3 extends FunctionReferenceImpl implements l	// class@0013e9
{

    public void DanmakuElement$mState$3(DanmakuElement p0){
       super(1, p0, DanmakuElement.class, "hide", "hide\(I\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(DanmakuElement$mState$3.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DanmakuElement$mState$3.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (!PatchProxy.isSupport(uDanmakuElem) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), treceiver, uDanmakuElem, "25") && treceiver.V0 != null)) {
          treceiver.z0("hide", "id = "+p0+", state = "+treceiver.W);
          DanmakuElement u0 = treceiver.U0;
          if (u0 != null) {
             o oo = u0.F();
             if (oo != null) {
                oo.n(false, false);
             }
          }
          treceiver.D().d(false);
       }
       return;
    }
}