package h82.p;
import erd.g;
import h82.z;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import h82.b0;
import java.lang.Boolean;
import z61.b;
import androidx.lifecycle.MutableLiveData;

public final class p implements g	// class@002ce5
{
    public final z b;

    public void p(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z.class, "12")) {
       }else {
          User user = tb.M.c.getUser();
          if (TextUtils.n(user.getId(), p0.a.getId())) {
             f.m(user, p0.a.getFollowStatus());
             p0 = tb.Q.g;
             int i = tb.c9();
             boolean b = false;
             if (i && (p0 == null || (!i && (p0 != null && tb.Q.c != null)))) {
                b = true;
             }
          label_004d :
             p0 = tb.Q;
             p0.g = i;
             p0.h = b;
             if (!b) {
                p0.mIsVisible = Boolean.valueOf(tb.d9());
             }
             tb.R.setValue(tb.Q);
             tb.k9();
          }
       }
       return;
    }
}
