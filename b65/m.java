package b65.m;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;

public final class m implements Runnable	// class@000352
{
    public final Daenerys b;

    public void m(Daenerys p0){
       this.b = p0;
    }
    public final void run(){
       m tb = this.b;
       tb.nativeSetCameraController(tb.c, 0);
    }
}
