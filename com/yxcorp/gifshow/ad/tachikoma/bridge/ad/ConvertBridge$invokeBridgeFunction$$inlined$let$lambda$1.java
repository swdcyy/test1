package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ConvertBridge;
import mxb.u;
import org.json.JSONObject;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;

public final class ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1 implements AdDataWrapper$AdLogParamAppender	// class@00180f
{
    public final u $actionBarClickProcessor$inlined;
    public final JSONObject $data$inlined;
    public final ConvertBridge this$0;

    public void ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1(ConvertBridge p0,u p1,JSONObject p2){
       this.this$0 = p0;
       this.$actionBarClickProcessor$inlined = p1;
       this.$data$inlined = p2;
       super();
    }
    public final void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       p0.X2 = this.$data$inlined.optInt("businessSceneType");
       PatchProxy.onMethodExit(ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1.class, "1");
       return;
    }
}
