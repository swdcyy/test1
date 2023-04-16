package gb1.v1;
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
import gb1.r1;
import eb1.a;
import gb1.s1;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import android.app.Activity;
import cb1.c;
import cb1.b;
import brd.t;
import gb1.t1;
import gb1.u1;
import erd.g;
import crd.b;

public class v1 extends e	// class@00248f
{

    public void v1(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, v1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.b();
       if (!this.f(obj.e())) {
          return objArray;
       }
       a uoa = new a(this.c.mType);
       if (obj.g().mKickUser != null) {
          uoa.d(a1.p(R.string.arg_RES_7f102079));
          uoa.e(new r1(this));
       }else {
          uoa.d(a1.p(R.string.arg_RES_7f1020a3));
          uoa.e(new s1(this));
       }
       return uoa;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, v1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.f() != null && this.b.getActivity() != null))? true: false;
       return b;
    }
    public final void j(boolean p0){
       v1 ov1 = v1.class;
       if (PatchProxy.isSupport(ov1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov1, "5")) {
          return;
       }
       b uob = this.b.b();
       this.c(b.b().h(uob.c(), uob.f().mId, p0).subscribe(new t1(this, uob, p0), new u1(this, uob, p0)));
       return;
    }
}
