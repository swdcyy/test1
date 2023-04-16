package com.kwai.live.gzone.rn.LiveGzoneKRNHalfScreenWebViewBridge$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import y67.k;
import qrd.l1;

public final class LiveGzoneKRNHalfScreenWebViewBridge$b implements Runnable	// class@000df1
{
    public final String b;

    public void LiveGzoneKRNHalfScreenWebViewBridge$b(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneKRNHalfScreenWebViewBridge$b.class, "1")) {
          return;
       }
       k ok = new k();
       ok.a = this.b;
       RxBus.f.b(ok);
       return;
    }
}
