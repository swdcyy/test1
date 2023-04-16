package bja.j;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.post.g;
import r26.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;

public final class j implements g	// class@0003ea
{
    public final g b;
    public final a c;
    public final int d;

    public void j(g p0,a p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       j tb = this.b;
       j tc = this.c;
       tb.j(p0, tc);
       boolean b = (tb.i.size() > this.d)? true: false;
       tb.h(tc, b);
       tb.g(tc);
       return;
    }
}
