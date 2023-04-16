package df2.l;
import android.content.DialogInterface$OnCancelListener;
import df2.m0;
import java.lang.Object;
import android.content.DialogInterface;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class l implements DialogInterface$OnCancelListener	// class@0024fb
{
    public final m0 b;

    public void l(m0 p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       l tb = this.b;
       m0 b = tb.B;
       if (b != null) {
          b.onCancelAtMoreDialog(tb.x.getBaseFeed(), tb.x.getUserProfile().mProfile.mId);
       }
       return;
    }
}
