package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$d;
import erd.g;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveAudienceAdNeoPendantPresenter$d implements g	// class@000969
{
    public final LiveAudienceAdNeoPendantPresenter b;

    public void LiveAudienceAdNeoPendantPresenter$d(LiveAudienceAdNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter$d.class, "1")) {
       }else if(p0.shouldHidePendent()){
          this.b.e9();
       }else {
          this.b.c9();
       }
       return;
    }
}
