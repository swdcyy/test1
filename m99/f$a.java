package m99.f$a;
import y8c.f$b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import n89.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m99.e;
import java.util.Map;

public class f$a extends f$b	// class@002e2d
{
    public PhotoDetailParam h;
    public a i;
    public boolean j;

    public void f$a(f$b p0,PhotoDetailParam p1,a p2,boolean p3){
       super(p0);
       this.i = p2;
       this.h = p1;
       this.j = p3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(f$a.class, new e());
       }else {
          obj.put(f$a.class, null);
       }
       return obj;
    }
}
