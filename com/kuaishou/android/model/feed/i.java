package com.kuaishou.android.model.feed.i;
import java.lang.Object;
import com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import java.lang.Long;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.List;
import android.util.SparseArray;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yp.g;
import tl8.d;
import ok.h;
import tl8.e;
import yp.i;
import yp.k;
import com.kuaishou.android.model.feed.f;
import com.kuaishou.android.model.feed.e;
import com.kuaishou.android.model.feed.a;
import java.lang.StringBuilder;
import java.lang.Iterable;
import qk.m;
import yp.h;
import ok.o;
import com.google.common.base.Optional;
import ei5.c;
import q87.c;
import com.kuaishou.android.model.feed.b;
import com.kuaishou.android.model.feed.h;
import yp.j;
import com.kuaishou.android.model.feed.c;
import com.kuaishou.android.model.feed.d;
import com.kuaishou.android.model.feed.g;

public final class i	// class@000b90
{

    public void i(){
       super();
    }
    public static boolean A(LivePlaybackQualityPlayUrls p0){
       return (q.f(p0.mUrls) ^ 0x01);
    }
    public static Long B(LivePlaybackMeta p0){
       return Long.valueOf(p0.mPlayOffsetMs);
    }
    public static CDNUrl[] C(BaseFeed p0,LivePlaybackMeta p1){
       boolean b = i.v(p0);
       LivePlaybackMeta mQualityPlay = p1.mQualityPlayUrls;
       if (!q.f(mQualityPlay)) {
          return i.q(mQualityPlay, b, p1.mCurrentQuality);
       }
       ExceptionHandler.handleCaughtException(new Exception("BaseFeedExtForLivePlaybackMeta getPlayUrls, qualityPlayUrls is empty"));
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       return uCDNUrlArray;
    }
    public static String D(LivePlaybackMeta p0){
       return p0.mProductId;
    }
    public static SparseArray E(LivePlaybackMeta p0){
       SparseArray sparseArray = new SparseArray();
       for (int i = 0; i < p0.mQualityPlayUrls.size(); i = i + 1) {
          LivePlaybackQualityPlayUrls livePlayback = p0.mQualityPlayUrls.get(i);
          sparseArray.append(i.J(livePlayback.mLevel), livePlayback);
       }
       return sparseArray;
    }
    public static Boolean F(LivePlaybackMeta p0){
       return Boolean.valueOf(p0.mIsUseFreeTraffic);
    }
    public static Integer G(int p0,LivePlaybackMeta p1){
       p1.mCurrentQuality = p0;
       return Integer.valueOf(p0);
    }
    public static Long H(long p0,LivePlaybackMeta p1){
       p1.mPlayOffsetMs = p0;
       return Long.valueOf(p0);
    }
    public static Boolean I(boolean p0,LivePlaybackMeta p1){
       p1.mIsUseFreeTraffic = p0;
       return Boolean.valueOf(p0);
    }
    public static int J(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (("SUPER").equals(p0)) {
          return 20;
       }
       if (("HIGH").equals(p0)) {
          return 10;
       }
       ("STANDARD").equals(p0);
       return 0;
    }
    public static void K(BaseFeed p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oi, "8")) {
          return;
       }
       e.h(p0, LivePlaybackMeta.class, new g(p1));
       return;
    }
    public static void L(BaseFeed p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, oi, "15")) {
          return;
       }
       e.h(p0, LivePlaybackMeta.class, new i(p1));
       return;
    }
    public static void M(BaseFeed p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oi, "13")) {
          return;
       }
       e.h(p0, LivePlaybackMeta.class, new k(p1));
       return;
    }
    public static boolean a(int p0,boolean p1,LivePlaybackQualityPlayUrls p2){
       return i.z(p0, p1, p2);
    }
    public static boolean b(LivePlaybackQualityPlayUrls p0){
       return i.A(p0);
    }
    public static String c(LivePlaybackMeta p0){
       return i.D(p0);
    }
    public static Boolean d(boolean p0,LivePlaybackMeta p1){
       return i.I(p0, p1);
    }
    public static SparseArray e(LivePlaybackMeta p0){
       return i.E(p0);
    }
    public static String f(LivePlaybackMeta p0){
       return i.x(p0);
    }
    public static Integer g(int p0,LivePlaybackMeta p1){
       return i.G(p0, p1);
    }
    public static Long h(long p0,LivePlaybackMeta p1){
       return i.H(p0, p1);
    }
    public static String i(LivePlaybackMeta p0){
       return i.w(p0);
    }
    public static Boolean j(LivePlaybackMeta p0){
       return i.F(p0);
    }
    public static Long k(LivePlaybackMeta p0){
       return i.B(p0);
    }
    public static String l(LivePlaybackMeta p0){
       return i.y(p0);
    }
    public static CDNUrl[] m(BaseFeed p0,LivePlaybackMeta p1){
       return i.C(p0, p1);
    }
    public static String n(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LivePlaybackMeta.class, f.b);
    }
    public static String o(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LivePlaybackMeta.class, e.b);
    }
    public static String p(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LivePlaybackMeta.class, a.b);
    }
    public static CDNUrl[] q(List p0,boolean p1,int p2){
       String obj;
       int i;
       if (PatchProxy.isSupport(i.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, i.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "qualityPlayUrls size : "+p0.size()+" isLocalFreeTraffic : "+p1+" currentQuality : "+p2;
       LivePlaybackQualityPlayUrls livePlayback = m.s(p0).r(new h(p2, p1)).orNull();
       String str = "BaseFeedExtForLivePlaybackMeta";
       i = 0;
       if (livePlayback == null) {
          Object[] objArray = new Object[]{obj};
          c.C().A(str, "fetch playback urls, with local free traffic error, log params, ", objArray);
          livePlayback = m.s(p0).r(b.b).orNull();
       }
       if (livePlayback != null && !q.f(livePlayback.mUrls)) {
          Object[] objArray1 = new Object[i];
          c.C().w(str, "fetch playback urls success, result size : "+livePlayback.mUrls.size()+"log params, "+obj, objArray1);
          LivePlaybackQualityPlayUrls mUrls = livePlayback.mUrls;
          CDNUrl[] uCDNUrlArray = new CDNUrl[mUrls.size()];
          return mUrls.toArray(uCDNUrlArray);
       }else {
          ExceptionHandler.handleCaughtException(new Exception("BaseFeedExtForLivePlaybackMeta getPlayUrls error . log params, "+obj));
          CDNUrl[] uCDNUrlArray1 = new CDNUrl[i];
          return uCDNUrlArray1;
       }
    }
    public static long r(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e.h(p0, LivePlaybackMeta.class, h.b).longValue();
    }
    public static CDNUrl[] s(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LivePlaybackMeta.class, new j(p0));
    }
    public static String t(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LivePlaybackMeta.class, c.b);
    }
    public static SparseArray u(BaseFeed p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, i.class, "9");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       return e.h(p0, LivePlaybackMeta.class, d.b);
    }
    public static boolean v(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h(p0, LivePlaybackMeta.class, g.b).booleanValue();
    }
    public static String w(LivePlaybackMeta p0){
       return p0.mGameId;
    }
    public static String x(LivePlaybackMeta p0){
       return p0.mLiveHighlightId;
    }
    public static String y(LivePlaybackMeta p0){
       return p0.mLiveStreamId;
    }
    public static boolean z(int p0,boolean p1,LivePlaybackQualityPlayUrls p2){
       int i = 0;
       if (i.J(p2.mLevel) == p0 && (!q.f(p2.mUrls) && p2.mUrls.get(i).mIsFreeTrafficCdn == p1)) {
          i = true;
       }
    label_001e :
       return i;
    }
}
