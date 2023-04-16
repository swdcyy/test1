package c8c.b;
import erd.g;
import com.yxcorp.gifshow.rankgather.api.b;
import java.lang.Object;
import com.yxcorp.gifshow.rankgather.api.RankGatherFeedResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import android.text.TextUtils;
import kp.y1;

public final class b implements g	// class@00055a
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "5")) {
       }else {
          List items = p0.getItems();
          if (!q.f(items) && !TextUtils.isEmpty(p0.mLlsid)) {
             y1.g(items, 10, p0.mLlsid);
             y1.b(items, 1);
          }
       }
       return;
    }
}
