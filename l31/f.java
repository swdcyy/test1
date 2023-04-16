package l31.f;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import l31.c;
import l31.f$a;
import l31.b;
import l31.f$b;
import l31.f$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.lang.Long;
import tj3.i;
import tj3.e;
import tj3.k;
import tj3.r;
import mq5.h;
import mq5.b;
import ds5.c;
import ds5.a;
import sj3.b;
import sj3.l;
import android.view.ViewGroup;
import com.kuaishou.livestream.message.nano.LiveStreamActivityMessages$SCActivityLiveInfo;
import lf3.g;
import hf3.a;
import l31.f$d;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.fragment.app.c$b;
import kq5.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import e93.f;
import cy1.a;
import com.kwai.robust.PatchProxyResult;
import l31.a;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import d61.g;
import zb6.a;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import java.util.Map;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ds5.e;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import t91.a;
import lp3.e;
import p91.m;
import lp3.c;
import com.yxcorp.utility.n;
import ow0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import l31.d;
import erd.g;
import com.kuaishou.live.common.core.component.topbar.topuser.i$i;
import java.lang.Math;
import ekd.k1;
import l31.e;
import java.lang.Runnable;

public class f extends i	// class@002e75
{
    public e V0;
    public l W0;
    public boolean X0;
    public e Y0;
    public LiveSlidePlayService Z0;
    public QLivePlayConfig a1;
    public a b1;
    public ImageView c1;
    public boolean d1;
    public boolean e1;
    public final Object f1;
    public b g1;
    public b h1;
    public BaseFragment i1;
    public final h j1;
    public final c k1;
    public final g l1;
    public final b m1;
    public final c$b n1;
    public static String sLivePresenterClassName = "LiveAudienceTopUserPresenter";

