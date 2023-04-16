package m6a.a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class a extends AnimatorListenerAdapter	// class@002f49
{
    public final AvatarWithLiving a;

    public void a(AvatarWithLiving p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.a.getMAvatarView().setScaleX(0x3f800000);
       this.a.getMAvatarView().setScaleY(0x3f800000);
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
