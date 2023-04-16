package fe2.e;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$b;

public class e extends m	// class@00293b
{
    public final LivePkPeerInfoView c;

    public void e(LivePkPeerInfoView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LivePkPeerInfoView.class, "8")) {
          LivePkPeerInfoView k = tc.k;
          if (k != null) {
             k.b(tc.h);
          }
       }
       return;
    }
}
