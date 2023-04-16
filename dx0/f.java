package dx0.f;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$a;
import im8.g;
import c12.f;
import sb1.a;
import dx0.f$a;
import dx0.b;
import dx0.a;
import dx0.c;
import dx0.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import t02.a0;
import ds5.c;
import ds5.a;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import e93.f;
import ee1.a;
import lp3.c;
import lp3.i;
import xv4.i;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import android.widget.ImageView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import android.graphics.PointF;
import qc2.a;
import i81.g;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import i81.f$a$b;
import android.view.View;
import i81.f$a;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.basic.resource.c;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ia1.b;
import d61.h;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;
import dx0.i;
import java.util.Map;
import java.util.HashMap;

public class f extends f implements LiveAudienceChatService$a, g	// class@002056
{
    public KwaiImageView K;
    public LottieAnimationView L;
    public View M;
    public final a N;
    public boolean O;
    public final c P;
    public final b Q;
    public a0 R;
    public b S;
    public i T;
    public final LivePlayerEventListener U;
    public final i V;
    public static String sLivePresenterClassName = "LiveAudienceAvatarAnimatorPresenter";

    public void f(){
       super();
       this.N = new a();
       this.O = false;
       this.P = new f$a(this);
       this.Q = new b(this);
       this.S = new a(this);
       this.U = new c(this);
       this.V = new f$b(this);
    }
    public void Q(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "7")) {
          return;
       }
       this.R.J.fo(this.P);
       this.R.E.removeLiveEventListener(this.U);
       f.g(this);
       this.c9();
       this.T.a(a.class).Y2(this.V);
       this.T.a(LiveAudienceChatService.class).Yg(this);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW};
       this.R.N().G5(this.Q, uoaArray);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       f tL = this.L;
       if (tL == null) {
          return;
       }
       if (this.R.j1 == null) {
          return;
       }
       int[] ointArray = new int[2];
       tL.getLocationInWindow(ointArray);
       this.R.j1.e(LyricsMode.LEFT, ConstraintType.RIGHT_TOP, new PointF((float)(n.k(this.getActivity()) - a1.d(R.dimen.arg_RES_7f070878)), (float)((ointArray[1] + this.L.getHeight()) + a1.d(R.dimen.arg_RES_7f070877))), 1);
       return;
    }
    public void b9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       g og = this.T.a(g.class);
       if (og.R6() && (og.i7() != null && og.nc() != null)) {
          og.i7().i(LiveBulletinStageType.Audio, objArray);
          f tK = this.K;
          if (tK != null && !tK.getVisibility()) {
             og.nc().b(new f$a$b(this.M));
          }
       }
    label_0049 :
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       f tL = this.L;
       if (tL == null) {
          return;
       }
       c.e(tL);
       this.L.setVisibility(4);
       return;
    }
    public void d9(String[] p0){
       int b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       b obj = PatchProxy.apply(null, this, f.class, "12");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = this.R.N();
          b1 = (this.O == null || (obj != null && (obj.r2(AudienceBizRelation.VOICE_PARTY) || obj.r2(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW))))? true: false;
       }
       if (b1) {
          return;
       }else {
          obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else if(!j.h(p0)){
             int len = p0.length;
             b1 = 0;
             while (true) {
                if (b1 < len) {
                   if (TextUtils.n(p0[b1], this.R.Z2.d())) {
                   label_0070 :
                      b.d0(LiveLogTag.LIVE_AUDIO_AVATAR_ANIMATION, "isAnchorSpeaking", "isAnchorSpeaking", Boolean.valueOf(b), "AnchorUserId", this.R.Z2.d());
                      b2 = b;
                   }else {
                      b1 = b1 + 1;
                   }
                }
             }
          }
          b = false;
          goto label_0070 ;
          if (b2) {
             if (!PatchProxy.applyVoid(null, this, f.class, "8")) {
                f tL = this.L;
                if (tL == null || (!tL.p() && this.N.isValid())) {
                   this.L.setVisibility(0);
                   this.L.setRepeatCount(-1);
                   c.a(this.L, this.N);
                }
             }
          }else {
             this.c9();
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       p0 = h.f(p0, R.id.live_audio_audience_avatar_animator_view_stub, 0x7f0a1a60);
       this.M = p0;
       this.L = m1.f(p0, 0x7f0a02fc);
       this.K = m1.f(this.M, 0x7f0a02fd);
       return;
    }
    public void f7(LiveAudienceChatService$ChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       if (p0 == LiveAudienceChatService$ChatState.END) {
          this.d9(null);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.R = this.q8(a0.class);
       this.T = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "6")) {
          return;
       }
       this.R.J.gd(this.P);
       this.T.a(a.class).p2(this.V);
       this.T.a(LiveAudienceChatService.class).Jl(this);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW};
       this.R.N().u5(this.Q, uoaArray);
       return;
    }
}
