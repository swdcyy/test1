package a7a.l$n;
import erd.g;
import a7a.l;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w85.a;
import rf5.u;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public final class l$n implements g	// class@00006a
{
    public final l b;

    public void l$n(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l$n.class, "1")) {
       }else if(!l.k9(this.b).g()){
          PatchProxy.onMethodExit(l$n.class, "1");
       }else if(this.b.b9().w() || this.b.p0().b1()){
          this.b.X8().setEnableScroll(false);
          this.b.R8();
       }else {
          this.b.X8().setEnableScroll(true);
          this.b.W8();
       }
       PatchProxy.onMethodExit(l$n.class, "1");
       return;
    }
}
