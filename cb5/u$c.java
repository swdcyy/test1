package cb5.u$c;
import qvb.q;
import cb5.u;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.content.Context;
import o56.f;
import oa5.a;
import e17.i;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import ya5.a;

public class u$c implements q	// class@00045b
{
    public final u b;

    public void u$c(u p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       u$c uoc = u$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       this.b.R8();
       if (this.b.s.e() != RefreshType.BACK_CLICK) {
          u$c tb = this.b;
          Activity activity = tb.getActivity();
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(activity, tb, u.class, "8") && (f.b(activity) && a.b())) {
             i oi = i.l();
             if (oi != null && (oi.s() && TextUtils.equals(a1.p(0x7f100da1), oi.n()))) {
                oi.h();
                a.a();
             }
          }
       }
    label_006d :
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
}
