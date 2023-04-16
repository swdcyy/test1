package com.kwai.live.gzone.bridge.a$a;
import java.lang.Runnable;
import com.kwai.live.gzone.bridge.a;
import com.kwai.feature.api.platform.bridge.beans.JsPageWXMiniProgramParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fu5.d;
import f55.c;
import com.kwai.bridge.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class a$a implements Runnable	// class@000c74
{
    public final JsPageWXMiniProgramParams b;
    public final a c;

    public void a$a(a p0,JsPageWXMiniProgramParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       d uod = a.c(d.class);
       if (uod != null) {
          try{
             uod.y0(this.b);
          }catch(com.kwai.bridge.exception.BridgeInvokeException e0){
             b.I(LiveLogTag.GZONE, "openWechatLivelink", e0);
          }
       }
    }
}
