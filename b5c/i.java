package b5c.i;
import erd.r;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import java.lang.Object;
import wca.q;
import java.util.Objects;
import java.lang.String;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class i implements r	// class@0003ac
{
    public final b b;

    public void i(b p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = true;
       if (p0.c == null || (p0.b != b || !TextUtils.n(p0.a.getId(), tb.r.getId()))) {
          b = false;
       }
       return b;
    }
}
