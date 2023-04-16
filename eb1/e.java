package eb1.e;
import eb1.b;
import crd.b;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import java.lang.Object;
import crd.a;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import db1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import bb1.d;
import lnc.b9;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Boolean;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo;
import java.util.Collection;
import ekd.q;
import java.lang.Enum;
import java.lang.Integer;
import java.util.List;
import eb1.a;
import u07.t$a;
import android.app.Activity;
import java.lang.CharSequence;
import eb1.d;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import io.reactivex.internal.disposables.DisposableHelper;

public abstract class e implements b, b	// class@0020cb
{
    public b b;
    public LiveAdminAbilityModel c;
    public final a d;

    public void e(b p0,LiveAdminAbilityModel p1){
       super();
       this.d = new a();
       this.b = p0;
       this.c = p1;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a uoa = this.b();
       if (uoa != null) {
          p0.accept(uoa);
       }
       return;
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g()) {
          return this.e();
       }
       b.B(LiveLogTag.LIVE_ADMIN, "直播管理弹窗选项参数不全:"+this.c);
       return null;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.d.c(p0);
       return;
    }
    public d d(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.c();
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       b9.a(this.d);
       return;
    }
    public abstract a e();
    public boolean f(LiveApiParams$AssistantType p0){
       LiveAdminAbilityModel obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.mExtInfo;
       if (obj == null) {
          return false;
       }
       if (q.f(obj.mTargetUserTypes)) {
          return false;
       }
       return this.c.mExtInfo.mTargetUserTypes.contains(Integer.valueOf(p0.ordinal()));
    }
    public abstract boolean g();
    public void h(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "9")) {
          return;
       }
       t$a uoa = new t$a(this.b.getActivity());
       uoa.X0(p0);
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new d(p1));
       uoa.v(true);
       j.d(uoa);
       return;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (this.d() != null) {
          p0.accept(this.d());
       }
       return;
    }
    public boolean isDisposed(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DisposableHelper.isDisposed(this.d);
    }
}
