package ki9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import android.content.Context;
import java.lang.Object;
import ekd.k1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.app.Activity;
import java.lang.String;
import va9.a;

public final class b implements Runnable	// class@002c8f
{
    public final AnimCameraView b;
    public final Context c;

    public void b(AnimCameraView p0,Context p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       if (tb.b == null) {
          long l = k1.i();
          int i = (tb.g != null)? 0x7f0d0197: 0x7f0d0188;
          a.c(null, "AnimCameraView inflate", l);
          tb.doBindView(a.d(tc, i, tb, true));
       }
       return;
    }
}
