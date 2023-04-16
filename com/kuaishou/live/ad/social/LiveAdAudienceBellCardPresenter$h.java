package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$h;
import erd.g;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveAdAudienceBellCardPresenter$h implements g	// class@0009f4
{
    public final LiveAdAudienceBellCardPresenter b;

    public void LiveAdAudienceBellCardPresenter$h(LiveAdAudienceBellCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdAudienceBellCardPresenter$h.class, "1")) {
       }else {
          a.o(p0, "isPure");
          if (p0.booleanValue()) {
             this.b.V8(false);
          }
       }
       return;
    }
}
