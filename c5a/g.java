package c5a.g;
import erd.o;
import c5a.i;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PostShowInfo;
import java.lang.Object;
import ixc.c;
import java.lang.Boolean;
import brd.t;

public final class g implements o	// class@00054f
{
    public final i b;
    public final BaseFeed c;
    public final PostShowInfo d;

    public void g(i p0,BaseFeed p1,PostShowInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       return t.just(this.b.V8(this.c, this.d, p0));
    }
}
