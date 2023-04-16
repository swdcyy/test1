package b65.p;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import l65.a;
import com.kwai.camerasdk.models.GlProcessorGroup;
import java.lang.Object;

public final class p implements Runnable	// class@000355
{
    public final Daenerys b;
    public final a c;
    public final GlProcessorGroup d;

    public void p(Daenerys p0,a p1,GlProcessorGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.d(this.c, this.d, false);
    }
}
