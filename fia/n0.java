package fia.n0;
import fia.a;
import fia.n0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.k;
import brd.t;
import t45.d;
import brd.z;
import fia.n0$d;
import kga.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import fia.n0$e;
import jta.c;
import rf5.u;
import e17.i;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse;
import kotlin.jvm.internal.Ref$IntRef;
import uh5.e;
import android.app.Activity;
import hn5.n;
import hn5.m;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import com.kwai.library.widget.popup.common.f;
import e17.i$b;
import java.lang.CharSequence;
import fia.n0$f;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import fia.n0$g;
import fia.n0$h;
import e17.i$e;
import fia.n0$a;
import com.yxcorp.gifshow.events.realaction.RealAction;
import fia.n0$b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse$SnackBarInfo;
import rd5.e;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.follow.config.model.FollowFeatureSnackBarGuideConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import java.lang.Boolean;

public final class n0 extends a	// class@00292f
{
    public t G;
    public u H;
    public final c I;

    public void n0(){
       super();
       this.I = new n0$c(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n0.class, "2")) {
          return;
       }
       super.E8();
       this.X7(RxBus.f.f(k.class).observeOn(d.a).subscribe(new n0$d(this), c.a));
       if (this.s9()) {
          this.o9();
       }
       a uoa = PatchProxy.apply(objArray, this, a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.v;
          if (uoa == null) {
             a.S("mFragment");
          }
       }
       this.X7(uoa.Vg().g().subscribe(new n0$e(this)));
       n0 tH = this.H;
       if (tH != null) {
          tH.j(this.I);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "3")) {
          return;
       }
       super.J8();
       n0 tH = this.H;
       if (tH != null) {
          tH.B(this.I);
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "11")) {
          return;
       }
       i oi = i.l();
       if (oi != null && oi.s()) {
          oi.h();
       }
       return;
    }
    public String Y8(){
       return "GUIDE_TOAST";
    }
    public String Z8(){
       return "GUIDE_FOLLOWPAGE_TOAST";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       super.j8();
       this.G = this.r8("DETAIL_PROCESS_EVENT");
       this.H = this.q8(u.class);
       return;
    }
    public void n9(FollowFeatureGuideSnackBarResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "10")) {
          return;
       }
       a.p(p0, "response");
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = e.c();
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity");
          if (!activity.isFinishing() && (!activity.isDestroyed() && m.a().U3(activity))) {
             a uoa = a.o0(activity);
             a.o(uoa, "HomeDataViewModel.get\(ac\x20\x02ity as FragmentActivity?\)\x00");
             if (uoa.p0() == 3) {
                intRef.element = e.c() + f.h(activity);
             }
          }
       }
       i$b uob = new i$b();
       uob.o((int)this.d9());
       uob.y("去关注页看看");
       uob.v(false);
       uob.r(n0$f.a);
       uob.u(n0$g.a);
       uob.s(R.layout.arg_RES_7f0d0413);
       a.o(uob, "ksBuilder.setDuration\(sh…re_to_follow_guide_toast\)");
       uob.A(new n0$h(this, intRef, p0));
       this.j9();
       i.z(uob);
       return;
    }
    public final void o9(){
       if (PatchProxy.applyVoid(null, this, n0.class, "4")) {
          return;
       }
       n0 tG = this.G;
       if (tG != null) {
          this.X7(tG.subscribe(new n0$a(this), c.a));
       }
       this.X7(RxBus.f.f(RealAction.class).observeOn(d.a).subscribe(new n0$b(this), c.a));
       return;
    }
    public final void onFollowPreRequestEvent(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "7")) {
          return;
       }
       if (!this.q9()) {
          return;
       }
       if (p0.c != null) {
          User user = r1.T1(this.b9().mEntity);
          Object[] objArray = null;
          String id = (user != null)? user.getId(): objArray;
          if (TextUtils.n(id, p0.b) && !PatchProxy.applyVoid(objArray, this, a.class, "12")) {
             c.i(KsLogFollowTag.FOLLOW_GUIDE.appendTag("BaseFeatureToFollowGuidePresenter"), "requestLocalData");
             this.q = 1;
             FollowFeatureGuideSnackBarResponse uFollowFeatu = new FollowFeatureGuideSnackBarResponse();
             FollowFeatureGuideSnackBarResponse$SnackBarInfo snackBarInfo = new FollowFeatureGuideSnackBarResponse$SnackBarInfo();
             snackBarInfo.mRefreshMyFollow = false;
             snackBarInfo.mDesc = "去关注页看更多关注的作者";
             uFollowFeatu.mSnackBarInfo = snackBarInfo;
             this.h9(uFollowFeatu);
          }
       }
    label_0062 :
       return;
    }
    public final void onReceiveProgressEvent(e p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "8")) {
          return;
       }
       if (!this.q9()) {
          return;
       }
       if (p0 != null && this.a9()) {
          e a = p0.a;
          p0 = PatchProxy.apply(null, this, a.class, "25");
          if (p0 != PatchProxyResult.class) {
             l = p0.longValue();
          }else {
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             FollowFeatureSnackBarGuideConfig uFollowFeatu = FollowConfigUtil.n();
             uFollowFeatu = (uFollowFeatu != null)? uFollowFeatu.mPlayDuration: 0;
             l = mILLISECONDS.convert(uFollowFeatu, TimeUnit.SECONDS);
          }
          if (a - l >= 0) {
             User user = r1.T1(this.b9().mEntity);
             if (user != null && user.isFollowingOrFollowRequesting() == true) {
                this.l9();
             }
          }
       }
    label_005d :
       return;
    }
    public final boolean q9(){
       Object obj = PatchProxy.apply(null, this, n0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!FollowConfigUtil.m()) {
          this.k9("SnackBar实验没命中");
          return false;
       }else if(this.W8()){
          return false;
       }else {
          return true;
       }
    }
    public final boolean s9(){
       User obj = PatchProxy.apply(null, this, n0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = r1.T1(this.b9().mEntity);
       boolean b = true;
       if (obj == null || obj.isFollowingOrFollowRequesting() != b) {
          b = false;
       }
       return b;
    }
}
