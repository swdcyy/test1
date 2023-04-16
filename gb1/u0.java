package gb1.u0;
import eb1.e;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import db1.b;
import lnc.a1;
import gb1.p0;
import eb1.a;
import db1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import gb1.r0;
import gb1.q0;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import android.app.Activity;
import cb1.c;
import cb1.b;
import brd.t;
import cjd.e;
import erd.o;
import gb1.k0;
import gb1.s0;
import erd.g;
import crd.b;
import java.lang.Enum;
import gb1.j0;
import gb1.t0;

public class u0 extends e	// class@00248b
{

    public void u0(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public static void j(u0 p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, u0.class, "5")) {
       }else {
          p0.h(a1.r(R.string.arg_RES_7f101fec, p0.b.b().h()), new p0(p0));
       }
       return;
    }
    public a e(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, u0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.b();
       if (!this.f(obj.e())) {
          return objArray;
       }
       a uoa = new a(this.c.mType);
       if (obj.e().isNormalAdmin()) {
          uoa.d(a1.p(R.string.arg_RES_7f101d16));
          uoa.e(new r0(this));
       }else if(obj.e().isSuperAdmin()){
          uoa.d(a1.p(R.string.arg_RES_7f102086));
          uoa.e(new q0(this));
       }else {
          uoa.d(a1.p(R.string.arg_RES_7f10406c));
          uoa.e(new q0(this));
       }
       return uoa;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, u0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.f() != null && this.b.getActivity() != null))? true: false;
       return b;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, u0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.b().f().isWatching();
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, u0.class, "4")) {
          return;
       }
       b uob = this.b.b();
       k0 ok0 = new k0(this, uob);
       this.c(b.b().d(uob.f().mId, uob.c(), this.k()).map(new e()).subscribe(ok0, new s0(this)));
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, u0.class, "6")) {
          return;
       }
       b uob = this.b.b();
       j0 oj0 = new j0(this, uob);
       this.c(b.b().f(uob.f().mId, LiveApiParams$AssistantType.ADMIN.ordinal(), uob.c(), this.k()).map(new e()).subscribe(oj0, new t0(this)));
       return;
    }
}
