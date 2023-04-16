package a7a.l$k;
import erd.g;
import a7a.l;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;

public final class l$k implements g	// class@000067
{
    public final l b;

    public void l$k(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l$k.class, "1")) {
       }else {
          PhotosScaleHelpView photosScaleH = this.b.Z8();
          a.o(p0, "it");
          boolean b = (p0.booleanValue() && this.b.q1 == null)? true: false;
          photosScaleH.setScaleEnabled(b);
          PatchProxy.onMethodExit(l$k.class, "1");
       }
       return;
    }
}
