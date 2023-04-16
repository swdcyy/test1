package h19.d$d;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager$a;
import h19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class d$d implements CustomViewPager$a	// class@002539
{
    public final d a;

    public void d$d(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$d.class, "2")) {
          return;
       }
       if (!this.a.P8()) {
          this.a.R8();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$d.class, "1")) {
          return;
       }
       u1.K0(3);
       this.a.getActivity().onBackPressed();
       return;
    }
}
