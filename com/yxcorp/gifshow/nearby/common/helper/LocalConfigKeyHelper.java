package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalSamplingRate$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalMapLog$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$pageLoadBlockedTime$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localHeaderNegativeType$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$isAdjustLiveComment$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyAnimatedCoverStrategy$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyBubbleSupportClick$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$showSelfGovernanceWidget$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalMapSamplingRate$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localSubpageStayDuration$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localInnerGuideMaxCount$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableShowV6UserName$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLoadMoreConfig$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalBulletVertical$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableTabNameStandard$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$refreshLocateType$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyVideoCacheConfig$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableForegroundSwitchRefresh$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableRefreshUseNotShow$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localSlideArrowType$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localCachePoolConfig$2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$preLoadMapSdk$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.yxcorp.gifshow.nearby.common.model.NearbyLiveCachePoolConfig;
import com.yxcorp.gifshow.nearby.common.model.NearbyVideoCacheConfig;

public final class LocalConfigKeyHelper	// class@002108
{
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final LocalConfigKeyHelper E;
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
       LocalConfigKeyHelper.E = new LocalConfigKeyHelper();
       LocalConfigKeyHelper.a = s.c(LocalConfigKeyHelper$isLocalSingleFeedDetailStream$2.INSTANCE);
       LocalConfigKeyHelper.b = s.c(LocalConfigKeyHelper$enableLocalSamplingRate$2.INSTANCE);
       LocalConfigKeyHelper.c = s.c(LocalConfigKeyHelper$enableLocalMapLog$2.INSTANCE);
       LocalConfigKeyHelper.d = s.c(LocalConfigKeyHelper$pageLoadBlockedTime$2.INSTANCE);
       LocalConfigKeyHelper.e = s.c(LocalConfigKeyHelper$localHeaderNegativeType$2.INSTANCE);
       LocalConfigKeyHelper.f = s.c(LocalConfigKeyHelper$isAdjustLiveComment$2.INSTANCE);
       LocalConfigKeyHelper.g = s.c(LocalConfigKeyHelper$nearbyAnimatedCoverStrategy$2.INSTANCE);
       LocalConfigKeyHelper.h = s.c(LocalConfigKeyHelper$getEnableLocalFeedPrefetchDebugConfig$2.INSTANCE);
       LocalConfigKeyHelper.i = s.c(LocalConfigKeyHelper$nearbyLocationPermissonDialogShowTime$2.INSTANCE);
       LocalConfigKeyHelper.j = s.c(LocalConfigKeyHelper$nearbyBubbleSupportClick$2.INSTANCE);
       LocalConfigKeyHelper.k = s.c(LocalConfigKeyHelper$showSelfGovernanceWidget$2.INSTANCE);
       LocalConfigKeyHelper.l = s.c(LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2.INSTANCE);
       LocalConfigKeyHelper.m = s.c(LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2.INSTANCE);
       LocalConfigKeyHelper.n = s.c(LocalConfigKeyHelper$enableLocalMapSamplingRate$2.INSTANCE);
       LocalConfigKeyHelper.o = s.c(LocalConfigKeyHelper$localSubpageStayDuration$2.INSTANCE);
       LocalConfigKeyHelper.p = s.c(LocalConfigKeyHelper$localInnerGuideMaxCount$2.INSTANCE);
       LocalConfigKeyHelper.q = s.c(LocalConfigKeyHelper$enableShowV6UserName$2.INSTANCE);
       LocalConfigKeyHelper.r = s.c(LocalConfigKeyHelper$nearbyLoadMoreConfig$2.INSTANCE);
       LocalConfigKeyHelper.s = s.c(LocalConfigKeyHelper$enableLocalBulletVertical$2.INSTANCE);
       LocalConfigKeyHelper.t = s.c(LocalConfigKeyHelper$enableTabNameStandard$2.INSTANCE);
       LocalConfigKeyHelper.u = s.c(LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2.INSTANCE);
       LocalConfigKeyHelper.v = s.c(LocalConfigKeyHelper$refreshLocateType$2.INSTANCE);
       LocalConfigKeyHelper.w = s.c(LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2.INSTANCE);
       LocalConfigKeyHelper.x = s.c(LocalConfigKeyHelper$nearbyVideoCacheConfig$2.INSTANCE);
       LocalConfigKeyHelper.y = s.c(LocalConfigKeyHelper$enableForegroundSwitchRefresh$2.INSTANCE);
       LocalConfigKeyHelper.z = s.c(LocalConfigKeyHelper$enableRefreshUseNotShow$2.INSTANCE);
       LocalConfigKeyHelper.A = s.c(LocalConfigKeyHelper$enableLocalAutoPlayIgnoreNet$2.INSTANCE);
       LocalConfigKeyHelper.B = s.c(LocalConfigKeyHelper$localSlideArrowType$2.INSTANCE);
       LocalConfigKeyHelper.C = s.c(LocalConfigKeyHelper$localCachePoolConfig$2.INSTANCE);
       LocalConfigKeyHelper.D = s.c(LocalConfigKeyHelper$preLoadMapSdk$2.INSTANCE);
    }
    public void LocalConfigKeyHelper(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "25");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.y.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "14");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.n.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "26");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.z.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean e(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.q.getValue();
       }
       return obj.booleanValue();
    }
    public static final int f(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.e.getValue();
       }
       return obj.intValue();
    }
    public static final int g(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.g.getValue();
       }
       return obj.intValue();
    }
    public static final NearbyLiveCachePoolConfig h(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalConfigKeyHelper.w.getValue();
    }
    public static final boolean i(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.i.getValue();
       }
       return obj.booleanValue();
    }
    public static final NearbyVideoCacheConfig j(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalConfigKeyHelper.x.getValue();
    }
    public static final int k(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "22");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.v.getValue();
       }
       return obj.intValue();
    }
    public static final boolean l(){
       Object obj = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "12");
       if (obj == PatchProxyResult.class) {
          obj = LocalConfigKeyHelper.l.getValue();
       }
       return obj.booleanValue();
    }
}
