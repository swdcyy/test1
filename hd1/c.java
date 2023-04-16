package hd1.c;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s81.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public class c implements d	// class@002671
{
    public final LiveRouterNoticeInfo a;
    public final a b;

    public void c(a p0,LiveRouterNoticeInfo p1){
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
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       a.G((a.i() + 1));
       c ta = this.a;
       a.f(this.b.d.a(), String.valueOf(this.a.mNoticeType), ta.mBizId, this.b.d(ta.mExtraInfoStr));
       return;
    }
}
