package com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchPoint;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Number;

public final class Minecraft$MagicTouchPoint extends ModelBase	// class@000a5e
{

    public void Minecraft$MagicTouchPoint(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$MagicTouchPoint(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$MagicTouchPoint native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setTime(long p0,double p1);
    public static native void native_setTouchEvent(long p0,int p1);
    public static native void native_setTouchX(long p0,float p1);
    public static native void native_setTouchY(long p0,float p1);
    public static native double native_time(long p0);
    public static native float native_touchX(long p0);
    public static native float native_touchY(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$MagicTouchPoint.class, "1")) {
          return;
       }
       Minecraft$MagicTouchPoint.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$MagicTouchPoint clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchPoint.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$MagicTouchPoint.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setTime(double p0){
       Minecraft$MagicTouchPoint magicTouchPo = Minecraft$MagicTouchPoint.class;
       if (PatchProxy.isSupport(magicTouchPo) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, magicTouchPo, "4")) {
          return;
       }
       Minecraft$MagicTouchPoint.native_setTime(this.nativeRef, p0);
       return;
    }
    public void setTouchEvent(int p0){
       Minecraft$MagicTouchPoint magicTouchPo = Minecraft$MagicTouchPoint.class;
       if (PatchProxy.isSupport(magicTouchPo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, magicTouchPo, "9")) {
          return;
       }
       Minecraft$MagicTouchPoint.native_setTouchEvent(this.nativeRef, p0);
       return;
    }
    public void setTouchX(float p0){
       Minecraft$MagicTouchPoint magicTouchPo = Minecraft$MagicTouchPoint.class;
       if (PatchProxy.isSupport(magicTouchPo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, magicTouchPo, "6")) {
          return;
       }
       Minecraft$MagicTouchPoint.native_setTouchX(this.nativeRef, p0);
       return;
    }
    public void setTouchY(float p0){
       Minecraft$MagicTouchPoint magicTouchPo = Minecraft$MagicTouchPoint.class;
       if (PatchProxy.isSupport(magicTouchPo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, magicTouchPo, "8")) {
          return;
       }
       Minecraft$MagicTouchPoint.native_setTouchY(this.nativeRef, p0);
       return;
    }
    public double time(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchPoint.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$MagicTouchPoint.native_time(this.nativeRef);
    }
    public float touchX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchPoint.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$MagicTouchPoint.native_touchX(this.nativeRef);
    }
    public float touchY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$MagicTouchPoint.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$MagicTouchPoint.native_touchY(this.nativeRef);
    }
}
