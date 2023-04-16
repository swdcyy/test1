package com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuDrawingCache$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$forceInsertAnimDanmaku$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$supportDebugTool$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuConfigInfo$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$hotDanmakuShowMinimumLikeCount$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuActivityShowCount$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$isFollowerCountOverThreshold$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuCloseGuideConfig$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuOpenGuideConfig$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuSendGuideConfig$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$sendDanmakuLocation$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$disableBottomSendDanmaku$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuAnimation$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuWishActivity$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuActMockConfig$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuHandlerThreadReuse$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuPlayerReuse$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$slideEnableDanmakuMask$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$slideEnableDanmakuInitDelay$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableFriendWorksSupportDanmaku$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$settingPositionOpt$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuFireworks$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableVerticalDanmaku$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuSpecialCharMap$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enablePrivilegeColorExp$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuFontSize$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuPerfSampleRate$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSDKObjectPool$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableSDKDrawingCachePool$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuStatEventLogger$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuInvalidByDanmakuId$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$poiPageEnableDanmaku$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableReadDanmakuSwitchNew$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuEditorActivityNew$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuEmotionOpt$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuContentSpannedReuse$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuItemFastMeasure$2;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$enableDanmakuItemFastMeasureLog$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nm5.c;
import nm5.g;
import nm5.r;
import java.lang.Number;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import im5.c;
import java.util.Objects;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils$a;
import java.lang.reflect.Type;
import el.a;
import xf6.d;
import nm5.a;
import com.kwai.feature.api.danmaku.model.DanmakuMaskOpenGuideConfig;
import java.util.Map;

public final class DanmakuExperimentUtils	// class@000e6c
{
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final p E;
    public static final p F;
    public static final p G;
    public static final p H;
    public static final p I;
    public static final p J;
    public static final p K;
    public static final p L;
    public static final p M;
    public static final p N;
    public static final p O;
    public static final p P;
    public static final p Q;
    public static final p R;
    public static final p S;
    public static final p T;
    public static final DanmakuExperimentUtils U;
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final p l;
    public static final p m;
    public static final p n;
    public static final p o;
    public static final p p;
    public static final p q;
    public static final p r;
    public static final p s;
    public static final p t;
    public static final p u;
    public static final p v;
    public static final p w;
    public static final p x;
    public static final p y;
    public static final p z;

