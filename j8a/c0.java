package j8a.c0;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import uw9.o;
import q87.c;

public class c0 extends AnimatorListenerAdapter	// class@002943
{
    public final h a;

    public void c0(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       this.a.D.start();
       Object[] objArray = new Object[0];
       o.C().s("SlidePlayLeftSlideGuide", "onAnimationRepeat", objArray);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.a.D.start();
       c0 ta = this.a;
       ta.I = ta.I + 1;
       return;
    }
}
