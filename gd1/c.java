package gd1.c;
import lc1.b;
import lp3.e;
import java.lang.Object;
import xp5.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import gd1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import nc1.j$a;
import bq5.f$a;
import gd1.b;
import bq5.d;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;

public class c implements b	// class@0024a4
{
    public final i b;
    public final e c;

    public void c(e p0){
       super();
       this.b = p0.a(i.class);
       this.c = p0;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "2")) {
       }else {
          j oj = PatchProxy.applyOneRefs(p1, this, uoc, "3");
          if (oj != PatchProxyResult.class) {
          }else {
             j$a uoa = new j$a();
             uoa.e(new a(p1, new a(this)));
             uoa.h(p1.mBizId);
             uoa.c(p1.mDisplayDurationMs);
             uoa.j(p1.mDelayDisplayTimeMs);
             uoa.f(p1.mPriority);
             uoa.i(p1.mNoticeType);
             uoa.d(new b(this, p1));
             oj = uoa.g();
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
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(38, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveGenericCommentNoticeInfoWithBaseExtra.class));
    }
    public void dispose(){
       a.a(this);
    }
}
