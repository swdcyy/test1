package f3.c$b;
import android.animation.AnimatorListenerAdapter;
import f3.c;
import android.animation.Animator;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import f3.b$a;
import java.util.Objects;

public class c$b extends AnimatorListenerAdapter	// class@001fbc
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       ArrayList uArrayList = new ArrayList(this.a.h);
       int i = uArrayList.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Objects.requireNonNull(uArrayList.get(i1));
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       ArrayList uArrayList = new ArrayList(this.a.h);
       int i = uArrayList.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Objects.requireNonNull(uArrayList.get(i1));
       }
       return;
    }
}
