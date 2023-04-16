package gf1.d;
import z1.a;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f$b;

public final class d implements a	// class@0024bc
{
    public final f a;
    public final LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened b;

    public void d(f p0,LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       f c = this.a.c;
       if (c != null) {
          c.a(tb, p0);
       }
       return;
    }
}
