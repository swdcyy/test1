package gf1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.fluency.quick.LiveQuickCommentContainerView;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import java.lang.Object;
import android.view.View;
import z1.a;

public final class b implements View$OnClickListener	// class@0024ba
{
    public final LiveQuickCommentContainerView b;
    public final LiveQuickCommentContainer$LiveQuickCommentItem c;

    public void b(LiveQuickCommentContainerView p0,LiveQuickCommentContainer$LiveQuickCommentItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b tc = this.c;
       LiveQuickCommentContainerView d = this.b.d;
       if (d != null) {
          d.accept(tc);
       }
       return;
    }
}
