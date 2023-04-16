package com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onViewCreated$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import lm6.j;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$handleSpeedViewShowEvent$1;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import ef9.b;
import msd.a;
import java.lang.Runnable;
import android.view.View;

public final class MagicSafeUIAreaController$onViewCreated$1 extends FunctionReferenceImpl implements l	// class@000e56
{

    public void MagicSafeUIAreaController$onViewCreated$1(MagicSafeUIAreaController p0){
       super(1, p0, MagicSafeUIAreaController.class, "handleSpeedViewShowEvent", "handleSpeedViewShowEvent\(Lcom/kwai/gifshow/post/api/core/event/SpeedViewShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaController$onViewCreated$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicSafeUIAreaController.class, "15")) {
          a.p(p0, "event");
          Object[] objArray = new Object[0];
          a.D().w("MagicSafeUIArea", "SpeedViewShowEvent", objArray);
          if (p0.a != null) {
             d l = treceiver.l;
             if (l != null) {
                l.postDelayed(new b(new MagicSafeUIAreaController$handleSpeedViewShowEvent$1(treceiver.o)), 100);
             }
          }else {
             treceiver.o.d();
          }
       }
       return;
    }
}
