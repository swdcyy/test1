package com.kwai.video.wayne.player.main.WaynePlayer$createPlayer$fetchCallback$1;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.main.LoadingType;
import com.kwai.video.wayne.player.main.RetryInfo;
import com.kwai.video.wayne.player.main.FetchDataError;
import java.lang.Throwable;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.datasource.IDatasource;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.wayne.player.listeners.OnBuildDataChangedListener;

public final class WaynePlayer$createPlayer$fetchCallback$1 extends DataSourceFetchCallback	// class@000d9c
{
    public final int $type;
    public final WaynePlayer this$0;

    public void WaynePlayer$createPlayer$fetchCallback$1(WaynePlayer p0,int p1){
       this.this$0 = p0;
       this.$type = p1;
       super();
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer$createPlayer$fetchCallback$1.class, "2")) {
          return;
       }
       a.p(p0, "errorCode");
       PlayerLoadingProcessor processor = this.this$0.getProcessor(PlayerLoadingProcessor.class);
       if (processor != null) {
          processor.notifyPlayerLoadingChanged(LoadingType.STATE_INITFETCHSOURCE_FAIL, false);
       }
       RetryInfo retryInfo = new RetryInfo();
       retryInfo.setWhat(1002);
       retryInfo.setError(new FetchDataError());
       this.this$0.notifyWaynePlayerError(retryInfo);
       return;
    }
    public void onSucceed(IDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer$createPlayer$fetchCallback$1.class, "1")) {
          return;
       }
       a.p(p0, "dataSource");
       if (this.this$0.isCancelDataSource$kp_mid_release()) {
          PlayerLoadingProcessor processor = this.this$0.getProcessor(PlayerLoadingProcessor.class);
          if (processor != null) {
             processor.notifyPlayerLoadingChanged(LoadingType.STATE_INITFETCHSOURCE_CANCEL, false);
          }
          return;
       }else {
          this.this$0.mBuildData.setDatasourceModule(p0);
          Iterator iterator = this.this$0.mOnBuildDataChangedListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onChanged(this.this$0.mBuildData, this.this$0.mBuildData);
          }
          this.this$0.createPlayerInternal(this.$type);
          WaynePlayer$createPlayer$fetchCallback$1 tthis$0 = this.this$0;
          if (tthis$0.shouldPrepareAfterInitFetchSource != null) {
             tthis$0.shouldPrepareAfterInitFetchSource = false;
             tthis$0.prepareAsync();
          }
          return;
       }
    }
}
