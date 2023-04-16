package c3c.b;
import vd7.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;

public final class b extends a	// class@000517
{
    public d d;
    public ProfileParam e;
    public User f;
    public BaseFragment g;
    public List h;
    public Set i;
    public int j;
    public RxPageBus k;

    public void b(){
       super();
       this.j = 5;
    }
    public final ProfileParam c(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mParam");
       }
       return obj;
    }
    public final User d(){
       b obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("mUser");
       }
       return obj;
    }
}
