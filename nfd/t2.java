package nfd.t2;
import f7c.d;
import com.kwai.framework.model.user.User;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import nfd.m0$a;
import nfd.n0;
import wca.m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wca.m$a;
import nfd.m0;

public class t2 extends d	// class@001e0d
{

    public void t2(){
       super();
    }
    public void h4(User p0,boolean p1,View p2,ImageView p3,TextView p4){
       t2 ot2 = t2.class;
       if (PatchProxy.isSupport(ot2)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ot2, "1")) {
             return;
          }
       }
       m0$a uoa = new m0$a();
       uoa.c(n0.h(p1));
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "6");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): m.a(p0).b;
       uoa.f(i);
       uoa.b(1);
       n0.a(p2, p3, p4, uoa.a());
       return;
    }
}
