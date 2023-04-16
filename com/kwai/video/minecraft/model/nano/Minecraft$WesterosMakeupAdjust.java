package com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupAdjust;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;

public final class Minecraft$WesterosMakeupAdjust extends ModelBase	// class@000a9d
{

    public void Minecraft$WesterosMakeupAdjust(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosMakeupAdjust(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosMakeupAdjust native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native float native_indensity(long p0);
    public static native String native_mode(long p0);
    public static native void native_setIndensity(long p0,float p1);
    public static native void native_setMode(long p0,String p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosMakeupAdjust.class, "1")) {
          return;
       }
       Minecraft$WesterosMakeupAdjust.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$WesterosMakeupAdjust clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupAdjust.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosMakeupAdjust.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float indensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupAdjust.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosMakeupAdjust.native_indensity(this.nativeRef);
    }
    public String mode(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupAdjust.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosMakeupAdjust.native_mode(this.nativeRef);
    }
    public native final long native_create();
    public void setIndensity(float p0){
       Minecraft$WesterosMakeupAdjust westerosMake = Minecraft$WesterosMakeupAdjust.class;
       if (PatchProxy.isSupport(westerosMake) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, westerosMake, "6")) {
          return;
       }
       Minecraft$WesterosMakeupAdjust.native_setIndensity(this.nativeRef, p0);
       return;
    }
    public void setMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosMakeupAdjust.class, "4")) {
          return;
       }
       Minecraft$WesterosMakeupAdjust.native_setMode(this.nativeRef, p0);
       return;
    }
}
