package c7c.v;
import erd.g;
import c7c.x;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;

public final class v implements g	// class@000556
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
       tb.R8(TextUtils.I(this.c.mRecommendReason));
    }
}
