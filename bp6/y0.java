package bp6.y0;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v;
import qo6.p;
import java.lang.Object;

public final class y0 implements Runnable	// class@00055d
{
    public final v b;
    public final p c;

    public void y0(v p0,p p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.z(this.c);
    }
}
