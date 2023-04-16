package b65.q;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import l65.a;
import com.kwai.camerasdk.models.GlProcessorGroup;
import java.lang.Object;
import java.util.Objects;
import com.kwai.camerasdk.preprocess.GlPreProcessorGroup;

public final class q implements Runnable	// class@000356
{
    public final Daenerys b;
    public final a c;
    public final GlProcessorGroup d;

    public void q(Daenerys p0,a p1,GlProcessorGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       Objects.requireNonNull(tb);
       if (tc instanceof GlPreProcessorGroup) {
          tb.nativeRemoveGLPreProcessorGroupFromGroup(tb.c, tc.getNativeGroup(), td.getNumber());
       }else {
          tb.nativeRemoveGLPreProcessorFromGroup(tb.c, tc.getNativeProcessor(), td.getNumber());
       }
       return;
    }
}
