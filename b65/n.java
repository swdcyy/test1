package b65.n;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;

public final class n implements Runnable	// class@000353
{
    public final Daenerys b;
    public final int c;

    public void n(Daenerys p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n tb = this.b;
       tb.nativeSetFaceDetectorContext(tb.c, 0, this.c);
    }
}
