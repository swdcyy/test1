package com.kwai.video.wayne.player.main.ErrorRetryProcessor$mDebugInfoCallback$1;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.OmniRetryInfo;

public final class ErrorRetryProcessor$mDebugInfoCallback$1 extends AwesomeCacheCallback	// class@000d54
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$mDebugInfoCallback$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor$mDebugInfoCallback$1.class, "2")) {
          return;
       }
       a.p(p0, "info");
       AcCallBackInfo stopReason = p0.stopReason;
       if (stopReason != 1 && stopReason != 2) {
          this.this$0.mOmniRetryInfo.onCdnError(p0.errorCode);
       }
       return;
    }
    public void onSessionProgress(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor$mDebugInfoCallback$1.class, "1")) {
          return;
       }
       a.p(p0, "info");
       return;
    }
}
