package androidx.transition.Fade$a;
import androidx.transition.d;
import androidx.transition.Fade;
import android.view.View;
import androidx.transition.Transition;
import e3.w;
import androidx.transition.Transition$f;

public class Fade$a extends d	// class@0009be
{
    public final View a;
    public final Fade b;

    public void Fade$a(Fade p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Transition p0){
       w.i(this.a, 0x3f800000);
       w.a(this.a);
       p0.T(this);
    }
}
