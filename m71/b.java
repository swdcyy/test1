package m71.b;
import zs1.g;
import asd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.Result;
import o63.m;
import o63.m$a;
import com.yxcorp.gifshow.exception.ServerException;

public final class b implements g	// class@003132
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       String str = null;
       if (p0) {
          this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, "", false, 2, str)));
       }else if(p1 instanceof ServerException){
          this.a.resumeWith(Result.constructor-impl(m.g.a(p1.errorCode, p1.errorMessage)));
       }else {
          b ta = this.a;
          m$a g = m.g;
          if (p1 != null) {
             str = p1.getMessage();
          }
          ta.resumeWith(Result.constructor-impl(g.a(-1, str)));
       }
       return;
    }
}
