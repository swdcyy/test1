package com.kwai.widget.customer.mediapreview.t$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.widget.customer.mediapreview.t;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class t$b extends AnimatorListenerAdapter	// class@001146
{
    public final t a;

    public void t$b(t p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$b.class, "1")) {
          return;
       }
       this.a.r.onNext(Integer.valueOf(2));
       this.a.getActivity().finish();
       return;
    }
}
