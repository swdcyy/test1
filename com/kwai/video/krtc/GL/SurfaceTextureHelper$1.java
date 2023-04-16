package com.kwai.video.krtc.GL.SurfaceTextureHelper$1;
import java.util.concurrent.Callable;
import com.kwai.video.krtc.GL.EglBase$Context;
import android.os.Handler;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.Log;

public final class SurfaceTextureHelper$1 implements Callable	// class@000748
{
    public final Handler val$handler;
    public final EglBase$Context val$sharedContext;
    public final String val$threadName;

    public void SurfaceTextureHelper$1(EglBase$Context p0,Handler p1,String p2){
       this.val$sharedContext = p0;
       this.val$handler = p1;
       this.val$threadName = p2;
       super();
    }
    public SurfaceTextureHelper call(){
       Object obj = PatchProxy.apply(null, this, SurfaceTextureHelper$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return new SurfaceTextureHelper(this.val$sharedContext, this.val$handler, null);
       }catch(java.lang.RuntimeException e0){
          Log.e("SurfaceTextureHelper", this.val$threadName+" create failure", e0);
          return v1;
       }
    }
    public Object call(){
       return this.call();
    }
}
