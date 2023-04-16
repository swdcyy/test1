package cx8.b;
import io.reactivex.g;
import java.lang.String;
import com.kwai.poi.service.model.KLocation;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cx8.b$a;
import ee6.a;
import lk7.a;

public final class b implements g	// class@00200d
{
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final KLocation g;
    public final String h;

    public void b(String p0,String p1,boolean p2,String p3,String p4,KLocation p5,String p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       a.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, new b$a(p0));
       return;
    }
}
