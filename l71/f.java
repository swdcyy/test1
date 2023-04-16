package l71.f;
import gq1.l$a;
import asd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import o63.m;
import zb6.a;
import o63.m$a;

public final class f implements l$a	// class@002e96
{
    public final c a;

    public void f(c p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       f ta = this.a;
       m$a g = m.g;
       int i = a.b(p0);
       String message = (p0 != null)? p0.getMessage(): null;
       ta.resumeWith(Result.constructor-impl(g.a(i, message)));
       return;
    }
    public void onSuccess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, objArray, false, 3, objArray)));
       return;
    }
}
