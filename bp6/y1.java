package bp6.y1;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v$c;
import java.util.List;
import java.lang.Object;
import com.kwai.imsdk.internal.v;

public final class y1 implements Runnable	// class@00055e
{
    public final v$c b;
    public final int c;
    public final List d;

    public void y1(v$c p0,int p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.a.F(this.c, this.d);
    }
}
