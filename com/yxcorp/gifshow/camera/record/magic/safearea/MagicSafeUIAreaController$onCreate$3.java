package com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onCreate$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import nd9.d0;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$handleRecordLeftEnterShowEvent$1;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import ef9.b;
import msd.a;
import java.lang.Runnable;
import android.view.View;

public final class MagicSafeUIAreaController$onCreate$3 extends FunctionReferenceImpl implements l	// class@000e55
{

    public void MagicSafeUIAreaController$onCreate$3(MagicSafeUIAreaController p0){
       super(1, p0, MagicSafeUIAreaController.class, "handleRecordLeftEnterShowEvent", "handleRecordLeftEnterShowEvent\(Lcom/yxcorp/gifshow/camera/record/guide/RecordLeftEnterShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaController$onCreate$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicSafeUIAreaController.class, "14")) {
          a.p(p0, "event");
          Object[] objArray = new Object[0];
          a.D().w("MagicSafeUIArea", "RecordLeftEnterShowEvent", objArray);
          d l = treceiver.l;
          if (l != null) {
             l.postDelayed(new b(new MagicSafeUIAreaController$handleRecordLeftEnterShowEvent$1(treceiver.o)), 300);
          }
       }
       return;
    }
}
