package com.kwai.video.wayne.player.main.ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$mKwaiInjectHttpCallback$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.datasource.WayneDatasourceProvider;

public final class ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1 extends DataSourceFetchCallback	// class@000d55
{
    public final ErrorRetryProcessor$mKwaiInjectHttpCallback$1 this$0;

    public void ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1(ErrorRetryProcessor$mKwaiInjectHttpCallback$1 p0){
       this.this$0 = p0;
       super();
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1.class, "2")) {
          return;
       }
       a.p(p0, "errorCode");
       DebugLog.i(this.this$0.this$0.getLogTag(), " KwaiInjectHttpCallback fetch failed");
       if (!this.this$0.this$0.isAttach()) {
          return;
       }
       this.this$0.this$0.getMediaPlayer().updateDataSourceForKernelPlayer(null);
       return;
    }
    public void onSucceed(IDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1.class, "1")) {
          return;
       }
       a.p(p0, "dataSource");
       if (!this.this$0.this$0.isAttach()) {
          return;
       }
       DebugLog.i(this.this$0.this$0.getLogTag(), " KwaiInjectHttpCallback fetch succeed "+p0);
       WayneDatasourceProvider provider = this.this$0.this$0.getMediaPlayer().getBuildData().getProvider();
       if (provider != null) {
          provider.setDatasource(p0);
       }
       this.this$0.this$0.getMediaPlayer().getBuildData().setDatasourceModule(p0);
       this.this$0.this$0.getMediaPlayer().updateDataSourceForKernelPlayer(this.this$0.this$0.getMediaPlayer().getBuildData().getDataSource());
       return;
    }
}
