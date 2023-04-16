package eh9.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import java.lang.Object;

public final class g implements Runnable	// class@00214e
{
    public final CameraScrollTabViewGroup b;

    public void g(CameraScrollTabViewGroup p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       if (tb.k()) {
          tb.m(tb.j);
       }else {
          tb.n(tb.j);
       }
       return;
    }
}
