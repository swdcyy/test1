package nz9.o;
import erd.g;
import nz9.z0;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.yxcorp.gifshow.entity.QPhoto;

public final class o implements g	// class@00323a
{
    public final z0 b;

    public void o(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "41")) {
       }else if(tb.Q != null && tb.Q.mPhoto != null){
          tb.Q.mPhoto.setUser(p0);
       }
       return;
    }
}
