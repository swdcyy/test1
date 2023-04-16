package com.kwai.video.minecraft.model.nano.Minecraft$Shift;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;

public final class Minecraft$Shift extends ModelBase	// class@000a70
{

    public void Minecraft$Shift(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Shift(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Shift native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setX(long p0,double p1);
    public static native void native_setY(long p0,double p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Shift.class, "1")) {
          return;
       }
       Minecraft$Shift.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Shift clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Shift.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Shift.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setX(double p0){
       Minecraft$Shift shift = Minecraft$Shift.class;
       if (PatchProxy.isSupport(shift) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, shift, "3")) {
          return;
       }
       Minecraft$Shift.native_setX(this.nativeRef, p0);
       return;
    }
    public void setY(double p0){
       Minecraft$Shift shift = Minecraft$Shift.class;
       if (PatchProxy.isSupport(shift) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, shift, "4")) {
          return;
       }
       Minecraft$Shift.native_setY(this.nativeRef, p0);
       return;
    }
}
