package l71.m;
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

public final class m implements l$a	// class@002ea1
{
    public final c a;

    public void m(c p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       m ta = this.a;
       m$a g = m.g;
       int i = a.b(p0);
       String message = (p0 != null)? p0.getMessage(): null;
       ta.resumeWith(Result.constructor-impl(g.a(i, message)));
       return;
    }
    public void onSuccess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "1")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, objArray, false, 3, objArray)));
       return;
    }
}
