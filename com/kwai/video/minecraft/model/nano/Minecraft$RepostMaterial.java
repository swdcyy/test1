package com.kwai.video.minecraft.model.nano.Minecraft$RepostMaterial;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Float;

public final class Minecraft$RepostMaterial extends ModelBase	// class@000a6c
{

    public void Minecraft$RepostMaterial(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$RepostMaterial(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$RepostMaterial native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setBackgroundPath(long p0,String p1);
    public static native void native_setHeight(long p0,int p1);
    public static native void native_setPath(long p0,String p1);
    public static native void native_setTjRemainTime(long p0,float p1);
    public static native void native_setWidth(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$RepostMaterial.class, "1")) {
          return;
       }
       Minecraft$RepostMaterial.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$RepostMaterial clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$RepostMaterial.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$RepostMaterial.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setBackgroundPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$RepostMaterial.class, "4")) {
          return;
       }
       Minecraft$RepostMaterial.native_setBackgroundPath(this.nativeRef, p0);
       return;
    }
    public void setHeight(int p0){
       Minecraft$RepostMaterial repostMateri = Minecraft$RepostMaterial.class;
       if (PatchProxy.isSupport(repostMateri) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, repostMateri, "6")) {
          return;
       }
       Minecraft$RepostMaterial.native_setHeight(this.nativeRef, p0);
       return;
    }
    public void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$RepostMaterial.class, "3")) {
          return;
       }
       Minecraft$RepostMaterial.native_setPath(this.nativeRef, p0);
       return;
    }
    public void setTjRemainTime(float p0){
       Minecraft$RepostMaterial repostMateri = Minecraft$RepostMaterial.class;
       if (PatchProxy.isSupport(repostMateri) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repostMateri, "7")) {
          return;
       }
       Minecraft$RepostMaterial.native_setTjRemainTime(this.nativeRef, p0);
       return;
    }
    public void setWidth(int p0){
       Minecraft$RepostMaterial repostMateri = Minecraft$RepostMaterial.class;
       if (PatchProxy.isSupport(repostMateri) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, repostMateri, "5")) {
          return;
       }
       Minecraft$RepostMaterial.native_setWidth(this.nativeRef, p0);
       return;
    }
}
