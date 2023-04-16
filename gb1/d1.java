package gb1.d1;
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
import gb1.z0;
import eb1.a;
import gb1.a1;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import android.app.Activity;
import cb1.c;
import cb1.b;
import brd.t;
import gb1.b1;
import gb1.c1;
import erd.g;
import crd.b;

public class d1 extends e	// class@002453
{

    public void d1(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, d1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.b();
       if (!this.f(obj.e())) {
          return objArray;
       }
       a uoa = new a(this.c.mType);
       if (obj.g().mBlock != null) {
          uoa.d(a1.p(R.string.arg_RES_7f102077));
          uoa.e(new z0(this));
       }else {
          uoa.d(a1.p(R.string.arg_RES_7f1020a1));
          uoa.e(new a1(this));
       }
       return uoa;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, d1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.f() != null && this.b.getActivity() != null))? true: false;
       return b;
    }
    public final void j(boolean p0){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod1, "5")) {
          return;
       }
       b uob = this.b.b();
       this.c(b.b().e(uob.c(), uob.f().mId, p0).subscribe(new b1(this, uob, p0), new c1(this, uob, p0)));
       return;
    }
}
