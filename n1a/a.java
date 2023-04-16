package n1a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import ekd.m1;

public class a extends PresenterV2	// class@0030b2
{
    public KwaiActionBar p;
    public View q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       this.q.setVisibility(0);
       this.p.j(j.n(this.getActivity(), R.drawable.arg_RES_7f08068e, 0x7f060148));
       this.p.q(R.string.arg_RES_7f1003c3);
       this.p.m(-1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       this.q = m1.f(p0, 0x7f0a3cde);
       return;
    }
}
