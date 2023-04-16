package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$b;
import qh7.b;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import java.lang.String;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;

public final class LiveHouseConsultPendantPresenter$b implements b	// class@00076d
{
    public final LiveHouseConsultPendantPresenter a;
    public final String b;

    public void LiveHouseConsultPendantPresenter$b(LiveHouseConsultPendantPresenter p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "result");
       if (p0.a != 200) {
          LiveHouseConsultPendantPresenter$b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(this.b, ta, LiveHouseConsultPendantPresenter.class, "15")) {
             s.n(a1.p(R.string.arg_RES_7f103ce2), 0);
          }
       }
       return;
    }
}
