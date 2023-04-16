package k19.t$a;
import y8c.f$b;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k19.y;
import java.util.Map;

public class t$a extends f$b	// class@002a96
{
    public PublishSubject h;
    public List i;
    public QPhoto j;

    public void t$a(f$b p0,PublishSubject p1,List p2,QPhoto p3){
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, t$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(t$a.class, new y());
       }else {
          obj.put(t$a.class, null);
       }
       return obj;
    }
}
