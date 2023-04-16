package knd.d$b;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.PostStartUpResponse;
import faa.a;
import q87.c;
import knd.d;
import knd.d$a;

public final class d$b implements o	// class@0017d8
{
    public static final d$b b;

    static {
       d$b.b = new d$b();
    }
    public void d$b(){
       super();
    }
    public Object apply(Object p0){
       List list = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          list = p0.a().c();
          Object[] objArray = new Object[0];
          a.D().w("RecommendTextRepoV2", "load default recommend text from net info", objArray);
          d.e.a(list);
       }
       return list;
    }
}
