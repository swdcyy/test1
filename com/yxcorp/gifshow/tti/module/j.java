package com.yxcorp.gifshow.tti.module.j;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.LiveStreamStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import java.lang.Enum;
import oe6.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.c;

public class j implements g	// class@001ddc
{

    public void j(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          e.v0(LiveStreamStatus.parseFrom(p0.mStatus).name());
          RxBus.f.b(new c(LiveStreamStatus.parseFrom(p0.mStatus)));
       }
       return;
    }
}
