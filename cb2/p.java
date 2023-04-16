package cb2.p;
import erd.g;
import cb2.q$a;
import java.lang.Object;
import com.kuaishou.live.core.show.liveslidesquare.guide.network.LiveSlideGuideResponse;
import java.util.Objects;
import cb2.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cb2.o;
import java.lang.Runnable;
import ekd.k1;

public final class p implements g	// class@000513
{
    public final q$a b;

    public void p(q$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q$a b = this.b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(p0, b, q.class, "8")) {
       }else if(p0.mShouldShowGuide != null){
          LiveSlideGuideResponse mDelayShowTi = p0.mDelayShowTimeMs;
          if (mDelayShowTi > 0) {
             k1.s(new o(b), b, mDelayShowTi);
          }
       }
       return;
    }
}
