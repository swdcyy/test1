package com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor;
import com.kwai.camerasdk.preprocess.AbstractGlProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.camerasdk.models.VideoFrameAttributes;
import java.util.List;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor$OnFaceActionListener;
import java.lang.StringBuilder;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor$OnFacesArrayListener;
import l65.a;

public class WesterosFrameAttributesDumpProcessor extends AbstractGlProcessor	// class@0010b7
{
    public WesterosFrameAttributesDumpProcessor$OnFaceActionListener faceActionListener;
    public Object faceActionListenerLock;
    public WesterosFrameAttributesDumpProcessor$OnFacesArrayListener facesArrayListener;
    public Object facesArrayListenerLock;
    public Object listenerLock;
    public static final String TAG = "FrameAttributesDump";

    public void WesterosFrameAttributesDumpProcessor(){
       super();
       this.listenerLock = new Object();
       this.facesArrayListenerLock = new Object();
       this.faceActionListenerLock = new Object();
    }
    public long createNativeResource(){
       Object obj = PatchProxy.apply(null, this, WesterosFrameAttributesDumpProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeInit();
    }
    public native final long nativeInit();
    public native final void nativeSetDumpPath(long p0,String p1);
    public native final void nativeStart(long p0);
    public native final void nativeStop(long p0);
    public final void onReceiveFaceActionData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WesterosFrameAttributesDumpProcessor.class, "6")) {
          return;
       }
       try{
          VideoFrameAttributes videoFrameAt = VideoFrameAttributes.parseFrom(p0);
          if (videoFrameAt != null) {
             WesterosFrameAttributesDumpProcessor tWesterosFra = this.faceActionListenerLock;
             _monitor_enter(tWesterosFra);
             WesterosFrameAttributesDumpProcessor tWesterosFra1 = this.faceActionListener;
             if (tWesterosFra1 != null) {
                tWesterosFra1.onFaceAction(videoFrameAt.getFaceActionList());
             }
             _monitor_exit(tWesterosFra);
          }
       }catch(java.lang.Exception e3){
          "Parse attributes failed: "+e3;
       }
       return;
    }
    public final void onReceiveVideoFrameAttributes(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WesterosFrameAttributesDumpProcessor.class, "5")) {
          return;
       }
       try{
          VideoFrameAttributes videoFrameAt = VideoFrameAttributes.parseFrom(p0);
          if (videoFrameAt != null) {
             WesterosFrameAttributesDumpProcessor tWesterosFra = this.facesArrayListenerLock;
             _monitor_enter(tWesterosFra);
             WesterosFrameAttributesDumpProcessor tWesterosFra1 = this.facesArrayListener;
             if (tWesterosFra1 != null) {
                tWesterosFra1.onFacesArray(videoFrameAt.getFacesList());
             }
             _monitor_exit(tWesterosFra);
          }
       }catch(java.lang.Exception e3){
          "Parse attributes failed: "+e3;
       }
       return;
    }
    public void setDumpPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WesterosFrameAttributesDumpProcessor.class, "4")) {
          return;
       }
       this.nativeSetDumpPath(this.nativeProcessor, p0);
       return;
    }
    public void setFaceActionListener(WesterosFrameAttributesDumpProcessor$OnFaceActionListener p0){
       WesterosFrameAttributesDumpProcessor tWesterosFra = this.faceActionListenerLock;
       _monitor_enter(tWesterosFra);
       this.faceActionListener = p0;
       _monitor_exit(tWesterosFra);
    }
    public void setFacesArrayListener(WesterosFrameAttributesDumpProcessor$OnFacesArrayListener p0){
       WesterosFrameAttributesDumpProcessor tWesterosFra = this.facesArrayListenerLock;
       _monitor_enter(tWesterosFra);
       this.facesArrayListener = p0;
       _monitor_exit(tWesterosFra);
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, WesterosFrameAttributesDumpProcessor.class, "2")) {
          return;
       }
       this.nativeStart(this.nativeProcessor);
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, WesterosFrameAttributesDumpProcessor.class, "3")) {
          return;
       }
       this.nativeStop(this.nativeProcessor);
       return;
    }
}
