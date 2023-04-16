package com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$ColorFilterParam extends MutableEffect	// class@000a48
{

    public void Minecraft$ColorFilterParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_ColorFilterParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$ColorFilterParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_ColorFilterParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$ColorFilterParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_intensity(long p0);
    public static native ArrayList native_resourceFiles(long p0);
    public static native String native_resourceFiles_getItem(long p0,int p1);
    public static native int native_resourceFiles_size(long p0);
    public static native void native_setId(long p0,long p1);
    public static native void native_setIntensity(long p0,double p1);
    public static native void native_setResourceFiles(long p0,ArrayList p1);
    public static native void native_setType(long p0,int p1);
    public static native int native_type(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$ColorFilterParam.class, "1")) {
          return;
       }
       Minecraft$ColorFilterParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$ColorFilterParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ColorFilterParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ColorFilterParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double intensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ColorFilterParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$ColorFilterParam.native_intensity(this.nativeRef);
    }
    public native final long native_create();
    public ImmutableArray resourceFiles(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ColorFilterParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$ColorFilterParam.native_resourceFiles(this.nativeRef), String.class);
    }
    public String resourceFiles(int p0){
       Minecraft$ColorFilterParam uColorFilter = Minecraft$ColorFilterParam.class;
       if (PatchProxy.isSupport(uColorFilter)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uColorFilter, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$ColorFilterParam.native_resourceFiles_getItem(this.nativeRef, p0);
    }
    public int resourceFilesSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ColorFilterParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$ColorFilterParam.native_resourceFiles_size(this.nativeRef);
    }
    public void setId(long p0){
       Minecraft$ColorFilterParam uColorFilter = Minecraft$ColorFilterParam.class;
       if (PatchProxy.isSupport(uColorFilter) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uColorFilter, "7")) {
          return;
       }
       Minecraft$ColorFilterParam.native_setId(this.nativeRef, p0);
       return;
    }
    public void setIntensity(double p0){
       Minecraft$ColorFilterParam uColorFilter = Minecraft$ColorFilterParam.class;
       if (PatchProxy.isSupport(uColorFilter) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uColorFilter, "6")) {
          return;
       }
       Minecraft$ColorFilterParam.native_setIntensity(this.nativeRef, p0);
       return;
    }
    public void setResourceFiles(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ColorFilterParam.class, "9")) {
          return;
       }
       Minecraft$ColorFilterParam.native_setResourceFiles(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setType(int p0){
       Minecraft$ColorFilterParam uColorFilter = Minecraft$ColorFilterParam.class;
       if (PatchProxy.isSupport(uColorFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uColorFilter, "4")) {
          return;
       }
       Minecraft$ColorFilterParam.native_setType(this.nativeRef, p0);
       return;
    }
    public int type(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ColorFilterParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$ColorFilterParam.native_type(this.nativeRef);
    }
}
