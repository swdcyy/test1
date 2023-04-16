package c7c.h;
import erd.g;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import mac.l;

public final class h implements g	// class@000545
{
    public final User b;

    public void h(User p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       tb.setSpecialFocusStatus(true);
       RxBus.f.b(new l(tb));
    }
}
