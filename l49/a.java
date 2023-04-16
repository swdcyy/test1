package l49.a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Boolean;

public final class a extends AnimatorListenerAdapter	// class@002c83
{
    public final AdRewardPendant a;
    public final a b;

    public void a(AdRewardPendant p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       AdRewardPendant d = this.a.d;
       if (d == null) {
          a.S("mAnimationView");
       }
       d.setVisibility(8);
       AdRewardPendant.a(this.a).setVisibility(0);
       this.b.invoke();
       return;
    }
    public void onAnimationStart(Animator p0,boolean p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, a.class, "2")) {
          return;
       }
       AdRewardPendant.a(this.a).setVisibility(8);
       return;
    }
}
