package kn1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailNavigatorModel$RollHotspots;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorTextSwitcher;
import android.view.View;
import android.widget.ViewSwitcher;
import android.widget.TextView;
import java.lang.CharSequence;

public final class e implements Observer	// class@002d71
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;

    public void e(LiveHotSpotDetailBottomNavigatorDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
       }else {
          e tb = this.b;
          tb.f = p0.hotspotId;
          LiveHotSpotDetailBottomNavigatorDataBinding d = tb.d;
          p0 = p0.title;
          a.o(p0, "it.title");
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(p0, d, LiveHotSpotDetailBottomNavigatorTextSwitcher.class, str)) {
             a.p(p0, "str");
             View nextView = d.getNextView();
             a.o(nextView, "nextView");
             if (!PatchProxy.applyVoidTwoRefs(nextView, p0, d, LiveHotSpotDetailBottomNavigatorTextSwitcher.class, "2")) {
                TextView textView = nextView.findViewWithTag("innerText");
                a.o(textView, "titleView");
                textView.setText(p0);
                nextView.setVisibility(0);
             }
             d.showNext();
          }
       }
       return;
    }
}
