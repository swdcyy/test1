package com.kuaishou.live.playeradapter.statistics.b$f;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kuaishou.live.playeradapter.statistics.b;
import java.lang.Object;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$f implements LiveUrlSwitchListener	// class@000d62
{
    public final b b;

    public void b$f(b p0){
       this.b = p0;
       super();
    }
    public void onUrlSwitchFail(LiveUrlSwitchReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "2")) {
          return;
       }
       this.b.H(p0.mReleaseReason, p0.mRetryReason, p0.mEmptyDataDurationMs);
       return;
    }
    public void onUrlSwitchSuccess(LiveUrlSwitchReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
          return;
       }
       this.b.H(p0.mReleaseReason, p0.mRetryReason, p0.mEmptyDataDurationMs);
       return;
    }
}
