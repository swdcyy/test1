package lq1.c$a$a;
import z1.a;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import java.lang.Object;
import lq1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$a$a implements a	// class@002ff5
{
    public final BizEndReason a;

    public void c$a$a(BizEndReason p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a$a.class, "1")) {
       }else {
          p0.b(this.a);
       }
       return;
    }
}
