package hk9.f;
import erd.g;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import java.lang.Object;
import ik9.c$a;
import java.util.Objects;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import al9.a;
import ek9.f;
import brd.y;

public final class f implements g	// class@0026a2
{
    public final CommonCommentsFragment b;

    public void f(CommonCommentsFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != null) {
          tb.G.b0();
          tb.W = true;
          tb.H.w.onNext(p0.a);
       }else {
          p0 = p0.b;
          if (p0 != null) {
             tb.W = false;
             tb.H.z.onNext(p0);
          }
       }
       return;
    }
}
