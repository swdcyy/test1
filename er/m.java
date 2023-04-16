package er.m;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import tq.h;
import tq.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er.f;

public abstract class m	// class@001594
{
    public static String a = "vader-client-log";

    public void m(){
       super();
    }
    public static m b(String p0,Map p1,h p2,d p3){
       Object obj = PatchProxy.applyFourRefsWithListener(p0, p1, p2, p3, null, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(m.class, "3");
       return new f(p0, p1, p2, p3);
    }
    public abstract Map a();
    public abstract String c();
    public abstract d d();
    public abstract h e();
}
