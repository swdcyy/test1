package fua.i;
import ekd.f$j;
import fua.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;

public final class i extends f$j	// class@0029fc
{
    public final k a;

    public void i(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setAlpha(0);
       }
       viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setVisibility(8);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setAlpha(0);
       }
       viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setVisibility(8);
       }
       return;
    }
}
