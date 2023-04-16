package i19.k$a;
import yg5.t0;
import i19.k;
import java.lang.Object;
import yg5.s0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import rkd.b;
import java.util.Objects;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Math;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import yg5.r0;

public class k$a implements t0	// class@002611
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       s0.a(this, p0);
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       boolean b;
       k$a uoa = k$a.class;
       int i = 5;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[i1] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       if (b.g()) {
          return;
       }else {
          uoa = this.b;
          b = (p4 == 2)? true: false;
          Objects.requireNonNull(uoa);
          if (PatchProxy.isSupport(k.class)) {
             Object[] objArray1 = new Object[i];
             objArray1[i1] = Integer.valueOf(p0);
             objArray1[1] = Integer.valueOf(p1);
             objArray1[2] = Integer.valueOf(p2);
             objArray1[3] = Float.valueOf(p3);
             objArray1[4] = Boolean.valueOf(b);
             if (PatchProxy.applyVoid(objArray1, uoa, k.class, "3")) {
             label_00c0 :
                return;
             }
          }
          float f = (float)n.k(uoa.getActivity());
          uoa.x = f;
          if (!f) {
             uoa.x = (float)a1.h();
          }
          uoa.y = (float)(p0 - p1);
          float f1 = 0x3f800000;
          float f2 = Math.min(Math.max(p3, 0), f1);
          uoa.t = f2;
          uoa.P8(f2, uoa.x, uoa.y);
          k p = uoa.p;
          if (p != null) {
             p.j.onNext(Float.valueOf((f1 - f2)));
          }
          uoa.r.onNext(Float.valueOf((f1 - f2)));
          goto label_00c0 ;
       }
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
