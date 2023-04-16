package b65.r;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import l65.a;
import com.kwai.camerasdk.models.GlProcessorGroup;
import java.lang.Object;
import java.util.Objects;
import com.kwai.camerasdk.preprocess.GlPreProcessorGroup;

public final class r implements Runnable	// class@000357
{
    public final Daenerys b;
    public final a c;
    public final GlProcessorGroup d;

    public void r(Daenerys p0,a p1,GlProcessorGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       r tb = this.b;
       r tc = this.c;
       r td = this.d;
       Objects.requireNonNull(tb);
       if (tc instanceof GlPreProcessorGroup) {
          tb.nativeAddGLPreProcessorGroupAtGroup(tb.c, tc.getNativeGroup(), td.getNumber(), 0, 1);
       }else {
          tb.nativeAddGLPreProcessorAtGroup(tb.c, tc.getNativeProcessor(), td.getNumber(), 0, 1);
       }
       return;
    }
}
