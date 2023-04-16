package bl3.i;
import im8.g;
import dk3.b;
import cl3.f$e;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import bl3.i$a;
import bl3.i$b;
import bl3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.yxcorp.gifshow.autoplay.live.g;
import com.yxcorp.gifshow.autoplay.live.e;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import brd.t;
import t45.d;
import brd.z;
import bl3.f;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import osb.a;
import bl3.e;
import ujc.e;
import bl3.d;
import bl3.c;
import bl3.b;
import android.app.Activity;
import lnc.a1;
import cl3.f;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import android.view.ViewGroup;
import pp.d;
import uk3.a;
import jl3.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import dk3.a;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import tjc.c;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import im8.f;
import ll3.j;
import com.kwai.sdk.switchconfig.a;
import hn5.n;
import hn5.m;
import androidx.fragment.app.Fragment;
import gb5.a;
import ekd.m1;
import bl3.o;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import wk3.b;
import wk3.a;

public class i extends b implements g	// class@0003ef
{
    public final b A;
    public ViewGroup B;
    public QPhoto C;
    public BaseFragment D;
    public g E;
    public LiveAudienceParam F;
    public b G;
    public f H;
    public d I;
    public a J;
    public QLivePlayConfig K;
    public String L;
    public PublishSubject M;
    public b N;
    public f O;
    public boolean P;
    public final c Q;
    public final LiveAutoPlay$b R;
    public final LiveAutoPlay$a S;
    public final f$e y;
    public final b z;

    public void i(){
       super();
       this.y = new f$e();
       Boolean fALSE = Boolean.FALSE;
       this.z = new b(fALSE);
       this.A = new b(fALSE);
       this.Q = new i$a(this);
       this.R = new i$b(this);
       this.S = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       super.E8();
       i tO = this.O;
       if (tO == null) {
          return;
       }
       this.y.a = tO;
       tO = this.E;
       tO.p.e = this.F.mLiveStreamStartPlaySourceForEnterPrompt;
       tO.N(this.S);
       this.E.P(this.R);
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(s.class).observeOn(a).subscribe(new f(this)));
       this.X7(f.f(a.class).observeOn(a).subscribe(new e(this)));
       if (this.Y8()) {
          this.X7(f.f(e.class).observeOn(a).subscribe(new d(this)));
       }
       this.X7(this.M.subscribe(new c(this)));
       tO = this.N;
       if (tO != null) {
          this.X7(tO.c().subscribe(new b(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       super.J8();
       this.E.W(this.S);
       this.E.Z(this.R);
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       if (!a1.i(this.getActivity())) {
          return;
       }
       f uof = new f(this.getActivity(), this.m8(), this.B, this.E, this.C.mEntity, this.I, this.J, this.G, this.K);
       this.O = v0;
       this.S8(v0);
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, i.class, "14")) {
          return;
       }
       if (this.X8()) {
          if (!this.E.t()) {
             this.Z8();
          }
       }else if(this.E.t()){
          this.a9(LiveStopReason.SLIDE_AWAY);
       }
       return;
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.Y8() && b.a(-1608526086).S()) {
          this.I.h(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "canStartPlay return by splashAd");
          return b;
       }else if(this.H.get().booleanValue()){
          this.I.h(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "canStartPlay return anchor end");
          return b;
       }else if(this.w7() && (this.isSelected() || this.Q4())){
          b = true;
       }
       return b;
    }
    public void Y4(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       this.E.unMute();
       this.W8();
       return;
    }
    public final boolean Y8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, i.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, j.class, "4");
       boolean b = false;
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("disableLivePreviewAvoidSplashAd", b);
       if (!b1 && (this.J.a() == 1 || this.J.a() == 2)) {
          b = true;
       }
       return b;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, i.class, "13")) {
          return;
       }
       this.I.i(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "startLivePlay", "mute", Boolean.valueOf(this.E.k));
       if (m.a().FG(this.D)) {
          b.a(0x8708467).B();
       }
       this.E.startPlay();
       this.P = false;
       this.G.b(false);
       return;
    }
    public final void a9(LiveStopReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "12")) {
          return;
       }
       this.I.i(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "stopLivePlay", "stop reason", p0);
       this.E.g0(p0);
       if (this.G.a() == 1) {
          return;
       }
       this.G.b(3);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a25a0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new o());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       super.j8();
       this.C = this.q8(QPhoto.class);
       this.D = this.r8("DETAIL_FRAGMENT");
       this.E = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       this.F = this.r8("LIVE_AUDIENCE_PARAM");
       this.G = this.r8("LIVE_PLAY_STATE");
       this.H = this.x8("LIVE_ANCHOR_END");
       this.L = this.t8("LIVE_SIMPLE_REUSE_SESSION_ID");
       this.I = this.r8("LIVE_PREVIEW_CONTEXT_LOGGER");
       this.J = this.r8("LIVE_FEATURE_CONFIG");
       this.K = this.r8("LIVE_PLAY_CONFIG");
       this.M = this.t8("Live_SIMPLE_ENTER_ACTION_PUBLISHER");
       this.N = this.t8("MORE_TRENDING_LIST_SHOW_EVENT");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       LiveStopReason pREVIEW_LIVE = (this.z.a().booleanValue())? LiveStopReason.PREVIEW_LIVE_CLICK2_NORMAL_LIVE: LiveStopReason.LIVE_HIDE;
       this.a9(pREVIEW_LIVE);
       this.z.d(Boolean.FALSE);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       this.W8();
       return;
    }
    public void t4(LiveWillShowType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       this.E.mute();
       this.W8();
       return;
    }
    public void t7(){
       if (PatchProxy.applyVoid(null, this, i.class, "9")) {
          return;
       }
       this.a9(LiveStopReason.SLIDE_AWAY);
       return;
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       a.i(this);
       this.A.d(Boolean.TRUE);
       this.a9(LiveStopReason.SLIDE_AWAY);
       this.A.d(Boolean.FALSE);
       return;
    }
}
