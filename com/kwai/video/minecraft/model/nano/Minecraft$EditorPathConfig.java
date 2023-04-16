package com.kwai.video.minecraft.model.nano.Minecraft$EditorPathConfig;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$EditorPathConfig extends ModelBase	// class@000a4d
{

    public void Minecraft$EditorPathConfig(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$EditorPathConfig(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_beautyPath(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$EditorPathConfig native_clone(long p0);
    public static native String native_colorFilterPath(long p0);
    public static native void native_destroy(long p0);
    public static native String native_magicFingerPath(long p0);
    public static native String native_metalLibPath(long p0);
    public static native void native_setBeautyPath(long p0,String p1);
    public static native void native_setColorFilterPath(long p0,String p1);
    public static native void native_setMagicFingerPath(long p0,String p1);
    public static native void native_setMetalLibPath(long p0,String p1);
    public static native void native_setVisualEffectPath(long p0,String p1);
    public static native String native_visualEffectPath(long p0);
    public String beautyPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EditorPathConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EditorPathConfig.native_beautyPath(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$EditorPathConfig.class, "1")) {
          return;
       }
       Minecraft$EditorPathConfig.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$EditorPathConfig clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EditorPathConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EditorPathConfig.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String colorFilterPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EditorPathConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EditorPathConfig.native_colorFilterPath(this.nativeRef);
    }
    public String magicFingerPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EditorPathConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EditorPathConfig.native_magicFingerPath(this.nativeRef);
    }
    public String metalLibPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EditorPathConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EditorPathConfig.native_metalLibPath(this.nativeRef);
    }
    public native final long native_create();
    public void setBeautyPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EditorPathConfig.class, "6")) {
          return;
       }
       Minecraft$EditorPathConfig.native_setBeautyPath(this.nativeRef, p0);
       return;
    }
    public void setColorFilterPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EditorPathConfig.class, "4")) {
          return;
       }
       Minecraft$EditorPathConfig.native_setColorFilterPath(this.nativeRef, p0);
       return;
    }
    public void setMagicFingerPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EditorPathConfig.class, "10")) {
          return;
       }
       Minecraft$EditorPathConfig.native_setMagicFingerPath(this.nativeRef, p0);
       return;
    }
    public void setMetalLibPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EditorPathConfig.class, "12")) {
          return;
       }
       Minecraft$EditorPathConfig.native_setMetalLibPath(this.nativeRef, p0);
       return;
    }
    public void setVisualEffectPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EditorPathConfig.class, "8")) {
          return;
       }
       Minecraft$EditorPathConfig.native_setVisualEffectPath(this.nativeRef, p0);
       return;
    }
    public String visualEffectPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EditorPathConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EditorPathConfig.native_visualEffectPath(this.nativeRef);
    }
}
