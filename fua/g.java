package fua.g;
import ekd.f$j;
import fua.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class g extends f$j	// class@0029fa
{
    public final c a;

    public void g(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.e(208.00f);
          }
       }
       viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.requestLayout();
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = a1.e(208.00f);
          }
       }
       viewGroup = this.a.Z8();
       if (viewGroup != null) {
          viewGroup.requestLayout();
       }
       return;
    }
}
