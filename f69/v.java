package f69.v;
import erd.g;
import f69.x;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class v implements g	// class@0022c6
{
    public final x b;
    public final UserExtraInfo c;

    public void v(x p0,UserExtraInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       tb.P8(this.c.mRecommendReason, p0);
    }
}
