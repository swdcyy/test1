package kn1.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import kn1.h;
import android.view.animation.Animation;
import kn1.g;
import android.view.animation.Animation$AnimationListener;
import th0.d;
import android.view.animation.Interpolator;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class f implements Observer	// class@002d72
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;

    public void f(LiveHotSpotDetailBottomNavigatorDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          String str = "nextRightContainer";
          String str1 = "nextTextView";
          if (p0.a()) {
             if (p0.b != null) {
                p0 = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoid(null, p0, LiveHotSpotDetailBottomNavigatorDataBinding.class, "3")) {
                   LiveHotSpotDetailBottomNavigatorDataBinding e = p0.e;
                   a.o(e, str1);
                   h oh = new h(p0, e.getWidth());
                   oh.setDuration(300);
                   oh.setAnimationListener(new g(p0));
                   oh.setInterpolator(new d());
                   p0.e.startAnimation(oh);
                }
             }else {
                p0 = this.b.b();
                a.o(p0, str1);
                p0.setVisibility(8);
                p0 = this.b.a();
                a.o(p0, str);
                p0 = p0.getLayoutParams();
                if (p0 != null) {
                   p0.width = a1.e(40.00f);
                }
             }
          }else {
             p0 = this.b.b();
             a.o(p0, str1);
             p0.setVisibility(0);
             p0 = this.b.a();
             a.o(p0, str);
             p0 = p0.getLayoutParams();
             if (p0 != null) {
                p0.width = -2;
             }
          }
       }
       return;
    }
}
