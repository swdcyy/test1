package jn8.b$a;
import androidx.transition.d;
import jn8.b;
import android.view.View;
import androidx.transition.Transition;
import androidx.transition.Transition$f;

public class b$a extends d	// class@002980
{
    public final View a;
    public final float b;
    public final float c;
    public final b d;

    public void b$a(b p0,View p1,float p2,float p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void b(Transition p0){
       this.a.setScaleX(this.b);
       this.a.setScaleY(this.c);
       p0.T(this);
    }
}
