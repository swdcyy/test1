package ct1.a$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import cm1.a;

public final class a$a	// class@001e49
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final Gift a(CohesionPkInfo p0){
       Gift obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null && !j.g(p0.giftId)) {
          obj = a.a(p0.giftId[0]);
       }
       return obj;
    }
}
