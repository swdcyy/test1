package bd1.b;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.b;
import bq5.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public class b implements d	// class@000348
{
    public final LiveHighlightNoticeInfo a;
    public final a b;

    public void b(a p0,LiveHighlightNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.d.Rl();
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
       a.e(this.b.b, String.valueOf(this.a.mNoticeType), this.a.mBizId);
       return;
    }
}
