package d3a.c;
import erd.g;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.a;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.yxcorp.gifshow.detail.helper.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.helper.FollowView;

public final class c implements g	// class@001e67
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b.w;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, c.class, "10")) {
       }else {
          boolean b = p0.c(p0.d);
          if (b != p0.g) {
             p0.g = b;
             if (p0.h == null) {
                p0.b();
             }else {
                p0.a.n(true);
                p0.e();
             }
          }
       }
       return;
    }
}
