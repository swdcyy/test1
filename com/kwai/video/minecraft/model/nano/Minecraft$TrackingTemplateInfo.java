package com.kwai.video.minecraft.model.nano.Minecraft$TrackingTemplateInfo;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$TrackingTemplateInfo extends ModelBase	// class@000a89
{

    public void Minecraft$TrackingTemplateInfo(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TrackingTemplateInfo(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TrackingTemplateInfo native_clone(long p0);
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TrackingTemplateInfo.class, "1")) {
          return;
       }
       Minecraft$TrackingTemplateInfo.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TrackingTemplateInfo clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TrackingTemplateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TrackingTemplateInfo.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
}
