package jg9.q0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Integer;
import java.lang.Number;
import java.util.Objects;
import jg9.v;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import hka.a;

public final class q0 implements g	// class@002aac
{
    public final MultiTakePictureController b;

    public void q0(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i1;
       Object[] obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "1")) {
       }else {
          q0 tb = this.b;
          if (tb.x == null || (tb.v != null && !p0.isEmpty())) {
             ArrayList uArrayList = new ArrayList();
             MultiTakePictureController x = this.b.x;
             a.m(x);
             Iterator iterator = x.K0().iterator();
             int i = 0;
             while (iterator.hasNext()) {
                if (p0.contains(iterator.next().c())) {
                   uArrayList.add(Integer.valueOf(i));
                }
                i = i + 1;
             }
             if (!uArrayList.isEmpty()) {
                i1 = uArrayList.size() - 1;
                while (i1 >= 0) {
                   MultiTakePictureController x1 = this.b.x;
                   a.m(x1);
                   obj = uArrayList.get(i1);
                   a.o(obj, "deleteIndexList[i]");
                   int i2 = obj.intValue();
                   Objects.requireNonNull(x1);
                   t0 ot0 = t0.class;
                   if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), x1, ot0, "5")) {
                      if (x1.e.get(i2).b() > -1) {
                         x1.J0(i2, false);
                      }
                      x1.e.remove(i2);
                      ot0 = x1.h;
                      if (ot0 != null) {
                         ot0.y1(i2);
                      }
                      x1.t0(i2);
                      if (i2 >= 0 && i2 < x1.e.size()) {
                         x1.l0(i2);
                      }else if(i2 == x1.e.size() && i2 > 0){
                         i2 = i2 - 1;
                         x1.l0(i2);
                      }
                   }
                label_00d0 :
                   i1--;
                }
             }
             obj = new Object[false];
             a.D().w(MultiTakePictureController.V.c(), "syncPicture success, delete "+uArrayList.size(), obj);
             i1 = this.b.x;
             a.m(i1);
             if (!i1.K0().size()) {
                i1 = this.b.x;
                if (i1 != null) {
                   i1 = i1.L0();
                   if (i1 != null && !PatchProxy.applyVoid(null, i1, MultiPicturePreviewHelper.class, "10")) {
                      obj = new Object[false];
                      a.D().w("MultiPicturePreviewHelper", "hidePreview", obj);
                      i1 = i1.d;
                      if (i1 != null) {
                         i1.onBackPressed();
                      }
                   }
                }
                MultiTakePictureController.t2(this.b, false, 1, null);
             }
          }
       }
       return;
    }
}