    public void f(){
       super();
       this.f1 = new Object();
       this.j1 = new c(this);
       this.k1 = new f$a(this);
       this.l1 = new b(this);
       this.m1 = new f$b(this);
       this.n1 = new f$c(this);
    }
    public void B9(){
       if (PatchProxy.applyVoid(null, this, f.class, "21")) {
          return;
       }
       b9.a(this.g1);
       this.g1 = null;
       return;
    }
    public final void C9(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "18")) {
          return;
       }
       this.V0.h().z(p0);
       this.V0.x().w(p0);
       return;
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
          return;
       }
       super.E8();
       this.h1.Km(this.j1);
       this.Y0.gd(this.k1);
       this.W0.b(this.m1);
       if (!PatchProxy.applyVoid(objArray, this, uof, "23") && this.Z8() == 2) {
          this.y.setVisibility(8);
          this.b1.u0(596, LiveStreamActivityMessages$SCActivityLiveInfo.class, this.l1);
       }
       if (this.X0 != null) {
          uof = this.Z0;
          if (uof != null) {
             uof.P4(new f$d(this));
          }
       }
       this.u.c(this.n1);
       if (this.X0 == null) {
          this.u9();
          this.y9();
       }
       LiveStreamFeedWrapper mEntity = this.v.mEntity;
       if (mEntity != null) {
          LiveStreamFeed mLiveStreamM = mEntity.mLiveStreamModel;
          if (mLiveStreamM != null) {
             mLiveStreamM.startSyncWithFragment(this.i1.m());
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       super.J8();
       this.h1.le(this.j1);
       this.Y0.fo(this.k1);
       this.W0.c(this.m1);
       this.u.a(this.n1);
       this.B9();
       f.g(this.f1);
       this.b1.o(596, this.l1);
       return;
    }
    public a Y8(){
       Object obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(0x7f0d0a5c, 0x7f0d0a5d);
    }
    public boolean b9(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.X0 != null) {
          b = (this.e1 != null && this.i1.isResumed())? true: false;
       }else {
          b = this.i1.isResumed();
       }
       if (!b) {
          this.o9("isStartLoopAvailable");
       }
       return b;
    }
    public void d9(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       b.d0(LiveLogTag.TOP_USER, "[LiveAudienceTopUserPresenter][onPollWatchersFailed]: ", "errMsg", g.e(p0), "errCode", Integer.valueOf(a.b(p0)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       super.doBindView(p0);
       this.c1 = m1.f(p0, 0x7f0a19cb);
       return;
    }
    public void e9(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "9")) {
          return;
       }
       this.C9(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(f.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.h1 = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.V0 = this.r8("LIVE_LOG_REPORTER");
       this.W0 = this.r8("LIVE_PLAYER_RECONNECT");
       this.X0 = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       this.Y0 = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.v = this.r8("LIVE_PHOTO");
       this.Z0 = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.a1 = this.r8("LIVE_PLAY_CONFIG");
       this.b1 = this.r8("LIVE_LONG_CONNECTION");
       this.i1 = this.r8("LIVE_FRAGMENT");
       return;
    }
    public void j9(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, f.class, "15")) {
          return;
       }
       super.j9();
       this.t.t5().a(uoa).Ki("livePatternType");
       this.t.t5().a(uoa).Ki("liveSubType");
       return;
    }
    public void k9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       i tv = this.v;
       if (tv != null) {
          tv.setDisplayAudienceCount(p0);
          this.v.setAudienceCount(p0);
       }
       return;
    }
    public void l9(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "10")) {
          return;
       }
       this.C9(p0);
       return;
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       b.c0(LiveLogTag.TOP_USER, "showTopUserListDialogFragment", "isUserListSupportClick\(\)", Boolean.valueOf(this.c9()));
       if (!this.c9()) {
          return;
       }
       super.m9();
       View[] viewArray = new View[]{this.c1};
       n.Z(8, viewArray);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("disableShowRedDotForLiveAudienceTopUser", 1);
       g.a(uEditor);
       return;
    }
    public void q9(){
       if (PatchProxy.applyVoid(null, this, f.class, "12")) {
          return;
       }
       LiveStreamFeedWrapper mEntity = this.v.mEntity;
       if (mEntity != null) {
          LiveStreamFeed mLiveStreamM = mEntity.mLiveStreamModel;
          if (mLiveStreamM != null) {
             mLiveStreamM.fireSync();
          }
       }
       return;
    }
    public void s9(long p0){
       a uoa = a.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "14")) {
          return;
       }
       super.s9(p0);
       this.t.t5().a(uoa).Oe("livePatternType", Integer.valueOf(this.a1.mPatternType));
       this.t.t5().a(uoa).Oe("liveSubType", Integer.valueOf(this.a1.mSubType));
       return;
    }
    public void u9(){
       if (PatchProxy.applyVoid(null, this, f.class, "20")) {
          return;
       }
       if (this.g1 == null) {
          this.g1 = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new d(this));
       }
       return;
    }
    public void x9(boolean p0,String p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uof, "2")) {
          return;
       }
       uof = (this.I != null || this.R.b != null)? 1: 0;
       if (!uof) {
          long l = Math.max(5000, this.D);
          long l1 = k1.k(l);
          b.d0(LiveLogTag.TOP_USER, "restartLoopGetAudienceIfNecessary", "scatterDurationMs", Long.valueOf(l), "delayMs", Long.valueOf(l1));
          e uoe = new e(this, p1);
          if (p0) {
             uoe.run();
          }else {
             f.g(this.f1);
             f.k("restartLoopGetWatchingCount", uoe, this.f1, l1);
          }
       }
       return;
    }
    public void y9(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       int i = 1;
       if (!a.a.getBoolean("disableShowRedDotForLiveAudienceTopUser", false) && (!this.v.isGRPRCustomizedLive() && this.Z8() == i)) {
          View[] viewArray = new View[i];
          viewArray[0] = this.c1;
          n.Z(false, viewArray);
       }else {
          View[] viewArray1 = new View[i];
          viewArray1[0] = this.c1;
          n.Z(8, viewArray1);
       }
       return;
    }
}
