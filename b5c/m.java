package b5c.m;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.d;
import android.net.Uri;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import b5c.j;
import java.util.HashMap;

public final class m implements g	// class@0003b0
{
    public final d b;
    public final Uri c;

    public void m(d p0,Uri p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m tb = this.b;
       m tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       p0 = PatchProxy.apply(objArray, tb, d.class, "3");
       if (p0 != PatchProxyResult.class) {
          objArray = p0;
       }else {
          p0 = j.a(tb.q, tb.p);
          if (p0 != null) {
             objArray = new HashMap();
             objArray.put("QPhoto", p0);
          }
       }
       tb.R8(tc, objArray);
       return;
    }
}
