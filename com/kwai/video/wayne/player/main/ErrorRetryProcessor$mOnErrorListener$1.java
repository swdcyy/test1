package com.kwai.video.wayne.player.main.ErrorRetryProcessor$mOnErrorListener$1;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.RetryInfo;
import com.kwai.video.wayne.player.main.RetryStrategy;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.main.RetryProcessorUnAttachError;
import java.lang.Throwable;
import com.kwai.video.wayne.player.main.NoRetryStrategyError;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Long;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager;
import com.kwai.video.wayne.player.datasource.IDatasource;
import kotlin.jvm.internal.a;

public final class ErrorRetryProcessor$mOnErrorListener$1 implements IMediaPlayer$OnErrorListener	// class@000d58
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$mOnErrorListener$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       ErrorRetryProcessor$mOnErrorListener$1 obj;
       long l1;
       if (PatchProxy.isSupport(ErrorRetryProcessor$mOnErrorListener$1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ErrorRetryProcessor$mOnErrorListener$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.this$0.mRetryInfo.setExtra(p2);
       this.this$0.mRetryInfo.setWhat(p1);
       obj = this.this$0;
       obj.mRetryInfo.setSwitchStrategy(obj.mRetryStrategy.getSwitchStrategy());
       if (!this.this$0.isAttach()) {
          DebugLog.i(this.this$0.getLogTag(), " !isAttached");
          this.this$0.mRetryInfo.setError(new RetryProcessorUnAttachError());
          p0.mShouldInterceptErrorListener = false;
          return false;
       }else if(this.this$0.mRetryStrategy.getSwitchStrategy() == -3){
          DebugLog.i(this.this$0.getLogTag(), " SwitchStrategy_NOALLRETRY");
          this.this$0.mRetryInfo.setError(new NoRetryStrategyError());
          this.this$0.getMediaPlayer().notifyWaynePlayerError(this.this$0.mRetryInfo);
          return false;
       }else {
          DebugLog.i(this.this$0.getLogTag(), "receive a error {what:"+p1+", extra:"+p2+'}');
          this.this$0.mErrorCode = p1+'|'+p2;
          obj = this.this$0;
          obj.mTargetState = obj.getMediaPlayer().getState();
          obj = this.this$0;
          long l = 0;
          Long longx = (p0 != null)? Long.valueOf(p0.getCurrentPosition()): l;
          if (longx) {
             longx = (p0 != null)? Long.valueOf(p0.getCurrentPosition()): l;
             if (longx.longValue() > 0) {
                if (p0 != null) {
                   l = Long.valueOf(p0.getCurrentPosition());
                }
                l = l.longValue();
             label_0124 :
                obj.mLastPositionOfErrorPlayer = l;
                p0.mShouldInterceptErrorListener = false;
                IDatasource dataSourceMo = this.this$0.getMediaPlayer().getBuildData().getDataSourceModule();
                a.o(dataSourceMo, "mediaPlayer.getBuildData\(\).dataSourceModule");
                KSVodPlayHistoryManager.getInstance().updatePlayPositionWithKey(dataSourceMo.getResourceKey(), this.this$0.mLastPositionOfErrorPlayer);
                this.this$0.tryToRetry(p1, p2);
                return false;
             }
          }
          l = this.this$0.getMediaPlayer().getBuildData().getStartPosition();
          goto label_0124 ;
       }
    }
}
