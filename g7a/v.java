package g7a.v;
import erd.r;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class v implements r	// class@002401
{
    public final d b;

    public void v(d p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.d == null && (p0.c == null && TextUtils.n(tb.x.getUser().getId(), p0.b)))? true: false;
       return b;
    }
}
