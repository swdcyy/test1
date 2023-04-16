package bjc.h$b;
import im8.g;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.share.widget.d$e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bjc.f;
import java.util.Map;
import java.util.HashMap;

public class h$b implements g	// class@000488
{
    public k b;
    public QPhoto c;
    public PublishSubject d;
    public d$e e;

    public void h$b(k p0,QPhoto p1,PublishSubject p2,d$e p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h$b.class, new f());
       }else {
          obj.put(h$b.class, null);
       }
       return obj;
    }
}
