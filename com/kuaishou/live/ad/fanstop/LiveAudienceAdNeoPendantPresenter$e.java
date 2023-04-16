package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$e;
import erd.g;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class LiveAudienceAdNeoPendantPresenter$e implements g	// class@00096a
{
    public final LiveAudienceAdNeoPendantPresenter b;

    public void LiveAudienceAdNeoPendantPresenter$e(LiveAudienceAdNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter$e.class, "1")) {
       }else {
          j0.b("LiveAudienceAdNeoPendantPresenter", "Unexpected net error ", p0);
          this.b.c9();
       }
       return;
    }
}
