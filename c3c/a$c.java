package c3c.a$c;
import erd.g;
import c3c.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.page.component.b;
import com.yxcorp.gifshow.profile.components.common.tag.ProfileHeadTagUI;
import c3c.b;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import u3c.h;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import z5c.s1;

public final class a$c implements g	// class@000515
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else if(a.g(p0, Boolean.valueOf(this.b.n))){
          p0 = this.b;
          if (p0.n != null) {
             p0.c.g();
             p0.n = false;
          }else {
             p0 = p0.d.c().mUserProfile;
             if (p0 != null) {
                CommonRoleLabel uCommonRoleL = h.d(p0);
                if (uCommonRoleL != null) {
                   p0 = s1.a(this.b.d.d(), p0, uCommonRoleL.mLabelGroup);
                   if (p0 != null) {
                      a$c tb = this.b;
                      tb.n = true;
                      tb.c.e(p0);
                   }
                }
             }
          }
       }
       return;
    }
}
