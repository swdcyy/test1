package iv1.h;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import vy1.a;
import lnc.a1;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationShimmerView;
import java.lang.Float;
import android.util.Property;
import android.animation.ObjectAnimator;
import iv1.e;
import android.animation.Animator$AnimatorListener;

public final class h implements Runnable	// class@0029a3
{
    public final LiveOperationNotificationView b;

    public void h(LiveOperationNotificationView p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       int i = 1;
       int i1 = 2;
       if (PatchProxy.applyVoid(null, tb, LiveOperationNotificationView.class, "5")) {
       }else {
          a uoa = new a((float)(a1.d(0x7f070897) / i1), 0, 0, tb.g.getWidth(), a1.d(0x7f070897));
          tb.g.setOutlineProvider(v10);
          tb.g.setClipToOutline(i);
       }
       LiveOperationNotificationView f = tb.f;
       float f1 = (float)(- tb.f.getWidth());
       float f2 = (float)tb.getWidth();
       Objects.requireNonNull(f);
       if (!PatchProxy.isSupport(LiveOperationNotificationShimmerView.class) || (PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), Float.valueOf(f2), f, LiveOperationNotificationShimmerView.class, "2") || (f1 - (float)f.getWidth() > 0 || (f2 > 0 && f1 - f2 < 0)))) {
          f.p0();
          float[] uofloatArray = new float[i1];
          uofloatArray[0] = f1;
          uofloatArray[i] = f2;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(f, View.TRANSLATION_X, uofloatArray);
          f.x = objectAnimat;
          objectAnimat.addListener(new e(f));
          f.x.setDuration(1500);
          f.x.start();
       }
    label_00a0 :
       return;
    }
}
