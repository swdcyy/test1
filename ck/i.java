package ck.i;
import java.lang.Object;
import java.util.ArrayList;
import ck.i$a;
import android.animation.ValueAnimator;
import ck.i$b;
import android.animation.Animator$AnimatorListener;
import android.util.StateSet;

public final class i	// class@000d2b
{
    public final ArrayList a;
    public i$b b;
    public ValueAnimator c;
    public final Animator$AnimatorListener d;

    public void i(){
       super();
       this.a = new ArrayList();
       this.b = null;
       this.c = null;
       this.d = new i$a(this);
    }
    public void a(int[] p0,ValueAnimator p1){
       p1.addListener(this.d);
       this.a.add(new i$b(p0, p1));
    }
    public final void b(){
       i tc = this.c;
       if (tc != null) {
          tc.cancel();
          this.c = null;
       }
       return;
    }
    public void c(){
       i tc = this.c;
       if (tc != null) {
          tc.end();
          this.c = null;
       }
       return;
    }
    public void d(int[] p0){
       i$b uob;
       int i = this.a.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             uob = this.a.get(i1);
             if (StateSet.stateSetMatches(uob.a, p0)) {
             label_001e :
                i tb = this.b;
                if (uob == tb) {
                   return;
                }
                if (tb != null) {
                   this.b();
                }
                this.b = uob;
                if (uob != null) {
                   this.e(uob);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             uob = null;
             goto label_001e ;
          }
       }
       return;
    }
    public final void e(i$b p0){
       p0 = p0.b;
       this.c = p0;
       p0.start();
    }
}
