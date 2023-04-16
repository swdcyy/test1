package d59.x;
import y49.f;
import d59.v;
import java.lang.String;
import msd.l;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import a59.e;

public final class x extends f	// class@002066
{
    public final v d;

    public void x(v p0,String p1,l p2){
       this.d = p0;
       super(p1, p2);
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       p0.z = p1;
       return this.e();
    }
}
