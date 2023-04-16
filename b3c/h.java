package b3c.h;
import ee7.g;
import ee7.d;
import ee7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ee7.e;
import com.yxcorp.gifshow.profile.components.common.actions.ProfileLoadStateAction;
import com.yxcorp.gifshow.profile.components.common.actions.HeadTagLoadAction;
import com.yxcorp.gifshow.profile.components.common.actions.UserProfileAction;
import com.yxcorp.gifshow.profile.components.common.actions.ScrollStateAction;

public class h extends g	// class@0003a1
{
    public final d b;
    public final d c;
    public final d d;
    public final d e;

    public void h(){
       super();
       this.b = new d(this);
       this.c = new d(this);
       this.d = new d(this);
       this.e = new d(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       e[] uoeArray = new e[]{ProfileLoadStateAction.UPDATE};
       this.a(this.b, uoeArray);
       uoeArray = new e[]{HeadTagLoadAction.UPDATE};
       this.a(this.e, uoeArray);
       uoeArray = new e[]{UserProfileAction.UPDATE};
       this.a(this.c, uoeArray);
       e[] uoeArray1 = new e[]{ScrollStateAction.UPDATE};
       this.a(this.d, uoeArray1);
       return;
    }
}
