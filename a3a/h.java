package a3a.h;
import vo5.r;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a3a.f;
import a3a.g;

public class h implements r	// class@000029
{

    public void h(){
       super();
    }
    public i JU(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(p0);
    }
    public i fn(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g();
    }
    public boolean isAvailable(){
       return true;
    }
}
