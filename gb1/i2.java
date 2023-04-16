package gb1.i2;
import eb1.e;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import db1.b;
import gb1.d2;
import eb1.a;
import db1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import lnc.a1;
import gb1.f2;
import gb1.e2;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import cb1.c;
import cb1.b;
import brd.t;
import cjd.e;
import erd.o;
import gb1.y1;
import gb1.h2;
import erd.g;
import crd.b;
import java.lang.Enum;
import gb1.x1;
import gb1.g2;

public class i2 extends e	// class@002468
{

    public void i2(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public static void j(i2 p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, i2.class, "3")) {
       }else {
          Object[] objArray = new Object[]{p0.b.b().h()};
          p0.h(p0.b.getActivity().getString(R.string.arg_RES_7f101fed, objArray), new d2(p0));
       }
       return;
    }
    public a e(){
       Object[] objArray = null;
       LiveApiParams$AssistantType obj = PatchProxy.apply(objArray, this, i2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.b().e();
       if (!this.f(obj)) {
          return objArray;
       }
       a uoa = new a(this.c.mType);
       if (obj.isSuperAdmin()) {
          uoa.d(a1.p(R.string.arg_RES_7f102cfb));
          uoa.e(new f2(this));
       }else if(obj.isNormalAdmin()){
          uoa.d(a1.p(R.string.arg_RES_7f102a9b));
          uoa.e(new e2(this));
       }else {
          uoa.d(a1.p(R.string.arg_RES_7f102cfd));
          uoa.e(new e2(this));
       }
       return uoa;
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, i2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.e() != null && (obj.f() != null && this.b.getActivity() != null))? true: false;
       return b;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, i2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.b().f().isWatching();
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, i2.class, "6")) {
          return;
       }
       b uob = this.b.b();
       y1 oy1 = new y1(this, uob);
       this.c(b.b().d(uob.f().mId, uob.c(), this.k()).map(new e()).subscribe(oy1, new h2(this)));
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, i2.class, "5")) {
          return;
       }
       b uob = this.b.b();
       x1 ox1 = new x1(this, uob);
       this.c(b.b().f(uob.f().mId, LiveApiParams$AssistantType.SUPER_ADMIN.ordinal(), uob.c(), this.k()).map(new e()).subscribe(ox1, new g2(this)));
       return;
    }
}
