package fi2.d$a;
import ro3.g$d;
import java.util.List;
import dx1.b;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ro3.j;
import fi2.d;
import java.lang.System;
import java.lang.Throwable;

public final class d$a implements g$d	// class@002965
{
    public final List a;
    public final b b;
    public final long c;

    public void d$a(List p0,b p1,long p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       j.b(this, p0);
       d.b.c(true, this.a, this.b, (System.currentTimeMillis() - this.c));
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       j.a(this, p0);
       d.b.c(false, this.a, this.b, (System.currentTimeMillis() - this.c));
       return;
    }
}
