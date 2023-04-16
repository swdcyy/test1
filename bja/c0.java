package bja.c0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.post.g;
import r26.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.Map;

public final class c0 implements g	// class@0003de
{
    public final g b;
    public final a c;

    public void c0(g p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.i.remove(this.c.getCacheId());
    }
}
