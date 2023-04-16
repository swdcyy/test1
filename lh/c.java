package lh.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import lh.c$a;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2	// class@00255e
{
    public KwaiActionBar p;
    public BaseFragment q;
    public final int r;

    public void c(int p0){
       super();
       this.r = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.p.d(R.drawable.arg_RES_7f0819d9, -1, this.r);
       this.p.h(new c$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
