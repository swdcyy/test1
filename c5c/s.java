package c5c.s;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.o;
import java.lang.Object;
import kotlin.Triple;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class s implements o	// class@000532
{
    public final o b;

    public void s(o p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       Pair pair = PatchProxy.applyOneRefs(p0, tb, o.class, "5");
       if (pair != PatchProxyResult.class) {
       }else {
          QPhoto second = p0.getSecond();
          if (second != null) {
             d.a(-1694791652).xf(second, tb.r.mAdExtra);
             if (TextUtils.isEmpty(second.getServerExpTag())) {
                second.setServerExpTag(tb.r.mServerExpTag);
             }
          }
          pair = new Pair(p0.getThird(), second);
       }
       return pair;
    }
}
