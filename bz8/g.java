package bz8.g;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bz8.l;
import java.util.Map;
import java.util.HashMap;

public final class g implements g	// class@00049a
{
    public d b;
    public f c;
    public PublishSubject d;

    public void g(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.d = publishSubje;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new l());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
}
