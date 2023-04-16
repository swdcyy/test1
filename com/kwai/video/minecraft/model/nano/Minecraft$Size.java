package com.kwai.video.minecraft.model.nano.Minecraft$Size;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public final class Minecraft$Size extends ModelBase	// class@000a71
{

    public void Minecraft$Size(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Size(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Size native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native int native_height(long p0);
    public static native void native_setHeight(long p0,int p1);
    public static native void native_setWidth(long p0,int p1);
    public static native int native_width(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Size.class, "1")) {
          return;
       }
       Minecraft$Size.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Size clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Size.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Size.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int height(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Size.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$Size.native_height(this.nativeRef);
    }
    public native final long native_create();
    public void setHeight(int p0){
       Minecraft$Size size = Minecraft$Size.class;
       if (PatchProxy.isSupport(size) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, size, "4")) {
          return;
       }
       Minecraft$Size.native_setHeight(this.nativeRef, p0);
       return;
    }
    public void setWidth(int p0){
       Minecraft$Size size = Minecraft$Size.class;
       if (PatchProxy.isSupport(size) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, size, "6")) {
          return;
       }
       Minecraft$Size.native_setWidth(this.nativeRef, p0);
       return;
    }
    public int width(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Size.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$Size.native_width(this.nativeRef);
    }
}
