package en2.e;
import erd.a;
import com.kuaishou.live.core.show.wishlight.download.base.e;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.List;

public final class e implements a	// class@002793
{
    public final e b;
    public final AtomicReference c;

    public void e(e p0,AtomicReference p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.g.remove(this.c);
    }
}
