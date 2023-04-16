package aqa.c;
import erd.g;
import aqa.e;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.view.View;

public final class c implements g	// class@0002b8
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       p0.C.animate().rotationBy(180.00f).setDuration(280).start();
       e g = p0.G;
       e e = (g != null)? p0.E: p0.D;
       g = (g != null)? p0.D: p0.E;
       e.animate().alpha(0).setDuration(180).start();
       g.animate().alpha(0x3f800000).setStartDelay(80).setDuration(180).start();
       p0.V8(true);
       p0.S8();
       return;
    }
}
