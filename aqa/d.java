package aqa.d;
import erd.g;
import aqa.e;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.view.View;

public final class d implements g	// class@0002b9
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       p0.x.animate().rotationBy(180.00f).setDuration(280).start();
       e g = p0.G;
       e z = (g != null)? p0.z: p0.y;
       g = (g != null)? p0.y: p0.z;
       z.animate().alpha(0).setDuration(180).start();
       g.animate().alpha(0x3f800000).setStartDelay(80).setDuration(180).start();
       p0.V8(false);
       p0.S8();
       return;
    }
}
