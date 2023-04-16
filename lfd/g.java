package lfd.g;
import erd.g;
import lfd.i;
import java.lang.Object;
import fw5.a;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinFeed;
import lfd.b;

public final class g implements g	// class@001c30
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       i b = tb.b;
       b.mJoinResponse = p0;
       tb.c.a(b);
    }
}
