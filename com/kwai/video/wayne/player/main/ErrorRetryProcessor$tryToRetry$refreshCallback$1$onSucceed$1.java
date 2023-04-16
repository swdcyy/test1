package com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$refreshCallback$1$onSucceed$1;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$tryToRetry$refreshCallback$1;
import com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.datasource.WayneDatasourceProvider;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;

public final class ErrorRetryProcessor$tryToRetry$refreshCallback$1$onSucceed$1 implements Runnable	// class@000d5d
{
    public final IDatasource $datasource;
    public final ErrorRetryProcessor$tryToRetry$refreshCallback$1 this$0;

    public void ErrorRetryProcessor$tryToRetry$refreshCallback$1$onSucceed$1(ErrorRetryProcessor$tryToRetry$refreshCallback$1 p0,IDatasource p1){
       this.this$0 = p0;
       this.$datasource = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor$tryToRetry$refreshCallback$1$onSucceed$1.class, "1")) {
          return;
       }
       WayneDatasourceProvider provider = this.this$0.this$0.getMediaPlayer().getBuildData().getProvider();
       if (provider != null) {
          provider.setDatasource(this.$datasource);
       }
       this.this$0.this$0.getMediaPlayer().getBuildData().setDatasourceModule(this.$datasource);
       this.this$0.this$0.doRetry();
       return;
    }
}
