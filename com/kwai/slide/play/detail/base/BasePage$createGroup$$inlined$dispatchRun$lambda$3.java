package com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$lambda$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;

public final class BasePage$createGroup$$inlined$dispatchRun$lambda$3 extends Lambda implements l	// class@001746
{
    public final BasePage this$0;

    public void BasePage$createGroup$$inlined$dispatchRun$lambda$3(BasePage p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BasePage$createGroup$$inlined$dispatchRun$lambda$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.this$0.R0(new PlcStrongGroup());
       PlcStrongGroup plcStrongGro = this.this$0.Y();
       if (plcStrongGro != null) {
          plcStrongGro.v(this.this$0.U());
       }
       plcStrongGro = this.this$0.Y();
       if (plcStrongGro != null) {
          RelativeLayout relativeLayo = this.this$0.V();
          a.m(relativeLayo);
          plcStrongGro.l(relativeLayo);
       }
       plcStrongGro = this.this$0.Y();
       if (plcStrongGro != null) {
          plcStrongGro.a(p0);
       }
       PatchProxy.onMethodExit(BasePage$createGroup$$inlined$dispatchRun$lambda$3.class, "1");
       return;
    }
}
