package ax8.f$c;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import o56.a;
import f66.i;
import jq.a;
import q87.c;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import ax8.f$c$a;
import java.lang.Runnable;
import am8.d;

public final class f$c	// class@000333
{

    public void f$c(){
       super();
    }
    public void f$c(u p0){
       super();
    }
    public final String a(){
       String obj = PatchProxy.apply(null, this, f$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       obj = qCurrentUser.getId()+"-"+"cache_key_share_producer_data"+"-"+a.m+"-"+this.b()+"_"+1;
       Object[] objArray = new Object[0];
       a.b().w("ShareProducerRepo", "getCacheKey "+obj, objArray);
       return obj;
    }
    public final long b(){
       Object obj = PatchProxy.apply(null, this, f$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (a.t().b("publish_share_link_cache_duration_in_hour", 24) * (long)0x36ee80);
    }
    public final void c(ProducerHelpConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       a.p(p0, "info");
       i oi = a.b();
       StringBuilder str = "updateShareProducerInfo info "+"have businessInfo? ";
       boolean b = true;
       boolean b1 = (p0.mShareBusinessLinkInfo != null)? true: false;
       str = str+b1+"  "+"have liveInfo? ";
       if (p0.mShareLivePredictionConfig == null) {
          b = false;
       }
       Object[] objArray = new Object[0];
       oi.w("ShareProducerRepo", str+b, objArray);
       d.d(new f$c$a(p0), "ShareProducerRepo", 0);
       return;
    }
}
