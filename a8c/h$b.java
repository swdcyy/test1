package a8c.h$b;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a8c.e;
import java.util.Map;
import java.util.HashMap;

public final class h$b implements g	// class@0000a1
{
    public final PublishSubject b;
    public final boolean c;
    public final b d;

    public void h$b(boolean p0){
       super();
       this.b = PublishSubject.g();
       this.c = p0;
       this.d = new b(null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
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
          obj.put(h$b.class, new e());
       }else {
          obj.put(h$b.class, null);
       }
       return obj;
    }
}
