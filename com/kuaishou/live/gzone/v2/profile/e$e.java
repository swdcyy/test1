package com.kuaishou.live.gzone.v2.profile.e$e;
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

public class e$e implements DialogInterface$OnCancelListener	// class@001ce2
{
    public final e b;

    public void e$e(e p0){
       this.b = p0;
       super();
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "1")) {
          return;
       }
       e$e tb = this.b;
       e y = tb.y;
       if (y != null) {
          y.onCancelAtMoreDialog(tb.r.getBaseFeed(), this.b.r.getUserProfile().mProfile.mId);
       }
       return;
    }
}
