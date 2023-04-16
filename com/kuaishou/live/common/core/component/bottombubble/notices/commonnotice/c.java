package com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.c;
import lc1.b;
import lp3.e;
import android.content.Context;
import xp5.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonBubbleInfo;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.a$a;
import oc1.c;
import nc1.j$a;
import bq5.f$a;
import bq5.d;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;

public class c implements b	// class@000fac
{
    public final ClientContent$LiveStreamPackage b;
    public final e c;
    public final Context d;
    public KwaiDialogFragment e;

    public void c(e p0,Context p1){
       super(p0, p1, p0.a(i.class).a());
    }
    public void c(e p0,Context p1,ClientContent$LiveStreamPackage p2){
       super();
       this.b = p2;
       this.c = p0;
       this.d = p1;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "2")) {
       }else {
          j oj = PatchProxy.applyOneRefs(p1, this, uoc, "4");
          if (oj != PatchProxyResult.class) {
          }else {
             j$a uoa = new j$a();
             uoa.e(new a(p1, new b(this)));
             uoa.d(new c(this, p1));
             uoa.c(p1.mDisplayDurationMs);
             uoa.j(p1.mDelayDisplayTimeMs);
             uoa.h(p1.mBizId);
             uoa.f(p1.mPriority);
             uoa.i(p1.mNoticeType);
             oj = uoa.g();
          }
          this.c.a(k.class).Y9(oj);
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION,LiveCommentNoticeChannelType.API_USER_STATUS,LiveCommentNoticeChannelType.API_ANCHOR_STATUS};
       return f.b(100, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveCommonBubbleInfo.class));
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       m.b(this.e);
       return;
    }
}
