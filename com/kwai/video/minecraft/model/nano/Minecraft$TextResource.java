package com.kwai.video.minecraft.model.nano.Minecraft$TextResource;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class Minecraft$TextResource extends ModelBase	// class@000a7f
{

    public void Minecraft$TextResource(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TextResource(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TextResource native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native String native_resPath(long p0);
    public static native void native_setResId(long p0,int p1);
    public static native void native_setResPath(long p0,String p1);
    public static native void native_setResType(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TextResource.class, "1")) {
          return;
       }
       Minecraft$TextResource.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TextResource clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TextResource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TextResource.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public String resPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TextResource.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TextResource.native_resPath(this.nativeRef);
    }
    public void setResId(int p0){
       Minecraft$TextResource textResource = Minecraft$TextResource.class;
       if (PatchProxy.isSupport(textResource) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textResource, "3")) {
          return;
       }
       Minecraft$TextResource.native_setResId(this.nativeRef, p0);
       return;
    }
    public void setResPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextResource.class, "6")) {
          return;
       }
       Minecraft$TextResource.native_setResPath(this.nativeRef, p0);
       return;
    }
    public void setResType(int p0){
       Minecraft$TextResource textResource = Minecraft$TextResource.class;
       if (PatchProxy.isSupport(textResource) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textResource, "4")) {
          return;
       }
       Minecraft$TextResource.native_setResType(this.nativeRef, p0);
       return;
    }
}
