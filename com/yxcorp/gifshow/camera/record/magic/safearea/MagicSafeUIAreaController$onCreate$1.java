package com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import tg9.g;
import com.yxcorp.gifshow.camera.record.base.b;
import android.graphics.RectF;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import java.lang.Float;
import java.lang.Boolean;
import y4b.c;
import s5b.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$handleDuetLayoutUpdateEvent$1;
import ef9.b;
import msd.a;
import java.lang.Runnable;
import android.view.View;

public final class MagicSafeUIAreaController$onCreate$1 extends FunctionReferenceImpl implements l	// class@000e53
{

    public void MagicSafeUIAreaController$onCreate$1(MagicSafeUIAreaController p0){
       super(1, p0, MagicSafeUIAreaController.class, "handleDuetLayoutUpdateEvent", "handleDuetLayoutUpdateEvent\(Lcom/yxcorp/gifshow/camera/record/duet/controller/DuetLayoutUpdateEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       g a;
       Object[] objArray3;
       Object obj = this;
       c obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MagicSafeUIAreaController$onCreate$1.class, "1")) {
          return;
       }
       a.p(obj1, "p1");
       CallableReference receiver = obj.receiver;
       Objects.requireNonNull(receiver);
       String str = "16";
       if (!PatchProxy.applyVoidOneRefs(obj1, receiver, MagicSafeUIAreaController.class, str)) {
          a.p(obj1, "event");
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("MagicSafeUIArea", "DuetLayoutUpdateEvent", objArray);
          obj1 = obj1.b;
          a = receiver.d.d(g.c).a;
          int i1 = 1;
          boolean b = (a == 90 || a == 270)? true: false;
          MagicSafeUIAreaController o = receiver.o;
          RectF left = obj1.left;
          RectF right = obj1.right;
          RectF top = obj1.top;
          RectF bottom = obj1.bottom;
          Objects.requireNonNull(o);
          MagicSafeUIAreaHandler magicSafeUIA = MagicSafeUIAreaHandler.class;
          int i2 = 5;
          if (PatchProxy.isSupport(magicSafeUIA)) {
             Object[] objArray1 = new Object[i2];
             objArray1[i] = Float.valueOf(left);
             objArray1[i1] = Float.valueOf(right);
             objArray1[2] = Float.valueOf(top);
             objArray1[3] = Float.valueOf(bottom);
             objArray1[4] = Boolean.valueOf(b);
             if (!PatchProxy.applyVoid(objArray1, o, magicSafeUIA, str)) {
             label_0097 :
                MagicSafeUIAreaHandler d = o.d;
                if (d == null) {
                   a.S("safeUIAreaCalculator");
                }
                Objects.requireNonNull(d);
                c uoc = c.class;
                if (PatchProxy.isSupport(uoc)) {
                   Object[] objArray2 = new Object[i2];
                   objArray2[i] = Float.valueOf(left);
                   objArray2[i1] = Float.valueOf(right);
                   objArray2[2] = Float.valueOf(top);
                   objArray2[3] = Float.valueOf(bottom);
                   objArray2[4] = Boolean.valueOf(b);
                   if (!PatchProxy.applyVoid(objArray2, d, uoc, "5")) {
                   }
                }else {
                }
             }
          }else {
             goto label_0097 ;
          }
          d l = receiver.l;
          if (l != null) {
             l.postDelayed(new b(new MagicSafeUIAreaController$handleDuetLayoutUpdateEvent$1(receiver.o)), 300);
          }
       }
       return;
    }
}
