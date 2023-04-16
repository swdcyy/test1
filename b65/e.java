package b65.e;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import l65.a;
import com.kwai.camerasdk.models.GlProcessorGroup;
import java.lang.Object;
import java.util.Objects;
import com.kwai.camerasdk.preprocess.GlPreProcessorGroup;

public final class e implements Runnable	// class@00034a
{
    public final Daenerys b;
    public final a c;
    public final GlProcessorGroup d;
    public final boolean e;

    public void e(Daenerys p0,a p1,GlProcessorGroup p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       Objects.requireNonNull(tb);
       if (tc instanceof GlPreProcessorGroup) {
          tb.nativeAddGLPreProcessorGroupAtGroup(tb.c, tc.getNativeGroup(), td.getNumber(), te, 0);
       }else {
          tb.nativeAddGLPreProcessorAtGroup(tb.c, tc.getNativeProcessor(), td.getNumber(), te, 0);
       }
       return;
    }
}
