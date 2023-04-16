package il0.d;
import erd.g;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements g	// class@002943
{
    public final LiveLiteBaseAdLogPresenter b;

    public void d(LiveLiteBaseAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          p0 = this.b;
          p0.B = true;
          p0.d9();
       }
       return;
    }
}
