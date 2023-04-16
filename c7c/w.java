package c7c.w;
import erd.o;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class w implements o	// class@000557
{
    public final UserExtraInfo b;

    public void w(UserExtraInfo p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       String str = TextUtils.I(this.b.mRecommendReason);
       if (!TextUtils.x(p0)) {
          str = str+"£º"+p0;
       }
       return str;
    }
}
