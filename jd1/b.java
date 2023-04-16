package jd1.b;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.util.Objects;
import java.util.Map;
import java.lang.Integer;
import s81.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import mc1.a;

public class b implements d	// class@002b39
{
    public final LiveRouterNoticeInfo a;
    public final a b;

    public void b(a p0,LiveRouterNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       b ta = this.a;
       LiveRouterNoticeInfo mExtraInfo = ta.mExtraInfo;
       int i = (mExtraInfo == null)? 0: mExtraInfo.mFrequencyLimitType;
       String str = tb.g(i, ta.mBizType);
       ta = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(str, ta, a.class, "14")) {
          Map map = ta.e();
          map.put(str, Integer.valueOf((ta.h(str) + 1)));
          a.P(map);
       }
       b ta1 = this.a;
       a.f(this.b.g.a(), String.valueOf(this.a.mNoticeType), ta1.mBizId, this.b.f(ta1.mExtraInfoStr));
       return;
    }
}
