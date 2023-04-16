package a5c.h;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.util.Objects;
import x3c.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import x3c.c;

public final class h implements g	// class@000080
{
    public final e b;

    public void h(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       UserProfileResponseMeta userProfileR = null;
       Object obj = PatchProxy.applyOneRefs(p0, userProfileR, b.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          p0 = c.d(p0);
          if (p0 != null) {
             userProfileR = p0.mProfileNoPhotoGuideInfo;
          }
          obj = userProfileR;
       }
       tb.C = obj;
       tb.F = true;
       tb.a9();
       return;
    }
}
