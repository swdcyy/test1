package c7c.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import c7c.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import android.view.ViewStub;
import a7c.h;
import android.widget.ImageView;
import lnc.a1;
import c7c.c;
import android.view.View$OnClickListener;
import ekd.m1;

public class d extends PresenterV2	// class@000541
{
    public User p;
    public h q;
    public ViewStub r;
    public View s;
    public boolean t;

    public void d(){
       super();
       this.t = true;
    }
    public static void R8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SET_NICKNAME_ICON";
       i3 oi3 = i3.f();
       oi3.d("set_user_id", p0.getId());
       String str = (p0.isFollowingOrFollowRequesting())? "TRUE": "FALSE";
       oi3.d("is_follow", str);
       oi3.c("loc", Integer.valueOf(1));
       oi3.d("list_index", TextUtils.N((long)(p0.mPosition + 1)));
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tp = this.p;
       if (tp.mIsHiddenUser != null) {
          this.P8();
          return;
       }else {
          this.S8(tp);
          this.X7(this.p.observable().subscribe(new a(this), Functions.d()));
          return;
       }
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       View[] viewArray = new View[]{this.s};
       n.Z(8, viewArray);
       return;
    }
    public final void S8(User p0){
       boolean b;
       d tq;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "4")) {
          return;
       }
       View obj = PatchProxy.applyOneRefs(p0, this, uod, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.getFollowStatus() == User$FollowStatus.FOLLOWING && !f.i(this.p)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
             if (this.s == null) {
                this.r.setLayoutResource(R.layout.arg_RES_7f0d164d);
                obj = this.r.inflate();
                this.s = obj;
                if (obj != null) {
                   tq = this.q;
                   if (tq != null && tq.h() != -1) {
                      this.s.setColorFilter(a1.a(this.q.h()));
                   }
                }
                this.s.setOnClickListener(new c(this));
             }
             if (this.t != null) {
                tq = this.p;
                if (!PatchProxy.applyVoidOneRefs(tq, objArray, uod, "8")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "SET_NICKNAME_ICON";
                   i3 oi3 = i3.f();
                   oi3.d("set_user_id", tq.getId());
                   String str = (tq.isFollowingOrFollowRequesting())? "TRUE": "FALSE";
                   oi3.d("is_follow", str);
                   oi3.c("loc", Integer.valueOf(1));
                   oi3.d("list_index", TextUtils.N((long)(tq.mPosition + 1)));
                   uElementPack.params = oi3.e();
                   u1.u(1, uElementPack, objArray);
                }
                this.t = this.t ^ 1;
             }
             this.s.setVisibility(0);
          }
       }else {
          this.P8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a4351);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       return;
    }
}
