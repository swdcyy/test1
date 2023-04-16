package d5c.p;
import erd.g;
import d5c.g0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import z5c.y2;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.String;
import android.util.SparseArray;
import com.yxcorp.utility.TextUtils;
import k2b.e0;

public final class p implements g	// class@002108
{
    public final g0 b;

    public void p(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.Q.b();
       }else {
          tb.Q.a(tb.s, tb.S8(tb.q.mPhotoTabId), TextUtils.I(tb.K.get(tb.q.mPhotoTabId)), tb.b9(tb.q.mPhotoTabId));
       }
       return;
    }
}
