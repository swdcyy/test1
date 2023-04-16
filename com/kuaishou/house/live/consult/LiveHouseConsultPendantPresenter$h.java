package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$h;
import erd.g;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import oy.a;
import java.lang.Object;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.house.live.prerequest.a$b;
import java.util.Objects;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage$a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Exception;

public final class LiveHouseConsultPendantPresenter$h implements g	// class@000773
{
    public final LiveHouseConsultPendantPresenter b;
    public final a c;
    public final long d;

    public void LiveHouseConsultPendantPresenter$h(LiveHouseConsultPendantPresenter p0,a p1,long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$h.class, "1")) {
       }else {
          LiveHouseConsultPendantPresenter$h tc = this.c;
          tc.a0((System.currentTimeMillis() - this.d));
          tc.b0(1);
          tc.r();
          this.b.S8().c = System.currentTimeMillis();
          tc = this.b;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, LiveHouseConsultPendantPresenter.class, "25") && p0 != null) {
             HouseConsultPendantMessage houseConsult = HouseConsultPendantMessage.Companion.b(p0);
             if (houseConsult != null) {
                tc.a9(houseConsult);
                houseConsult = tc.R8();
                if (houseConsult != null) {
                   tc.O = true;
                   tc.v = houseConsult.getMReservedStatus();
                   tc.P8();
                }
             }
          }
          if (p0.mDataResponse != null) {
             try{
                this.b.S8().d = a.a.q(p0);
             }catch(java.lang.Exception e6){
                e6.printStackTrace();
             }
          }else {
             p0.d = "";
          }
       }
       return;
    }
}
