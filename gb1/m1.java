package gb1.m1;
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
import com.kwai.framework.model.live.LiveAdminPrivilege;
import lnc.a1;
import gb1.i1;
import eb1.a;
import gb1.j1;
import java.lang.Boolean;
import android.app.Activity;
import com.kwai.framework.model.user.UserInfo;
import cb1.c;
import cb1.b;
import brd.t;
import gb1.k1;
import gb1.l1;
import erd.g;
import crd.b;

public class m1 extends e	// class@002474
{

    public void m1(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, m1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.b();
       if (!this.f(obj.e())) {
          return objArray;
       }
       a uoa = new a(this.c.mType);
       if (obj.g().mForbidComment != null) {
          uoa.d(a1.p(R.string.arg_RES_7f102078));
          uoa.e(new i1(this));
       }else {
          uoa.d(a1.p(R.string.arg_RES_7f1020a2));
          uoa.e(new j1(this));
       }
       return uoa;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, m1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.g() != null && (this.b.getActivity() != null && obj.f() != null)))? true: false;
       return b;
    }
    public final void j(boolean p0){
       m1 om1 = m1.class;
       if (PatchProxy.isSupport(om1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om1, "5")) {
          return;
       }
       b uob = this.b.b();
       this.c(b.b().g(uob.c(), uob.f().mId, p0).subscribe(new k1(this, uob, p0), new l1(this, uob, p0)));
       return;
    }
}
