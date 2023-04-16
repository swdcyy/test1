package com.kuaishou.live.core.show.music.audiencelyrics.d;
import im8.g;
import k51.c;
import lnc.a1;
import com.kuaishou.live.core.show.music.audiencelyrics.d$a;
import com.kuaishou.live.core.show.music.audiencelyrics.d$b;
import com.kuaishou.live.core.show.music.audiencelyrics.d$c;
import android.os.Handler;
import android.os.Looper;
import qc2.s;
import java.lang.String;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import j80.c;
import com.kuaishou.live.core.show.music.audiencelyrics.c;
import t02.a0;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kuaishou.live.core.show.music.audiencelyrics.d$d;
import qc2.e;
import com.kuaishou.livestream.message.nano.SCAuthorMusicOpened;
import com.kuaishou.live.core.show.music.audiencelyrics.b;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCAuthorMusicClosed;
import qc2.j;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import xr5.b;
import brd.t;
import t45.d;
import brd.z;
import qc2.k;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xr5.c;
import qc2.l;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import qy1.a;
import qc2.n;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import qc2.f;
import java.lang.Runnable;
import ft5.d;
import ft5.b;
import qc2.t;
import p91.m;
import qc2.a;
import ok2.h;
import android.view.View;
import java.util.Objects;
import java.util.Arrays;
import com.kuaishou.live.core.show.subscribe.pendant.f$c;
import android.view.ViewStub;
import ekd.b;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import z12.e;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import android.widget.ScrollView;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.music.audiencelyrics.d$f;
import io.reactivex.g;
import com.kuaishou.live.core.show.music.audiencelyrics.d$e;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import qc2.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.c;
import android.animation.TimeInterpolator;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import qc2.r;
import java.util.Map;
import java.util.HashMap;
import lp3.i;
import lp3.c;
import gt5.a;

public class d extends c implements g	// class@000d35
{
    public LyricsMode A;
    public ConstraintType B;
    public LivePlayerEventListener C;
    public x D;
    public long E;
    public Handler F;
    public Runnable G;
    public SCAuthorMusicOpened H;
    public boolean I;
    public String J;
    public String K;
    public long L;
    public boolean M;
    public final s N;
    public View O;
    public View P;
    public RectF Q;
    public RectF R;
    public a S;
    public t T;
    public boolean U;
    public ViewStub p;
    public a0 q;
    public b r;
    public h s;
    public LiveAudienceLyricsPendantView t;
    public a u;
    public a v;
    public b w;
    public final d x;
    public PointF y;
    public PointF z;
    public static final String V = "d";
    public static final int W = 0;
    public static final int X = 0;
    public static boolean Y = false;
    public static String sLivePresenterClassName;

