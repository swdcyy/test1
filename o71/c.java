package o71.c;
import wd2.c;
import asd.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.Result;
import o63.m;
import o63.m$a;

public final class c implements c	// class@00349f
{
    public final c a;

    public void c(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m.g.a(p1, p0)));
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, objArray, false, 3, objArray)));
       return;
    }
}
