package dlc.g1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.m1;

public class g1 extends PresenterV2	// class@00224a
{
    public View p;

    public void g1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g1.class, "2")) {
          return;
       }
       if (i.c()) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.topMargin = n.A(this.getContext());
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a407e);
       return;
    }
}
