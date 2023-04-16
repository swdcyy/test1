package kgd.l;
import erd.o;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import lgd.a;

public final class l implements o	// class@0017a2
{
    public final int b;

    public void l(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Result result = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (result != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          RxBus.f.b(new a(this.b));
          result = Result.box-impl(Result.constructor-impl(p0));
       }
       return result;
    }
}
