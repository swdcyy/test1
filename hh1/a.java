package hh1.a;
import hh1.j;
import java.lang.String;
import yg1.e;
import yg1.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import dh1.c;
import dh1.b;
import eh1.a;
import brd.t;
import hh1.a$a;
import erd.o;
import t45.d;
import brd.z;
import hh1.a$b;
import hh1.a$c;
import erd.g;
import crd.b;

public final class a extends j	// class@0026ab
{

    public void a(){
       super();
    }
    public void a(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       b uob = b.b().b(p1.a().a).map(a$a.b).observeOn(d.a).subscribe(new a$b(p2, p0), new a$c(p2, p0));
       a.o(uob, "LiveGiftBoxApiService.ge¡­it\n          \)\n        }\)");
       this.b(uob);
       return;
    }
}
