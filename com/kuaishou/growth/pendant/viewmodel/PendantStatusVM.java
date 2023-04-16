package com.kuaishou.growth.pendant.viewmodel.PendantStatusVM;
import androidx.lifecycle.ViewModel;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$a;
import nsd.u;
import tf0.a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Objects;
import brd.t;
import pc0.b;
import cjd.e;
import erd.o;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$b;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$c;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import vt5.g;
import kotlin.jvm.internal.Ref$IntRef;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$d;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$e;
import t45.d;
import brd.z;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$f;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$g;

public final class PendantStatusVM extends ViewModel	// class@000708
{
    public final a mPendantStatusReportRepository;
    public static final PendantStatusVM$a Companion;

    static {
       PendantStatusVM.Companion = new PendantStatusVM$a(null);
    }
    public void PendantStatusVM(){
       super();
       this.mPendantStatusReportRepository = new a();
    }
    public static final PendantStatusVM getInstance(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PendantStatusVM.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PendantStatusVM.Companion.a(p0);
    }
    public final void pendant2ActiveReport(int p0){
       t ot;
       PendantStatusVM pendantStatu = PendantStatusVM.class;
       if (PatchProxy.isSupport(pendantStatu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, pendantStatu, "2")) {
          return;
       }
       pendantStatu = this.mPendantStatusReportRepository;
       Objects.requireNonNull(pendantStatu);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          ot = PatchProxy.applyOneRefs(Integer.valueOf(p0), pendantStatu, uoa, "1");
          if (ot != PatchProxyResult.class) {
          label_0047 :
             ot.subscribe(PendantStatusVM$b.b, PendantStatusVM$c.b);
             return;
          }
       }
       ot = pendantStatu.a.f(p0).map(new e());
       a.o(ot, "pendantApiV2.pendantActi¡­ .map\(ResponseFunction\(\)\)");
       goto label_0047 ;
    }
    public final void pendant2CloseOrOpenReport(){
       t ot;
       if (PatchProxy.applyVoid(null, this, PendantStatusVM.class, "4")) {
          return;
       }
       boolean i = 0x348c642a;
       if (!d.a(i).Wx()) {
          return;
       }
       i = d.a(i).EL();
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = 2;
       if (i) {
          intRef.element = 1;
       }
       PendantStatusVM tmPendantSta = this.mPendantStatusReportRepository;
       Ref$IntRef element = intRef.element;
       Objects.requireNonNull(tmPendantSta);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          ot = PatchProxy.applyOneRefs(Integer.valueOf(element), tmPendantSta, uoa, "2");
          if (ot != PatchProxyResult.class) {
          label_0067 :
             ot.subscribe(new PendantStatusVM$d(i, intRef), new PendantStatusVM$e(intRef));
             return;
          }
       }
       ot = tmPendantSta.a.e(element).map(new e());
       a.o(ot, "pendantApiV2.changeWidge¡­ .map\(ResponseFunction\(\)\)");
       goto label_0067 ;
    }
    public final void pendant2DoubleReport(int p0){
       PendantStatusVM pendantStatu = PendantStatusVM.class;
       String str = "3";
       if (PatchProxy.isSupport(pendantStatu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, pendantStatu, str)) {
          return;
       }
       pendantStatu = this.mPendantStatusReportRepository;
       Objects.requireNonNull(pendantStatu);
       t ot = PatchProxy.apply(null, pendantStatu, a.class, str);
       if (ot != PatchProxyResult.class) {
       }else {
          ot = pendantStatu.a.h().map(new e()).observeOn(d.a);
          a.o(ot, "pendantApiV2.pendantDoub¡­veOn\(KwaiSchedulers.MAIN\)");
       }
       ot.subscribe(new PendantStatusVM$f(p0), new PendantStatusVM$g(p0));
       return;
    }
    public final void pendant2NormalReport(int p0){
       PendantStatusVM pendantStatu = PendantStatusVM.class;
       if (PatchProxy.isSupport(pendantStatu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, pendantStatu, "1")) {
          return;
       }
       if (!p0) {
          this.pendant2CloseOrOpenReport();
       }else {
          this.pendant2ActiveReport(p0);
       }
       return;
    }
}
