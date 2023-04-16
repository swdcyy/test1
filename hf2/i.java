package hf2.i;
import we2.f;
import hf2.l;
import java.lang.Object;
import wj2.r;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import hf2.p;
import android.widget.TextView;
import hf2.o;
import android.animation.Animator;
import hf2.m;
import android.animation.Animator$AnimatorListener;

public final class i implements f	// class@002d84
{
    public final l a;

    public void i(l p0){
       this.a = p0;
    }
    public final void a(){
       i ta = this.a;
       if (ta.D.t != null) {
          ta.Z8();
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          l ol = l.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, ol, "11")) {
             ta.Z8();
             AnimatorSet uAnimatorSet = new AnimatorSet();
             AnimatorSet uAnimatorSet1 = PatchProxy.apply(objArray, ta, ol, "13");
             if (uAnimatorSet1 != patchProxyRe) {
             }else {
                uAnimatorSet1 = ta.C.b(ta.v, ta.B.f(), ta.B.e(), 0);
             }
             AnimatorSet uAnimatorSet2 = PatchProxy.apply(objArray, ta, ol, "14");
             if (uAnimatorSet2 != patchProxyRe) {
             }else {
                uAnimatorSet2 = ta.C.a(ta.x, ta.B.f(), ta.B.i(), ta.B.d(), ta.B.c());
             }
             AnimatorSet uAnimatorSet3 = PatchProxy.apply(objArray, ta, ol, "15");
             if (uAnimatorSet3 != patchProxyRe) {
             }else {
                uAnimatorSet3 = ta.C.c(ta.w, ta.B.f(), ta.B.i(), ta.B.h(), ta.B.g());
             }
             Animator[] uAnimatorArr = new Animator[]{uAnimatorSet1,uAnimatorSet2,uAnimatorSet3};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.addListener(new m(ta));
             uAnimatorSet.start();
          }
       }
       return;
    }
}
