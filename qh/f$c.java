package qh.f$c;
import qw6.a;
import qh.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ef5.f;
import ef5.e;
import java.util.Objects;
import ef5.a;
import java.util.Iterator;
import java.lang.Iterable;

public final class f$c implements a	// class@0029de
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void H2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$c.class, "2")) {
          return;
       }
       f uof = this.b.u.c();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "4")) {
          uof.c = true;
          Iterator iterator = uof.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().H2();
          }
       }
       return;
    }
    public void N2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$c.class, "4")) {
          return;
       }
       f uof = this.b.u.c();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "5")) {
          uof.c = false;
          Iterator iterator = uof.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().N2();
          }
       }
       return;
    }
    public void Q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$c.class, "3")) {
          return;
       }
       f uof = this.b.u.c();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "3")) {
          uof.b = false;
          Iterator iterator = uof.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().Q0();
          }
       }
       return;
    }
    public void Q1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$c.class, "1")) {
          return;
       }
       f uof = this.b.u.c();
       Objects.requireNonNull(uof);
       if (!PatchProxy.applyVoid(objArray, uof, f.class, "2")) {
          uof.b = true;
          Iterator iterator = uof.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().Q1();
          }
       }
       return;
    }
}
