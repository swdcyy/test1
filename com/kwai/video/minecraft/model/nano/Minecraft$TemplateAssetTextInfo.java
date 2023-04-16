package com.kwai.video.minecraft.model.nano.Minecraft$TemplateAssetTextInfo;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$TemplateAssetTextInfo extends ModelBase	// class@000a78
{

    public void Minecraft$TemplateAssetTextInfo(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TemplateAssetTextInfo(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TemplateAssetTextInfo native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setCustomImagePath(long p0,String p1);
    public static native void native_setTextMarker(long p0,String p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TemplateAssetTextInfo.class, "1")) {
          return;
       }
       Minecraft$TemplateAssetTextInfo.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TemplateAssetTextInfo clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetTextInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateAssetTextInfo.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setCustomImagePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateAssetTextInfo.class, "4")) {
          return;
       }
       Minecraft$TemplateAssetTextInfo.native_setCustomImagePath(this.nativeRef, p0);
       return;
    }
    public void setTextMarker(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateAssetTextInfo.class, "3")) {
          return;
       }
       Minecraft$TemplateAssetTextInfo.native_setTextMarker(this.nativeRef, p0);
       return;
    }
}
