package boc.p;
import erd.g;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.resource.n;

public final class p implements g	// class@00044b
{
    public final b b;
    public final n$c c;

    public void p(b p0,n$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p tb = this.b;
       p tc = this.c;
       n.g(tb, p0);
       if (tc != null) {
          tc.d(tb, p0);
       }
       return;
    }
}
