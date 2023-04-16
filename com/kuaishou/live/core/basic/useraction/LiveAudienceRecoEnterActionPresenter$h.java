package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$h;
import erd.g;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y12.b;

public final class LiveAudienceRecoEnterActionPresenter$h implements g	// class@0008d9
{
    public final LiveAudienceRecoEnterActionPresenter b;

    public void LiveAudienceRecoEnterActionPresenter$h(LiveAudienceRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecoEnterActionPresenter$h.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.w.a("liveFloatingWindowShowing");
          }
       }
       return;
    }
}
