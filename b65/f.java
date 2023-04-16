package b65.f;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import com.kwai.camerasdk.preprocess.AudioProcessor;
import java.lang.Object;
import l65.a;

public final class f implements Runnable	// class@00034b
{
    public final Daenerys b;
    public final AudioProcessor c;

    public void f(Daenerys p0,AudioProcessor p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       tb.nativeRemoveAudioProcessor(tb.c, this.c.getNativeProcessor());
    }
}
