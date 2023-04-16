package com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$InputFileOptions extends ModelBase	// class@000a54
{

    public void Minecraft$InputFileOptions(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$InputFileOptions(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$InputFileOptions native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$RationalV2 native_frameRate(long p0);
    public static native void native_setDecryptionKey(long p0,String p1);
    public static native void native_setFrameRate(long p0,Minecraft$RationalV2 p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$InputFileOptions.class, "1")) {
          return;
       }
       Minecraft$InputFileOptions.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$InputFileOptions clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$InputFileOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$InputFileOptions.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$RationalV2 frameRate(){
       Object obj = PatchProxy.apply(null, this, Minecraft$InputFileOptions.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$InputFileOptions.native_frameRate(this.nativeRef);
    }
    public native final long native_create();
    public void setDecryptionKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$InputFileOptions.class, "5")) {
          return;
       }
       Minecraft$InputFileOptions.native_setDecryptionKey(this.nativeRef, p0);
       return;
    }
    public void setFrameRate(Minecraft$RationalV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$InputFileOptions.class, "4")) {
          return;
       }
       Minecraft$InputFileOptions.native_setFrameRate(this.nativeRef, p0);
       return;
    }
}
