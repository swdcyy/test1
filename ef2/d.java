package ef2.d;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import lnc.a1;
import ef2.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ef2.a;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import mkc.b;
import mkc.c;
import ekd.m1;

public class d extends c	// class@00271a
{
    public r v;
    public View w;
    public View x;
    public View y;
    public static String sLivePresenterClassName = "LiveProfileNetworkPresenter";

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       super.E8();
       if (this.w != null && !PatchProxy.applyVoid(objArray, this, uod, "4")) {
          ViewGroup$MarginLayoutParams layoutParams = this.w.getLayoutParams();
          d tv = this.v;
          layoutParams.height = (tv != null && tv.m == LiveProfileMode.AUDIENCE_VIEW_SELF)? a1.e(363.00f): a1.e(375.00f);
          this.w.setLayoutParams(layoutParams);
       }
       this.W8();
       uod = this.v;
       uod.p.observe(uod.e, new b(this));
       uod = this.v;
       uod.o.observe(uod.e, new a(this));
       return;
    }
    public final boolean S8(){
       r m = this.v.m;
       boolean b = (m == LiveProfileMode.SPECIAL_ROLE || m == LiveProfileMode.LITE_SPECIAL_ROLE)? true: false;
       return b;
    }
    public final void V8(View p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "8")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void W8(){
       b[] uobArray;
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       r m = this.v.m;
       int i = 1;
       if (m != LiveProfileMode.ANCHOR_VIEW_SELF && (m == LiveProfileMode.ESCROW_VIEW_SELF || (!n.I(this.getActivity()) && this.S8()))) {
          uobArray = new b[i];
          uobArray[0] = b.g;
          c.d(this.y, uobArray);
          this.V8(this.y, 8);
          this.V8(this.x, 0);
          c.h(this.x, b.e);
       }else {
          this.V8(this.w, 0);
          uobArray = new b[i];
          uobArray[0] = b.g;
          c.d(this.w, uobArray);
          c.h(this.w, b.e);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a23a5);
       this.y = m1.f(p0, 0x7f0a23a3);
       this.x = m1.f(p0, 0x7f0a23a4);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.v = this.q8(r.class);
       return;
    }
}