    static {
       DanmakuExperimentUtils.U = new DanmakuExperimentUtils();
       DanmakuExperimentUtils.a = s.c(DanmakuExperimentUtils$enableDanmakuDrawingCache$2.INSTANCE);
       DanmakuExperimentUtils.b = s.c(DanmakuExperimentUtils$forceInsertAnimDanmaku$2.INSTANCE);
       DanmakuExperimentUtils.c = s.c(DanmakuExperimentUtils$supportDebugTool$2.INSTANCE);
       DanmakuExperimentUtils.d = s.c(DanmakuExperimentUtils$danmakuConfigInfo$2.INSTANCE);
       DanmakuExperimentUtils.e = s.c(DanmakuExperimentUtils$hotDanmakuShowMinimumLikeCount$2.INSTANCE);
       DanmakuExperimentUtils.f = s.c(DanmakuExperimentUtils$danmakuActivityShowCount$2.INSTANCE);
       DanmakuExperimentUtils.g = s.c(DanmakuExperimentUtils$enableHotDanmakuShowNewStyle$2.INSTANCE);
       DanmakuExperimentUtils.h = s.c(DanmakuExperimentUtils$isFollowerCountOverThreshold$2.INSTANCE);
       DanmakuExperimentUtils.i = s.c(DanmakuExperimentUtils$danmakuCloseGuideConfig$2.INSTANCE);
       DanmakuExperimentUtils.j = s.c(DanmakuExperimentUtils$danmakuMaskOpenGuideConfig$2.INSTANCE);
       DanmakuExperimentUtils.k = s.c(DanmakuExperimentUtils$danmakuOpenGuideConfig$2.INSTANCE);
       DanmakuExperimentUtils.l = s.c(DanmakuExperimentUtils$danmakuSendGuideConfig$2.INSTANCE);
       DanmakuExperimentUtils.m = s.c(DanmakuExperimentUtils$sendDanmakuLocation$2.INSTANCE);
       DanmakuExperimentUtils.n = s.c(DanmakuExperimentUtils$enableSendDanmakuAtMusicLabelRight$2.INSTANCE);
       DanmakuExperimentUtils.o = s.c(DanmakuExperimentUtils$enableSendDanmakuReplaceMusicLabel$2.INSTANCE);
       DanmakuExperimentUtils.p = s.c(DanmakuExperimentUtils$disableBottomSendDanmaku$2.INSTANCE);
       DanmakuExperimentUtils.q = s.c(DanmakuExperimentUtils$enableDanmakuAnimation$2.INSTANCE);
       DanmakuExperimentUtils.r = s.c(DanmakuExperimentUtils$enableDanmakuWishActivity$2.INSTANCE);
       DanmakuExperimentUtils.s = s.c(DanmakuExperimentUtils$enableDanmakuPerformanceOptV1$2.INSTANCE);
       DanmakuExperimentUtils.t = s.c(DanmakuExperimentUtils$danmakuActMockConfig$2.INSTANCE);
       DanmakuExperimentUtils.u = s.c(DanmakuExperimentUtils$danmakuHandlerThreadReuse$2.INSTANCE);
       DanmakuExperimentUtils.v = s.c(DanmakuExperimentUtils$danmakuPlayerReuse$2.INSTANCE);
       DanmakuExperimentUtils.w = s.c(DanmakuExperimentUtils$slideEnableDanmakuMask$2.INSTANCE);
       DanmakuExperimentUtils.x = s.c(DanmakuExperimentUtils$slideEnableDanmakuInitDelay$2.INSTANCE);
       DanmakuExperimentUtils.y = s.c(DanmakuExperimentUtils$enableFriendWorksSupportDanmaku$2.INSTANCE);
       DanmakuExperimentUtils.z = s.c(DanmakuExperimentUtils$settingPositionOpt$2.INSTANCE);
       DanmakuExperimentUtils.A = s.c(DanmakuExperimentUtils$enableDanmakuFireworks$2.INSTANCE);
       DanmakuExperimentUtils.B = s.c(DanmakuExperimentUtils$enableVerticalDanmaku$2.INSTANCE);
       DanmakuExperimentUtils.C = s.c(DanmakuExperimentUtils$danmakuSpecialCharMap$2.INSTANCE);
       DanmakuExperimentUtils.D = s.c(DanmakuExperimentUtils$enablePrivilegeColorExp$2.INSTANCE);
       DanmakuExperimentUtils.E = s.c(DanmakuExperimentUtils$danmakuFontSize$2.INSTANCE);
       DanmakuExperimentUtils.F = s.c(DanmakuExperimentUtils$danmakuPerfSampleRate$2.INSTANCE);
       DanmakuExperimentUtils.G = s.c(DanmakuExperimentUtils$enableSDKObjectPool$2.INSTANCE);
       DanmakuExperimentUtils.H = s.c(DanmakuExperimentUtils$enableSDKDrawingCachePool$2.INSTANCE);
       DanmakuExperimentUtils.I = s.c(DanmakuExperimentUtils$enableDanmakuStatEventLogger$2.INSTANCE);
       DanmakuExperimentUtils.J = s.c(DanmakuExperimentUtils$danmakuContentAreaPatternARatio$2.INSTANCE);
       DanmakuExperimentUtils.K = s.c(DanmakuExperimentUtils$enableDanmakuDeviceAdapt$2.INSTANCE);
       DanmakuExperimentUtils.L = s.c(DanmakuExperimentUtils$enableDanmakuInvalidByDanmakuId$2.INSTANCE);
       DanmakuExperimentUtils.M = s.c(DanmakuExperimentUtils$poiPageEnableDanmaku$2.INSTANCE);
       DanmakuExperimentUtils.N = s.c(DanmakuExperimentUtils$enableReadDanmakuSwitchNew$2.INSTANCE);
       DanmakuExperimentUtils.O = s.c(DanmakuExperimentUtils$enableDanmakuEditorActivityNew$2.INSTANCE);
       DanmakuExperimentUtils.P = s.c(DanmakuExperimentUtils$enableDanmakuEmotionOpt$2.INSTANCE);
       DanmakuExperimentUtils.Q = s.c(DanmakuExperimentUtils$enableDanmakuItemLayoutOpt$2.INSTANCE);
       DanmakuExperimentUtils.R = s.c(DanmakuExperimentUtils$enableDanmakuContentSpannedReuse$2.INSTANCE);
       DanmakuExperimentUtils.S = s.c(DanmakuExperimentUtils$enableDanmakuItemFastMeasure$2.INSTANCE);
       DanmakuExperimentUtils.T = s.c(DanmakuExperimentUtils$enableDanmakuItemFastMeasureLog$2.INSTANCE);
    }
    public void DanmakuExperimentUtils(){
       super();
    }
    public static final boolean D(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.g.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean H(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.n.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean I(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "16");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.o.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean J(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "29");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.B.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean T(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.h.getValue();
       }
       return obj.booleanValue();
    }
    public static final c e(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.d.getValue();
    }
    public static final g i(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.k.getValue();
    }
    public static final r l(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.l.getValue();
    }
    public static final boolean r(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean u(){
       Object obj = PatchProxy.apply(null, null, DanmakuExperimentUtils.class, "28");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.A.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean A(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "37");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.I.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean B(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "19");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.r.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean C(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "26");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.y.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean E(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "32");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.D.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean F(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "36");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.H.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean G(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "35");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.G.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean K(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.b.getValue();
       }
       return obj.booleanValue();
    }
    public final int L(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.e.getValue();
       }
       return obj.intValue();
    }
    public final List M(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(c.b);
       return a.t().getValue(c.a, new DanmakuExperimentUtils$a().getType(), null);
    }
    public final boolean N(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "41");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.M.getValue();
       }
       return obj.booleanValue();
    }
    public final int O(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "14");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.m.getValue();
       }
       return obj.intValue();
    }
    public final int P(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "27");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.z.getValue();
       }
       return obj.intValue();
    }
    public final boolean Q(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "25");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.x.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean R(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "24");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.w.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean S(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.c.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (d.r("KEY_ENABLE_DANMAKU_COLLISION_ANIM") || a.t().d("collisionDanmakuAnimSwitch", b)) {
          b = true;
       }
       return b;
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.t.getValue();
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.f.getValue();
       }
       return obj.intValue();
    }
    public final g d(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.i.getValue();
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "33");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.E.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "22");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.u.getValue();
       }
       return obj.booleanValue();
    }
    public final DanmakuMaskOpenGuideConfig h(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.j.getValue();
    }
    public final int j(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "34");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.F.getValue();
       }
       return obj.intValue();
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "23");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.v.getValue();
       }
       return obj.booleanValue();
    }
    public final Map m(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuExperimentUtils.C.getValue();
    }
    public final boolean n(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.p.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean o(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "18");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.q.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean p(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "46");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.R.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean q(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "39");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.K.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean s(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "43");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.O.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean t(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "44");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.P.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "40");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.L.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean w(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "47");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.S.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean x(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "48");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.T.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean y(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "45");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.Q.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean z(){
       Object obj = PatchProxy.apply(null, this, DanmakuExperimentUtils.class, "20");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuExperimentUtils.s.getValue();
       }
       return obj.booleanValue();
    }
}
