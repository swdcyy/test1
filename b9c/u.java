package b9c.u;
import java.lang.Object;
import y8c.q;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import im8.c;
import java.util.Arrays;
import java.util.Collection;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import e9c.k;
import e9c.f;
import e9c.i;
import hka.l;
import e9c.d;
import qvb.i;
import e9c.a;

public final class u	// class@0003ef
{

    public void u(){
       super();
    }
    public static List a(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{p0,new c("FRAGMENT", p0)};
       return new ArrayList(Arrays.asList(objArray));
    }
    public static PresenterV2 b(q p0,boolean p1){
       PresenterV2 obj;
       if (PatchProxy.isSupport2(u.class, "1")) {
          obj = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), null, u.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new k());
       obj.U7(new f(p0));
       obj.U7(new i(p0));
       if (p1) {
          obj.U7(new d(p0.q()));
       }
       obj.U7(new a());
       PatchProxy.onMethodExit(u.class, "1");
       return obj;
    }
}
