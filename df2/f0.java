package df2.f0;
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
import ne2.k;

public final class f0 implements DialogInterface$OnCancelListener	// class@0024ee
{
    public final m0 b;

    public void f0(m0 p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       f0 tb = this.b;
       m0 b = tb.B;
       if (b != null) {
          b.onCancelAtMoreDialog(tb.x.getBaseFeed(), tb.x.getUserProfile().mProfile.mId);
       }
       tb.z.s(false, "PERSONAL_CARD_MORE");
       return;
    }
}
