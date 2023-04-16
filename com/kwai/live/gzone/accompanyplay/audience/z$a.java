package com.kwai.live.gzone.accompanyplay.audience.z$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.z;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState$State;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameDownloadConfig;
import com.kwai.live.gzone.accompanyplay.audience.y;
import android.view.View$OnClickListener;
import android.view.View;

public class z$a implements g	// class@000bc9
{
    public final z b;

    public void z$a(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
       }else {
          p0 = this.b;
          z t = p0.t;
          if (t != null && t.mGameChannelLimit != null) {
             LiveGzoneAccompanyGameInfo mGameDownloa = t.mGameInfo.mGameDownloadConfig;
             if (mGameDownloa != null && mGameDownloa.mGameCenterUrl != null) {
                p0.r.setOnClickListener(new y(this));
                this.b.R8();
                p0 = this.b;
                p0.P8(p0.t.mGameInfo.mGameId);
             }
          }
       }
       return;
    }
}
