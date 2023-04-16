package com.kuaishou.live.effect.resource.download.common.o;
import com.kuaishou.live.effect.resource.download.common.MagicGiftNetworkMonitor$a;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import wz2.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$MagicGiftDownloadState;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.List;
import com.kuaishou.android.live.log.b;

public class o implements MagicGiftNetworkMonitor$a	// class@001b45
{
    public final a a;
    public final LiveMagicGiftDownloadController b;

    public void o(LiveMagicGiftDownloadController p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "2")) {
          return;
       }
       if (p0) {
          if (this.b.i == LiveMagicGiftDownloadController$MagicGiftDownloadState.READY) {
             this.a.i(RequestTiming.NETWORK_CHANGED);
             this.a.h(6);
             this.b.f(null, false, this.a);
             b.P(this.b.a, "[onMobileNetworkState]£ºmobile is good, download magic face go>>");
          }
       }else {
          this.b.q();
          b.P(this.b.a, "[onMobileNetworkState]£ºmobile is not good£¬downlaoad magic face fail>>");
       }
       return;
    }
    public void b(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "1")) {
          return;
       }
       if (p0 && this.b.i == LiveMagicGiftDownloadController$MagicGiftDownloadState.READY) {
          this.a.i(RequestTiming.NETWORK_CHANGED);
          this.a.h(6);
          this.b.f(null, false, this.a);
          b.P(this.b.a, "[onWifiNetworkState]£ºwifi is good, download magic face go >>");
       }
       return;
    }
}
