package ii9.f;
import wc9.t;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import oa0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wc9.e;

public class f extends t	// class@002837
{

    public void f(CameraPageType p0,b p1){
       super(p0, p1);
       a.r1(true);
    }
    public int h2(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = super.h2();
       if (i <= 0) {
          i = 3;
       }
       return i;
    }
    public boolean i2(){
       return true;
    }
    public void p2(int p0){
    }
}
