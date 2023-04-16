package b65.l;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;

public final class l implements Runnable	// class@000351
{
    public final Daenerys b;

    public void l(Daenerys p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       tb.nativeResume(tb.c);
    }
}
