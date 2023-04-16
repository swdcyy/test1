package b5c.o;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.page.d;
import java.lang.Object;
import kotlin.Pair;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class o implements o	// class@0003b2
{
    public final d b;

    public void o(d p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       HashMap hashMap = PatchProxy.applyOneRefs(p0, tb, d.class, "4");
       if (hashMap != PatchProxyResult.class) {
       }else {
          hashMap = new HashMap();
          if (p0.getFirst() != null) {
             p0 = p0.getSecond();
             if (p0 != null) {
                d.a(-1694791652).xf(p0, tb.q.mAdExtra);
                if (TextUtils.isEmpty(p0.getServerExpTag())) {
                   p0.setServerExpTag(tb.q.mServerExpTag);
                }
                hashMap.put("QPhoto", p0);
             }
          }
       }
       return hashMap;
    }
}
