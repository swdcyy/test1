package fw8.a;
import on5.m$a;
import java.lang.String;
import java.lang.Object;
import zr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fw8.a$a;
import zr6.g;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import hsa.f;
import wn5.b;
import java.lang.Boolean;
import java.lang.Integer;
import wq6.e;
import android.content.Intent;
import android.net.Uri;
import on5.n;
import ekd.x0;
import wq6.h;
import isa.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import on5.o;

public class a extends m$a	// class@002357
{

    public void a(){
       super("ato_operate");
    }
    public b d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(p0);
    }
    public void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       f uof = null;
       Object obj = p0.f();
       if (obj instanceof DynamicTabConfig) {
          uof = new f(obj);
       }
       if (uof != null) {
          p0.a("KEY_TAB_NAME_DEST", new b(uof.a.mTabName));
          p0.a("KEY_OPERATE_BOTTOM_ALPHA", Boolean.valueOf(uof.k()));
          p0.a("KEY_OPERATE_TAB_CONFIG", uof);
          p0.a("KEY_X_BLOCK_TAB_BACKGROUND", Integer.valueOf(uof.j()));
       }
       return;
    }
    public boolean f(e p0,Intent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.f(p0, p1)) {
          return b;
       }
       boolean b1 = n.d(p1.getData(), "kwai", "home", "activity");
       if (b1) {
          String str = x0.a(p1.getData(), "activityId");
          a uoa = p0.q("KEY_OPERATE_TAB_CONFIG");
          if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, uoa.m())) {
             b = 0;
          }
          b1 = b;
       }
       if (b1) {
          o.a("activity", false);
       }
       return b1;
    }
}
