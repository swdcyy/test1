package com.kwai.video.minecraft.model.nano.Minecraft$Opening;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableMap;

public final class Minecraft$Opening extends ModelBase	// class@000a61
{

    public void Minecraft$Opening(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Opening(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Opening native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Map native_fontMap(long p0);
    public static native void native_setFontMap(long p0,Map p1);
    public static native void native_setTextMap(long p0,Map p1);
    public static native Map native_textMap(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Opening.class, "1")) {
          return;
       }
       Minecraft$Opening.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Opening clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Opening.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Opening.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public ImmutableMap fontMap(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Opening.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableMap(Minecraft$Opening.native_fontMap(this.nativeRef));
    }
    public native final long native_create();
    public void setFontMap(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$Opening.class, "4")) {
          return;
       }
       Minecraft$Opening.native_setFontMap(this.nativeRef, p0.getMap());
       return;
    }
    public void setTextMap(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$Opening.class, "6")) {
          return;
       }
       Minecraft$Opening.native_setTextMap(this.nativeRef, p0.getMap());
       return;
    }
    public ImmutableMap textMap(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Opening.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableMap(Minecraft$Opening.native_textMap(this.nativeRef));
    }
}
