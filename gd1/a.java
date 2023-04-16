package gd1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import gd1.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.util.Objects;
import java.lang.Integer;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import d61.h;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import android.view.View;
import gd1.d;
import lp3.c;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public class a implements a$a	// class@0024a2
{
    public final c a;

    public void a(c p0){
       this.a = p0;
       super();
    }
    public void a(LiveGenericCommentNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       int i = a1.a(R.color.arg_RES_7f060752);
       int i1 = a1.a(R.color.arg_RES_7f060752);
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(LiveGenericCommentNoticeView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), p0, LiveGenericCommentNoticeView.class, "14")) {
          int[] ointArray = new int[]{i,i1};
          p0.g.setBackground(h.b(a1.d(R.dimen.arg_RES_7f07042c), GradientDrawable$Orientation.LEFT_RIGHT, ointArray));
       }
       p0.setRightButtonTextColor(a1.a(R.color.arg_RES_7f0620c7));
       return;
    }
    public void b(LiveGenericCommentNoticeInfo p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, c.class, "5")) {
          ta.c.a(d.class).nl("", true);
       }
       a.b(this.a.b.a(), String.valueOf(p0.mNoticeType), p0.mBizId);
       return;
    }
}
