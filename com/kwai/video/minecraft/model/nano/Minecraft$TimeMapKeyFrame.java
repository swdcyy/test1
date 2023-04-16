package com.kwai.video.minecraft.model.nano.Minecraft$TimeMapKeyFrame;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Double;

public final class Minecraft$TimeMapKeyFrame extends ModelBase	// class@000a82
{

    public void Minecraft$TimeMapKeyFrame(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TimeMapKeyFrame(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TimeMapKeyFrame native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$Vec2f native_lastBazierOut(long p0);
    public static native double native_mappedTrackAssetPts(long p0);
    public static native Minecraft$Vec2f native_nextBazierIn(long p0);
    public static native double native_originalTrackAssetPts(long p0);
    public static native void native_setIsHold(long p0,boolean p1);
    public static native void native_setLastBazierOut(long p0,Minecraft$Vec2f p1);
    public static native void native_setMappedTrackAssetPts(long p0,double p1);
    public static native void native_setNextBazierIn(long p0,Minecraft$Vec2f p1);
    public static native void native_setOriginalTrackAssetPts(long p0,double p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TimeMapKeyFrame.class, "1")) {
          return;
       }
       Minecraft$TimeMapKeyFrame.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TimeMapKeyFrame clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapKeyFrame.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeMapKeyFrame.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$Vec2f lastBazierOut(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapKeyFrame.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeMapKeyFrame.native_lastBazierOut(this.nativeRef);
    }
    public double mappedTrackAssetPts(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapKeyFrame.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TimeMapKeyFrame.native_mappedTrackAssetPts(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$Vec2f nextBazierIn(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapKeyFrame.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeMapKeyFrame.native_nextBazierIn(this.nativeRef);
    }
    public double originalTrackAssetPts(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapKeyFrame.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TimeMapKeyFrame.native_originalTrackAssetPts(this.nativeRef);
    }
    public void setIsHold(boolean p0){
       Minecraft$TimeMapKeyFrame timeMapKeyFr = Minecraft$TimeMapKeyFrame.class;
       if (PatchProxy.isSupport(timeMapKeyFr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timeMapKeyFr, "7")) {
          return;
       }
       Minecraft$TimeMapKeyFrame.native_setIsHold(this.nativeRef, p0);
       return;
    }
    public void setLastBazierOut(Minecraft$Vec2f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TimeMapKeyFrame.class, "9")) {
          return;
       }
       Minecraft$TimeMapKeyFrame.native_setLastBazierOut(this.nativeRef, p0);
       return;
    }
    public void setMappedTrackAssetPts(double p0){
       Minecraft$TimeMapKeyFrame timeMapKeyFr = Minecraft$TimeMapKeyFrame.class;
       if (PatchProxy.isSupport(timeMapKeyFr) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, timeMapKeyFr, "6")) {
          return;
       }
       Minecraft$TimeMapKeyFrame.native_setMappedTrackAssetPts(this.nativeRef, p0);
       return;
    }
    public void setNextBazierIn(Minecraft$Vec2f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TimeMapKeyFrame.class, "11")) {
          return;
       }
       Minecraft$TimeMapKeyFrame.native_setNextBazierIn(this.nativeRef, p0);
       return;
    }
    public void setOriginalTrackAssetPts(double p0){
       Minecraft$TimeMapKeyFrame timeMapKeyFr = Minecraft$TimeMapKeyFrame.class;
       if (PatchProxy.isSupport(timeMapKeyFr) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, timeMapKeyFr, "4")) {
          return;
       }
       Minecraft$TimeMapKeyFrame.native_setOriginalTrackAssetPts(this.nativeRef, p0);
       return;
    }
}
