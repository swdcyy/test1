package o71.e;
import wd2.r;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import o63.m;
import o63.m$a;
import java.lang.Integer;

public final class e implements r	// class@0034a2
{
    public final c a;

    public void e(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, objArray, false, 3, objArray)));
       return;
    }
    public void b(String p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       this.a.resumeWith(Result.constructor-impl(m.g.a(p1, p0)));
       return;
    }
}
