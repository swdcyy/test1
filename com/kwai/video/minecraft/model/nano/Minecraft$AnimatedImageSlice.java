package com.kwai.video.minecraft.model.nano.Minecraft$AnimatedImageSlice;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public final class Minecraft$AnimatedImageSlice extends ModelBase	// class@000a33
{

    public void Minecraft$AnimatedImageSlice(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AnimatedImageSlice(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AnimatedImageSlice native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native int native_height(long p0);
    public static native void native_setHeight(long p0,int p1);
    public static native void native_setWidth(long p0,int p1);
    public static native void native_setX(long p0,int p1);
    public static native void native_setY(long p0,int p1);
    public static native int native_width(long p0);
    public static native int native_x(long p0);
    public static native int native_y(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AnimatedImageSlice.class, "1")) {
          return;
       }
       Minecraft$AnimatedImageSlice.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AnimatedImageSlice clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AnimatedImageSlice.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AnimatedImageSlice.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int height(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AnimatedImageSlice.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AnimatedImageSlice.native_height(this.nativeRef);
    }
    public native final long native_create();
    public void setHeight(int p0){
       Minecraft$AnimatedImageSlice uAnimatedIma = Minecraft$AnimatedImageSlice.class;
       if (PatchProxy.isSupport(uAnimatedIma) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedIma, "10")) {
          return;
       }
       Minecraft$AnimatedImageSlice.native_setHeight(this.nativeRef, p0);
       return;
    }
    public void setWidth(int p0){
       Minecraft$AnimatedImageSlice uAnimatedIma = Minecraft$AnimatedImageSlice.class;
       if (PatchProxy.isSupport(uAnimatedIma) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedIma, "8")) {
          return;
       }
       Minecraft$AnimatedImageSlice.native_setWidth(this.nativeRef, p0);
       return;
    }
    public void setX(int p0){
       Minecraft$AnimatedImageSlice uAnimatedIma = Minecraft$AnimatedImageSlice.class;
       if (PatchProxy.isSupport(uAnimatedIma) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedIma, "4")) {
          return;
       }
       Minecraft$AnimatedImageSlice.native_setX(this.nativeRef, p0);
       return;
    }
    public void setY(int p0){
       Minecraft$AnimatedImageSlice uAnimatedIma = Minecraft$AnimatedImageSlice.class;
       if (PatchProxy.isSupport(uAnimatedIma) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedIma, "6")) {
          return;
       }
       Minecraft$AnimatedImageSlice.native_setY(this.nativeRef, p0);
       return;
    }
    public int width(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AnimatedImageSlice.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AnimatedImageSlice.native_width(this.nativeRef);
    }
    public int x(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AnimatedImageSlice.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AnimatedImageSlice.native_x(this.nativeRef);
    }
    public int y(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AnimatedImageSlice.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AnimatedImageSlice.native_y(this.nativeRef);
    }
}
