package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$i;
import com.yxcorp.gifshow.util.r0$c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import q16.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import oc9.t;

public final class MultiTakePictureController$i implements r0$c	// class@000ed4
{
    public final MultiTakePictureController a;

    public void MultiTakePictureController$i(MultiTakePictureController p0){
       this.a = p0;
       super();
    }
    public final void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$i.class, "1")) {
          return;
       }
       d d = this.a.d;
       a.o(d, "mCallerContext");
       w ow = d.b();
       a.o(ow, "mCallerContext.controllerManager");
       List list = ow.za();
       a.o(list, "mCallerContext.controllerManager.controllers");
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          iterator.next().lc(p0);
       }
       return;
    }
}
