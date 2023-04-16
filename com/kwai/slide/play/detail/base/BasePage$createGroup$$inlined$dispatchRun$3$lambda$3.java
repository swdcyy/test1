package com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3$lambda$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import com.kwai.slide.play.detail.base.BasePage;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;

public final class BasePage$createGroup$$inlined$dispatchRun$3$lambda$3 extends Lambda implements l	// class@00173c
{
    public final BasePage$createGroup$$inlined$dispatchRun$3 this$0;

    public void BasePage$createGroup$$inlined$dispatchRun$3$lambda$3(BasePage$createGroup$$inlined$dispatchRun$3 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BasePage$createGroup$$inlined$dispatchRun$3$lambda$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.this$0.h.R0(new PlcStrongGroup());
       PlcStrongGroup plcStrongGro = this.this$0.h.Y();
       if (plcStrongGro != null) {
          plcStrongGro.v(this.this$0.h.U());
       }
       plcStrongGro = this.this$0.h.Y();
       if (plcStrongGro != null) {
          RelativeLayout relativeLayo = this.this$0.h.V();
          a.m(relativeLayo);
          plcStrongGro.l(relativeLayo);
       }
       plcStrongGro = this.this$0.h.Y();
       if (plcStrongGro != null) {
          plcStrongGro.a(p0);
       }
       PatchProxy.onMethodExit(BasePage$createGroup$$inlined$dispatchRun$3$lambda$3.class, "1");
       return;
    }
}
