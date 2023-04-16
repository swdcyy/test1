package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher$DataSourceFetchCallback;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.LiveRestartReason;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import com.kwai.video.waynelive.datasource.LiveDataSource;

public class WayneLivePlayer$1 implements LiveDataSourceFetcher$DataSourceFetchCallback	// class@000e42
{
    public final WayneLivePlayer this$0;
    public final LiveRestartReason val$reason;

    public void WayneLivePlayer$1(WayneLivePlayer p0,LiveRestartReason p1){
       this.this$0 = p0;
       this.val$reason = p1;
       super();
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$1.class, "3")) {
          return;
       }
       DebugLog.e(this.this$0.getTag(), "fetchDataSource error"+new Throwable(p0));
       return;
    }
    public void onSucceed(ILiveDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$1.class, "1")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "fetchDataSource success, startPlay");
       if (this.val$reason == LiveRestartReason.PULL_STREAM_FAIL) {
          WayneLivePlayer$1 tthis$0 = this.this$0;
          tthis$0.mTotalRetryCount = tthis$0.mTotalRetryCount + 1;
       }
       this.this$0.updateDataSourceInternal(p0);
       this.this$0.startPlay();
       return;
    }
    public void onSucceed(LiveDataSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneLivePlayer$1.class, "2")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "fetchDataSource success, LiveDataSource startPlay");
       this.onSucceed(p0.tranforms2ILiveDatasource(this.this$0.isEnableWebRTCManifest()));
       return;
    }
}
