package com.kwai.video.westeros.audioplugin.AudioPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class AudioPlugin extends WesterosPlugin	// class@000e74
{

    static {
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("audioplugin");
    }
    public void AudioPlugin(){
       super();
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, AudioPlugin.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateAudioPlugin();
    }
    public native final long nativeCreateAudioPlugin();
    public native final void nativeDestroyAudioPlugin(long p0);
    public void releaseNativePlugin(long p0){
       AudioPlugin uAudioPlugin = AudioPlugin.class;
       if (PatchProxy.isSupport(uAudioPlugin) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAudioPlugin, "2")) {
          return;
       }
       this.nativeDestroyAudioPlugin(p0);
       return;
    }
}
