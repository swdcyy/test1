package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$i;
import erd.g;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import oy.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.house.live.prerequest.a$b;

public final class LiveHouseConsultPendantPresenter$i implements g	// class@000774
{
    public final LiveHouseConsultPendantPresenter b;
    public final a c;
    public final long d;

    public void LiveHouseConsultPendantPresenter$i(LiveHouseConsultPendantPresenter p0,a p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$i.class, "1")) {
       }else {
          LiveHouseConsultPendantPresenter$i tc = this.c;
          tc.a0((System.currentTimeMillis() - this.d));
          tc.b0(0);
          int errorCode = (v2 = p0 instanceof KwaiException)? p0.getErrorCode(): 0;
          tc.E(errorCode);
          KwaiException mErrorMessag = (v2)? p0.mErrorMessage: p0.getMessage();
          tc.F(mErrorMessag);
          tc.r();
          this.b.S8().c = System.currentTimeMillis();
          this.b.S8().e = false;
          this.b.S8().d = p0.getMessage();
          p0 = this.b;
          p0.V8(p0.S8());
          p0 = this.b;
          if (p0.z != null) {
             p0.P8();
          }
       }
       return;
    }
}
