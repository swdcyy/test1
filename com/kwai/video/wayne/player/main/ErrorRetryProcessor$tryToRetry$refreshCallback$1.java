package com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$refreshCallback$1;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.main.FetchDataError;
import java.lang.Throwable;
import com.kwai.video.wayne.player.main.RetryInfo;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.wayne.player.datasource.IDatasource;
import android.os.Handler;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$refreshCallback$1$onSucceed$1;
import java.lang.Runnable;

public final class ErrorRetryProcessor$tryToRetry$refreshCallback$1 extends DataSourceFetchCallback	// class@000d5e
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$tryToRetry$refreshCallback$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor$tryToRetry$refreshCallback$1.class, "2")) {
          return;
       }
       a.p(p0, "error");
       if (!this.this$0.isAttach()) {
          return;
       }
       ErrorRetryProcessor$tryToRetry$refreshCallback$1 tthis$0 = this.this$0;
       tthis$0.mShouldInterceptErrorListener = false;
       DebugLog.e(tthis$0.getLogTag(), "refresh dataSource error, "+p0);
       this.this$0.mRetryInfo.setError(new FetchDataError());
       this.this$0.getMediaPlayer().notifyWaynePlayerError(this.this$0.mRetryInfo);
       this.this$0.mIsRetrying.set(false);
       return;
    }
    public void onSucceed(IDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor$tryToRetry$refreshCallback$1.class, "1")) {
          return;
       }
       a.p(p0, "datasource");
       if (this.this$0.isAttach() && !this.this$0.getMediaPlayer().isCancelDataSource$kp_mid_release()) {
          DebugLog.i(this.this$0.getLogTag(), "refresh dataSource success");
          this.this$0.getMediaPlayer().getHandler().post(new ErrorRetryProcessor$tryToRetry$refreshCallback$1$onSucceed$1(this, p0));
       }
       return;
    }
}
