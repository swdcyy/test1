package jc9.j;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import hc9.e;
import jc9.b0;
import com.yxcorp.gifshow.camera.record.base.d;
import fe9.b;
import jc9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import fe9.a;
import jc9.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import android.view.View;
import java.util.Objects;
import ee9.c;
import jc9.i;
import erd.g;
import crd.b;
import ig9.b;
import jc9.c;
import zb9.j;
import jc9.d;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import jc9.h;
import eoc.f;
import j4b.l;
import jc9.e;
import lm6.j;
import jc9.f;
import j4b.j;
import jc9.g;
import hc9.e$a;
import ad9.i;

public class j extends e0	// class@002942
{
    public b0 q;

    public void j(CameraPageType p0,b p1,e p2){
       super(p0, p1);
       this.q = new b0(p1, p2);
       this.d.n(b.class, b.a);
       this.d.n(a.class, new a(this, p2));
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       super.I7();
       Object[] objArray = new Object[0];
       a.D().s("DownloadBarController", "onCaptureStart", objArray);
       this.q.d(2);
       return;
    }
    public void k(View p0){
       j oj = j.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, str)) {
          return;
       }
       super.k(p0);
       j tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(null, tq, b0.class, str)) {
          tq.e.j(false);
          tq.e.k(false);
       }
       if (!PatchProxy.applyVoid(null, this, oj, "6")) {
          this.Y1(this.d.l(c.class, new i(this)));
          this.Y1(this.d.l(b.class, new c(this)));
          this.Y1(this.d.l(j.class, new d(this)));
          this.Y1(f.a(PanelShowEvent.class, new h(this)));
          this.Y1(f.a(l.class, new e(this)));
          this.Y1(f.a(j.class, new f(this)));
          this.Y1(f.a(j.class, new g(this)));
       }
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "5")) {
          return;
       }
       super.onDestroy();
       j tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, b0.class, "13")) {
          tq.e.i(tq);
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "4")) {
          return;
       }
       super.onDestroyView();
       j tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, b0.class, "12")) {
          if (tq.e.g() != 7) {
             tq.e.c(objArray, 1);
          }
          tq.d.c(false);
          tq.e();
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       super.q1();
       Object[] objArray = new Object[0];
       a.D().s("DownloadBarController", "onCaptureInterrupted", objArray);
       this.q.d(2);
       return;
    }
}
