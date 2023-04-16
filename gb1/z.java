package gb1.z;
import eb1.e;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import db1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import db1.b;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import lnc.a1;
import gb1.w;
import eb1.a;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import android.app.Activity;
import gb1.y;
import gb1.x;
import erd.g;
import crd.b;
import cb1.b;

public class z extends e	// class@00249c
{

    public void z(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, z.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.f(this.b.b().e())) {
          return objArray;
       }
       obj = new a(this.c.mType);
       obj.f(a1.p(R.string.arg_RES_7f101d19));
       obj.d(a1.p(R.string.arg_RES_7f10406b));
       obj.e(new w(this));
       return obj;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.f() != null && this.b.getActivity() != null))? true: false;
       return b;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       b uob = this.b.b();
       String str = uob.h();
       String str1 = uob.c();
       y oy = new y(this, str);
       this.c(b.c(str1, uob.f().mId, oy, new x(this)));
       return;
    }
}
