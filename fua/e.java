package fua.e;
import ekd.f$j;
import fua.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;

public final class e extends f$j	// class@0029f8
{
    public final c a;

    public void e(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setVisibility(8);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setVisibility(8);
       }
       return;
    }
}
