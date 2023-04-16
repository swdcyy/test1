package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$recommend$4;
import grd.d;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$recommend$4$onStart$1;
import msd.l;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import e17.i;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import java.lang.StringBuilder;
import w46.b;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$c;
import q87.c;

public final class MultiTakePictureController$recommend$4 extends d	// class@000eea
{
    public final MultiTakePictureController c;

    public void MultiTakePictureController$recommend$4(MultiTakePictureController p0){
       this.c = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController$recommend$4.class, "1")) {
          return;
       }
       this.c.Y1(this);
       this.c.v2(R.string.arg_RES_7f1048a9, new MultiTakePictureController$recommend$4$onStart$1(this));
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MultiTakePictureController$recommend$4.class, "4")) {
          return;
       }
       this.c.u2();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$recommend$4.class, "3")) {
          return;
       }
       a.p(p0, "e");
       i.a(R.style.arg_RES_7f11066a, 0x7f1048ab);
       a.D().e(MultiTakePictureController.V.c(), "recommend error: "+p0, p0);
       this.b();
       return;
    }
    public void onSuccess(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$recommend$4.class, "2")) {
       }else {
          a.p(p0, "items");
          a uoa = 1;
          int i = 0;
          if (!p0 instanceof Collection || !p0.isEmpty()) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                MultiTakePictureController$b uob = (!iterator.next().a() - 1)? 1: null;
                if (!uob) {
                   uoa = null;
                   break ;
                }
             }
          }
          if (uoa) {
             objArray = new Object[i];
             a.D().w(MultiTakePictureController.V.c(), "recommend failure: "+p0, objArray);
             i.a(R.style.arg_RES_7f11066a, 0x7f1048ab);
          }else {
             objArray = new Object[i];
             a.D().w(MultiTakePictureController.V.c(), "recommend success: "+p0, objArray);
             i.a(R.style.arg_RES_7f11066a, 0x7f1048ae);
          }
          this.b();
       }
       return;
    }
}
