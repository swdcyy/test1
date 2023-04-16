package e8a.h1$d;
import erd.g;
import e8a.h1;
import java.lang.Object;
import d0a.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import uc6.c;
import sd5.d;
import android.graphics.Bitmap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.util.HashSet;
import java.lang.Integer;
import qrd.l1;
import java.util.Set;

public final class h1$d implements g	// class@0020af
{
    public final h1 b;

    public void h1$d(h1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1$d.class, "1")) {
       }else {
          h1 q = this.b.q;
          if (q == null) {
             a.S("mPhoto");
          }
          if (a.g(q, p0.a)) {
             h1.R8(this.b).getPlayer().seekTo(p0.c);
             r d = p0.d;
             if (d != null) {
                h1$d tb = this.b;
                tb.y = d;
                h1 w = tb.w;
                if (w != null) {
                   c uoc = w.N();
                   if (uoc != null) {
                      uoc.h(d);
                   }
                }
             }
             DetailPlayConfig detailPlayCo = h1.P8(this.b).getDetailPlayConfig();
             String str = "mDetailParam.detailPlayConfig";
             a.o(detailPlayCo, str);
             detailPlayCo.setContinuePlayStrategy(1);
             if (p0.b == null) {
                p0 = h1.P8(this.b).getDetailPlayConfig();
                a.o(p0, str);
                HashSet hashSet = new HashSet();
                hashSet.add(Integer.valueOf(1));
                p0.setInitPauseFlags(hashSet);
             }else {
                p0 = h1.P8(this.b).getDetailPlayConfig();
                a.o(p0, str);
                p0.getInitPauseFlags().remove(Integer.valueOf(1));
             }
          }
       }
       return;
    }
}
