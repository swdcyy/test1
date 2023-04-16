package com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;
import java.lang.Long;

public final class Minecraft$Range extends ModelBase	// class@000a69
{

    public void Minecraft$Range(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Range(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Range native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_duration(long p0);
    public static native long native_id(long p0);
    public static native void native_setDuration(long p0,double p1);
    public static native void native_setId(long p0,long p1);
    public static native void native_setStart(long p0,double p1);
    public static native double native_start(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Range.class, "1")) {
          return;
       }
       Minecraft$Range.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Range clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Range.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Range.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double duration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Range.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$Range.native_duration(this.nativeRef);
    }
    public long id(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Range.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Minecraft$Range.native_id(this.nativeRef);
    }
    public native final long native_create();
    public void setDuration(double p0){
       Minecraft$Range range = Minecraft$Range.class;
       if (PatchProxy.isSupport(range) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, range, "6")) {
          return;
       }
       Minecraft$Range.native_setDuration(this.nativeRef, p0);
       return;
    }
    public void setId(long p0){
       Minecraft$Range range = Minecraft$Range.class;
       if (PatchProxy.isSupport(range) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, range, "8")) {
          return;
       }
       Minecraft$Range.native_setId(this.nativeRef, p0);
       return;
    }
    public void setStart(double p0){
       Minecraft$Range range = Minecraft$Range.class;
       if (PatchProxy.isSupport(range) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, range, "4")) {
          return;
       }
       Minecraft$Range.native_setStart(this.nativeRef, p0);
       return;
    }
    public double start(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Range.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$Range.native_start(this.nativeRef);
    }
}
