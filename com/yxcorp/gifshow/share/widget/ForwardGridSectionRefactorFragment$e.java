package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$e;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;

public final class ForwardGridSectionRefactorFragment$e implements Animator$AnimatorListener	// class@001cdb
{
    public final ForwardGridSectionRefactorFragment a;

    public void ForwardGridSectionRefactorFragment$e(ForwardGridSectionRefactorFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionRefactorFragment$e.class, "1")) {
          return;
       }
       this.a.Kh().onNext(Boolean.TRUE);
       this.a.Kh().onComplete();
       return;
    }
}
