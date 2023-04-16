package bra.b;
import w4.j;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.String;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b implements j	// class@00042d
{
    public final LottieAnimationView a;
    public final UnmuteTipView b;
    public final String c;

    public void b(LottieAnimationView p0,UnmuteTipView p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          this.a.setComposition(p0);
          p0.G = true;
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
}
