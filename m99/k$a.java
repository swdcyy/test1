package m99.k$a;
import y8c.f$b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import y8c.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m99.j;
import java.util.Map;

public class k$a extends f$b	// class@002e33
{
    public PhotoDetailParam h;
    public a i;

    public void k$a(f$b p0,PhotoDetailParam p1,a p2){
       super(p0);
       this.h = p1;
       this.i = p2;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(k$a.class, new j());
       }else {
          obj.put(k$a.class, null);
       }
       return obj;
    }
}
