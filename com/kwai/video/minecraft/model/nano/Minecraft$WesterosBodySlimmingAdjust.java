package com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingAdjust;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Integer;

public final class Minecraft$WesterosBodySlimmingAdjust extends ModelBase	// class@000a99
{

    public void Minecraft$WesterosBodySlimmingAdjust(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosBodySlimmingAdjust(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosBodySlimmingAdjust native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native float native_intensity(long p0);
    public static native void native_setIntensity(long p0,float p1);
    public static native void native_setType(long p0,int p1);
    public static native int native_type(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosBodySlimmingAdjust.class, "1")) {
          return;
       }
       Minecraft$WesterosBodySlimmingAdjust.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$WesterosBodySlimmingAdjust clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBodySlimmingAdjust.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosBodySlimmingAdjust.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float intensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBodySlimmingAdjust.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBodySlimmingAdjust.native_intensity(this.nativeRef);
    }
    public native final long native_create();
    public void setIntensity(float p0){
       Minecraft$WesterosBodySlimmingAdjust westerosBody = Minecraft$WesterosBodySlimmingAdjust.class;
       if (PatchProxy.isSupport(westerosBody) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, westerosBody, "6")) {
          return;
       }
       Minecraft$WesterosBodySlimmingAdjust.native_setIntensity(this.nativeRef, p0);
       return;
    }
    public void setType(int p0){
       Minecraft$WesterosBodySlimmingAdjust westerosBody = Minecraft$WesterosBodySlimmingAdjust.class;
       if (PatchProxy.isSupport(westerosBody) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westerosBody, "4")) {
          return;
       }
       Minecraft$WesterosBodySlimmingAdjust.native_setType(this.nativeRef, p0);
       return;
    }
    public int type(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBodySlimmingAdjust.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosBodySlimmingAdjust.native_type(this.nativeRef);
    }
}
