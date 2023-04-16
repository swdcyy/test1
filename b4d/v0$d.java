package b4d.v0$d;
import android.animation.AnimatorListenerAdapter;
import b4d.v0;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import b4d.x0;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import android.view.ViewPropertyAnimator;
import android.view.View;
import lnc.c3$a;

public class v0$d extends AnimatorListenerAdapter	// class@000397
{
    public boolean a;
    public final EmotionInfo b;
    public final CDNUrl[] c;
    public final v0 d;

    public void v0$d(v0 p0,EmotionInfo p1,CDNUrl[] p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       v0$d uod = v0$d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       v0$d td = this.d;
       v0 a = td.A;
       a.setPlaceHolderImage(td.E.getDrawable());
       td = this.d;
       uod = this.b;
       td.R8(uod, td.A, this.c, new x0(this));
       v0 b = this.d.B;
       if (b != null) {
          long l = 100;
          b.animate().alpha(0x3f800000).setDuration(l).start();
       }
       this.d.q.apply(this.b);
       b.G = null;
       return;
    }
    public void onAnimationStart(Animator p0){
       v0$d uod = v0$d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
          return;
       }
       this.d.E.setVisibility(0);
       return;
    }
}
