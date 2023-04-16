package cy9.q;
import y8c.f$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy9.v;
import java.util.Map;

public final class q extends f$b	// class@001e43
{
    public PublishSubject h;
    public boolean i;
    public final QPhoto j;

    public void q(QPhoto p0){
       a.p(p0, "mQPhoto");
       super();
       this.j = p0;
       this.h = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, q.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(q.class, new v());
       }else {
          obj.put(q.class, null);
       }
       return obj;
    }
}
