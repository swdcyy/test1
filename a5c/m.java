package a5c.m;
import ekd.f$j;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class m extends f$j	// class@000085
{
    public final UserProfileFollowGuidePresenter a;

    public void m(UserProfileFollowGuidePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       UserProfileFollowGuidePresenter y = this.a.y;
       if (y != null) {
          y.setVisibility(0);
       }
       return;
    }
}
