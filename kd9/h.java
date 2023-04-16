package kd9.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import java.lang.Object;

public final class h implements Runnable	// class@002c54
{
    public final AnimCameraView b;

    public void h(AnimCameraView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.b();
    }
}
