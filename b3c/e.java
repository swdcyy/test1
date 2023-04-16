package b3c.e;
import androidx.lifecycle.Observer;
import b3c.g;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import u3c.h;
import java.util.List;
import z5c.a3;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.profile.model.IpLocation;
import com.kwai.page.component.load.LoadState;
import com.kwai.page.component.a;
import b3c.h;
import com.yxcorp.gifshow.profile.components.common.actions.HeadTagLoadAction;
import ee7.e;
import ee7.d;

public final class e implements Observer	// class@00039e
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "8")) {
       }else if(q.f(a3.a(h.d(p0))) && h.i(p0) == null){
          p0 = LoadState.UNLOAD;
       }else {
          p0 = LoadState.LOAD;
       }
       tb.c.e.v(HeadTagLoadAction.UPDATE, p0);
       return;
    }
}
