package h71.l$c;
import erd.g;
import asd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import o63.m;
import o63.m$a;

public final class l$c implements g	// class@00263c
{
    public final c b;

    public void l$c(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$c.class, "1")) {
       }else {
          this.b.resumeWith(Result.constructor-impl(m$a.e(m.g, null, 1, null)));
       }
       return;
    }
}
