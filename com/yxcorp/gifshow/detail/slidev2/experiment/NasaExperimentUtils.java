package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$featuredSimilarPopWindowConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$atlasCustomLongPressTimeout$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$atlasV3CustomProfileFactor$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$atlasV3CustomProfileEnterThreshold$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableTimeManagement$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableVerticalAtlasAutoPlay$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableNasaSlideSmallWindow$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$disablePlayFailView$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$showToastWithAutoRetry$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$pauseAnimaWhenSliding$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableHardLayerInSlidePage$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$autoRetryWithPlayErrorView$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enablePictureDetailPageClip$2;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enablePicRecognitionIcon$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hn5.n;
import hn5.m;
import kotlin.jvm.internal.a;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld;
import com.kwai.sdk.switchconfig.a;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$a;
import java.lang.Number;
import java.lang.Integer;
import java.util.Objects;
import xf6.d;
import f3a.c;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.homepage.SlidePlayNextGuideConfig;
import o56.c;
import o56.a;

public final class NasaExperimentUtils	// class@0018a7
{
    public static final p A;
    public static final p B;
    public static Boolean C;
    public static Boolean D;
    public static Integer E;
    public static Boolean F;
    public static Boolean G;
    public static Boolean H;
    public static Boolean I;
    public static Integer J;
    public static Integer K;
    public static Boolean L;
    public static final p M;
    public static Integer N;
    public static Integer O;
    public static Boolean P;
    public static Boolean Q;
    public static Boolean R;
    public static Boolean S;
    public static Integer T;
    public static Integer U;
    public static Integer V;
    public static Integer W;
    public static final p X;
    public static final p Y;
    public static final p Z;
    public static Boolean a;
    public static final p a0;
    public static Boolean b;
    public static Boolean b0;
    public static Long c;
    public static Boolean c0;
    public static final p d;
    public static Boolean d0;
    public static Integer e;
    public static Boolean e0;
    public static Integer f;
    public static final p f0;
    public static Float g;
    public static final p g0;
    public static Float h;
    public static final p h0;
    public static SlidePlayNextGuideConfig i;
    public static final p i0;
    public static c j;
    public static final p j0;
    public static Boolean k;
    public static Integer k0;
    public static Integer l;
    public static final boolean l0;
    public static Integer m;
    public static final boolean m0;
    public static Integer n;
    public static final boolean n0;
    public static Boolean o;
    public static Boolean o0;
    public static Boolean p;
    public static Boolean p0;
    public static Boolean q;
    public static String q0;
    public static Boolean r;
    public static final p r0;
    public static Integer s;
    public static final p s0;
    public static Boolean t;
    public static final NasaExperimentUtils t0;
    public static Boolean u;
    public static Integer v;
    public static Boolean w;
    public static Boolean x;
    public static Integer y;
    public static final p z;

