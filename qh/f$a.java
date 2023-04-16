package qh.f$a;
import vy6.a;
import qh.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ef5.b;
import ef5.e;
import java.util.Objects;
import ef5.a;
import java.util.Iterator;
import java.lang.Iterable;

public final class f$a implements a	// class@0029dc
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void B0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "4")) {
          return;
       }
       b uob = this.b.u.a();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "5")) {
          uob.c = false;
          Iterator iterator = uob.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().B0();
          }
       }
       return;
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "2")) {
          return;
       }
       b uob = this.b.u.a();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "4")) {
          uob.b = false;
          Iterator iterator = uob.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().F1();
          }
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
          return;
       }
       b uob = this.b.u.a();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "2")) {
          uob.b = true;
          Iterator iterator = uob.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().i2();
          }
       }
       return;
    }
    public void k1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "3")) {
          return;
       }
       b uob = this.b.u.a();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "3")) {
          uob.c = true;
          Iterator iterator = uob.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().k1();
          }
       }
       return;
    }
}
