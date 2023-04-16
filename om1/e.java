package om1.e;
import om1.a;
import mm1.g;
import java.lang.Object;
import pm1.a;
import om1.e$a;
import pm1.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lm1.k;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import lm1.j;
import java.lang.reflect.Type;
import km1.b;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import mm1.c;
import pm1.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.Boolean;
import lp3.e;
import lp3.c;
import lp3.b;
import mm1.e;
import om1.d;
import mm1.d;

public class e implements a	// class@003541
{
    public final g b;
    public final k c;
    public final a d;

    public void e(g p0){
       super();
       this.d = new a(new e$a(this));
       this.b = p0;
       k ok = PatchProxy.apply(null, this, e.class, "10");
       if (ok != PatchProxyResult.class) {
       }else {
          k ok1 = new k(a.t().u("SOURCE_LIVE").getValue("liveSendGiftTraceLogConfig", j.class, j.a));
          b.P(b.a, "[LiveSendGiftTracer][generateTraceLogSwitcher]isNeedReportPreSend:"+ok1.b()+",isNeedReportSending:"+ok1.c()+",isNeedReportAfterSend:"+ok1.a()+",isOnlyLogAfterSendGiftFailed:"+ok1.d());
          ok = ok1;
       }
       this.c = ok;
       return;
    }
    public c De(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.De(p0, p1);
    }
    public void Ia(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.d.a(p0);
       return;
    }
    public LiveSendGiftBaseTraceInfo Ig(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.De(LiveSendGiftBaseTraceInfo.class, p0);
    }
    public boolean Qc(){
       Object obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.b();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void k8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.d.a(p0);
       return;
    }
    public LiveSendGiftBaseTraceInfo o6(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.ud(LiveSendGiftBaseTraceInfo.class);
    }
    public c ud(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.ud(p0);
    }
    public e yk(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.yk(p0).c(new d(this));
    }
}
