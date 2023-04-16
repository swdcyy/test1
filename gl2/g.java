package gl2.g;
import erd.g;
import gl2.i;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.systemfeedback.IncrByWatchResponse;
import com.kuaishou.live.core.show.systemfeedback.WatchTaskTips;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import fl2.a;

public final class g implements g	// class@002b43
{
    public final i b;

    public void g(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          p0 = p0.a().getWatchTaskTips();
          if (p0 != null) {
             if (!TextUtils.isEmpty(p0.getTip())) {
                g tb = this.b;
                if (tb.d == null) {
                   String tip = p0.getTip();
                   a.m(tip);
                   tb.c.a(tip, "SYS_WATCH");
                }
             }
             if (p0.getThreshold() >= 0 && !TextUtils.isEmpty(p0.getWatchTaskToken())) {
                p0 = p0.getWatchTaskToken();
                a.m(p0);
                this.b.e(p0.getThreshold(), p0);
             }
          }
       }
       return;
    }
}
