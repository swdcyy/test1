package aua.g;
import android.view.View$OnClickListener;
import aua.h;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aua.e;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ia5.h;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;

public final class g implements View$OnClickListener	// class@00030e
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "3")) {
       }else {
          e q = tb.q;
          if (q != null) {
             String str = r1.G1(q);
             if (!TextUtils.x(str)) {
                h k = tb.K;
                int i = 1596;
                if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(k, str, Integer.valueOf(i), null, h.class, "1")) {
                   h.a(k, str, 1, 0, 1, 1596, null);
                }
             }
          }
       }
       return;
    }
}
