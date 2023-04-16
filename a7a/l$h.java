package a7a.l$h;
import jta.a;
import a7a.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;

public final class l$h extends a	// class@000064
{
    public final l a;

    public void l$h(l p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport2(l$h.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, l$h.class, "1")) {
          return;
       }
       l$h ta = this.a;
       boolean b = (p0 - 0x3f800000)? true: false;
       ta.q1 = b;
       if (b) {
          ta.X8().setEnableScroll(false);
          this.a.R8();
       }else {
          ta.X8().setEnableScroll(true);
          this.a.W8();
       }
       PatchProxy.onMethodExit(l$h.class, "1");
       return;
    }
}
