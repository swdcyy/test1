package d61.b0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import d61.h;
import android.view.View;
import android.content.res.Resources;
import cw9.c;

public class b0	// class@001f10
{

    public void b0(){
       super();
    }
    public static int a(int p0){
       return (int)((float)p0 / 0x3f100000);
    }
    public static int b(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob0, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return ((p0 + a1.d(0x7f0708ca)) + h.e());
    }
    public static int c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((p0.getBottom() + c.b(p0.getResources(), 0x7f0708ca)) + h.e());
    }
    public static int d(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob0, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return ((p0 + a1.d(0x7f0708fe)) + h.e());
    }
}
