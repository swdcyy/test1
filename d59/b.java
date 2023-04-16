package d59.b;
import java.lang.Runnable;
import d59.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import java.lang.StringBuilder;
import yx.j0;

public final class b implements Runnable	// class@002042
{
    public final float b;
    public final int c;
    public final int d;
    public final a e;

    public void b(float p0,int p1,int p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       int height = a.P8(this.e).getHeight();
       float f = (float)height / this.b;
       ViewGroup$LayoutParams layoutParams = a.P8(this.e).getLayoutParams();
       layoutParams.height = (int)f;
       layoutParams.width = this.c;
       StringBuilder str = "scale:"+this.b+" currentHeight:"+height;
       Object[] objArray = new Object[0];
       j0.f("AdMKAdapterScreen", str+" targetHeight:"+f+' '+"currentWidth:"+this.d+" targetWidth"+this.c, objArray);
       a.P8(this.e).setScaleX(this.b);
       a.P8(this.e).setScaleY(this.b);
       a.P8(this.e).setLayoutParams(layoutParams);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
