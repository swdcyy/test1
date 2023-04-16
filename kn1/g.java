package kn1.g;
import ekd.f$i;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import kotlin.jvm.internal.a;

public final class g extends f$i	// class@002d73
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;

    public void g(LiveHotSpotDetailBottomNavigatorDataBinding p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       TextView textView = this.b.b();
       a.o(textView, "nextTextView");
       textView.setVisibility(8);
       return;
    }
}
