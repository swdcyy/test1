package lb1.a;
import erd.g;
import lb1.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.admin.model.AssistantsResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import va1.k0;

public final class a implements g	// class@002eb2
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "2")) {
       }else {
          p0 = p0.getItems();
          if (!q.f(p0)) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                UserInfo mExtraInfo = p0.next().mExtraInfo;
                if (mExtraInfo != null) {
                   mExtraInfo.mIconSegments = k0.a(mExtraInfo.mBase64Segments);
                }
             }
          }
       }
       return;
    }
}
