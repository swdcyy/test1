package m3c.a;
import java.lang.Class;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import fx5.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;

public abstract class a	// class@0034ca
{
    public final Class a;
    public final BaseFragment b;
    public final RecyclerFragment c;
    public final ProfileParam d;

    public void a(Class p0,BaseFragment p1,RecyclerFragment p2,ProfileParam p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public abstract void a(ProfilePostEmptyGuide p0);
    public a b(ProfilePostEmptyGuide p0){
       ProfilePostEmptyGuide obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.c;
       a uoa = (obj == null || obj.getClass() != this.a)? null: p0.c;
       return uoa;
    }
    public abstract View c(ProfilePostEmptyGuide p0);
}
