package com.kwai.video.minecraft.model.nano.Minecraft$AudioSpectrumClip;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$AudioSpectrumClip extends MutableClip	// class@000a3b
{

    public void Minecraft$AudioSpectrumClip(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_AudioSpectrumClip;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AudioSpectrumClip(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_AudioSpectrumClip;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AudioSpectrumClip native_clone(long p0);
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AudioSpectrumClip.class, "1")) {
          return;
       }
       Minecraft$AudioSpectrumClip.native_clear(this.nativeRef);
       return;
    }
    public MutableClip clone(){
       return this.clone();
    }
    public Minecraft$AudioSpectrumClip clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioSpectrumClip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioSpectrumClip.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
}
