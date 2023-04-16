package com.yxcorp.gifshow.camera.record.photo.m$b;
import hg9.n;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.List;
import java.util.Iterator;
import oc9.t;
import oc9.e0;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.camera.record.photo.h;
import com.yxcorp.gifshow.camera.record.photo.p;
import hg9.f0;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.Fragment;
import j8c.a;
import q87.c;
import java.util.Objects;
import kuaishou.perf.page.impl.d;
import java.lang.StringBuilder;
import eg9.a;
import android.view.View;
import com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent;
import android.net.Uri;
import ekd.w0;
import android.widget.ImageView;

public class m$b implements n	// class@000eb5
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public void n0(int p0){
       t ot;
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       m a = this.b.A;
       if (a != null) {
          a.dismiss();
          this.b.A = null;
       }
       this.b.m2(p0);
       Iterator iterator = this.b.d.b().za().iterator();
       while (iterator.hasNext()) {
          ot = iterator.next();
          if (ot instanceof n) {
             ot.n0(p0);
          }
       }
       iterator = this.b.getChildren().iterator();
       while (iterator.hasNext()) {
          ot = iterator.next();
          if (ot instanceof n) {
             ot.n0(p0);
          }
       }
       return;
    }
    public void t0(File p0,Bitmap p1,int p2){
       t ot;
       if (PatchProxy.isSupport(m$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, m$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.d.b().za().iterator();
       while (iterator.hasNext()) {
          ot = iterator.next();
          if (ot instanceof n) {
             ot.t0(p0, p1, p2);
          }
       }
       iterator = this.b.getChildren().iterator();
       while (iterator.hasNext()) {
          ot = iterator.next();
          if (ot instanceof n) {
             ot.t0(p0, p1, p2);
          }
       }
       m$b tb = this.b;
       tb.D.m(tb.C.e(), p1, p2, false);
       k1.o(new f0(this, p0, p1, p2));
       return;
    }
    public void x0(File p0,Bitmap p1,int p2){
       m a;
       t ot;
       if (PatchProxy.isSupport(m$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, m$b.class, "2")) {
          return;
       }
       String str = "TakePictureController";
       if (this.b.f.isDetached()) {
          Object[] objArray = new Object[0];
          a.D().w(str, "onCaptureSuccess after detached", objArray);
          return;
       }else {
          a = this.b.A;
          if (a != null) {
             a.dismiss();
             this.b.A = null;
          }
          if (p0 != null && p0.exists()) {
             m$b tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), tb, m.class, "25")) {
                if (!tb.D.i()) {
                   d.d("postPhotoToEditorMonitor").h("clickToTakeSuccess");
                   d.d("postPhotoToEditorMonitor").g("takeSuccessToDoBackground");
                }
                Object[] objArray1 = new Object[0];
                a.D().s(str, "onTakePicture\(\) called with: pictureFile = ["+p0+"]", objArray1);
                tb.d.m(new a(0));
                Iterator iterator = tb.d.b().za().iterator();
                while (iterator.hasNext()) {
                   ot = iterator.next();
                   if (ot instanceof n) {
                      ot.x0(p0, p1, p2);
                   }
                }
                iterator = tb.getChildren().iterator();
                while (iterator.hasNext()) {
                   ot = iterator.next();
                   if (ot instanceof n) {
                      ot.x0(p0, p1, p2);
                   }
                }
                if (!tb.D.i()) {
                   p.a(tb.d);
                   tb.D.j(p0, p1, p2);
                }
                if (tb.c1()) {
                   tb.r.setEnabled(true);
                   tb.d.m(new TakePictureEvent(p0, true, 0));
                }else {
                   m t = tb.t;
                   if (t != null) {
                      t.setImageURI(w0.c(p0));
                   }
                }
             }
          }else {
             this.b.m2(true);
          }
          return;
       }
    }
}
