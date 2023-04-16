package ne1.j;
import msd.l;
import com.kuaishou.live.common.core.component.comments.b$b;
import com.kuaishou.live.common.core.component.comments.LiveCommentDynamicBackgroundView;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.Objects;
import com.kuaishou.live.common.core.component.comments.util.LiveMsgFormatter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import com.kwai.framework.model.user.UserInfo;
import va1.a0;
import com.kuaishou.live.common.core.component.comments.b;
import o81.g;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import android.graphics.drawable.Drawable;
import ne1.k;
import com.kuaishou.live.common.core.component.comments.b$c;
import qrd.l1;

public final class j implements l	// class@0032f1
{
    public final b$b b;
    public final LiveCommentDynamicBackgroundView c;
    public final QLiveMessage d;

    public void j(b$b p0,LiveCommentDynamicBackgroundView p1,QLiveMessage p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(Object p0){
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       Objects.requireNonNull(tb);
       p0 = LiveMsgFormatter.a(p0);
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, b$b.class, "2")) {
       }else {
          tc.setHasLastPadding2Dp(td.getHasLastButton());
          if (td instanceof SystemNoticeMessage && td.mIsFirstSystemNotice != null) {
             tc.setIs6DpPadding(true);
          }else {
             tc.setIs6DpPadding(false);
          }
       }
       b$b uob = null;
       boolean b = a0.c(td.getUser());
       if (!tb.g.b.o() || (!tb.g.b.r() || b)) {
          uob = tb.g;
          uob = k.f(td, uob.c, uob.b.f);
       }
       if (uob != null) {
          tc.e(p0, uob);
       }else {
          tc.d(p0);
       }
       p0 = tb.g.d;
       if (p0 != null) {
          p0.a(td);
       }
       return l1.a;
    }
}
