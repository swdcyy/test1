package om1.c;
import om1.a;
import mm1.g;
import java.lang.Object;
import pm1.a;
import om1.c$a;
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
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import java.lang.Boolean;
import lp3.e;
import lp3.c;
import lp3.b;
import mm1.e;
import om1.b;
import mm1.d;

public class c implements a	// class@00353e
{
    public final g b;
    public final k c;
    public final a d;

    public void c(g p0){
       super();
       this.d = new a(new c$a(this));
       this.b = p0;
       k ok = PatchProxy.apply(null, this, c.class, "10");
       if (ok != PatchProxyResult.class) {
       }else {
          k ok1 = new k(a.t().u("SOURCE_LIVE").getValue("liveSendGiftTraceLogConfig", j.class, j.a));
          b.P(b.a, "[LiveSendGiftTraceServiceImpl][generateTraceLogSwitcher]isNeedReportPreSend:"+ok1.b()+",isNeedReportSending:"+ok1.c()+",isNeedReportAfterSend:"+ok1.a()+",isOnlyLogAfterSendGiftFailed:"+ok1.d());
          ok = ok1;
       }
       this.c = ok;
       return;
    }
    public c De(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.De(p0, p1);
    }
    public void Ia(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.d.a(p0);
       return;
    }
    public LiveSendGiftBaseTraceInfo Ig(String p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.b.De(LiveSendGiftTraceInfo.class, p0);
       }
       return uoc;
    }
    public boolean Qc(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.d.a(p0);
       return;
    }
    public LiveSendGiftBaseTraceInfo o6(){
       LiveSendGiftTraceInfo liveSendGift = PatchProxy.apply(null, this, c.class, "1");
       if (liveSendGift != PatchProxyResult.class) {
       }else {
          liveSendGift = this.b.ud(LiveSendGiftTraceInfo.class);
       }
       return liveSendGift;
    }
    public c ud(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.ud(p0);
    }
    public e yk(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.yk(p0).c(new b(this));
    }
}
