package m6a.c;
import ekd.f$i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class c extends f$i	// class@002f4b
{
    public final AvatarWithLiving b;

    public void c(AvatarWithLiving p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.b.f.setVisibility(0);
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
