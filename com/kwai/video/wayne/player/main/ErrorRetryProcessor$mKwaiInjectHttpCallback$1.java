package com.kwai.video.wayne.player.main.ErrorRetryProcessor$mKwaiInjectHttpCallback$1;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.player.kwai_player.Util;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.multisource.switcher.FetchReason;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetcher;

public final class ErrorRetryProcessor$mKwaiInjectHttpCallback$1 implements IKwaiInjectHttpCallback	// class@000d56
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$mKwaiInjectHttpCallback$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public boolean onError(int p0){
       ErrorRetryProcessor obj;
       ErrorRetryProcessor$mKwaiInjectHttpCallback$1 omKwaiInject = ErrorRetryProcessor$mKwaiInjectHttpCallback$1.class;
       if (PatchProxy.isSupport(omKwaiInject)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, omKwaiInject, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DebugLog.i(this.this$0.getLogTag(), " KwaiInjectHttpCallback");
       int i = 0;
       if (this.this$0.mFetcher != null && Util.isHttpForbiddenErrorInMediaPlayer(i, p0)) {
          ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1 omKwaiInject1 = new ErrorRetryProcessor$mKwaiInjectHttpCallback$1$onError$fetchCallback$1(this);
          DebugLog.i(this.this$0.getLogTag(), " KwaiInjectHttpCallback start fetch "+this.this$0.mFetcher);
          obj = this.this$0.mFetcher;
          if (obj != null) {
             obj.fetch(omKwaiInject1, FetchReason.FetchReason_403V2);
          }
          return true;
       }else {
          return i;
       }
    }
}
