package oh1.a;
import oh1.c;
import java.lang.Object;
import xg1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import lj1.b;
import oh1.b;
import java.lang.Integer;

public final class a implements c	// class@0034f2
{
    public final a a;

    public void a(){
       super();
       this.a = new a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       return;
    }
    public void d(){
       b.f(this);
    }
    public void e(int p0,b p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1);
       }
       return;
    }
    public void f(int p0,b p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0, p1);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       Iterator iterator = this.a.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
}
