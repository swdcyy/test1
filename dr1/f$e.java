package dr1.f$e;
import lq1.f;
import dr1.f;
import java.lang.Object;
import lq1.e;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import qrd.l1;
import java.util.List;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class f$e implements f	// class@002001
{
    public final f a;

    public void f$e(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       e.b(this);
    }
    public void b(BizEndReason p0){
       e.a(this, p0);
    }
    public void c(SCLiveMultiLineChatOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "1")) {
          return;
       }
       a.p(p0, "scLineOpened");
       e.c(this, p0);
       if (!TextUtils.n(this.a.c(), p0.subModeId)) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          linkedHashMa.put("current", this.a.c());
          p0 = p0.subModeId;
          a.o(p0, "scLineOpened.subModeId");
          linkedHashMa.put("received", p0);
          b.z(f.s, "onSubBizUpdate, arenaId not match", linkedHashMa, null);
          return;
       }else {
          b.P(f.s, "onSubBizUpdate");
          this.a.k(p0);
          return;
       }
    }
}
