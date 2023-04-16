package com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParamPrivate;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public final class Minecraft$EnhanceFilterParamPrivate extends ModelBase	// class@000a51
{

    public void Minecraft$EnhanceFilterParamPrivate(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$EnhanceFilterParamPrivate(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$EnhanceFilterParamPrivate native_clone(long p0);
    public static native int native_dehazeFilterType(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_enableCorrection(long p0);
    public static native int native_grayFilterType(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$EnhanceFilterParamPrivate.class, "1")) {
          return;
       }
       Minecraft$EnhanceFilterParamPrivate.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$EnhanceFilterParamPrivate clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParamPrivate.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EnhanceFilterParamPrivate.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int dehazeFilterType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParamPrivate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$EnhanceFilterParamPrivate.native_dehazeFilterType(this.nativeRef);
    }
    public boolean enableCorrection(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParamPrivate.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$EnhanceFilterParamPrivate.native_enableCorrection(this.nativeRef);
    }
    public int grayFilterType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParamPrivate.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$EnhanceFilterParamPrivate.native_grayFilterType(this.nativeRef);
    }
    public native final long native_create();
}
