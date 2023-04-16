package com.kuaishou.live.core.show.notification.frequencypolicy.LiveAudienceActivityNotificationFrequencyPolicy;
import vc2.a;
import z1.k;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBroadcastNotice;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.notification.frequencypolicy.LiveAudienceActivityNotificationFrequencyPolicy$CacheItem;
import e61.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.reflect.Type;
import e61.d;
import e61.f$b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class LiveAudienceActivityNotificationFrequencyPolicy implements a	// class@000d4a
{
    public final k a;
    public f b;

    public void LiveAudienceActivityNotificationFrequencyPolicy(k p0){
       super();
       this.a = p0;
    }
    public boolean a(LiveCommonNoticeMessages$SCTopBroadcastNotice p0){
       boolean b;
       LiveCommonNoticeMessages$SCTopBroadcastNotice sCTopBroadca;
       Object obj = this;
       LiveLogTag obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, LiveAudienceActivityNotificationFrequencyPolicy.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       LiveCommonNoticeMessages$SCTopBroadcastNotice limitTimeWin = obj1.limitTimeWindow;
       LiveCommonNoticeMessages$SCTopBroadcastNotice limitTimes = obj1.limitTimes;
       LiveCommonNoticeMessages$SCTopBroadcastNotice limitExpireT = obj1.limitExpireTime;
       LiveCommonNoticeMessages$SCTopBroadcastNotice limitTarget = obj1.limitTarget;
       if (PatchProxy.isSupport(LiveAudienceActivityNotificationFrequencyPolicy.class)) {
          obj1 = PatchProxy.applyFourRefs(Long.valueOf(limitTimeWin), Integer.valueOf(limitTimes), Long.valueOf(limitExpireT), limitTarget, this, LiveAudienceActivityNotificationFrequencyPolicy.class, "3");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_0049 :
             obj1 = null;
             b = true;
             if (limitTimeWin - obj1 > 0 && (limitTimes > null && (limitExpireT - obj1 <= 0 || TextUtils.isEmpty(limitTarget)))) {
                b.f0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "checkFrequencyPolicy | true | invalid param\(s\)", "limitTarget", limitTarget, "calcDurationMs", Long.valueOf(limitTimeWin), "limitCount", Integer.valueOf(limitTimes), "limitDurationMs", Long.valueOf(limitExpireT));
             }else {
                this.c();
                LiveAudienceActivityNotificationFrequencyPolicy$CacheItem uCacheItem = PatchProxy.applyOneRefs(limitTarget, obj, LiveAudienceActivityNotificationFrequencyPolicy.class, "6");
                if (uCacheItem != patchProxyRe) {
                }else {
                   LiveAudienceActivityNotificationFrequencyPolicy b1 = obj.b;
                   uCacheItem = (b1 != null)? b1.get(limitTarget): null;
                }
                if (uCacheItem == null) {
                   uCacheItem = new LiveAudienceActivityNotificationFrequencyPolicy$CacheItem();
                }
                long l = obj.a.get().longValue();
                LiveAudienceActivityNotificationFrequencyPolicy$CacheItem mBanTimestam = uCacheItem.mBanTimestamp;
                if (mBanTimestam - obj1 > 0) {
                   if ((l - mBanTimestam) - limitExpireT < 0) {
                      b.f0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "checkFrequencyPolicy | false | banned", "limitTarget", limitTarget, "currentTimeMs", Long.valueOf(l), "mBanTimestamp", Long.valueOf(uCacheItem.mBanTimestamp), "limitDurationMs", Long.valueOf(limitExpireT));
                      b = false;
                   }else {
                      sCTopBroadca = limitTarget;
                      uCacheItem.mBanTimestamp = obj1;
                   }
                }else {
                   sCTopBroadca = limitTarget;
                }
                mBanTimestam = uCacheItem.mLastTimestamp;
                if (mBanTimestam - obj1 <= 0) {
                   uCacheItem.mLastTimestamp = l;
                   uCacheItem.mLastCount = b;
                   obj.d(sCTopBroadca, uCacheItem);
                   b.c0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "checkFrequencyPolicy | true | new arrived", "limitTarget", sCTopBroadca);
                }else if((l - mBanTimestam) - limitTimeWin < 0){
                   int i = uCacheItem.mLastCount + b;
                   uCacheItem.mLastCount = i;
                   if (i <= limitTimes) {
                      obj.d(sCTopBroadca, uCacheItem);
                      b.d0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "checkFrequencyPolicy | true | increasing", "limitTarget", sCTopBroadca, "count", Integer.valueOf(uCacheItem.mLastCount));
                   }else {
                      uCacheItem.mBanTimestamp = l;
                      uCacheItem.mLastTimestamp = obj1;
                      b = 0;
                      uCacheItem.mLastCount = b;
                      obj.d(sCTopBroadca, uCacheItem);
                      b.d0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "checkFrequencyPolicy | false | limit trigger", "limitTarget", sCTopBroadca, "count", Integer.valueOf(uCacheItem.mLastCount));
                   }
                }else {
                   uCacheItem.mLastTimestamp = l;
                   uCacheItem.mLastCount = b;
                   obj.d(sCTopBroadca, uCacheItem);
                   b.c0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "checkFrequencyPolicy | true | new lastTime", "limitTarget", sCTopBroadca);
                }
             }
          }
       }else {
          goto label_0049 ;
       }
       return b;
    }
    public void b(LiveCommonNoticeMessages$SCTopBroadcastNotice p0){
       LiveAudienceActivityNotificationFrequencyPolicy liveAudience = LiveAudienceActivityNotificationFrequencyPolicy.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "2")) {
          return;
       }
       p0 = p0.limitTarget;
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "4") && !TextUtils.isEmpty(p0)) {
          b.c0(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "resetFrequencyPolicyByLimitTarget", "limitTarget", p0);
          this.c();
          if (!PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "8")) {
             liveAudience = this.b;
             if (liveAudience != null) {
                liveAudience.remove(p0);
             }
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceActivityNotificationFrequencyPolicy.class, "5")) {
          return;
       }
       if (this.b == null) {
          this.b = d.a("LiveCommonNotificationFrequencyCacheKey", 4096, LiveAudienceActivityNotificationFrequencyPolicy$CacheItem.class);
       }
       return;
    }
    public final void d(String p0,LiveAudienceActivityNotificationFrequencyPolicy$CacheItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceActivityNotificationFrequencyPolicy.class, "7")) {
          return;
       }
       LiveAudienceActivityNotificationFrequencyPolicy tb = this.b;
       if (tb != null && !PatchProxy.applyVoidTwoRefs(p0, p1, tb, f.class, "3")) {
          f$b uob = new f$b(tb, p0, p1, 0);
          c.k(v0);
       }
       return;
    }
}
