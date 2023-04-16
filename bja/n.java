package bja.n;
import erd.o;
import com.yxcorp.gifshow.follow.stagger.post.g;
import r26.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.Map;

public final class n implements o	// class@0003ee
{
    public final g b;
    public final a c;

    public void n(g p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       n tb = this.b;
       n tc = this.c;
       tb.j(p0, tc);
       tb.i.put(tc.getCacheId(), p0);
       return p0;
    }
}
