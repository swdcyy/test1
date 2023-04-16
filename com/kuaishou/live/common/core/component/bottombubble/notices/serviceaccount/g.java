package com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.g;
import lc1.b;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.h;
import lp3.i;
import java.lang.Class;
import lp3.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xx1.a;
import brd.t;
import ld1.d;
import erd.g;
import crd.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo$ExtraInfo;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.b;
import msd.a;
import c15.b;
import tkd.b;
import tkd.d;
import xx5.d;
import cy5.a;
import ld1.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import ld1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.a$a;
import nc1.j$a;
import bq5.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.f;
import bq5.d;
import ld1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.h$a;
import nc1.k;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import lnc.b9;
import java.util.HashMap;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;

public class g implements b	// class@001003
{
    public final ClientContent$LiveStreamPackage b;
    public final e c;
    public final h d;
    public a e;
    public boolean f;
    public boolean g;
    public b h;

    public void g(e p0,ClientContent$LiveStreamPackage p1){
       super();
       this.f = false;
       this.g = false;
       this.b = p1;
       this.c = p0;
       this.d = p0.a(h.class);
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
       }else {
          this.g = false;
          this.h = p0.a(a.class).Pm().subscribe(new d(this));
       }
       return;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "2")) {
       }else {
          String str = "onReceiveCommentNotice";
          if (!this.d.Df(p1.mExtraInfo)) {
             b.g(KsgLogTunaLiveTag.COMMON_NOTICE.appendTag(str), b.b);
          }else {
             int i = -734569516;
             a uoa = d.a(i).rA();
             if (uoa != null) {
                uoa.d();
             }
             KsgLogTunaLiveTag cOMMON_NOTIC = KsgLogTunaLiveTag.COMMON_NOTICE;
             cOMMON_NOTIC.appendTag(str);
             KsgLogTunaLiveTag ksgLogTunaLi = cOMMON_NOTIC;
             b.f(ksgLogTunaLi, new e(p1));
             d.a(i).K4(p1.mExtraInfo.mTunaButtonModel, this.d());
             j oj = PatchProxy.applyTwoRefs(p1, uoa, this, og, "4");
             if (oj != PatchProxyResult.class) {
             }else {
                a uoa1 = new a(p1, new b(this), uoa);
                this.e = uoa1;
                LiveServiceAccountNoticeInfo mDelayDispla = (p1.mExtraInfo != null)? p1.mDelayDisplayTimeMs: 0x2710;
                j$a uoa2 = new j$a();
                uoa2.e(uoa1);
                uoa2.f(p1.mPriority);
                uoa2.h(p1.mBizId);
                uoa2.j(mDelayDispla);
                uoa2.i(p1.mNoticeType);
                uoa2.c(p1.mDisplayDurationMs);
                uoa2.d(new f(this, p1));
                oj = uoa2.g();
             }
             this.d.en(new c(this));
             this.d.Hd(p1.mExtraInfo);
             if (oj != null) {
                this.c.a(k.class).Y9(oj);
             }
             if (uoa != null) {
                uoa.c();
                uoa.b(p1.mExtraInfo.mTunaBizType, 1);
             }
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(19, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveServiceAccountNoticeInfo.class));
    }
    public final BaseFeed d(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       Object[] objArray1 = (obj == null)? objArray: obj.a(d.class);
       if (objArray1 != null) {
          objArray = objArray1.j0();
       }
       return objArray;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       b9.a(this.h);
       return;
    }
    public String e(LiveServiceAccountNoticeInfo p0){
       LiveServiceAccountNoticeInfo obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mExtraInfo;
          if (obj != null && obj.mTunaBizType != null) {
             HashMap hashMap = new HashMap();
             hashMap.put("bizType", p0.mExtraInfo.mTunaBizType);
             hashMap.put("statistics_info", p0.mExtraInfo.mStatisticInfo);
             d.a(-734569516).Y9(hashMap, p0.mExtraInfo.mTunaButtonModel, this.d());
             return a.a.q(hashMap);
          }
       }
       return "";
    }
}
