package c03.g;
import erd.g;
import c03.k;
import c03.k$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@00048d
{
    public final k b;
    public final k$a c;

    public void g(k p0,k$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b.y(this.b.a, "[checkDependResourceReady] error ", p0);
       this.c.b(false);
    }
}
