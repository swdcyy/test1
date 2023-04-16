package dlb.b;
import om6.g;
import java.lang.Object;
import r26.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.mockphoto.d;

public class b implements g	// class@0024bf
{

    public void b(){
       super();
    }
    public QPhoto LC(a p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.c(p0, p1);
    }
    public QPhoto SP(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = d.c(p0, true);
       }
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
}
