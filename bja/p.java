package bja.p;
import erd.o;
import com.yxcorp.gifshow.follow.stagger.post.g;
import r26.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.Map;

public final class p implements o	// class@0003f0
{
    public final g b;
    public final a c;

    public void p(g p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       p tc = this.c;
       tb.j(p0, tc);
       tb.i.put(tc.getCacheId(), p0);
       return p0;
    }
}
