package c42.d$a;
import cq5.c;
import c42.d;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import cq5.a$a;
import wq5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kp3.e;
import java.lang.Integer;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import hb2.g$b;
import java.lang.Boolean;

public class d$a implements c	// class@0004b1
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public RecyclerView a(){
       return this.a.x;
    }
    public void b(a$a p0){
       this.a.B = p0;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "6")) {
          return;
       }
       this.a.v.y(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.a.S8();
       return;
    }
    public void e(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       d d = this.a.D;
       if (d != null) {
          QPhoto qPhoto = d.N0(p0);
          if (qPhoto != null) {
             uoa = this.a;
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidOneRefs(qPhoto, uoa, d.class, "13")) {
                uoa.V8(qPhoto);
                uoa.R8(qPhoto);
                d b = uoa.B;
                if (b != null) {
                   b.b();
                }
             }
          }
       }
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "5")) {
          return;
       }
       this.a.v.k(p0);
       return;
    }
    public View g(){
       a0 obj = PatchProxy.apply(null, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.u.l1;
       if (obj != null) {
          return obj.i();
       }
       return null;
    }
    public boolean h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d$a obj = PatchProxy.apply(objArray, this, d$a.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, d.class, "12");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.v.s();
       return b;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void j(){
       this.a.B = null;
    }
}
