package fua.j;
import ekd.f$j;
import fua.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;

public final class j extends f$j	// class@0029fd
{
    public final k a;

    public void j(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setAlpha(0x3f4ccccd);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.setAlpha(0x3f4ccccd);
       }
       return;
    }
}
