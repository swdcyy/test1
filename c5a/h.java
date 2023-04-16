package c5a.h;
import erd.o;
import c5a.i;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PostShowInfo;
import java.lang.Object;
import java.lang.Throwable;
import ixc.c;
import java.lang.Boolean;

public final class h implements o	// class@000550
{
    public final i b;
    public final BaseFeed c;
    public final PostShowInfo d;

    public void h(i p0,BaseFeed p1,PostShowInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       return this.b.V8(this.c, this.d, null);
    }
}
