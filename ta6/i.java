package ta6.i;
import ia0.g;
import java.lang.Object;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import com.yxcorp.retrofit.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ta6.g;
import java.lang.Number;
import ta6.a;
import com.yxcorp.retrofit.f;
import ta6.e;
import com.yxcorp.retrofit.c$b;
import ta6.h;

public class i implements g	// class@002492
{

    public void i(){
       super();
    }
    public a a(RouteType p0,z p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(p0, p1);
    }
    public float b(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return a.b();
    }
    public f e(){
       return new e();
    }
    public c$b m(){
       return new h();
    }
}
