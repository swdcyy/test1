package androidx.transition.Transition$b;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import androidx.collection.ArrayMap;
import android.animation.Animator;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

public class Transition$b extends AnimatorListenerAdapter	// class@0009d1
{
    public final ArrayMap a;
    public final Transition b;

    public void Transition$b(Transition p0,ArrayMap p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.remove(p0);
       this.b.y.remove(p0);
    }
    public void onAnimationStart(Animator p0){
       this.b.y.add(p0);
    }
}
