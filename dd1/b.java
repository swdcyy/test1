package dd1.b;
import bq5.d;
import dd1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.merchant.LiveCustomerReplyNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dd1.c$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import dd1.d;

public class b implements d	// class@001f77
{
    public final LiveCustomerReplyNoticeInfo a;
    public final c b;

    public void b(c p0,LiveCustomerReplyNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.b.e.a(3);
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.e.a(3);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.e.a(2);
       a.e(this.b.d.a(), String.valueOf(this.a.mNoticeType), this.a.mBizId);
       this.b.c.Mi(this.a.mBizType);
       return;
    }
}
