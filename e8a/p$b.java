package e8a.p$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$e;
import e8a.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;

public final class p$b extends SlidingPaneLayout$e	// class@0020c9
{
    public final p a;

    public void p$b(p p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "2")) {
          return;
       }
       if (this.a.r != null) {
          a.d().k(new PlayEvent(this.a.p, PlayEvent$Status.RESUME));
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       if (this.a.r != null) {
          a.d().k(new PlayEvent(this.a.p, PlayEvent$Status.PAUSE));
       }
       return;
    }
}
