package e8a.s0;
import msd.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import java.lang.String;
import com.yxcorp.gifshow.comment.e$c;
import java.lang.Object;
import ek9.a$a;
import java.util.Objects;
import e8a.v0;

public final class s0 implements l	// class@0020d5
{
    public final j b;
    public final boolean c;
    public final String d;
    public final e$c e;

    public void s0(j p0,boolean p1,String p2,e$c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object invoke(Object p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       p0.d(this.c);
       p0.q(this.d);
       p0.n(new v0(tb, this.e));
       return null;
    }
}
