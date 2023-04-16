package g19.f0;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;

public final class f0 implements g	// class@0023b6
{
    public final k b;

    public void f0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.r.getUser().setMissUStatus(true);
    }
}
