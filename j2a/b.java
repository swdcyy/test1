package j2a.b;
import j2a.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import com.yxcorp.gifshow.entity.QPhoto;

public class b	// class@0028f4
{
    public static final x a;

    static {
       b.a = Suppliers.a(a.b);
    }
    public void b(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableShowUserEducation", false);
    }
    public static boolean b(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!c.b() && !VisitorModeManager.f())? true: false;
       return b;
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SystemUtil.a(21);
    }
    public static boolean d(DetailCoverInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || !p0.isVideoPhoto()) {
          return false;
       }
       return b.c();
    }
    public static boolean e(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || !p0.isVideoType()) {
          return false;
       }
       if (p0.getStereoType()) {
          return false;
       }
       return b.c();
    }
}
