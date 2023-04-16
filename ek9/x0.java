package ek9.x0;
import erd.g;
import com.yxcorp.gifshow.comment.e;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.e$e;
import android.app.Activity;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.List;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.comment.e$b;

public final class x0 implements g	// class@0021ab
{
    public final e b;
    public final QComment c;
    public final QPhoto d;
    public final e$e e;
    public final Activity f;

    public void x0(e p0,QComment p1,QPhoto p2,e$e p3,Activity p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       x0 tb = this.b;
       x0 tc = this.c;
       x0 td = this.d;
       x0 te = this.e;
       x0 tf = this.f;
       Objects.requireNonNull(tb);
       int i = 1;
       if (tc.hasSub()) {
          i = i + tc.mSubComment.mComments.size();
       }
       td.setNumberOfComments((td.numberOfComments() - i));
       if (te != null) {
          te.b(tc);
       }
       a.d().k(new CommentsEvent(tf.hashCode(), td, tc, CommentsEvent$Operation.DELETE));
       p0 = tb.b.iterator();
       while (p0.hasNext()) {
          p0.next().H5(td, tc);
       }
       return;
    }
}
