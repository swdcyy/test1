package djc.q0;
import java.lang.Runnable;
import djc.o0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import djc.o0;
import djc.m0;
import qsd.d;
import qrd.l1;

public final class q0 implements Runnable	// class@002219
{
    public final o0$c b;

    public void q0(o0$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, q0.class, "1")) {
          return;
       }
       Ref$ObjectRef element = this.b.b.element;
       Ref$ObjectRef objectRef = element;
       ViewGroup$LayoutParams layoutParams = element.getLayoutParams();
       layoutParams.height = d.G0(((double)this.b.b.element.getWidth() / this.b.c.b.b()));
       objectRef.setLayoutParams(layoutParams);
       PatchProxy.onMethodExit(q0.class, "1");
       return;
    }
}
