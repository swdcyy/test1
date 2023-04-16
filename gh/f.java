package gh.f;
import gh.b;
import java.lang.Object;
import android.view.View;
import java.util.List;
import dh.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import jh.d;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import jh.b;
import gh.d;

public class f implements b	// class@0020b3
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public void a(View p0,List p1,b p2){
       Object obj = p0;
       List list = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "1")) {
          return;
       }
       b d = p2.d;
       if (d != null && d.size() >= 2) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          super();
          d uod = d.get(0);
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          int i = 1;
          int i1 = 1;
          int i2 = 0;
          while (i1 < d.size()) {
             d uod1 = d.get(i1);
             float[] uofloatArray = new float[2];
             uofloatArray[0] = uod.d();
             uofloatArray[i] = uod1.d();
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj, "scaleX", uofloatArray);
             int i3 = uod1.b() - uod.b();
             objectAnimat.setDuration((long)i3);
             uArrayList.add(objectAnimat);
             float[] uofloatArray1 = new float[]{uod.e(),uod1.e()};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(obj, "scaleY", uofloatArray1);
             i1 = uod1.b() - uod.b();
             objectAnimat1.setDuration((long)i1);
             uArrayList1.add(objectAnimat1);
             i = uod1.b() - uod.b();
             i2 = i2 + i;
             i1 = i1 + 1;
             objectAnimat1 = 1;
          }
          uAnimatorSet.playSequentially(uArrayList);
          this.playSequentially(uArrayList1);
          list.add(new d(uAnimatorSet, i2));
          list.add(new d(this, i2));
       }
       return;
    }
}
