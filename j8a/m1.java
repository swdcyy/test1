package j8a.m1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o$a;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;

public final class m1 implements g	// class@002966
{
    public final o$a b;
    public final long c;

    public void m1(o$a p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.longValue() - this.c <= 0) {
          tb.b.a9();
       }
       return;
    }
}
