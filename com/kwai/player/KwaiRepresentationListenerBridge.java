package com.kwai.player.KwaiRepresentationListenerBridge;
import java.lang.Object;
import com.kwai.video.player.IKwaiRepresentationListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Number;
import java.util.List;

public class KwaiRepresentationListenerBridge	// class@0012d7
{

    public void KwaiRepresentationListenerBridge(){
       super();
    }
    public static IKwaiRepresentationListener getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiRepresentationListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static void onRepresentationSelected(Object p0,int p1,boolean p2){
       if (PatchProxy.isSupport(KwaiRepresentationListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, KwaiRepresentationListenerBridge.class, "3")) {
          return;
       }
       p0 = KwaiRepresentationListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onRepresentationSelected(p1, p2);
       return;
    }
    public static int onSelectRepresentation(Object p0,ArrayList p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KwaiRepresentationListenerBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p0 = KwaiRepresentationListenerBridge.getListener(p0);
       if (p0 == null) {
          return 0;
       }
       return p0.onSelectRepresentation(p1);
    }
    public static void representationChangeEnd(Object p0,int p1,boolean p2){
       if (PatchProxy.isSupport(KwaiRepresentationListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, KwaiRepresentationListenerBridge.class, "5")) {
          return;
       }
       p0 = KwaiRepresentationListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.representationChangeEnd(p1, p2);
       return;
    }
    public static void representationChangeStart(Object p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiRepresentationListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, KwaiRepresentationListenerBridge.class, "4")) {
          return;
       }
       p0 = KwaiRepresentationListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.representationChangeStart(p1, p2);
       return;
    }
}
