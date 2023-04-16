package cd9.b;
import com.yxcorp.gifshow.camera.record.widget.CameraView$c;
import com.yxcorp.gifshow.camera.record.duet.controller.a;
import java.lang.Object;
import android.graphics.RectF;

public final class b implements CameraView$c	// class@0005a1
{
    public final a a;

    public void b(a p0){
       this.a = p0;
    }
    public final boolean a(float p0,float p1){
       b ta = this.a;
       boolean b = (ta.x.contains(p0, p1) && !ta.w.contains(p0, p1))? true: false;
       return b;
    }
}
