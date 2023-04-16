package ce5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.core.media.a;
import android.app.Activity;

public class a extends PresenterV2	// class@0006ac
{
    public a p;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a uoa = new a(this.getActivity());
       this.p = uoa;
       uoa.a();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p.b();
       return;
    }
}
