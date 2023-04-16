package e11.e;
import w4.k;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import e11.f;
import java.lang.String;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.Objects;
import com.airbnb.lottie.LottieAnimationView;

public final class e implements k	// class@002087
{
    public final LiveLottieAnimationView a;
    public final f b;
    public final String c;
    public final boolean d;

    public void e(LiveLottieAnimationView p0,f p1,String p2,boolean p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(e p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       f l = this.b.l;
       if (l != null) {
          l.setVisibility(8);
       }
       this.a.setVisibility(0);
       if (this.d != null) {
          l = this.b;
          e ta = this.a;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoidOneRefs(ta, l, f.class, "6")) {
             if (ta.p()) {
                ta.f();
             }
             ta.s();
          }
       }else {
          this.a.setProgress(0x3f800000);
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
