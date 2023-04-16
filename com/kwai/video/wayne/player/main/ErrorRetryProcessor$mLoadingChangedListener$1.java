package com.kwai.video.wayne.player.main.ErrorRetryProcessor$mLoadingChangedListener$1;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.lang.Object;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.wayne.player.main.RetryInfo;

public final class ErrorRetryProcessor$mLoadingChangedListener$1 implements OnPlayerLoadingChangedListener	// class@000d57
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$mLoadingChangedListener$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(boolean p0,LoadingType p1){
       if (PatchProxy.isSupport(ErrorRetryProcessor$mLoadingChangedListener$1.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ErrorRetryProcessor$mLoadingChangedListener$1.class, "1")) {
          return;
       }
       a.p(p1, "loadingType");
       if (p1 == LoadingType.STATE_FIRSTFRAME) {
          DebugLog.i(this.this$0.getLogTag(), "error retry STATE_FIRSTFRAME ");
          this.this$0.mIsRetrying.set(false);
          this.this$0.mRetryInfo.setNotCDNRetryCount(false);
       }
       return;
    }
}
