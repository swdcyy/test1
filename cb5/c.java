package cb5.c;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeHotRefreshTipButtonPresenter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.view.ViewGroup;

public final class c extends AnimatorListenerAdapter	// class@000445
{
    public final HomeHotRefreshTipButtonPresenter a;
    public final View b;

    public void c(HomeHotRefreshTipButtonPresenter p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       View view = this.a.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       view.removeView(this.b);
       view.z = null;
       return;
    }
}
