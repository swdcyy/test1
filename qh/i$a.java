package qh.i$a;
import hka.f;
import qh.i;
import java.lang.Object;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class i$a implements f	// class@0029e4
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,KeyEvent p1){
       i$a ta;
       i r;
       i oi = i.class;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 19) {
          if (p1.getAction() == 1) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, oi, "4") && ta.s != null) {
                r = ta.r;
                if (r != null) {
                   if (r.a0() < 1) {
                      i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001ce));
                   }
                   ta.r.u(true);
                }
             }
          }
          return true;
       }else if(p0 == 20){
          if (p1.getAction() == 1) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, oi, "3") && ta.s != null) {
                r = ta.r;
                if (r != null) {
                   if (r.a0() < (ta.r.Q() - true)) {
                      ta.r.Y(true);
                   }else {
                      i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001cd));
                   }
                }
             }
          }
          return true;
       }else {
          return false;
       }
    }
}
