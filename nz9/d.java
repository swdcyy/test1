package nz9.d;
import erd.g;
import nz9.z0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;

public final class d implements g	// class@003219
{
    public final z0 b;

    public void d(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.u.getUser().setMissUStatus(true);
    }
}
