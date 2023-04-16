package i02.u;
import u91.b;
import lp3.a;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.framework.abtest.f;
import com.kwai.sdk.switchconfig.a;

public class u extends a implements b	// class@0027fe
{

    public void u(){
       super();
    }
    public boolean H5(String p0,String p1,boolean p2){
       boolean b;
       if (PatchProxy.isSupport(u.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, u.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0.equals("abtest")) {
          p0 = PatchProxy.applyOneRefs(p1, this, u.class, "2");
          b = (p0 != PatchProxyResult.class)? p0.booleanValue(): f.a(p1);
          return b;
       }else if(p0.equals("kswitch")){
          if (PatchProxy.isSupport(u.class)) {
             p0 = PatchProxy.applyTwoRefs(p1, Boolean.valueOf(p2), this, u.class, "3");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             label_0067 :
                return b;
             }
          }
          b = a.t().d(p1, p2);
          goto label_0067 ;
       }else {
          return false;
       }
    }
}
