package cy9.i;
import y8c.f$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy9.n;
import java.util.Map;

public final class i extends f$b	// class@001e3b
{
    public PublishSubject h;
    public boolean i;
    public final QPhoto j;

    public void i(QPhoto p0){
       a.p(p0, "mQPhoto");
       super();
       this.j = p0;
       this.h = PublishSubject.g();
       this.i = true;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(i.class, new n());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
}
