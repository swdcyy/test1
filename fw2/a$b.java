package fw2.a$b;
import android.animation.AnimatorListenerAdapter;
import fw2.a;
import android.view.ViewPropertyAnimator;
import android.view.View;
import usd.f;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Comparable;
import usd.g;
import java.lang.Number;
import java.util.WeakHashMap;
import qrd.l1;
import java.util.Map;

public final class a$b extends AnimatorListenerAdapter	// class@0029ee
{
    public final a a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final f d;
    public final f e;
    public final a f;

    public void a$b(a p0,ViewPropertyAnimator p1,View p2,f p3,f p4,a p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       this.c.setAlpha(this.d.d().floatValue());
       this.c.setTranslationY(this.e.d().floatValue());
       this.a.a.remove(this.c);
       a$b tf = this.f;
       if (tf != null) {
          tf.invoke();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.a.a.put(this.c, this.b);
       return;
    }
}
