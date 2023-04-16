package e7a.l$b;
import ud5.b;
import e7a.l;
import td5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import td5.b;
import im8.f;
import java.lang.Integer;
import brd.y;

public class l$b extends b	// class@00208d
{
    public final l d;

    public void l$b(l p0){
       this.d = p0;
       super();
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
          return;
       }
       if (this.d.v != null) {
          b uob = new b(1);
          uob.c = p0;
          uob.b = this.d.u.get().intValue();
          this.d.v.onNext(uob);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "4")) {
          return;
       }
       l$b td = this.d;
       l v = td.v;
       if (v != null) {
          v.onNext(new b(4, td.u.get().intValue()));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "2")) {
          return;
       }
       l$b td = this.d;
       l v = td.v;
       if (v != null) {
          v.onNext(new b(2, td.u.get().intValue()));
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "3")) {
          return;
       }
       l$b td = this.d;
       l v = td.v;
       if (v != null) {
          v.onNext(new b(3, td.u.get().intValue()));
       }
       return;
    }
}
