package ic9.k;
import erd.o;
import ic9.w;
import java.util.List;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import ic9.b;
import brd.t;

public final class k implements o	// class@002679
{
    public final w b;
    public final List c;
    public final b d;

    public void k(w p0,List p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       return this.b.u(this.c, this.d, true);
    }
}
