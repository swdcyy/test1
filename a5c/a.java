package a5c.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.fragment.app.Fragment;
import z5c.o2;
import uh5.e;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@000079
{
    public BaseFragment p;
    public View q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.q.getLayoutParams();
       ViewGroup$MarginLayoutParams bottomMargin = layoutParams.bottomMargin;
       int i = (o2.c(this.p))? e.c(): 0;
       if (bottomMargin != i) {
          layoutParams.bottomMargin = i;
          this.q.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3283);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p = this.r8("PROFILE_FRAGMENT");
       return;
    }
}
