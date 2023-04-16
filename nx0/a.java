package nx0.a;
import nx0.a$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.view.View;

public final class a	// class@0033e6
{
    public LiveAudienceOverRoomV2View a;
    public final LifecycleOwner b;
    public final ViewGroup c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
    }
    public void a(LifecycleOwner p0,ViewGroup p1){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "containerView");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.d();
          this.c.removeView(ta);
       }
       this.a = null;
       return;
    }
}
