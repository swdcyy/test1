package com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.b;
import lc1.b;
import lp3.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.c;
import java.lang.Class;
import lp3.c;
import pc1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.c$a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xx1.a;
import brd.t;
import pc1.b;
import erd.g;
import crd.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.LiveConversionTaskNoticeInfo;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import lc1.a;
import lc1.f;
import com.kwai.robust.PatchProxyResult;
import lc1.e;
import lc1.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.LiveConversionTaskNoticeInfo$ExtraInfo;
import nc1.j;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import nc1.j$a;
import bq5.f$a;
import pc1.c;
import bq5.d;
import nc1.k;
import lnc.b9;

public class b implements b	// class@000fb0
{
    public final e b;
    public final c c;
    public LiveConversionTaskNoticeInfo d;
    public boolean e;
    public b f;

    public void b(e p0){
       super();
       boolean b = false;
       this.e = b;
       this.b = p0;
       c uoc = p0.a(c.class);
       this.c = uoc;
       uoc.Yb(new a(this));
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
       }else {
          this.e = b;
          this.f = p0.a(a.class).Pm().subscribe(new b(this));
       }
       return;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
       }else {
          b.d0(LiveCommonLogTag.COMMENT_NOTICE, "onReceiveCommentNotice", "channelType", p0, "noticeInfo", p1);
          this.d = p1;
          this.d();
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(31, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveConversionTaskNoticeInfo.class));
    }
    public final void d(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "4")) {
          return;
       }
       b td = this.d;
       if (td != null) {
          LiveGenericCommentNoticeInfo mExtraInfo = td.mExtraInfo;
          if (mExtraInfo != null && this.c.qb(mExtraInfo.mConversionId)) {
             td = this.d;
             j oj = PatchProxy.applyOneRefs(td, this, uob, "6");
             if (oj != PatchProxyResult.class) {
             }else {
                j$a uoa = new j$a();
                uoa.h(td.mBizId);
                uoa.f(td.mPriority);
                uoa.e(new a(td, new a(this)));
                uoa.c(td.mDisplayDurationMs);
                uoa.j(td.mDelayDisplayTimeMs);
                uoa.i(td.mNoticeType);
                uoa.d(new c(this));
                oj = uoa.g();
             }
             if (oj != null) {
                this.b.a(k.class).Y9(oj);
             }
          }
       }
       return;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b9.a(this.f);
       return;
    }
}
