package o71.b;
import vt1.c;
import o71.a;
import asd.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import vt1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.Result;
import o63.m;
import o63.m$a;
import zb6.a;

public final class b implements c	// class@00349e
{
    public final a a;
    public final c b;

    public void b(a p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void e(String p0,boolean p1,Throwable p2){
       b.b(this, p0, p1, p2);
    }
    public void f(String p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       this.a.m();
       p0 = null;
       if (p1) {
          this.b.resumeWith(Result.constructor-impl(m$a.g(m.g, p0, false, 3, p0)));
       }else {
          int i = a.b(p2);
          if (p2 != null) {
             p0 = p2.getMessage();
          }
          this.b.resumeWith(Result.constructor-impl(m.g.a(i, p0)));
       }
       return;
    }
}
