package com.kwai.video.minecraft.model.nano.Minecraft$Vec3f;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class Minecraft$Vec3f extends ModelBase	// class@000a90
{

    public void Minecraft$Vec3f(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Vec3f(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Vec3f native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_x(long p0);
    public static native double native_y(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Vec3f.class, "1")) {
          return;
       }
       Minecraft$Vec3f.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Vec3f clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Vec3f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Vec3f.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public double x(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Vec3f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$Vec3f.native_x(this.nativeRef);
    }
    public double y(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Vec3f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$Vec3f.native_y(this.nativeRef);
    }
}