    static {
       NasaExperimentUtils.t0 = new NasaExperimentUtils();
       NasaExperimentUtils.d = s.c(NasaExperimentUtils$featuredSimilarPopWindowConfig$2.INSTANCE);
       NasaExperimentUtils.z = s.c(NasaExperimentUtils$atlasCustomLongPressTimeout$2.INSTANCE);
       NasaExperimentUtils.A = s.c(NasaExperimentUtils$atlasV3CustomProfileFactor$2.INSTANCE);
       NasaExperimentUtils.B = s.c(NasaExperimentUtils$atlasV3CustomProfileEnterThreshold$2.INSTANCE);
       NasaExperimentUtils.M = s.c(NasaExperimentUtils$enableTimeManagement$2.INSTANCE);
       NasaExperimentUtils.X = s.c(NasaExperimentUtils$enableLongPressPanelAddRewardEntrance$2.INSTANCE);
       NasaExperimentUtils.Y = s.c(NasaExperimentUtils$enableVerticalAtlasAutoPlay$2.INSTANCE);
       NasaExperimentUtils.Z = s.c(NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2.INSTANCE);
       NasaExperimentUtils.a0 = s.c(NasaExperimentUtils$enableNasaSlideSmallWindow$2.INSTANCE);
       NasaExperimentUtils.f0 = s.c(NasaExperimentUtils$disablePlayFailView$2.INSTANCE);
       NasaExperimentUtils.g0 = s.c(NasaExperimentUtils$showToastWithAutoRetry$2.INSTANCE);
       NasaExperimentUtils.h0 = s.c(NasaExperimentUtils$pauseAnimaWhenSliding$2.INSTANCE);
       NasaExperimentUtils.i0 = s.c(NasaExperimentUtils$enableHardLayerInSlidePage$2.INSTANCE);
       NasaExperimentUtils.j0 = s.c(NasaExperimentUtils$autoRetryWithPlayErrorView$2.INSTANCE);
       boolean b = false;
       boolean b1 = (NasaExperimentUtils.K() == 1)? true: false;
       NasaExperimentUtils.l0 = b1;
       b1 = (NasaExperimentUtils.K() == 2)? true: false;
       NasaExperimentUtils.m0 = b1;
       if (NasaExperimentUtils.K() == 3) {
          b = true;
       }
       NasaExperimentUtils.n0 = b;
       NasaExperimentUtils.r0 = s.c(NasaExperimentUtils$enablePictureDetailPageClip$2.INSTANCE);
       NasaExperimentUtils.s0 = s.c(NasaExperimentUtils$enablePicRecognitionIcon$2.INSTANCE);
    }
    public void NasaExperimentUtils(){
       super();
    }
    public static final boolean A(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "67");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.r0.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean B(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.q == null) {
             NasaExperimentUtils.q = Boolean.valueOf(f.a("playerSpeedAndDataSaveModeOptimize"));
          }
          Boolean q = NasaExperimentUtils.q;
          a.m(q);
          b = q.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "18");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.r.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean C(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.b == null) {
             NasaExperimentUtils.b = Boolean.valueOf(a.t().d("enablePreLoadingFeatureComment", false));
          }
          Boolean b = NasaExperimentUtils.b;
          a.m(b);
          b1 = b.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "2");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.b.getValue();
          }
          b1 = uBoolean.booleanValue();
       }
       return b1;
    }
    public static final boolean D(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.r == null) {
             NasaExperimentUtils.r = Boolean.valueOf(ProfileFollowManager.h.a());
          }
          Boolean r = NasaExperimentUtils.r;
          a.m(r);
          b = r.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "19");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.s.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean E(){
       Boolean obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.D == null) {
          NasaExperimentUtils.D = Boolean.valueOf(a.t().d("zoomInCleanScreenGuideStrategy", false));
       }
       obj = NasaExperimentUtils.D;
       a.m(obj);
       return obj.booleanValue();
    }
    public static final boolean F(){
       Boolean obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.p0 == null) {
          NasaExperimentUtils.p0 = Boolean.valueOf(a.t().d("enableSerialAutoSwitchWithPlc", false));
       }
       obj = NasaExperimentUtils.p0;
       a.m(obj);
       return obj.booleanValue();
    }
    public static final boolean G(){
       Boolean obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.o0 == null) {
          NasaExperimentUtils.o0 = Boolean.valueOf(a.t().d("enableSerialPreload", false));
       }
       obj = NasaExperimentUtils.o0;
       a.m(obj);
       return obj.booleanValue();
    }
    public static final boolean H(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.u == null) {
             NasaExperimentUtils.u = Boolean.valueOf(a.t().d("enableCaptionTitle", false));
          }
          Boolean u = NasaExperimentUtils.u;
          a.m(u);
          b = u.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "26");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.z.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final int I(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "46");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.T == null) {
             NasaExperimentUtils.T = Integer.valueOf(a.t().a("enableShowElementMaxSlotCount", 0));
          }
          Integer t = NasaExperimentUtils.T;
          a.m(t);
          i = t.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(objArray, u, NasaExperimentUtilOld.class, "37");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.K.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final boolean J(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.k == null) {
             NasaExperimentUtils.k = Boolean.valueOf(f.a("location_authorized_card_app"));
          }
          Boolean k = NasaExperimentUtils.k;
          a.m(k);
          b = k.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "11");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.k.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final int K(){
       Integer obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.g() > 0) {
          return d.g();
       }
       if (NasaExperimentUtils.k0 == null) {
          NasaExperimentUtils.k0 = Integer.valueOf(f.e("enableSidefeedminiUpdate"));
       }
       obj = NasaExperimentUtils.k0;
       a.m(obj);
       return obj.intValue();
    }
    public static final boolean L(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.p == null) {
             NasaExperimentUtils.p = Boolean.valueOf(a.t().d("slideBottomEntryTextFontWithMedium", false));
          }
          Boolean p = NasaExperimentUtils.p;
          a.m(p);
          b = p.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "16");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.p.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean M(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "24");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.x == null) {
             NasaExperimentUtils.x = Boolean.valueOf(f.a("userRefreshWayBack"));
          }
          Boolean x = NasaExperimentUtils.x;
          a.m(x);
          b = x.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "23");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.w.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final c N(){
       c j;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "10";
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.j == null) {
             NasaExperimentUtils.j = a.t().getValue("imageOCRButtonFrequencyControl", c.class, new c());
          }
          j = NasaExperimentUtils.j;
          a.m(j);
       }else {
          Object obj1 = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, str);
          j = (obj1 != patchProxyRe)? obj1: NasaExperimentUtilOld.j.getValue();
       }
       return j;
    }
    public static final SlidePlayNextGuideConfig O(){
       SlidePlayNextGuideConfig i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "9";
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.i == null) {
             NasaExperimentUtils.i = a.t().getValue("displayFrequencyOfSlideUpGuideBubble", SlidePlayNextGuideConfig.class, new SlidePlayNextGuideConfig());
          }
          i = NasaExperimentUtils.i;
          a.m(i);
       }else {
          Object obj1 = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, str);
          i = (obj1 != patchProxyRe)? obj1: NasaExperimentUtilOld.i.getValue();
       }
       return i;
    }
    public static final boolean P(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "54");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.b0 == null) {
             NasaExperimentUtils.b0 = Boolean.valueOf(f.a("offline_music_label"));
          }
          Boolean b0 = NasaExperimentUtils.b0;
          a.m(b0);
          b = b0.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "45");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.S.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final int Q(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "31");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (d.G() > 0) {
          return 1;
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.E == null) {
             NasaExperimentUtils.E = Integer.valueOf(f.e("hotStartAutoRefreshDuration"));
          }
          Integer e = NasaExperimentUtils.E;
          a.m(e);
          i = e.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "27");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.A.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int R(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "41");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.O == null) {
             NasaExperimentUtils.O = Integer.valueOf(f.e("pauseBroadcastFunction1"));
          }
          Integer o = NasaExperimentUtils.O;
          a.m(o);
          i = o.intValue();
       }else {
          Number number = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "42");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.P.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int S(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "40");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.N == null) {
             NasaExperimentUtils.N = Integer.valueOf(f.e("pauseBroadcast1"));
          }
          Integer n = NasaExperimentUtils.N;
          a.m(n);
          i = n.intValue();
       }else {
          Number number = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "41");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.O.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int T(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "37");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.K == null) {
             NasaExperimentUtils.K = Integer.valueOf(f.f("refreshAdAvoid", 0));
          }
          Integer k = NasaExperimentUtils.K;
          a.m(k);
          i = k.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "33");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.G.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final boolean U(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "38");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.L == null) {
             NasaExperimentUtils.L = Boolean.valueOf(f.a("watchedBtnNoShow"));
          }
          Boolean l = NasaExperimentUtils.L;
          a.m(l);
          b = l.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "34");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.H.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final int V(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "36");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.J == null) {
             NasaExperimentUtils.J = Integer.valueOf(f.f("userRefreshButtonShowTime", 7));
          }
          Integer j = NasaExperimentUtils.J;
          a.m(j);
          i = j.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "32");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.F.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int W(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "22");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.v == null) {
             NasaExperimentUtils.v = Integer.valueOf(a.t().a("restoreHistoryPhotoMaxCount", 20));
          }
          Integer v = NasaExperimentUtils.v;
          a.m(v);
          i = v.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(objArray, u, NasaExperimentUtilOld.class, "21");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.u.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final boolean X(){
       Boolean obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.e0 == null) {
          NasaExperimentUtils.e0 = Boolean.valueOf(a.t().d("scaleCleanAddSmallWindow", true));
       }
       obj = NasaExperimentUtils.e0;
       a.m(obj);
       return obj.booleanValue();
    }
    public static final String Y(){
       String obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (NasaExperimentUtils.q0 == null) {
          NasaExperimentUtils.q0 = a.t().c("serialHodorPreloadConfig", "");
       }
       obj = NasaExperimentUtils.q0;
       a.m(obj);
       return obj;
    }
    public static final int Z(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "47");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.U == null) {
             NasaExperimentUtils.U = Integer.valueOf(f.e("longPressQuickShare"));
          }
          Integer u = NasaExperimentUtils.U;
          a.m(u);
          i = u.intValue();
       }else {
          NasaExperimentUtilOld u1 = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u1);
          Number number = PatchProxy.apply(null, u1, NasaExperimentUtilOld.class, "38");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.L.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "52");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.Z.getValue();
       }
       return obj.booleanValue();
    }
    public static final int a0(){
       Integer m;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "13");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.m == null) {
             NasaExperimentUtils.m = Integer.valueOf(a.t().a("showSlideGPSDialogInterval", 0));
          }
          m = NasaExperimentUtils.m;
          a.m(m);
          i = m.intValue();
       }else {
          Number number = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "13");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.m.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "51");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.Y.getValue();
       }
       return obj.booleanValue();
    }
    public static final int b0(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "12");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.l == null) {
             NasaExperimentUtils.l = Integer.valueOf(a.t().a("showSlideGPSDialogPhotoPosition", 0));
          }
          Integer l = NasaExperimentUtils.l;
          a.m(l);
          i = l.intValue();
       }else {
          Number number = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "12");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.l.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int c(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "26");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.z.getValue();
       }
       return obj.intValue();
    }
    public static final boolean c0(){
       return NasaExperimentUtils.m0;
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "62");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.j0.getValue();
       }
       return obj.booleanValue();
    }
    public static final int d0(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "19");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.s == null) {
             NasaExperimentUtils.s = Integer.valueOf(a.t().a("relaxTimeVideoTimeoutDuration", 5));
          }
          Integer s = NasaExperimentUtils.s;
          a.m(s);
          i = s.intValue();
       }else {
          Number number = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "20");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.t.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int e(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "48");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.V == null) {
             NasaExperimentUtils.V = Integer.valueOf(f.e("longPressQuickFollow"));
          }
          Integer v = NasaExperimentUtils.V;
          a.m(v);
          i = v.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "39");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.M.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int e0(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "25");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.y == null) {
             NasaExperimentUtils.y = Integer.valueOf(f.e("userRefreshTimeControl"));
          }
          Integer y = NasaExperimentUtils.y;
          a.m(y);
          i = y.intValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Number number = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "24");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.x.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int f(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "14");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.n == null) {
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             if (uoc.c()) {
                i = d.F();
                if (!i) {
                   i = a.t().a("episodeType", 0);
                }
             }else {
                i = a.t().a("episodeType", 0);
             }
             NasaExperimentUtils.n = Integer.valueOf(i);
          }
          Integer n = NasaExperimentUtils.n;
          a.m(n);
          i = n.intValue();
       }else {
          Number number = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "14");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.n.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final int g(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "49");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.W == null) {
             NasaExperimentUtils.W = Integer.valueOf(a.t().a("captionUnfold", 0));
          }
          Integer w = NasaExperimentUtils.W;
          a.m(w);
          i = w.intValue();
       }else {
          Number number = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "40");
          if (number == patchProxyRe) {
             number = NasaExperimentUtilOld.N.getValue();
          }
          i = number.intValue();
       }
       return i;
    }
    public static final boolean h(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "35");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.I == null) {
             int i = 0;
             if (a.t().a("fastFreshRerankType", i) == 2) {
                i = true;
             }
             NasaExperimentUtils.I = Boolean.valueOf(i);
          }
          Boolean i1 = NasaExperimentUtils.I;
          a.m(i1);
          b = i1.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(objArray, u, NasaExperimentUtilOld.class, "31");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.E.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean i(){
       Boolean obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.d0 == null) {
          NasaExperimentUtils.d0 = Boolean.valueOf(a.t().d("disableDraggingTranslucent", false));
       }
       obj = NasaExperimentUtils.d0;
       a.m(obj);
       return obj.booleanValue();
    }
    public static final boolean j(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "20");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.t == null) {
             NasaExperimentUtils.t = Boolean.valueOf(a.t().d("disableHotSlideRerank", false));
          }
          Boolean t = NasaExperimentUtils.t;
          a.m(t);
          b = t.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "25");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.y.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean k(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "33");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.G == null) {
             NasaExperimentUtils.G = Boolean.valueOf(a.t().d("disableNasaHotStartRefreshAdrRemoveCover", false));
          }
          Boolean g = NasaExperimentUtils.G;
          a.m(g);
          b = g.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(objArray, u, NasaExperimentUtilOld.class, "29");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.C.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean l(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "34");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.H == null) {
             NasaExperimentUtils.H = Boolean.valueOf(a.t().d("disableNasaHotStartRefreshAdrUnpause", false));
          }
          Boolean h = NasaExperimentUtils.H;
          a.m(h);
          b = h.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(objArray, u, NasaExperimentUtilOld.class, "30");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.D.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean m(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "58");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.f0.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean n(){
       Boolean obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.C == null) {
          NasaExperimentUtils.C = Boolean.valueOf(a.t().d("disableZoomInCleanScreen", false));
       }
       obj = NasaExperimentUtils.C;
       a.m(obj);
       return obj.booleanValue();
    }
    public static final boolean o(){
       boolean b;
       Boolean f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "32");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (d.G() > 0) {
          b = (d.G() == 2)? true: false;
          return b;
       }else {
          obj = m.a();
          a.o(obj, "HomePagePlugin.getInstance\(\)");
          if (obj.GG()) {
             if (NasaExperimentUtils.F == null) {
                NasaExperimentUtils.F = Boolean.valueOf(f.a("enableAllPhotosRefresh"));
             }
             f = NasaExperimentUtils.F;
             a.m(f);
             b = f.booleanValue();
          }else {
             NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
             Objects.requireNonNull(u);
             Boolean uBoolean = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "28");
             if (uBoolean == patchProxyRe) {
                uBoolean = NasaExperimentUtilOld.B.getValue();
             }
             b = uBoolean.booleanValue();
          }
          return b;
       }
    }
    public static final boolean p(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.o == null) {
             NasaExperimentUtils.o = Boolean.valueOf(a.t().d("breathingCircleNew", true));
          }
          Boolean o = NasaExperimentUtils.o;
          a.m(o);
          b = o.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "15");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.o.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean q(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "44");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.R == null) {
             int i = 0;
             if (a.t().a("enableCaptionSimplify", i) == 1) {
                i = true;
             }
             NasaExperimentUtils.R = Boolean.valueOf(i);
          }
          Boolean r = NasaExperimentUtils.R;
          a.m(r);
          b = r.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(objArray, u, NasaExperimentUtilOld.class, "35");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.I.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean r(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "45");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.S == null) {
             NasaExperimentUtils.S = Boolean.valueOf(f.a("fastreply_bottombar_exclude"));
          }
          Boolean s = NasaExperimentUtils.S;
          a.m(s);
          b = s.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "36");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.J.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean s(){
       Boolean a;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.a == null) {
             NasaExperimentUtils.a = Boolean.valueOf(f.a("enableFriendsWorkShowTime"));
          }
          a = NasaExperimentUtils.a;
          a.m(a);
          b = a.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.a.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean t(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.w == null) {
             NasaExperimentUtils.w = Boolean.valueOf(f.a("hotRefreshWayBack"));
          }
          Boolean w = NasaExperimentUtils.w;
          a.m(w);
          b = w.booleanValue();
       }else {
          NasaExperimentUtilOld u = NasaExperimentUtilOld.U;
          Objects.requireNonNull(u);
          Boolean uBoolean = PatchProxy.apply(null, u, NasaExperimentUtilOld.class, "22");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.v.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean u(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "50");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.X.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean v(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, objArray, NasaExperimentUtils.class, "55");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.c0 == null) {
             NasaExperimentUtils.c0 = Boolean.valueOf(a.t().d("musicLabelMarqueeTextOpt", false));
          }
          Boolean c0 = NasaExperimentUtils.c0;
          a.m(c0);
          b = c0.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, NasaExperimentUtilOld.class, "46");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.T.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean w(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "53");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.a0.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean x(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "42");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.P == null) {
             NasaExperimentUtils.P = Boolean.valueOf(f.a("pauseBroadcastAutoplay1"));
          }
          Boolean p = NasaExperimentUtils.P;
          a.m(p);
          b = p.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "43");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.Q.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean y(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "43");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       if (obj.GG()) {
          if (NasaExperimentUtils.Q == null) {
             NasaExperimentUtils.Q = Boolean.valueOf(f.a("pageControl1"));
          }
          Boolean q = NasaExperimentUtils.Q;
          a.m(q);
          b = q.booleanValue();
       }else {
          Boolean uBoolean = PatchProxy.apply(null, null, NasaExperimentUtilOld.class, "44");
          if (uBoolean == patchProxyRe) {
             uBoolean = NasaExperimentUtilOld.R.getValue();
          }
          b = uBoolean.booleanValue();
       }
       return b;
    }
    public static final boolean z(){
       Object obj = PatchProxy.apply(null, null, NasaExperimentUtils.class, "68");
       if (obj == PatchProxyResult.class) {
          obj = NasaExperimentUtils.s0.getValue();
       }
       return obj.booleanValue();
    }
}
