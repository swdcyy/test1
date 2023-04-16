package com.kwai.video.minecraft.model.nano.Minecraft$DefinitionParam;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;

public final class Minecraft$DefinitionParam extends ModelBase	// class@000a4b
{

    public void Minecraft$DefinitionParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$DefinitionParam(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$DefinitionParam native_clone(long p0);
    public static native float native_definitionIntensity(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setDefinitionIntensity(long p0,float p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$DefinitionParam.class, "1")) {
          return;
       }
       Minecraft$DefinitionParam.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$DefinitionParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$DefinitionParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$DefinitionParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float definitionIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$DefinitionParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$DefinitionParam.native_definitionIntensity(this.nativeRef);
    }
    public native final long native_create();
    public void setDefinitionIntensity(float p0){
       Minecraft$DefinitionParam uDefinitionP = Minecraft$DefinitionParam.class;
       if (PatchProxy.isSupport(uDefinitionP) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uDefinitionP, "4")) {
          return;
       }
       Minecraft$DefinitionParam.native_setDefinitionIntensity(this.nativeRef, p0);
       return;
    }
}
