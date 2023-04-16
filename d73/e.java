package d73.e;
import dz2.c$a;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter;
import xp5.g;
import java.lang.Object;
import cz2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import sa3.a;
import java.lang.Boolean;
import android.graphics.Rect;
import com.kwai.robust.PatchProxyResult;

public final class e implements c$a	// class@002486
{
    public final LiveLiteEffectPresenter a;
    public final g b;

    public void e(LiveLiteEffectPresenter p0,g p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "render");
       LiveLiteEffectPresenter k = this.a.K;
       Objects.requireNonNull(k);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.TRUE, k, uoa, "11")) {
          a.p(p0, "localRenderService");
          k.n = p0;
          k.m = true;
          k.So(k.l);
       }
       return;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.e();
    }
}
