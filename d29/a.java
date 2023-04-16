package d29.a;
import erd.g;
import d29.b;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a implements g	// class@002035
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "user");
          b b = this.b.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(p0, b, AdAvatarElement.class, "25")) {
             AdAvatarElement j = b.J;
             if (j != null) {
                AvatarInfoResponse mPhoto = j.mPhoto;
                if (mPhoto != null) {
                   mPhoto.setUser(p0);
                }
             }
          }
       }
       return;
    }
}
