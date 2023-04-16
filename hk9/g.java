package hk9.g;
import erd.g;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import al9.a;
import ek9.f;
import nk9.l;
import brd.y;

public final class g implements g	// class@0026a3
{
    public final CommonCommentsFragment b;

    public void g(CommonCommentsFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.W != null) {
          tb.G.q0();
          tb.H.q.onNext(new l());
       }
       return;
    }
}
