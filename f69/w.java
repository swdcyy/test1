package f69.w;
import erd.g;
import f69.x;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;

public final class w implements g	// class@0022c7
{
    public final x b;
    public final UserExtraInfo c;

    public void w(x p0,UserExtraInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       tb.P8(this.c.mRecommendReason, "");
    }
}
