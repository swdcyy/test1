package ld1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.h;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public final class b implements a$a	// class@002ece
{
    public final g a;

    public void b(g p0){
       this.a = p0;
    }
    public final void a(LiveServiceAccountNoticeInfo p0,View p1){
       b ta = this.a;
       ta.d.Xl(p0.mExtraInfo);
       a.c(ta.b, String.valueOf(p0.mNoticeType), p0.mBizId, ta.e(p0));
    }
}
