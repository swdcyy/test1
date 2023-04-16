package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$c;
import aq5.b;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import aq5.d;
import fq5.b;

public final class LiveHouseConsultPendantPresenter$c implements b	// class@00076e
{
    public final LiveHouseConsultPendantPresenter b;

    public void LiveHouseConsultPendantPresenter$c(LiveHouseConsultPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       boolean b;
       LiveHouseConsultPendantPresenter$c uoc = LiveHouseConsultPendantPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       LiveHouseConsultPendantPresenter$c tb = this.b;
       Objects.requireNonNull(tb);
       LiveHouseConsultPendantPresenter$c obj = PatchProxy.apply(null, tb, LiveHouseConsultPendantPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          LiveHouseConsultPendantPresenter s = tb.s;
          a.m(s);
          d uod = s.A0();
          a.o(uod, "mLiveContext!!.bizRelationManager");
          LiveHouseConsultPendantPresenter h = tb.H;
          int len = h.length;
          boolean b1 = false;
          int i = 0;
          while (i < len) {
             object oobject = h[i];
             b1 = (b1 || uod.r2(oobject))? true: false;
             i = i + 1;
          }
          b = b1;
       }
       obj = this.b;
       if (obj.G == b) {
          return;
       }else {
          obj.G = b;
          if (obj.N != null) {
             obj.b9(b);
          }
          return;
       }
    }
}
