package ap6.x2;
import java.lang.Runnable;
import com.kwai.imsdk.group.g;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import cp6.o;
import java.lang.Throwable;
import l85.b;

public final class x2 implements Runnable	// class@000384
{
    public final g b;
    public final KwaiGroupInfo c;
    public final List d;

    public void x2(g p0,KwaiGroupInfo p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       x2 tb = this.b;
       o.a(tb.c).e(this.c);
       o.a(tb.c).g(this.d);
       return;
    }
}
