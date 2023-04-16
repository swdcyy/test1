package gf1.e;
import z1.a;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f$a;

public final class e implements a	// class@0024bd
{
    public final f a;
    public final LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened b;

    public void e(f p0,LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       f b = this.a.b;
       if (b != null) {
          b.a(tb, p0);
       }
       return;
    }
}
