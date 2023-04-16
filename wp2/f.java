package wp2.f;
import wp2.c;
import java.lang.Object;
import crd.a;
import java.util.ArrayList;
import wp2.f$a;
import wp2.f$b;
import wp2.f$c;
import wp2.f$d;
import wp2.a;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableList;
import wp2.a$a;
import wp2.g;
import android.util.Pair;
import wp2.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import crd.b;
import wp2.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public abstract class f implements c	// class@0049f9
{
    public final a a;
    public final a$a b;
    public final a$a c;
    public final a$a d;
    public final a$a e;
    public g f;
    public final g g;
    public a h;
    public boolean i;
    public final List j;

    public void f(){
       super();
       this.h = new a();
       this.i = true;
       this.j = new ArrayList();
       f$a uoa = new f$a(this);
       this.b = uoa;
       f$b uob = new f$b(this);
       this.c = uob;
       f$c uoc = new f$c(this);
       this.d = uoc;
       f$d uod = new f$d(this);
       this.e = uod;
       ImmutableTable$a uoa1 = ImmutableTable.builder();
       uoa1.b(uoa, uob, ImmutableList.of(uob));
       uoa1.b(uob, uoc, ImmutableList.of(uoc));
       uoa1.b(uob, uod, ImmutableList.of(uoc, uod));
       uoa1.b(uoc, uob, ImmutableList.of(uob));
       uoa1.b(uoc, uod, ImmutableList.of(uod));
       this.a = new a(uoa1.a(), uoa);
       this.g = new g();
    }
    public Pair a(){
       return b.a(this);
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.j.add(p0);
       f tg = this.g;
       p0.f = tg;
       p0.i = false;
       tg.b(p0.a());
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       if (p0 != null) {
          this.h.c(p0);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.l(this.c);
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.l(this.e);
       return;
    }
    public e e(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.a(p0);
    }
    public e f(Class p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          return obj.a(p0);
       }
       throw new IllegalArgumentException("Controller:"+this.getClass().getName()+", not has sibling node");
    }
    public void g(){
    }
    public void h(){
    }
    public void i(){
    }
    public void j(){
    }
    public void k(Class p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "4")) {
          return;
       }
       this.g.b(Pair.create(p0, p1));
       return;
    }
    public final void l(a$a p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "12")) {
          return;
       }
       f ta = this.a;
       Objects.requireNonNull(ta);
       List obj = PatchProxy.applyOneRefs(p0, ta, a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = ta.a.get(ta.b, p0);
          if (q.f(obj)) {
             b = false;
          }else {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                a$a uoa = iterator.next();
                uoa.b();
                ta.b = uoa;
                uoa.a();
             }
             b = true;
          }
       }
       if (b) {
          return;
       }else {
          throw new IllegalArgumentException("不能从"+this.a.b+"转到"+p0+",当前Controller："+this.getClass().getName());
       }
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       this.l(this.d);
       return;
    }
}
