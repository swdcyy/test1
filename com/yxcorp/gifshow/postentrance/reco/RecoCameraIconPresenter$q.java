package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$q;
import erd.g;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import w16.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import lnc.a1;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.reco.b;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$a;

public final class RecoCameraIconPresenter$q implements g	// class@00106c
{
    public final RecoCameraIconPresenter b;

    public void RecoCameraIconPresenter$q(RecoCameraIconPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$q.class, "1")) {
       }else {
          p0 = p0.a;
          if (p0 == null) {
             p0 = "";
          }
          Object[] objArray = new Object[0];
          g.C().w("RecoCameraIconPresenter", "receive postSessionExitEvent, scheme: "+p0, objArray);
          this.b.p = a1.k();
          RecoCameraIconPresenter v = this.b.v;
          if (v != null) {
             k1.m(v);
          }
          p0 = CustomEvent.newBuilder().setCustomKey("leavePostSession").setCustomValue(p0).build();
          a.o(p0, "eveCustomEvent");
          EveManagerWrapper.e.n(p0);
          p0.v = new b(this);
          k1.r(this.b.v, RecoCameraIconPresenter.I.a());
       }
       return;
    }
}
