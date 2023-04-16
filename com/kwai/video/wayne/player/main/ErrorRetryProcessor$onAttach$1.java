package com.kwai.video.wayne.player.main.ErrorRetryProcessor$onAttach$1;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;
import com.kwai.video.wayne.player.main.ErrorRetryProcessor;
import java.lang.Object;

public final class ErrorRetryProcessor$onAttach$1 extends _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor	// class@000d59
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$onAttach$1(ErrorRetryProcessor p0,Object p1){
       this.this$0 = p0;
       super(p1);
    }
    public boolean intercepted(){
       return this.this$0.mShouldInterceptErrorListener;
    }
}
