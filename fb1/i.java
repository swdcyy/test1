package fb1.i;
import eb1.e;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import db1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import db1.b;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Boolean;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.basic.model.StreamType;
import java.lang.Integer;
import java.util.List;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import lnc.a1;
import fb1.e;
import eb1.a;
import fb1.f;
import com.kwai.framework.model.user.UserInfo;
import android.app.Activity;
import cb1.c;
import cb1.b;
import brd.t;
import fb1.g;
import fb1.h;
import erd.g;
import crd.b;

public class i extends e	// class@0022de
{

    public void i(b p0,LiveAdminAbilityModel p1){
       super(p0, p1);
    }
    public a e(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       b obj = PatchProxy.apply(null, this, oi, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b.b();
       if (!this.f(obj.e())) {
          return null;
       }
       b h = obj.h;
       Object obj1 = PatchProxy.applyOneRefs(h, this, oi, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          LiveAdminAbilityModel mExtInfo = this.c.mExtInfo;
          b = (mExtInfo != null && (!q.f(mExtInfo.mTargetLiveStreamTypes) && h != null))? this.c.mExtInfo.mTargetLiveStreamTypes.contains(Integer.valueOf(h.toInt())): false;
       }
       if (!b) {
          return null;
       }else {
          a uoa = new a(this.c.mType);
          if (obj.g().mControl != null) {
             uoa.d(a1.p(R.string.arg_RES_7f102075));
             uoa.e(new e(this));
          }else {
             uoa.d(a1.p(R.string.arg_RES_7f10209e));
             uoa.e(new f(this));
          }
          return uoa;
       }
    }
    public boolean g(){
       b obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.b();
       boolean b = (obj.g() != null && (obj.f() != null && (obj.e() != null && this.b.getActivity() != null)))? true: false;
       return b;
    }
    public final void j(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "6")) {
          return;
       }
       b uob = this.b.b();
       this.c(b.b().j(uob.c(), uob.f().mId, p0).subscribe(new g(this, uob, p0), new h(this, uob, p0)));
       return;
    }
}
