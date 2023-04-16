package e3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.d2;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import j2a.b;
import android.content.res.Resources;
import cw9.c;
import uw9.m3;

public final class b	// class@002060
{

    public void b(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)d2.e() * 0.26f);
    }
    public static int b(Activity p0,QPhoto p1,boolean p2){
       int i;
       int i1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p2 && !b.e(p1)) {
          i = c.b(p0.getResources(), R.dimen.arg_RES_7f070c59);
          if (PatchProxy.isSupport(uob)) {
             Object obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.TRUE, null, b.class, "3");
             if (obj1 != PatchProxyResult.class) {
                i1 = obj1.intValue();
             label_0055 :
                i = i + i1;
             }
          }
          i1 = m3.e(p0, p1);
          goto label_0055 ;
       }else {
          i = 0;
       }
       return i;
    }
}
