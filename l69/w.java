package l69.w;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i69.j;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import o69.m1;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import s69.b;
import l69.x;
import java.lang.Runnable;
import t45.c;

public final class w	// class@002cb4
{
    public static final String a = "KwaiStyleDownloadHelper";
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final w e;

    static {
       w.e = new w();
       w.b = new HashMap();
       w.c = new HashMap();
       w.d = new HashMap();
    }
    public void w(){
       super();
    }
    public static final HashMap a(w p0){
       return w.c;
    }
    public static final HashMap b(w p0){
       return w.b;
    }
    public static final HashMap c(w p0){
       return w.d;
    }
    public static final String d(w p0){
       return w.a;
    }
    public final void e(AICutStyle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "4")) {
          return;
       }
       w.d.remove(p0.getId());
       w.c.remove(p0.getId());
       w.b.remove(p0.getId());
       return;
    }
    public final void f(int p0,AICutStyle p1,j p2){
       m1 a;
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, w.class, "2")) {
          return;
       }
       a.p(p1, "info");
       a.p(p2, "callback");
       a = m1.a;
       String str = a.a();
       String str1 = a.c(p1);
       String a1 = w.a;
       int i = 0;
       Object[] objArray = new Object[i];
       g.D().s(a1, "download: desFolder="+str+" desFileName="+str1, objArray);
       String[] stringArray = b.a(p1.getResourceUrls(), null);
       a.o(stringArray, "AICutCDNUtil.convertToUr¡­\(info.resourceUrls, null\)");
       if (PatchProxy.isSupport(ow)) {
          Object[] objArray1 = new Object[]{Integer.valueOf(p0),stringArray,p2,p1,str,str1};
          if (!PatchProxy.applyVoid(objArray1, this, ow, "3")) {
          label_0088 :
             Object[] objArray2 = new Object[i];
             g.D().s(a1, "addDownloadTask: info="+p1, objArray2);
             if (w.c.containsKey(p1.getId())) {
                Object[] objArray3 = new Object[i];
                g.D().A(a1, "addDownloadTask: ignore this, mDownloadIds contains "+p1.getId(), objArray3);
             }else {
                x ox = new x(str, str1, p1, p0, stringArray, p2);
                c.a(ow);
             }
          }
       }else {
          goto label_0088 ;
       }
       return;
    }
}
