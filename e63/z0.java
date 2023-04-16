package e63.z0;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public class z0 implements DialogInterface$OnCancelListener	// class@00267d
{
    public final e b;

    public void z0(e p0){
       this.b = p0;
       super();
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0.class, "1")) {
          return;
       }
       z0 tb = this.b;
       e y = tb.y;
       if (y != null) {
          y.onCancelAtMoreDialog(tb.r.getBaseFeed(), this.b.r.getUserProfile().mProfile.mId);
       }
       return;
    }
}
