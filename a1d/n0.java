package a1d.n0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageButton;

public class n0 extends PresenterV2	// class@000040
{
    public KwaiActionBar p;
    public ImageButton q;
    public ImageButton r;

    public void n0(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       this.r = m1.f(p0, 0x7f0a1716);
       this.q = m1.f(p0, 0x7f0a3643);
       this.p.q(R.string.arg_RES_7f1002d4);
       this.r.setVisibility(4);
       this.q.setVisibility(4);
       return;
    }
}
