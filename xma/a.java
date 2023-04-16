package xma.a;
import qn.l;
import java.lang.Object;
import rn.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public abstract class a implements l	// class@0048c4
{

    public void a(){
       super();
    }
    public void a(){
    }
    public void b(){
    }
    public final void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "popup");
       this.i();
       return;
    }
    public final void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.b();
       return;
    }
    public final void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       this.h();
       return;
    }
    public final void f(a p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       a.p(p0, "popup");
       this.g(p1);
       return;
    }
    public void g(int p0){
    }
    public void h(){
    }
    public void i(){
    }
}
