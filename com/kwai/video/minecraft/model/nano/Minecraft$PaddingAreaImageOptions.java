package com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaImageOptions;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$PaddingAreaImageOptions extends ModelBase	// class@000a62
{

    public void Minecraft$PaddingAreaImageOptions(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$PaddingAreaImageOptions(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$PaddingAreaImageOptions native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setPath(long p0,String p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$PaddingAreaImageOptions.class, "1")) {
          return;
       }
       Minecraft$PaddingAreaImageOptions.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$PaddingAreaImageOptions clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$PaddingAreaImageOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$PaddingAreaImageOptions.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$PaddingAreaImageOptions.class, "3")) {
          return;
       }
       Minecraft$PaddingAreaImageOptions.native_setPath(this.nativeRef, p0);
       return;
    }
}
