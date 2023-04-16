package com.kwai.player.qosevent.KwaiQosEventInfoListenerBridge;
import java.lang.Object;
import com.kwai.player.qosevent.KwaiQosEventInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.OnQosEventInfoListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;

public class KwaiQosEventInfoListenerBridge	// class@0012fc
{

    public void KwaiQosEventInfoListenerBridge(){
       super();
    }
    public static void OnQosEventInfo(Object p0,KwaiQosEventInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KwaiQosEventInfoListenerBridge.class, "2")) {
          return;
       }
       p0 = KwaiQosEventInfoListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.OnQosEventInfo(p1);
       return;
    }
    public static OnQosEventInfoListener getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiQosEventInfoListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
}
