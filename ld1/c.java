package ld1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.h$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.g;
import java.lang.Object;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeBubbleView;

public final class c implements h$a	// class@002ecf
{
    public final g a;

    public void c(g p0){
       this.a = p0;
    }
    public final void a(CharSequence p0){
       g e = this.a.e;
       if (e != null && !PatchProxy.applyVoidOneRefs(p0, e, a.class, "2")) {
          a d = e.d;
          if (d == null) {
             e.b.mLiveCommentNoticeButtonInfo.mBtnTitle = p0.toString();
          }else {
             d.setRightButtonContent(p0);
          }
       }
       return;
    }
}
