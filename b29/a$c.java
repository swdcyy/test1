package b29.a$c;
import erd.g;
import b29.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.UserVerifiedDetail;
import n49.s;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import b29.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;
import java.util.HashMap;

public final class a$c implements g	// class@00035c
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "4")) {
             a u = p0.u;
             String str = "mPhoto";
             if (u == null) {
                a.S(str);
             }
             User user = u.getUser();
             if (user != null) {
                user = user.mVerifiedDetail;
                if (user != null && (user.mIconType == 2 && s.a())) {
                   j0 oj0 = o.z();
                   a u1 = p0.u;
                   if (u1 == null) {
                      a.S(str);
                   }
                   oj0.e(141, u1.mEntity).d(c.b).a();
                   Object obj = PatchProxy.apply(null, null, s.class, "56");
                   boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): f.a("canConvertIfClickBlueVerified");
                   if (b) {
                      p0.o0(null, null);
                   }
                }
             }
          }
       }
    label_0076 :
       return;
    }
}
