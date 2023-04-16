package dd1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.merchant.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.merchant.LiveCustomerReplyNoticeInfo;
import java.lang.Object;
import android.view.View;
import dd1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import dd1.d;

public final class a implements View$OnClickListener	// class@001f76
{
    public final a b;
    public final LiveCustomerReplyNoticeInfo c;

    public void a(a p0,LiveCustomerReplyNoticeInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       tb.b.e(tc);
       tb.b.c.Qk(tc.mBizType);
    }
}
