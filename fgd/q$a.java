package fgd.q$a;
import android.animation.AnimatorListenerAdapter;
import fgd.q;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fgd.r;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import android.widget.Button;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class q$a extends AnimatorListenerAdapter	// class@000e32
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       r r;
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       r.R8(this.a.a).setAlpha(0x3f800000);
       r.R8(this.a.a).setClickable(true);
       r = this.a.a.r;
       if (r == null) {
          a.S("mCacheSizeView");
       }
       r.setText("0.00 MB");
       return;
    }
}
