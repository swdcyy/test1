package bac.i$a;
import y8c.f$b;
import fac.c;
import io.reactivex.subjects.PublishSubject;
import fac.b;
import bac.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bac.g;
import java.util.Map;

public class i$a extends f$b	// class@000409
{
    public c h;
    public PublishSubject i;
    public PublishSubject j;
    public b k;
    public i l;

    public void i$a(f$b p0,c p1,PublishSubject p2,PublishSubject p3,b p4,i p5){
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(i$a.class, new g());
       }else {
          obj.put(i$a.class, null);
       }
       return obj;
    }
}
