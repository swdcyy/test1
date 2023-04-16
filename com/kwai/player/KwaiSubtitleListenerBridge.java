package com.kwai.player.KwaiSubtitleListenerBridge;
import java.lang.Object;
import com.kwai.video.player.IKwaiSubtitleListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;

public class KwaiSubtitleListenerBridge	// class@0012da
{

    public void KwaiSubtitleListenerBridge(){
       super();
    }
    public static IKwaiSubtitleListener getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiSubtitleListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static void onSelectedSubtitleStatusChange(Object p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiSubtitleListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, KwaiSubtitleListenerBridge.class, "3")) {
          return;
       }
       p0 = KwaiSubtitleListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onSelectedSubtitleStatusChange(p1, p2);
       return;
    }
    public static void onSubtitleCues(Object p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KwaiSubtitleListenerBridge.class, "4")) {
          return;
       }
       p0 = KwaiSubtitleListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onSubtitleCues(p1);
       return;
    }
    public static void onSubtitleUpdate(Object p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KwaiSubtitleListenerBridge.class, "2")) {
          return;
       }
       p0 = KwaiSubtitleListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onSubtitleUpdate(p1);
       return;
    }
}
