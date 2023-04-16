package bp6.p;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;

public final class p implements Callable	// class@000544
{
    public final o b;
    public final KwaiMsg c;

    public void p(o p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       p tc = this.c;
       this.b.i(tc);
       return tc;
    }
}
