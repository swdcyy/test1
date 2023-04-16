package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import lc1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$a;
import java.lang.reflect.Type;
import el.a;
import lp3.e;
import java.lang.Object;
import xp5.g;
import java.lang.Class;
import lp3.c;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo$ExtraInfo;
import java.lang.Long;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import s81.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import java.lang.Integer;
import java.lang.Number;
import java.util.Random;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yb6.d;
import crd.b;
import md1.b;
import ok.x;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.d;
import erd.r;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.c;
import erd.g;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public class e implements b	// class@001011
{
    public HashMap b;
    public final e c;
    public final g d;
    public final i e;
    public b f;
    public boolean g;
    public j h;
    public e$b i;
    public static final int j;
    public static final Type k;

    static {
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION,LiveCommentNoticeChannelType.API_DELAY_INFO,LiveCommentNoticeChannelType.API_PLAYBACK_STATUS};
       e.j = LiveCommentNoticeChannelType.combineChannels(liveCommentN);
       e.k = new e$a().getType();
    }
    public void e(e p0){
       super();
       this.c = p0;
       this.d = p0.a(g.class);
       this.e = p0.a(i.class);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "2")) {
       }else {
          String str = this.d.d();
          LiveSubscribeAnchorNoticeInfo mExtraInfo = p1.mExtraInfo;
          if (mExtraInfo != null) {
             LiveSubscribeAnchorNoticeInfo$ExtraInfo mSubscribeNo = mExtraInfo.mSubscribeNoticeShowValidMs;
             b = true;
             if (PatchProxy.isSupport(uoe)) {
                HashMap obj = PatchProxy.applyTwoRefs(str, Long.valueOf(mSubscribeNo), this, uoe, "7");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                label_0039 :
                   obj = this.e();
                   if (obj == null || obj.isEmpty()) {
                      b.P(LiveLogTag.LIVE_SUBSCRIBE.appendTag("SubscribeAnchorNotice"), "canShowSubscribeCommonNotice, noticeAnchorIds is empty, so true");
                   }else {
                      Iterator iterator = obj.entrySet().iterator();
                      Map$Entry uEntry = (iterator.hasNext())? iterator.next(): null;
                      long l = (uEntry == null || uEntry.getValue() == null)? 0: uEntry.getValue().longValue();
                      if ((System.currentTimeMillis() - l) - mSubscribeNo > 0) {
                         b.P(LiveLogTag.LIVE_SUBSCRIBE.appendTag("SubscribeAnchorNotice"), "canShowSubscribeCommonNotice, noticeAnchorIds not empty, but valid, so true");
                         obj.clear();
                         a.R(obj);
                      }else {
                         b = b ^ obj.containsKey(str);
                         b.S(LiveLogTag.LIVE_SUBSCRIBE.appendTag("SubscribeAnchorNotice"), "canShowSubscribeCommonNotice, normal case", "canShowNotice", Boolean.valueOf(b));
                      }
                   }
                }
             }else {
                goto label_0039 ;
             }
             if (b) {
                int i = (int)mExtraInfo.mDelayDisplayTimeMs;
                int i1 = (int)mExtraInfo.mLiveCommentNoticeRandomTimeShowMs;
                if (PatchProxy.isSupport(uoe)) {
                   Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, uoe, "9");
                   if (obj1 != patchProxyRe) {
                      i = obj1.intValue();
                   }else {
                   label_00d6 :
                      Random random = new Random(System.currentTimeMillis());
                      if (i <= 0 || i1 <= 0) {
                         i = 0;
                      }else if(i1 > i){
                         i1 = i1 - i;
                      }
                      i = i + random.nextInt(i1);
                   }
                }else {
                   goto label_00d6 ;
                }
                LiveLogTag lIVE_SUBSCRI = LiveLogTag.LIVE_SUBSCRIBE;
                lIVE_SUBSCRI.appendTag("SubscribeAnchorNotice");
                b.S(lIVE_SUBSCRI, "onReceiveCommentNotice", "delayRequestSubscribeStateTimeMs", Integer.valueOf(i));
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(i), this, uoe, "4")) {
                   lIVE_SUBSCRI.appendTag("SubscribeAnchorNotice");
                   b.S(lIVE_SUBSCRI, "tryRequestSubscribeStat", "delayDurationMs", Integer.valueOf(i));
                   LiveSubscribeAnchorNoticeInfo mExtraInfo1 = p1.mExtraInfo;
                   if (mExtraInfo1 != null && (TextUtils.x(mExtraInfo1.mSubscribeId) || mExtraInfo1.mReservationEndMs - d.a() < 0)) {
                      lIVE_SUBSCRI.appendTag("SubscribeAnchorNotice");
                      b.P(lIVE_SUBSCRI, "tryRequestSubscribeStat, but can\'t!!! ");
                   }else {
                      this.d(this.f);
                      this.f = b.a.get().a(mExtraInfo1.mSubscribeId).map(new e()).delaySubscription((long)i, TimeUnit.MILLISECONDS).filter(d.b).observeOn(d.a).subscribe(new c(this, p1));
                   }
                }
             }
          }
          b.S(LiveLogTag.LIVE_SUBSCRIBE.appendTag("SubscribeAnchorNotice"), "onReceiveCommentNotice, but  can\'t subscribe !!! ", "extraInfo", mExtraInfo);
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b(26, e.j, new e(LiveSubscribeAnchorNoticeInfo.class));
    }
    public final void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       if (p0 != null && !p0.isDisposed()) {
          p0.dispose();
       }
       return;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.d(this.f);
       this.g = false;
       return;
    }
    public final HashMap e(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.k;
       String str = a.a.getString(b.d("user")+"subscribeNoticeAnchorIdHashMap", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public final c f(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(p0);
    }
}
