package q56.e;
import x97.l;
import com.kwai.framework.model.router.RouteType;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.StringBuilder;

public class e implements l	// class@002233
{
    public RouteType a;

    public void e(RouteType p0){
       super();
       this.a = p0;
    }
    public String a(){
       Host obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a().c(this.a.mName);
       if (obj == null) {
          return "";
       }
       StringBuilder str = "";
       str = (obj.mIsHttps != null && !d.a().b(this.a.mName))? str+"https": str+"http";
       return str+"://"+obj.mHost;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       d.a().f(this.a.mName, d.a().c(this.a.mName));
       return;
    }
}
