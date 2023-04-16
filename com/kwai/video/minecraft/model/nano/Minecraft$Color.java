package com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;

public final class Minecraft$Color extends ModelBase	// class@000a47
{

    public void Minecraft$Color(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Color(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Color native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAlpha(long p0,float p1);
    public static native void native_setBlue(long p0,float p1);
    public static native void native_setGreen(long p0,float p1);
    public static native void native_setRed(long p0,float p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Color.class, "1")) {
          return;
       }
       Minecraft$Color.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Color clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Color.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Color.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAlpha(float p0){
       Minecraft$Color uColor = Minecraft$Color.class;
       if (PatchProxy.isSupport(uColor) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uColor, "6")) {
          return;
       }
       Minecraft$Color.native_setAlpha(this.nativeRef, p0);
       return;
    }
    public void setBlue(float p0){
       Minecraft$Color uColor = Minecraft$Color.class;
       if (PatchProxy.isSupport(uColor) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uColor, "5")) {
          return;
       }
       Minecraft$Color.native_setBlue(this.nativeRef, p0);
       return;
    }
    public void setGreen(float p0){
       Minecraft$Color uColor = Minecraft$Color.class;
       if (PatchProxy.isSupport(uColor) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uColor, "4")) {
          return;
       }
       Minecraft$Color.native_setGreen(this.nativeRef, p0);
       return;
    }
    public void setRed(float p0){
       Minecraft$Color uColor = Minecraft$Color.class;
       if (PatchProxy.isSupport(uColor) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uColor, "3")) {
          return;
       }
       Minecraft$Color.native_setRed(this.nativeRef, p0);
       return;
    }
}
