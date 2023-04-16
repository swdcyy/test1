package com.kwai.player.KwaiOnVideoRenderListenerBridge;
import java.lang.Object;
import com.kwai.video.player.IKwaiMediaPlayer$OnVideoRenderListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Long;

public class KwaiOnVideoRenderListenerBridge	// class@0012d2
{

    public void KwaiOnVideoRenderListenerBridge(){
       super();
    }
    public static IKwaiMediaPlayer$OnVideoRenderListener getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiOnVideoRenderListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static void onVideoFrameRender(Object p0,long p1){
       KwaiOnVideoRenderListenerBridge kwaiOnVideoR = KwaiOnVideoRenderListenerBridge.class;
       if (PatchProxy.isSupport(kwaiOnVideoR) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, kwaiOnVideoR, "2")) {
          return;
       }
       p0 = KwaiOnVideoRenderListenerBridge.getListener(p0);
       if (p0 != null) {
          p0.onVideoFrameRender(p1);
       }
       return;
    }
}
