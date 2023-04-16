package gh.e;
import gh.b;
import java.lang.Object;
import android.view.View;
import java.util.List;
import dh.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import jh.c;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import jh.b;
import gh.d;

public class e implements b	// class@0020b2
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public void a(View p0,List p1,b p2){
       c this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "1")) {
          return;
       }
       p2 = p2.b;
       if (p2 != null && p2.size() >= 2) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this = p2.get(0);
          ArrayList uArrayList = new ArrayList();
          int i = 1;
          int i1 = 0;
          while (i < p2.size()) {
             c uoc = p2.get(i);
             float[] uofloatArray = new float[]{this.d(),uoc.d()};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "rotation", uofloatArray);
             int i2 = uoc.b() - this.b();
             objectAnimat.setDuration((long)i2);
             i2 = uoc.b() - this.b();
             i1 = i1 + i2;
             uArrayList.add(objectAnimat);
             i = i + 1;
             this = uoc;
          }
          uAnimatorSet.playSequentially(uArrayList);
          p1.add(new d(uAnimatorSet, i1));
       }
       return;
    }
}
