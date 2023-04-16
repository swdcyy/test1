package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$g;
import erd.g;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import java.lang.Object;
import mg0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;

public final class LiveHouseConsultPendantPresenter$g implements g	// class@000772
{
    public final LiveHouseConsultPendantPresenter b;

    public void LiveHouseConsultPendantPresenter$g(LiveHouseConsultPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$g.class, "1")) {
       }else if(p0.b != null){
          this.b.Z8();
       }else {
          LiveHouseConsultPendantPresenter$g tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveHouseConsultPendantPresenter.class, "26")) {
             HouseConsultPendantMessage houseConsult = tb.R8();
             boolean b = true;
             int i = (houseConsult != null && tb.L != null)? 1: 0;
             if (i) {
                tb.O = b;
                if (houseConsult != null) {
                   houseConsult.setMReservedStatus(p0.a());
                }
                tb.v = p0.a();
                tb.P8();
             }
          }
       }
       return;
    }
}
