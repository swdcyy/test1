package com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.lang.Number;

public final class Minecraft$Vec2f extends ModelBase	// class@000a8f
{

    public void Minecraft$Vec2f(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Vec2f(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Vec2f native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setX(long p0,double p1);
    public static native void native_setY(long p0,double p1);
    public static native double native_x(long p0);
    public static native double native_y(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Vec2f.class, "1")) {
          return;
       }
       Minecraft$Vec2f.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Vec2f clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Vec2f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Vec2f.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setX(double p0){
       Minecraft$Vec2f vec2f = Minecraft$Vec2f.class;
       if (PatchProxy.isSupport(vec2f) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, vec2f, "4")) {
          return;
       }
       Minecraft$Vec2f.native_setX(this.nativeRef, p0);
       return;
    }
    public void setY(double p0){
       Minecraft$Vec2f vec2f = Minecraft$Vec2f.class;
       if (PatchProxy.isSupport(vec2f) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, vec2f, "6")) {
          return;
       }
       Minecraft$Vec2f.native_setY(this.nativeRef, p0);
       return;
    }
    public double x(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Vec2f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$Vec2f.native_x(this.nativeRef);
    }
    public double y(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Vec2f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$Vec2f.native_y(this.nativeRef);
    }
}
