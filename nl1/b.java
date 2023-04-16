package nl1.b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.LiveGiftComboEffectRootView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class b extends AnimatorListenerAdapter	// class@003360
{
    public final LiveGiftComboEffectRootView a;

    public void b(LiveGiftComboEffectRootView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.F.setVisibility(8);
       this.a.P();
       return;
    }
}
