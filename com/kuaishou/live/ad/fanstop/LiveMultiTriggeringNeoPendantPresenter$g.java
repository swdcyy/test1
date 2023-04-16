package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$g;
import erd.g;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class LiveMultiTriggeringNeoPendantPresenter$g implements g	// class@00098c
{
    public final LiveMultiTriggeringNeoPendantPresenter b;

    public void LiveMultiTriggeringNeoPendantPresenter$g(LiveMultiTriggeringNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiTriggeringNeoPendantPresenter$g.class, "1")) {
       }else {
          j0.b("LiveMultiTriggeringNeoPendantPresenter", "Request neo status failed", p0);
          this.b.X8();
       }
       return;
    }
}
