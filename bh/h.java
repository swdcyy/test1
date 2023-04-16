package bh.h;
import android.animation.Animator$AnimatorListener;
import com.gifshow.kanim.a;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import bh.c;
import bh.r;
import android.view.View;

public class h implements Animator$AnimatorListener	// class@000b35
{
    public final a a;

    public void h(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       a n;
       Iterator iterator;
       a uoa = a.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, str)) {
          return;
       }
       h ta = this.a;
       ta.l = false;
       a k = ta.k;
       if (k == -1) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, uoa, "19")) {
             n = ta.n;
             if (n != null) {
                iterator = n.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onAnimationRepeat();
                }
             }
          }
          this.a.k();
          return;
       }else {
          int i = k - 1;
          ta.k = i;
          if (i <= 0) {
             if (ta.f != null) {
                k = ta.b;
                n = ta.e;
                if (PatchProxy.applyVoidTwoRefs(k, n, null, r.class, str) || (k != null && n != null)) {
                   k.setScaleX(n.a);
                   k.setScaleY(n.b);
                   k.setAlpha(n.e);
                   k.setRotation(n.f);
                   k.setTranslationX(n.c);
                   k.setTranslationY(n.d);
                }
             }
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, uoa, "18")) {
                n = ta.n;
                if (n != null) {
                   iterator = n.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onAnimationEnd();
                   }
                }
             }
          }else {
             ta.k();
          }
          return;
       }
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h ta = this.a;
       ta.l = true;
       if (ta.o != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, a.class, "17")) {
             a n = ta.n;
             if (n != null) {
                Iterator iterator = n.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onAnimationStart();
                }
             }
          }
          ta.o = false;
       }
       return;
    }
}
