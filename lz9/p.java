package lz9.p;
import msd.l;
import lz9.b0;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import ek9.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import lz9.a0;
import com.yxcorp.gifshow.comment.e$c;

public final class p implements l	// class@002ee6
{
    public final b0 b;
    public final QComment c;

    public void p(b0 p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       p tb = this.b;
       p0 = p0.o(tb.t, false);
       p0.p(false);
       p0.f(true);
       p0.k(this.c).n(new a0(tb));
       return null;
    }
}
