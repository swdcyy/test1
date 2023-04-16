package h71.v;
import erd.g;
import asd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import o63.m;
import o63.m$a;
import java.lang.Exception;
import kotlin.Result;

public final class v implements g	// class@00264b
{
    public final c b;

    public void v(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
       }else if(p0 instanceof KwaiException){
          p0 = m.g.a(p0.getErrorCode(), p0.getMessage());
       }else {
          p0 = m.g.b(new Exception(p0));
       }
       this.b.resumeWith(Result.constructor-impl(p0));
       return;
    }
}
