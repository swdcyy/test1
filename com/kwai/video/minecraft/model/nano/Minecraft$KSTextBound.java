package com.kwai.video.minecraft.model.nano.Minecraft$KSTextBound;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec3f;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$KSTextBound extends ModelBase	// class@000a57
{

    public void Minecraft$KSTextBound(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$KSTextBound(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$KSTextBound native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$Vec3f native_localToWorldScaling(long p0);
    public static native Minecraft$Vec2f native_size(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$KSTextBound.class, "1")) {
          return;
       }
       Minecraft$KSTextBound.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$KSTextBound clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextBound.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextBound.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$Vec3f localToWorldScaling(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextBound.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextBound.native_localToWorldScaling(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$Vec2f size(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSTextBound.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSTextBound.native_size(this.nativeRef);
    }
}
