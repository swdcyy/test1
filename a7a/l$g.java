package a7a.l$g;
import tw6.e;
import a7a.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import w85.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import rf5.u;

public final class l$g implements e	// class@000063
{
    public final l a;

    public void l$g(l p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(l$g.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, l$g.class, "2")) {
          return;
       }
       if (!l.k9(this.a).g()) {
          PatchProxy.onMethodExit(l$g.class, "2");
          return;
       }else {
          l$g ta = this.a;
          ta.j1 = true;
          ta.X8().setEnableScroll(false);
          this.a.R8();
          PatchProxy.onMethodExit(l$g.class, "2");
          return;
       }
    }
    public void b(int p0){
       if (PatchProxy.isSupport2(l$g.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, l$g.class, "1")) {
          return;
       }
       if (!l.k9(this.a).g()) {
          PatchProxy.onMethodExit(l$g.class, "1");
          return;
       }else {
          l$g ta = this.a;
          ta.j1 = false;
          if (!ta.b9().w()) {
             this.a.X8().setEnableScroll(true);
             this.a.W8();
          }
          PatchProxy.onMethodExit(l$g.class, "1");
          return;
       }
    }
}
