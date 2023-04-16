package oc1.c;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonBubbleInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public class c implements d	// class@0034c4
{
    public final LiveCommonBubbleInfo a;
    public final c b;

    public void c(c p0,LiveCommonBubbleInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return true;
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
       a.e(this.b.b, String.valueOf(100), this.a.mBizId);
       return;
    }
}
