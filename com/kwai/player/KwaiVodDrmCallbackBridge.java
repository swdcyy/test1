package com.kwai.player.KwaiVodDrmCallbackBridge;
import java.lang.Object;
import com.kwai.video.player.IKwaiVodDrmCallback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Integer;

public class KwaiVodDrmCallbackBridge	// class@0012db
{

    public void KwaiVodDrmCallbackBridge(){
       super();
    }
    public static IKwaiVodDrmCallback getCallback(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiVodDrmCallbackBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static void onGetDrmMainKey(Object p0,String p1,int p2){
       if (PatchProxy.isSupport(KwaiVodDrmCallbackBridge.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, KwaiVodDrmCallbackBridge.class, "2")) {
          return;
       }
       p0 = KwaiVodDrmCallbackBridge.getCallback(p0);
       if (p0 == null) {
          return;
       }
       p0.onGetDrmMainKey(p1, p2);
       return;
    }
}
