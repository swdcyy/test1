package gb1.g;
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
import gb1.c;
import eb1.a;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g extends e	// class@002461
{

    public void g(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.f(this.b.b().e())) {
          return objArray;
       }
       obj = new a(this.c.mType);
       obj.f(a1.p(R.string.arg_RES_7f101d15));
       obj.d(a1.p(R.string.arg_RES_7f101d13));
       obj.e(new c(this));
       return obj;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.f() != null && !TextUtils.x(obj.a())))? true: false;
       return b;
    }
}
