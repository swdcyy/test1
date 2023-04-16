package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$insertNewPhoto$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import jg9.m0;
import com.yxcorp.gifshow.bubble.b$c;
import jg9.n0;
import k07.g;
import jg9.o0;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class MultiTakePictureController$insertNewPhoto$2 extends FunctionReferenceImpl implements l	// class@000ed5
{

    public void MultiTakePictureController$insertNewPhoto$2(MultiTakePictureController p0){
       super(1, p0, MultiTakePictureController.class, "showTakeActionBubble", "showTakeActionBubble\(Landroid/view/View;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$insertNewPhoto$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MultiTakePictureController.class, "10")) {
          b uob = new b(RecordBubbleItem.MULTI_TAKE_PREVIEW_TIP).n(p0);
          uob.p(true);
          uob = uob.A(R.string.arg_RES_7f104c00);
          uob.q((long)5000);
          uob = uob.z(m0.a);
          uob.o(n0.a);
          uob.v(o0.a);
          a.o(uob, "RecordBubble\(RecordBubbl¡­TakeAction\(false\)\n      }");
          d d = treceiver.d;
          a.o(d, "mCallerContext");
          w ow = d.b();
          a.o(ow, "mCallerContext.controllerManager");
          ow.V7().n(uob);
       }
       return;
    }
}
