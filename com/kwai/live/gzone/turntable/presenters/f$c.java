package com.kwai.live.gzone.turntable.presenters.f$c;
import erd.g;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import y43.a;
import fq5.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import u37.h;
import u37.e;
import cjd.e;
import erd.o;
import o77.m;
import com.kwai.live.gzone.turntable.presenters.j;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f$c implements g	// class@000e64
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b;
          Objects.requireNonNull(p0);
          f uof = f.class;
          if (!PatchProxy.applyVoid(null, p0, uof, "12")) {
             String liveStreamId = p0.p.m.getLiveStreamId();
             t ot = PatchProxy.applyOneRefs(liveStreamId, p0, uof, "13");
             if (ot != PatchProxyResult.class) {
             }else {
                String[] stringArray = new String[]{"liveStreamId",liveStreamId,"type","network"};
                LiveGzoneTurntableLogger.f("loadPrizeList", stringArray);
                ot = e.d().c(liveStreamId).map(new e());
             }
             p0.X7(ot.subscribe(new m(p0, liveStreamId), new j(p0)));
          }
       }
       return;
    }
}
