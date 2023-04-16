package com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;

public final class Minecraft$TransitionParam extends ModelBase	// class@000a8d
{

    public void Minecraft$TransitionParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TransitionParam(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TransitionParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_duration(long p0);
    public static native void native_setDuration(long p0,double p1);
    public static native void native_setType(long p0,int p1);
    public static native int native_type(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TransitionParam.class, "1")) {
          return;
       }
       Minecraft$TransitionParam.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TransitionParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TransitionParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TransitionParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double duration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TransitionParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TransitionParam.native_duration(this.nativeRef);
    }
    public native final long native_create();
    public void setDuration(double p0){
       Minecraft$TransitionParam transitionPa = Minecraft$TransitionParam.class;
       if (PatchProxy.isSupport(transitionPa) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, transitionPa, "6")) {
          return;
       }
       Minecraft$TransitionParam.native_setDuration(this.nativeRef, p0);
       return;
    }
    public void setType(int p0){
       Minecraft$TransitionParam transitionPa = Minecraft$TransitionParam.class;
       if (PatchProxy.isSupport(transitionPa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, transitionPa, "4")) {
          return;
       }
       Minecraft$TransitionParam.native_setType(this.nativeRef, p0);
       return;
    }
    public int type(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TransitionParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TransitionParam.native_type(this.nativeRef);
    }
}
