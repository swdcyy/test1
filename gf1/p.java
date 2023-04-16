package gf1.p;
import lf3.g;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import gf1.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Runnable;
import ekd.k1;
import lf3.f;

public final class p implements g	// class@0024c9
{
    public final j b;

    public void p(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "19")) {
       }else {
          LiveLogTag lIVE_QUICK_C = LiveLogTag.LIVE_QUICK_COMMENT;
          b.c0(lIVE_QUICK_C, "LiveQuickCommentMessagePool.handleQuickCommentClosed", "message", p0.bizId);
          LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened sCLiveQuickC = tb.l.d();
          if (sCLiveQuickC != null && TextUtils.n(p0.bizId, sCLiveQuickC.bizId)) {
             tb.b("CommentClosed-"+p0.bizId);
          }
          sCLiveQuickC = tb.l.c();
          if (sCLiveQuickC != null && TextUtils.n(p0.bizId, sCLiveQuickC.bizId)) {
             b.Z(lIVE_QUICK_C, "LiveQuickCommentMessagePool.handleQuickCommentClosed clear pending message");
             tb.l.a();
             k1.m(tb.q);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
