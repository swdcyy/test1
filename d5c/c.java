package d5c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.d2;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.LinearLayout$LayoutParams;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import d5c.b;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class c extends PresenterV2	// class@0020ea
{
    public int p;
    public PagerSlidingTabStrip q;
    public LinearLayout$LayoutParams r;
    public PublishSubject s;
    public static float t = 0.000000;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       int i = (d2.g())? d2.b(this.getActivity()): n.z(this.getContext());
       this.p = (int)((float)i * c.t);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(0, -1, 0x3f800000);
       this.r = layoutParams;
       layoutParams.width = this.p;
       this.q.setTabLayoutParams(layoutParams);
       this.X7(this.s.subscribe(new b(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3cb6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.s = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       return;
    }
}
