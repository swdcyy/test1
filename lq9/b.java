package lq9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import lq9.c;
import com.yxcorp.gifshow.corona.common.monitor.CostDebugView;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class b	// class@002e96
{

    public static final void a(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uob, "1")) {
          return;
       }
       CostDebugView uCostDebugVi = c.f.d();
       if (uCostDebugVi != null) {
          uCostDebugVi.setT1Msg("click start : "+new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(p0)));
       }
       return;
    }
    public static final void b(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uob, "2")) {
          return;
       }
       CostDebugView uCostDebugVi = c.f.d();
       if (uCostDebugVi != null) {
          uCostDebugVi.setT2Msg("switch start: "+new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(p0)));
       }
       return;
    }
    public static final void c(){
       if (PatchProxy.applyVoid(null, null, b.class, "5")) {
          return;
       }
       CostDebugView uCostDebugVi = c.f.d();
       if (uCostDebugVi != null) {
          uCostDebugVi.setReset(true);
          uCostDebugVi.setT1Msg("click start : ");
          uCostDebugVi.setT2Msg("switch start: ");
          uCostDebugVi.setT3Msg("switch end: ");
          uCostDebugVi.setT4Msg("click cost: ");
       }
       return;
    }
}
