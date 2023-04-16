package kd9.q;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.camera.record.frame.c;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class q implements ViewTreeObserver$OnPreDrawListener	// class@002c66
{
    public final AnimCameraView b;
    public final int c;
    public final c d;

    public void q(c p0,AnimCameraView p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean onPreDraw(){
       q obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       obj = this.d;
       obj.x = true;
       obj.y = false;
       obj.k2(this.c);
       return true;
    }
}
