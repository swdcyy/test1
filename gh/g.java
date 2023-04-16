package gh.g;
import gh.b;
import java.lang.Object;
import android.view.View;
import java.util.List;
import dh.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import jh.e;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import jh.b;
import gh.d;

public class g implements b	// class@0020b4
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public void a(View p0,List p1,b p2){
       Object obj = p0;
       List list = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "1")) {
          return;
       }
       b a = p2.a;
       if (a != null && a.size() >= 2) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          super();
          e uoe = a.get(0);
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          float translationX = p0.getTranslationX();
          float translationY = p0.getTranslationY();
          int i = 1;
          int i1 = 1;
          int i2 = 0;
          while (i1 < a.size()) {
             e uoe1 = a.get(i1);
             float f = uoe1.d() - uoe.d();
             f = f + translationX;
             float[] uofloatArray = new float[2];
             uofloatArray[0] = translationX;
             uofloatArray[i] = f;
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj, "translationX", uofloatArray);
             int i3 = uoe1.b() - uoe.b();
             objectAnimat.setDuration((long)i3);
             uArrayList.add(objectAnimat);
             float f1 = uoe1.e() - uoe.e();
             f1 = f1 + translationY;
             float[] uofloatArray1 = new float[]{translationY,f1};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(obj, "translationY", uofloatArray1);
             i = uoe1.b() - uoe.b();
             objectAnimat1.setDuration((long)i);
             uArrayList1.add(objectAnimat1);
             i3 = uoe1.b() - uoe.b();
             i2 = i2 + i3;
             i1 = i1 + 1;
             a = a;
             i = 1;
          }
          uAnimatorSet.playSequentially(uArrayList);
          this.playSequentially(uArrayList1);
          list.add(new d(uAnimatorSet, i2));
          list.add(new d(this, i2));
       }
       return;
    }
}
