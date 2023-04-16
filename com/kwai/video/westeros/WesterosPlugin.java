package com.kwai.video.westeros.WesterosPlugin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.camerasdk.log.Log;

public abstract class WesterosPlugin	// class@000e6e
{
    public long nativePlugin;
    public boolean released;

    public void WesterosPlugin(){
       super();
       this.nativePlugin = 0;
       this.released = false;
       this.nativePlugin = this.createNativePlugin();
    }
    public abstract long createNativePlugin();
    public long getNativePlugin(){
       return this.nativePlugin;
    }
    public synchronized boolean isReleased(){
       return this.released;
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, WesterosPlugin.class, "1")) {
          return;
       }
       Log.i("WesterosPlugin", this.getClass().getName()+" release,has released:"+this.released);
       if (this.released == null) {
          this.releaseNativePlugin(this.nativePlugin);
          this.nativePlugin = 0;
          this.released = true;
       }
       return;
    }
    public abstract void releaseNativePlugin(long p0);
}
