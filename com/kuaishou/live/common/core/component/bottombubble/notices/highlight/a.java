package com.kuaishou.live.common.core.component.bottombubble.notices.highlight.a;
import lc1.b;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.b;
import lp3.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import bd1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.c;
import bd1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.c$a;
import nc1.j$a;
import bq5.d;
import bq5.f$a;
import java.lang.Long;
import java.lang.Number;
import java.util.Random;
import java.lang.System;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;

public class a implements b	// class@000fd2
{
    public final ClientContent$LiveStreamPackage b;
    public final e c;
    public final b d;
    public j e;

    public void a(e p0,ClientContent$LiveStreamPackage p1){
       super();
       this.b = p1;
       this.c = p0;
       b uob = p0.a(b.class);
       this.d = uob;
       uob.G8();
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       int i;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "6")) {
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          j oj = PatchProxy.applyOneRefs(p1, this, uoa, "1");
          if (oj != patchProxyRe) {
          }else {
             j$a uoa1 = new j$a();
             uoa1.d(new b(this, p1));
             uoa1.h(p1.mBizId);
             uoa1.e(new c(p1, new a(this, p1)));
             LiveHighlightNoticeInfo mRandomTimeD = p1.mRandomTimeDuration;
             if (PatchProxy.isSupport(uoa)) {
                Object obj = PatchProxy.applyOneRefs(Long.valueOf(mRandomTimeD), this, uoa, "3");
                if (obj != patchProxyRe) {
                   i = obj.intValue();
                }else {
                label_0055 :
                   Random random = new Random(System.currentTimeMillis());
                   i = (mRandomTimeD > 0)? random.nextInt((int)mRandomTimeD): 0;
                }
             }else {
                goto label_0055 ;
             }
             uoa1.j((long)i);
             uoa1.c(p1.mDisplayDurationMs);
             uoa1.f(p1.mPriority);
             uoa1.i(p1.mNoticeType);
             oj = uoa1.g();
             this.e = oj;
          }
          if (oj != null) {
             this.c.a(k.class).Y9(oj);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(17, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveHighlightNoticeInfo.class));
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.d.clean();
       return;
    }
}
