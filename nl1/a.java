package nl1.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.LiveGiftComboEffectRootView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import nl1.b;
import android.animation.Animator$AnimatorListener;

public final class a implements Runnable	// class@00335f
{
    public final LiveGiftComboEffectRootView b;

    public void a(LiveGiftComboEffectRootView p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGiftComboEffectRootView.class, "4")) {
       }else {
          LiveGiftComboEffectRootView f = tb.F;
          if (f != null && !f.getVisibility()) {
             if (tb.J == null) {
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb.F, View.ALPHA, new float[2]{0x3f800000,0});
                tb.J = objectAnimat;
                objectAnimat.setDuration(560);
                tb.J.addListener(new b(tb));
             }
             tb.J.start();
          }
       }
       return;
    }
}
