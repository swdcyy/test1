package bja.k;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.post.g;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import cja.b;
import java.lang.String;
import q87.c;
import lnc.y6;
import lnc.g3;
import lnc.t;

public final class k implements g	// class@0003eb
{
    public final g b;
    public final Runnable c;

    public void k(g p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.D().w("MockFeedRepoImp", "postTask lazy", objArray);
       y6.e.n(tb.f);
       tb.a(this.c);
    }
}
