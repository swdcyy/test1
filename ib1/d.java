package ib1.d;
import erd.g;
import com.kuaishou.live.common.core.component.admin.user.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.admin.model.AssistantInfoResponse;
import java.util.Objects;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import com.kuaishou.live.core.show.admin.model.LiveAdminAssistantConfig;
import bb1.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import bb1.a$a;

public final class d implements g	// class@002886
{
    public final a b;
    public final boolean c;

    public void d(a p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       AssistantInfoResponse privilege = p0.privilege;
       if (privilege == null) {
          privilege = new LiveAdminPrivilege();
       }
       tb.f = false;
       tb.g = false;
       tb.So(p0.mLiveAdminAssistantConfig);
       p0 = a.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidTwoRefs(privilege, Boolean.valueOf(tc), tb, p0, "9")) {
          p0 = tb.i.iterator();
          while (p0.hasNext()) {
             p0.next().b(privilege, tc);
          }
       }
       return;
    }
}
