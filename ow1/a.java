package ow1.a;
import im3.b;
import ry1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import ow1.a$a;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a extends b	// class@0035b3
{
    public b b;
    public final b c;

    public void a(b p0){
       a.p(p0, "audienceStatusObtainService");
       super();
       this.c = p0;
       this.b = p0.W().subscribe(new a$a(this));
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       return;
    }
}
