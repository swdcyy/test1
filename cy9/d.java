package cy9.d;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.a;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;

public final class d implements g	// class@001e34
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.W8(p0.isFollowingOrFollowRequesting());
    }
}
