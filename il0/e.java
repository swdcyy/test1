package il0.e;
import erd.g;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import java.lang.StringBuilder;
import yx.j0;
import kotlin.jvm.internal.a;

public final class e implements g	// class@002944
{
    public final LiveLiteBaseAdLogPresenter b;

    public void e(LiveLiteBaseAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
       }else {
          SlidePlayViewModel slidePlayVie = this.b.m9();
          Integer integer = (slidePlayVie != null)? Integer.valueOf(slidePlayVie.c()): null;
          Object[] objArray = new Object[0];
          j0.a("LiveLiteBaseAdLogPresenter", "isTabSelectedObservable"+p0+"---"+integer, objArray);
          int i = 1;
          if (integer == null || (integer.intValue() == i || (integer != null && integer.intValue() == 2))) {
             a.o(p0, "isPageSelected");
             if (p0.booleanValue()) {
                this.b.reset();
             }
          }
          PatchProxy.onMethodExit(e.class, "1");
       }
       return;
    }
}
