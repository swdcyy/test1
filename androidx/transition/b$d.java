package androidx.transition.b$d;
import androidx.transition.Transition$e;
import androidx.transition.b;
import android.graphics.Rect;
import androidx.transition.Transition;

public class b$d extends Transition$e	// class@0009e5
{
    public final Rect a;
    public final b b;

    public void b$d(b p0,Rect p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Rect a(Transition p0){
       b$d ta = this.a;
       if (ta == null || ta.isEmpty()) {
          return null;
       }
       return this.a;
    }
}
