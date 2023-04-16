package ap6.h3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.util.List;
import java.lang.Object;
import brd.t;

public final class h3 implements Callable	// class@000339
{
    public final g b;
    public final List c;

    public void h3(g p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       return this.b.X(this.c).blockingFirst();
    }
}
