package e8a.f0;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class f0 extends AnimatorListenerAdapter	// class@0020a3
{
    public final NasaProfileSideLikePresenter a;

    public void f0(NasaProfileSideLikePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       this.onAnimationEnd(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       f0 ta = this.a;
       ta.z = null;
       ta.q.setScaleX(0x3f800000);
       this.a.q.setScaleY(0x3f800000);
       this.a.q.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.q.setVisibility(0);
       this.a.q.setAlpha(0);
       return;
    }
}
