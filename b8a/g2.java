package b8a.g2;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.d0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;

public final class g2 implements g	// class@0003a8
{
    public final d0 b;

    public void g2(d0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.r.getUser().setMissUStatus(true);
    }
}
