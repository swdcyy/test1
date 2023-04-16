package b65.g;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import com.kwai.camerasdk.preprocess.AudioProcessor;
import java.lang.Object;
import l65.a;

public final class g implements Runnable	// class@00034c
{
    public final Daenerys b;
    public final AudioProcessor c;
    public final boolean d;

    public void g(Daenerys p0,AudioProcessor p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       g tb = this.b;
       tb.nativeAddAudioProcessor(tb.c, this.c.getNativeProcessor(), this.d);
    }
}
