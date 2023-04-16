package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a$b;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import mc1.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.u1;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$NoticeStatus;
import java.util.HashMap;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class a$b implements d	// class@000fe0
{
    public final LiveIncreaseFansNoticeWidget a;
    public final LiveIncreaseFansNoticeInfo b;
    public final a c;

    public void a$b(a p0,LiveIncreaseFansNoticeWidget p1,LiveIncreaseFansNoticeInfo p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       a f;
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "2")) {
          return;
       }
       a$b ta = this.a;
       if (ta != null) {
          a$b tc = this.c;
          if (tc.i != null) {
             f = tc.f;
             Objects.requireNonNull(ta);
             Object obj = PatchProxy.apply(objArray, ta, LiveIncreaseFansNoticeWidget.class, "8");
             if (obj != PatchProxyResult.class) {
                l = obj.longValue();
             }else {
                LiveIncreaseFansNoticeWidget liveIncrease = null;
                l = (ta.e - liveIncrease > 0)? System.currentTimeMillis() - ta.e: liveIncrease;
             }
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(f, Long.valueOf(l), objArray, uoa, "11")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                i3 oi3 = i3.f();
                oi3.c("total_duration", Long.valueOf(l));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = f;
                h$b uob = h$b.e(7, "IMPROVE_FANS_CARD");
                uob.h(uContentPack);
                uob.k(uElementPack);
                u1.r0(uob);
             }
          }
          ta = this.c;
          LiveCommentNoticeBaseInfo mBizType = this.b.mBizType;
          Objects.requireNonNull(ta);
          f = a.class;
          if (!PatchProxy.isSupport(f) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mBizType), ta, f, "18")) {
             ta.g.remove(Integer.valueOf(mBizType));
          }
       }
       return;
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b ta = this.a;
       if (ta != null) {
          ta.D(LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_SHOWING);
          this.a.e = System.currentTimeMillis();
       }
       a f = this.c.f;
       String str = String.valueOf(this.b.mNoticeType);
       a$b tb = this.b;
       LiveCommentNoticeBaseInfo mBizId = tb.mBizId;
       a$b tc = this.c;
       Objects.requireNonNull(tc);
       String str1 = PatchProxy.applyOneRefs(tb, tc, a.class, "14");
       if (str1 != PatchProxyResult.class) {
       }else if(tb == null){
          str1 = "";
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("extra_info", TextUtils.k(tb.mExtraInfoStr));
          hashMap.put("biz_type", String.valueOf(tb.mBizType));
          str1 = a.a.q(hashMap);
       }
       a.f(f, str, mBizId, str1);
       return;
    }
}
