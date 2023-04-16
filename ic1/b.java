package ic1.b;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import aq5.d;
import lp3.c;
import lp3.e;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import bq5.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public class b implements d	// class@002890
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.c.a(d.class).ck(AudienceBizRelation.CHAT);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       ta.j = true;
       b ta1 = this.a;
       a.f(ta.b, String.valueOf(54), ta1.h.mBizId, ta1.d());
       return;
    }
}
