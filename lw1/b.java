package lw1.b;
import android.os.Handler;
import com.kuaishou.live.common.core.component.pk.widget.LivePkBannerView;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import h3.a;
import androidx.viewpager.widget.ViewPager;

public class b extends Handler	// class@003068
{
    public final LivePkBannerView a;

    public void b(LivePkBannerView p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0.what == null) {
          b ta = this.a;
          if (ta.g != null) {
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, LivePkBannerView.class, "5") && (ta.d.getAdapter() != null && ta.d.getAdapter().j() > 0)) {
                ta.d.setCurrentItem(((ta.d.getCurrentItem() + 1) % ta.d.getAdapter().j()));
             }
          label_0050 :
             this.a.b();
          }
       }
       return;
    }
}
