package com.kwai.player.KwaiInjectHttpCallbackBridge;
import java.lang.Object;
import com.kwai.video.player.IKwaiInjectHttpCallback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Integer;
import java.lang.Boolean;

public class KwaiInjectHttpCallbackBridge	// class@0012d1
{

    public void KwaiInjectHttpCallbackBridge(){
       super();
    }
    public static IKwaiInjectHttpCallback getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiInjectHttpCallbackBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static boolean onError(Object p0,int p1){
       KwaiInjectHttpCallbackBridge kwaiInjectHt = KwaiInjectHttpCallbackBridge.class;
       if (PatchProxy.isSupport(kwaiInjectHt)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, kwaiInjectHt, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = KwaiInjectHttpCallbackBridge.getListener(p0);
       if (p0 != null) {
          return p0.onError(p1);
       }else {
          return false;
       }
    }
}
