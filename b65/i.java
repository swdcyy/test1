package b65.i;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;

public final class i implements Runnable	// class@00034e
{
    public final Daenerys b;
    public final long[] c;

    public void i(Daenerys p0,long[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       long l = tb.nativeGetSubPipelineCount(tb.c);
       this.c[0] = l;
    }
}
