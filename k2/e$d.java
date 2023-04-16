package k2.e$d;
import android.transition.Transition$EpicenterCallback;
import k2.e;
import android.graphics.Rect;
import android.transition.Transition;

public class e$d extends Transition$EpicenterCallback	// class@00245e
{
    public final Rect a;
    public final e b;

    public void e$d(e p0,Rect p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Rect onGetEpicenter(Transition p0){
       e$d ta = this.a;
       if (ta == null || ta.isEmpty()) {
          return null;
       }
       return this.a;
    }
}
