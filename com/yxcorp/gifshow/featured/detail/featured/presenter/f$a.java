package com.yxcorp.gifshow.featured.detail.featured.presenter.f$a;
import hka.f;
import com.yxcorp.gifshow.featured.detail.featured.presenter.f;
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

public class f$a implements f	// class@000f73
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,KeyEvent p1){
       f$a ta;
       f r;
       f uof = f.class;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.a.s != null && p1.getAction() == 1) {
          if (p0 == 19) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, uof, "5")) {
                r = ta.r;
                if (r != null) {
                   if (r.a0() < 1) {
                      i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001ce));
                   }
                   ta.r.u(true);
                }
             }
             return true;
          }else if(p0 == 20){
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, uof, "4")) {
                r = ta.r;
                if (r != null) {
                   if (r.a0() < ta.r.Q()) {
                      ta.r.Y(true);
                   }else {
                      i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001cd));
                   }
                }
             }
             return true;
          }
       }
       return false;
    }
}
