package com.kwai.video.minecraft.model.nano.Minecraft$EffectBasicAdjustValues;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec3f;
import com.kwai.video.minecraft.model.nano.Minecraft$BasicAdjustCurvePoints;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$EffectBasicAdjustValues extends ModelBase	// class@000a4e
{

    public void Minecraft$EffectBasicAdjustValues(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$EffectBasicAdjustValues(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native Minecraft$Vec3f native_blueHsl(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$EffectBasicAdjustValues native_clone(long p0);
    public static native Minecraft$BasicAdjustCurvePoints native_curvePoints(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$Vec3f native_greenHsl(long p0);
    public static native Minecraft$Vec3f native_orangeHsl(long p0);
    public static native Minecraft$Vec3f native_purpleHsl(long p0);
    public static native Minecraft$Vec3f native_redHsl(long p0);
    public static native void native_setBlueHsl(long p0,Minecraft$Vec3f p1);
    public static native void native_setCurvePoints(long p0,Minecraft$BasicAdjustCurvePoints p1);
    public static native void native_setGreenHsl(long p0,Minecraft$Vec3f p1);
    public static native void native_setOrangeHsl(long p0,Minecraft$Vec3f p1);
    public static native void native_setPurpleHsl(long p0,Minecraft$Vec3f p1);
    public static native void native_setRedHsl(long p0,Minecraft$Vec3f p1);
    public static native void native_setYellowHsl(long p0,Minecraft$Vec3f p1);
    public static native Minecraft$Vec3f native_yellowHsl(long p0);
    public Minecraft$Vec3f blueHsl(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_blueHsl(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$EffectBasicAdjustValues.class, "1")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$EffectBasicAdjustValues clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$BasicAdjustCurvePoints curvePoints(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_curvePoints(this.nativeRef);
    }
    public Minecraft$Vec3f greenHsl(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_greenHsl(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$Vec3f orangeHsl(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_orangeHsl(this.nativeRef);
    }
    public Minecraft$Vec3f purpleHsl(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_purpleHsl(this.nativeRef);
    }
    public Minecraft$Vec3f redHsl(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_redHsl(this.nativeRef);
    }
    public void setBlueHsl(Minecraft$Vec3f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "10")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setBlueHsl(this.nativeRef, p0);
       return;
    }
    public void setCurvePoints(Minecraft$BasicAdjustCurvePoints p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "16")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setCurvePoints(this.nativeRef, p0);
       return;
    }
    public void setGreenHsl(Minecraft$Vec3f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "12")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setGreenHsl(this.nativeRef, p0);
       return;
    }
    public void setOrangeHsl(Minecraft$Vec3f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "4")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setOrangeHsl(this.nativeRef, p0);
       return;
    }
    public void setPurpleHsl(Minecraft$Vec3f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "14")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setPurpleHsl(this.nativeRef, p0);
       return;
    }
    public void setRedHsl(Minecraft$Vec3f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "6")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setRedHsl(this.nativeRef, p0);
       return;
    }
    public void setYellowHsl(Minecraft$Vec3f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$EffectBasicAdjustValues.class, "8")) {
          return;
       }
       Minecraft$EffectBasicAdjustValues.native_setYellowHsl(this.nativeRef, p0);
       return;
    }
    public Minecraft$Vec3f yellowHsl(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EffectBasicAdjustValues.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EffectBasicAdjustValues.native_yellowHsl(this.nativeRef);
    }
}
