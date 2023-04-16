package k3a.g;
import android.widget.LinearLayout;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.e;
import java.lang.Enum;

public final class g	// class@002bc9
{
    public final LinearLayout a;

    public void g(LinearLayout p0){
       a.p(p0, "clarityContainer");
       super();
       this.a = p0;
    }
    public final String a(ActionType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       int i = e.a[p0.ordinal()];
       if (i == 1) {
          return "sound_effect";
       }
       if (i == 2) {
          return "video_saveflow_icon_button";
       }
       if (i == 3) {
          return "assist_function_button";
       }
       if (i != 4) {
          return "";
       }
       return "mirror";
    }
}
