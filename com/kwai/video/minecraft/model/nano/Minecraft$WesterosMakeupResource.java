package com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupResource;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Integer;

public final class Minecraft$WesterosMakeupResource extends ModelBase	// class@000a9f
{

    public void Minecraft$WesterosMakeupResource(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosMakeupResource(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosMakeupResource native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native float native_intensity(long p0);
    public static native int native_priority(long p0);
    public static native String native_resourceDir(long p0);
    public static native void native_setIntensity(long p0,float p1);
    public static native void native_setPriority(long p0,int p1);
    public static native void native_setResourceDir(long p0,String p1);
    public static native void native_setType(long p0,String p1);
    public static native String native_type(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosMakeupResource.class, "1")) {
          return;
       }
       Minecraft$WesterosMakeupResource.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$WesterosMakeupResource clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupResource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosMakeupResource.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float intensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupResource.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosMakeupResource.native_intensity(this.nativeRef);
    }
    public native final long native_create();
    public int priority(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupResource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosMakeupResource.native_priority(this.nativeRef);
    }
    public String resourceDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupResource.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosMakeupResource.native_resourceDir(this.nativeRef);
    }
    public void setIntensity(float p0){
       Minecraft$WesterosMakeupResource westerosMake = Minecraft$WesterosMakeupResource.class;
       if (PatchProxy.isSupport(westerosMake) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, westerosMake, "6")) {
          return;
       }
       Minecraft$WesterosMakeupResource.native_setIntensity(this.nativeRef, p0);
       return;
    }
    public void setPriority(int p0){
       Minecraft$WesterosMakeupResource westerosMake = Minecraft$WesterosMakeupResource.class;
       if (PatchProxy.isSupport(westerosMake) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westerosMake, "4")) {
          return;
       }
       Minecraft$WesterosMakeupResource.native_setPriority(this.nativeRef, p0);
       return;
    }
    public void setResourceDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosMakeupResource.class, "10")) {
          return;
       }
       Minecraft$WesterosMakeupResource.native_setResourceDir(this.nativeRef, p0);
       return;
    }
    public void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosMakeupResource.class, "8")) {
          return;
       }
       Minecraft$WesterosMakeupResource.native_setType(this.nativeRef, p0);
       return;
    }
    public String type(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupResource.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosMakeupResource.native_type(this.nativeRef);
    }
}
