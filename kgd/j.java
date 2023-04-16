package kgd.j;
import erd.o;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.jvm.internal.a;
import ghd.v;

public final class j implements o	// class@00179a
{
    public final boolean b;

    public void j(boolean p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Result result = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (result != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          v.b((this.b ^ 0x01));
          result = Result.box-impl(Result.constructor-impl(p0));
       }
       return result;
    }
}
