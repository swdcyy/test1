package b65.o;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import com.kwai.camerasdk.face.FaceDetectorContext;
import java.lang.Object;

public final class o implements Runnable	// class@000354
{
    public final Daenerys b;
    public final FaceDetectorContext c;
    public final int d;

    public void o(Daenerys p0,FaceDetectorContext p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       o tb = this.b;
       tb.nativeSetFaceDetectorContext(tb.c, this.c.getNativeContext(), this.d);
    }
}
