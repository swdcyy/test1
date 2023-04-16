package nz9.q;
import erd.g;
import nz9.z0;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class q implements g	// class@003240
{
    public final z0 b;

    public void q(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "79")) {
       }else if(TextUtils.equals(tb.u.getUser().mId, p0.b)){
          f.m(tb.u.getUser(), p0.a.getFollowStatus());
       }
       return;
    }
}
