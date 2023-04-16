package d63.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import f12.d;
import f12.c;
import android.view.View;

public class c extends PresenterV2	// class@002477
{
    public d p;
    public static String sLivePresenterClassName = "LiveGzoneSlideIgnorePresenter";

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       d uod = c.b(this.getActivity());
       this.p = uod;
       uod.S(this.getActivity(), this.m8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.p.z(this.getActivity(), this.m8());
       return;
    }
}