    static {
       d.W = a1.e(160.00f);
       d.X = a1.e(55.00f);
    }
    public void d(){
       super();
       this.v = new d$a(this);
       this.w = new d$b(this);
       this.x = new d$c(this);
       this.F = new Handler(Looper.getMainLooper());
       this.J = "";
       this.K = "";
       this.M = false;
       this.N = new s();
       this.U = true;
    }
    public static File S8(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uod, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       File uFile = PatchProxy.apply(null, null, uod, "28");
       if (uFile != patchProxyRe) {
       }else {
          uFile = b.a(-1504323719).d(".live_music_lyrics");
       }
       return new File(uFile, p0);
    }
    public void E8(){
       z a;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       this.Y8(d.X);
       c uoc = new c(this);
       this.C = uoc;
       this.q.E.addLiveEventListener(uoc);
       this.D = new d$d(this, 40);
       this.G = new e(this);
       this.q.C.u0(490, SCAuthorMusicOpened.class, new b(this));
       this.q.C.u0(491, SCAuthorMusicClosed.class, new j(this));
       if (!PatchProxy.applyVoid(objArray, this, uod, "8")) {
          a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.VOICE_PARTY_GUEST};
          this.q.N().u5(this.w, uoaArray);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "10")) {
          RxBus f = RxBus.f;
          a = d.a;
          this.X7(f.f(b.class).observeOn(a).subscribe(new k(this)));
          this.X7(f.f(c.class).observeOn(a).subscribe(new l(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          this.X7(this.u.vo(OptimizedElement.LYRICS).distinctUntilChanged().observeOn(d.a).subscribe(new n(this)));
       }
       a uoa = new a(ViewElement.LYRICS_PENDANT, new f(this));
       this.S = uoa;
       uoa.c();
       this.r.Le(this.x);
       d tq = this.q;
       t ot = new t(tq.Y0, this.v, this.s, this.P, tq.Z2.B0());
       this.T = uoa;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, t.class, "1")) {
          ot = uoa.c;
          uoa.f.u5(uoa.d, Arrays.copyOf(ot, ot.length));
          uoa.h.c(uoa.e);
          uoa.a(true);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p = this.m8().findViewById(0x7f0a21ed);
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          return;
       }
       this.q.E.removeLiveEventListener(this.C);
       if (!PatchProxy.applyVoid(objArray, this, uod, "9")) {
          a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.VOICE_PARTY_GUEST};
          this.q.N().G5(this.w, uoaArray);
       }
       uod = this.D;
       if (uod != null) {
          uod.stop();
          this.D = objArray;
       }
       this.F.removeCallbacksAndMessages(objArray);
       this.X8();
       this.K = "";
       this.J = "";
       long l = 0;
       this.L = l;
       this.I = false;
       this.H = objArray;
       this.E = l;
       d.Y = false;
       uod = this.S;
       if (uod != null) {
          uod.b();
       }
       this.r.Yj(this.x);
       uod = this.T;
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(objArray, uod, t.class, "2")) {
          t c = uod.c;
          uod.f.G5(uod.d, Arrays.copyOf(c, c.length));
          uod.h.d(uod.e);
       }
       uod = this.N;
       uod.a = 0;
       uod.b = false;
       return;
    }
    public void P8(){
       LiveAudienceLyricsPendantViewV2 o;
       LiveAudienceLyricsPendantViewV2 o1;
       Object[] objArray = null;
       String str = "29";
       if (PatchProxy.applyVoid(objArray, this, d.class, str)) {
          return;
       }
       d tt = this.t;
       if (tt != null) {
          d tz = this.z;
          if (tz != null) {
             if (!tt instanceof LiveAudienceLyricsPendantViewV2) {
                String[] stringArray = new String[0];
                e.c(d.V, "impossible!", stringArray);
                return;
             }else {
                d tA = this.A;
                d uod = (tA != null && (this.B != null && tz != null))? 1: null;
                if (!uod) {
                   return;
                }else {
                   d tB = this.B;
                   Objects.requireNonNull(tt);
                   if (!PatchProxy.applyVoidThreeRefs(tA, tB, tz, tt, LiveAudienceLyricsPendantViewV2.class, "28")) {
                      a.p(tA, "lyricsMode");
                      a.p(tB, "constraintType");
                      a.p(tz, "position");
                      tt.v = tA;
                      tt.w = tB;
                      tt.x = tz;
                      if (!PatchProxy.applyVoidOneRefs(tA, tt, LiveAudienceLyricsPendantViewV2.class, "31")) {
                         int i1 = 8;
                         if (tA == LyricsMode.LEFT) {
                            o1 = tt.o;
                            if (o1 == null) {
                               a.S("leftLyricsView");
                            }
                            o1.setVisibility(0);
                            o1 = tt.p;
                            if (o1 == null) {
                               a.S("rightLyricsView");
                            }
                            o1.setVisibility(i1);
                            o1 = tt.o;
                            if (o1 == null) {
                               a.S("leftLyricsView");
                            }
                            tt.k = o1;
                         }else {
                            o1 = tt.o;
                            if (o1 == null) {
                               a.S("leftLyricsView");
                            }
                            o1.setVisibility(i1);
                            o1 = tt.p;
                            if (o1 == null) {
                               a.S("rightLyricsView");
                            }
                            o1.setVisibility(0);
                            o1 = tt.p;
                            if (o1 == null) {
                               a.S("rightLyricsView");
                            }
                            tt.k = o1;
                         }
                      }
                      if (!PatchProxy.applyVoid(objArray, tt, LiveAudienceLyricsPendantViewV2.class, str)) {
                         tt.l();
                         if (!PatchProxy.applyVoid(objArray, tt, LiveAudienceLyricsPendantViewV2.class, "34")) {
                            o = tt.y;
                            if (o != null && o.isRunning() == true) {
                               o = tt.y;
                               a.m(o);
                               o.cancel();
                            }
                         }
                         if (!PatchProxy.applyVoid(objArray, tt, LiveAudienceLyricsPendantViewV2.class, "35")) {
                            o = tt.z;
                            if (o != null && o.isRunning() == true) {
                               o = tt.z;
                               a.m(o);
                               o.cancel();
                            }
                         }
                         LiveAudienceLyricsPendantView i = tt.i;
                         a.o(i, "mMusicCoverLayout");
                         i.setAlpha(0x3f800000);
                         i = tt.h;
                         a.o(i, "mMusicLyricsContainer");
                         i.setAlpha(0x3f800000);
                         o = tt.o;
                         if (o == null) {
                            a.S("leftLyricsView");
                         }
                         o.setAlpha(0x3f800000);
                         o = tt.p;
                         if (o == null) {
                            a.S("rightLyricsView");
                         }
                         o.setAlpha(0x3f800000);
                         tt.n = false;
                         tt.t = false;
                      }
                      tt.post(tt.B);
                   }
                   d.Y = false;
                   this.A = objArray;
                   this.B = objArray;
                   this.z = objArray;
                }
             }
          }
       }
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "26")) {
          return;
       }
       t.create(new d$f(this, p0)).subscribeOn(d.c).observeOn(d.a).subscribe(new d$e(this));
       return;
    }
    public void V8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "3")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       int i = 2;
       ValueAnimator valueAnimato = (p0)? ValueAnimator.ofFloat(new float[i]{0,0x3f800000}): ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
       valueAnimato.addUpdateListener(new b(this));
       valueAnimato.setInterpolator(new c());
       valueAnimato.setDuration(200);
       valueAnimato.start();
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       d tS = this.S;
       if (tS != null && !tS.a()) {
          return;
       }
       tS = this.t;
       d tN = this.N;
       s a = tN.a;
       if (a == null) {
          a = (tN.b == null)? 0: 4;
       }
    label_002e :
       tS.setVisibility(a);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, d.class, "22")) {
          return;
       }
       d tt = this.t;
       if (tt != null) {
          tt.i();
          this.N.a = 8;
          this.W8();
       }
       return;
    }
    public final void Y8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "11")) {
          return;
       }
       if (b.d(this)) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.topMargin = p0;
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
    public boolean Z8(){
       Object obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.Y || !this.u.Ko(OptimizedElement.LYRICS))? true: false;
       return b;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, d.class, "21")) {
          return;
       }
       d tD = this.D;
       if (tD != null) {
          tD.stop();
       }
       tD = this.t;
       if (tD != null) {
          tD.i();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.P = m1.f(p0, 0x7f0a3fd0);
       this.t = m1.f(p0, 0x7f0a197d);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new r());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.u = this.r8("LIVE_SERVICE_MANAGER").a(a.class);
       this.O = this.q.H.a2();
       this.r = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       this.s = this.q8(h.class);
       return;
    }
}
