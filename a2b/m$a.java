package a2b.m$a;
import com.yxcorp.gifshow.widget.m;
import a2b.m;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;

public final class m$a extends m	// class@00002e
{
    public final m c;

    public void m$a(m p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       m$a tc = this.c;
       m s = tc.s;
       if (s != null) {
          m q = tc.q;
          if (q != null) {
             q.h5(s.mLinkUrl, "5", tc.r, s.mType, tc.z);
          }
          tc.z = false;
       }
       return;
    }
}
