package k2.e$a;
import android.transition.Transition$EpicenterCallback;
import k2.e;
import android.graphics.Rect;
import android.transition.Transition;

public class e$a extends Transition$EpicenterCallback	// class@00245b
{
    public final Rect a;
    public final e b;

    public void e$a(e p0,Rect p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Rect onGetEpicenter(Transition p0){
       return this.a;
    }
}