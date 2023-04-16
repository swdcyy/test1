package l71.d;
import l02.e$a;
import asd.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Result;
import o63.m;
import l71.c$b;
import o63.m$a;

public final class d implements e$a	// class@002e93
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "newUserTag");
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, new c$b(p0), false, 2, null)));
       return;
    }
}
