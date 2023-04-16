package a29.k$a;
import qp7.b1;
import a29.k;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import lnc.d6;

public class k$a implements b1	// class@000037
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       k1.r(this.a.C, 100);
       return;
    }
    public void d(boolean p0){
       a1.h(this, p0);
    }
    public void e(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       k$a ta = this.a;
       ta.z = false;
       ta.D = false;
       ta.E = false;
       ta.F = false;
       k1.m(ta.C);
       this.a.t0();
       return;
    }
    public void f(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       k$a ta = this.a;
       ta.z = true;
       ta.n0(d6.c(ta.t));
       ta = this.a;
       if (ta.F != null && ta.E == null) {
          ta.o0();
       }
       return;
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
