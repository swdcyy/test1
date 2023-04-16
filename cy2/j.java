package cy2.j;
import x71.c;
import cy2.h;
import java.lang.Object;
import u71.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ee1.a;
import ee1.a1;
import yv4.d;

public final class j implements c	// class@002407
{
    public final h a;
    public final boolean b;

    public void j(h p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void c6(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "videoFrame");
       h d = this.a.d;
       if (d != null && d.j() == 2) {
          this.a.d.X(this.b, new a1(p0));
       }
       return;
    }
}
