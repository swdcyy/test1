package com.kwai.video.westeros.veplugin.VEPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import com.kwai.video.westeros.veplugin.ColorPickResult;
import com.kwai.video.westeros.veplugin.VEPlugin$OnFrameColorListener;
import java.lang.Boolean;
import java.lang.Float;
import com.kwai.video.westeros.veplugin.VEPlugin$OnDirtyLensDetectionListener;
import java.lang.Long;
import com.kwai.video.westeros.models.VEFeatureType;
import com.kwai.video.westeros.models.VEFeatureParams;
import com.google.protobuf.AbstractMessageLite;

public class VEPlugin extends WesterosPlugin	// class@001100
{
    public WeakReference dirtyLensDetectListener;
    public WeakReference frameColorListener;
    public Object frameColorPickListenerLock;
    public Object listenerLock;

    static {
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("tensorflow-lite");
       WesterosSoLoader.loadLibrary("visionengine");
       WesterosSoLoader.loadLibrary("ykit");
       WesterosSoLoader.loadLibrary("veplugin");
    }
    public void VEPlugin(){
       super();
       this.listenerLock = new Object();
       this.frameColorPickListenerLock = new Object();
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, VEPlugin.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateVEPlugin();
    }
    public native final long nativeCreateVEPlugin();
    public native final void nativeDestroVEPlugin(long p0);
    public native final void nativeSetFeatureEnabled(long p0,int p1,boolean p2,byte[] p3);
    public final void onColorPickResult(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VEPlugin.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VEPlugin.class, "5")) {
          return;
       }
       VEPlugin tframeColorP = this.frameColorPickListenerLock;
       _monitor_enter(tframeColorP);
       VEPlugin tframeColorL = this.frameColorListener;
       if (tframeColorL != null && tframeColorL.get() != null) {
          this.frameColorListener.get().onFrameColor(new ColorPickResult(p0, p1, p2, p3));
       }
       _monitor_exit(tframeColorP);
       return;
    }
    public final void onDirtyResult(boolean p0,float p1){
       VEPlugin vEPlugin = VEPlugin.class;
       if (PatchProxy.isSupport(vEPlugin) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Float.valueOf(p1), this, vEPlugin, "4")) {
          return;
       }
       vEPlugin = this.listenerLock;
       _monitor_enter(vEPlugin);
       VEPlugin tdirtyLensDe = this.dirtyLensDetectListener;
       if (tdirtyLensDe != null && tdirtyLensDe.get() != null) {
          this.dirtyLensDetectListener.get().onDirtyDetectionResult(p0, p1);
       }
       _monitor_exit(vEPlugin);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, VEPlugin.class, "6")) {
          return;
       }
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       VEPlugin vEPlugin = VEPlugin.class;
       if (PatchProxy.isSupport(vEPlugin) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, vEPlugin, "8")) {
          return;
       }
       this.nativeDestroVEPlugin(p0);
       return;
    }
    public void setDirtyLensDetectListener(VEPlugin$OnDirtyLensDetectionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VEPlugin.class, "2")) {
          return;
       }
       VEPlugin tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       this.dirtyLensDetectListener = new WeakReference(p0);
       _monitor_exit(tlistenerLoc);
       return;
    }
    public void setFeatureEnabledAndParams(VEFeatureType p0,boolean p1,VEFeatureParams p2){
       if (PatchProxy.isSupport(VEPlugin.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, VEPlugin.class, "1")) {
          return;
       }
       byte[] uobyteArray = (p2 != null)? p2.toByteArray(): 0;
       this.nativeSetFeatureEnabled(this.nativePlugin, p0.getNumber(), p1, uobyteArray);
       return;
    }
    public void setFrameColorPickListener(VEPlugin$OnFrameColorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VEPlugin.class, "3")) {
          return;
       }
       VEPlugin tframeColorP = this.frameColorPickListenerLock;
       _monitor_enter(tframeColorP);
       this.frameColorListener = new WeakReference(p0);
       _monitor_exit(tframeColorP);
       return;
    }
}
