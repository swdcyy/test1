package ic9.j;
import erd.o;
import ic9.w;
import ic9.b;
import java.util.List;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import brd.t;

public final class j implements o	// class@002678
{
    public final w b;
    public final b c;
    public final List d;
    public final b e;

    public void j(w p0,b p1,List p2,b p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       return this.b.s(this.c, this.d, this.e, true);
    }
}
