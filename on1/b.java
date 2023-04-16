package on1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class b implements Observer	// class@003543
{
    public final LiveHotSpotDetailRelatedAnchorsViewController b;

    public void b(LiveHotSpotDetailRelatedAnchorsViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          LiveHotSpotDetailRelatedAnchorsViewController j = this.b.j;
          if (j == null) {
             a.S("titleTextView");
          }
          j.setText(p0);
       }
       return;
    }
}
