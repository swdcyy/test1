package com.yxcorp.gifshow.camera.record.tab.d$a;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.d;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.LiveStreamStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import tkd.b;
import tkd.d;
import os5.l;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.c;

public class d$a implements g	// class@000f4e
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("LiveTabTagManager", "accept: response"+p0.mStatus, objArray);
          d.a(-1492894991).qf(LiveStreamStatus.parseFrom(p0.mStatus));
          RxBus.f.b(new c(LiveStreamStatus.parseFrom(p0.mStatus)));
       }
       return;
    }
}
