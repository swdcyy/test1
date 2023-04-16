package com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;

public abstract class _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor	// class@000da9
{
    public Object mListener;

    public void _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor(){
       super();
    }
    public void _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor(Object p0){
       super();
       this.mListener = p0;
    }
    public Object getListener(){
       _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor obj = PatchProxy.apply(null, this, _2_AbstractPlayerListenerDelegate$AbsListenerInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mListener;
       if (obj != null) {
          return obj;
       }
       throw new IllegalArgumentException("listener must not null!!!");
    }
    public abstract boolean intercepted();
}
