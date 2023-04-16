package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$e;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class RelaxTimeDetailPresenter$e extends AnimatorListenerAdapter	// class@0017af
{
    public final RelaxTimeDetailPresenter a;

    public void RelaxTimeDetailPresenter$e(RelaxTimeDetailPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RelaxTimeDetailPresenter$e.class, "1")) {
          return;
       }
       this.a.v.setVisibility(0);
       this.a.I.cancel();
       this.a.I.start();
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$e.class, "1");
       return;
    }
}
