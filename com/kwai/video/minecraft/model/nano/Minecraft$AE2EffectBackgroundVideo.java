package com.kwai.video.minecraft.model.nano.Minecraft$AE2EffectBackgroundVideo;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$AE2EffectBackgroundVideo extends ModelBase	// class@000a2b
{

    public void Minecraft$AE2EffectBackgroundVideo(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AE2EffectBackgroundVideo(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AE2EffectBackgroundVideo native_clone(long p0);
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AE2EffectBackgroundVideo.class, "1")) {
          return;
       }
       Minecraft$AE2EffectBackgroundVideo.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AE2EffectBackgroundVideo clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectBackgroundVideo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AE2EffectBackgroundVideo.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
}