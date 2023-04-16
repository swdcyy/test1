package lod.g;
import erd.g;
import bod.a;
import brd.v;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bod.b;
import brd.g;

public final class g implements g	// class@001c81
{
    public final a b;
    public final v c;

    public void g(a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          int i = 200;
          if (p0 != null && p0.intValue() == i) {
             b.a(this.b);
             this.c.onComplete();
          }else {
             g og = -2;
             if (p0 == null || p0.intValue() != og) {
                this.c.onNext(p0);
             }
          }
       }
       return;
    }
}
