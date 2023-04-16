package bra.f;
import w4.j;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.String;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class f implements j	// class@000431
{
    public final LottieAnimationView a;
    public final UnmuteTipView b;
    public final String c;

    public void f(LottieAnimationView p0,UnmuteTipView p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
       }else {
          this.a.setComposition(p0);
          p0.E = true;
          PatchProxy.onMethodExit(f.class, "1");
       }
       return;
    }
}
