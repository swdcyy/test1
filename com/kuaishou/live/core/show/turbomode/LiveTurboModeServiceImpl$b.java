package com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl$b;
import p41.b;
import com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl;
import java.lang.Object;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qy1.a;
import pp.c;
import qy1.a$a;
import java.lang.StringBuilder;
import r91.e;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import d61.l0;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import trd.t;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import rl2.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import nc1.j$a;
import bq5.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import nc1.j;
import lp3.e;
import lp3.a;
import nc1.k;
import lp3.c;
import com.kuaishou.live.core.show.turbomode.a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveTurboModeServiceImpl$b implements b	// class@001226
{
    public final LiveTurboModeServiceImpl a;

    public void LiveTurboModeServiceImpl$b(LiveTurboModeServiceImpl p0){
       this.a = p0;
       super();
    }
    public void a(WolverinePerformanceLevelInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTurboModeServiceImpl$b.class, "1")) {
       }else {
          a.p(p0, "performanceLevel");
          b.Z(a.K0.a(), "performance level changed "+e.b());
          if (e.b() && this.a.So()) {
             long l = 0;
             Long longx = this.a.r.b(Long.valueOf(l));
             long l1 = System.currentTimeMillis();
             if (longx == null || longx.longValue() - l) {
                a.o(longx, "lastNoticeTime");
                if (DateUtils.I(longx.longValue(), l1)) {
                label_0110 :
                   k1.p(new a(this), this);
                }
             }
             this.a.r.i(Long.valueOf(l1));
             LiveTurboModeServiceImpl$b ta = this.a;
             Objects.requireNonNull(ta);
             Object[] objArray = null;
             if (PatchProxy.applyVoid(objArray, ta, LiveTurboModeServiceImpl.class, "14")) {
                goto label_0110 ;
             }else {
                LiveGenericCommentNoticeInfo liveGenericC = new LiveGenericCommentNoticeInfo();
                liveGenericC.mSubTitle = a1.p(0x7f102c74);
                liveGenericC.mContentIconUrls = t.k(new CDNUrl(objArray, LiveTurboModeServiceImpl.w));
                LiveCommentNoticeButtonInfo liveCommentN = new LiveCommentNoticeButtonInfo();
                liveGenericC.mButtonInfo = liveCommentN;
                liveCommentN.mBtnTitle = a1.p(0x7f102c71);
                j$a uoa = new j$a();
                uoa.e(new a(liveGenericC, new e(ta)));
                uoa.c(0x2710);
                uoa.h("liveTurboMode_"+System.currentTimeMillis());
                uoa.f(liveGenericC.mPriority);
                uoa.i(liveGenericC.mNoticeType);
                j oj = uoa.g();
                e uoe = ta.Po();
                a.o(uoe, "serviceManager");
                if (!uoe.b()) {
                   ta.Po().a(k.class).Y9(oj);
                   goto label_0110 ;
                }else {
                   goto label_0110 ;
                }
             }
          }else {
             goto label_0110 ;
          }
       }
       return;
    }
}
