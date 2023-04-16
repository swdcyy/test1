package gb1.s;
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
import gb1.m;
import eb1.a;
import gb1.n;
import java.lang.Boolean;
import android.app.Activity;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import cb1.c;
import cb1.b;
import brd.t;
import cjd.e;
import erd.o;
import gb1.r;
import gb1.i;
import erd.g;
import crd.b;
import gb1.p;
import gb1.q;

public class s extends e	// class@002487
{

    public void s(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.b();
       if (!this.f(obj.e())) {
          return objArray;
       }
       a uoa = new a(this.c.mType);
       if (obj.i()) {
          uoa.f(a1.p(R.string.arg_RES_7f101d2b));
          uoa.d(a1.p(R.string.arg_RES_7f1028af));
          uoa.e(new m(this));
       }else {
          uoa.f(a1.p(R.string.arg_RES_7f101d18));
          uoa.d(a1.p(R.string.arg_RES_7f102225));
          uoa.e(new n(this));
       }
       return uoa;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (this.b.getActivity() != null && obj.f() != null))? true: false;
       return b;
    }
    public final void j(LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig p0,String p1,UserInfo p2,boolean p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, s.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c(b.b().i(p1, p2.mId, String.valueOf(p0.mDurationMS)).map(new e()).subscribe(new r(this, p2, p3, p0), new i(this, p2, p3, p0)));
       return;
    }
    public final void k(String p0,UserInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "6")) {
          return;
       }
       this.c(b.b().b(p0, p1.mId).map(new e()).subscribe(new p(this, p1), new q(this, p1)));
       return;
    }
}
