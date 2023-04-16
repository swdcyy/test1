package j8a.c1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import rf5.u;
import kotlin.jvm.internal.a;

public final class c1 implements Runnable	// class@002944
{
    public final SideSlideUpGuider b;

    public void c1(SideSlideUpGuider p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, c1.class, str)) {
          return;
       }
       c1 tb = this.b;
       Objects.requireNonNull(tb);
       SideSlideUpGuider sideSlideUpG = PatchProxy.apply(objArray, tb, SideSlideUpGuider.class, str);
       if (sideSlideUpG != PatchProxyResult.class) {
       }else {
          sideSlideUpG = tb.h;
          if (sideSlideUpG == null) {
             a.S("mSwipeToProfileFeedMovement");
          }
       }
       sideSlideUpG.F(true, 7);
       return;
    }
}
