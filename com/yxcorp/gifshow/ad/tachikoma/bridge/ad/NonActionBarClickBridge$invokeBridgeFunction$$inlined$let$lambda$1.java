package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.NonActionBarClickBridge;
import mxb.u;
import org.json.JSONObject;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;

public final class NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1 implements AdDataWrapper$AdLogParamAppender	// class@001816
{
    public final u $actionBarClickProcessor$inlined;
    public final JSONObject $data$inlined;
    public final int $itemClickType$inlined;
    public final NonActionBarClickBridge this$0;

    public void NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1(NonActionBarClickBridge p0,u p1,int p2,JSONObject p3){
       this.this$0 = p0;
       this.$actionBarClickProcessor$inlined = p1;
       this.$itemClickType$inlined = p2;
       this.$data$inlined = p3;
       super();
    }
    public final void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       p0.X2 = this.$data$inlined.optInt("businessSceneType");
       PatchProxy.onMethodExit(NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1.class, "1");
       return;
    }
}
