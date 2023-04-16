package com.kwai.video.minecraft.model.nano.Minecraft$TimeMapSpeedCurvePoints;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$TimeMapSpeedCurvePoints extends ModelBase	// class@000a85
{

    public void Minecraft$TimeMapSpeedCurvePoints(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TimeMapSpeedCurvePoints(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TimeMapSpeedCurvePoints native_clone(long p0);
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TimeMapSpeedCurvePoints.class, "1")) {
          return;
       }
       Minecraft$TimeMapSpeedCurvePoints.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TimeMapSpeedCurvePoints clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapSpeedCurvePoints.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeMapSpeedCurvePoints.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
}
