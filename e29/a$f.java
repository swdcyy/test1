package e29.a$f;
import erd.g;
import e29.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import wy5.a;

public final class a$f implements g	// class@002133
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b.A;
             if (p0 == 1) {
                a.l(System.currentTimeMillis());
                a.h((a.a() + 1));
                this.b.q0(1, false);
             }else if(p0 == 2){
                a.i(1);
                this.b.q0(1, 1);
             }
          }
       }
       return;
    }
}
