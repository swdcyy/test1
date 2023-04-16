package b8a.s1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Math;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import java.lang.Boolean;
import im8.f;
import android.view.View;
import com.yxcorp.gifshow.detail.slidev2.presenter.x;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.utility.n;
import io.reactivex.subjects.PublishSubject;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Exception;
import k2b.u1;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import ekd.y0;
import com.yxcorp.gifshow.detail.slidev2.presenter.z;

public final class s1 implements Runnable	// class@0003e5
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void s1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void run(){
       s1 tb;
       SlidePlayAutoPlayNextPresenter j;
       try{
          tb = this.b;
          int i = tb.S + 60;
          tb.S = i;
          tb.S = Math.min(i, 0x2af8);
          long l = tb.b9();
          long l1 = tb.d9();
          if (!l1) {
          }else {
             float f = 1000.00f;
             float f1 = (float)(l1 - l) / f;
             if (tb.u9(f1) && tb.W8()) {
                tb.Y8();
                if (tb.O != null && (tb.W == SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE && !tb.a9())) {
                   tb.k9();
                   tb.H9(tb.Z8(f1));
                   j = tb.J;
                   if (j != null) {
                      j.set(Boolean.TRUE);
                   }
                   if (!tb.J9()) {
                      if (!tb.m9()) {
                         tb.C9();
                      }
                   }else {
                      j = tb.q;
                      if (j != null && j.getVisibility()) {
                         c3.c(tb.r, x.a);
                         n.W(tb.q, 0, 300);
                         tb.X8(true);
                         tb.F.onNext(Boolean.TRUE);
                         j = tb.s;
                         if (j != null) {
                            tb.s9(j.getText().toString());
                         }
                         c3.c(tb.u, y.a);
                      }
                   }
                }
             }else if(tb.x9(((float)l / f)) && tb.W8()){
                if (tb.V8()) {
                   tb.I9();
                   if (!tb.J9() && !tb.m9()) {
                      tb.D9();
                   }
                }
             }else if(!tb.J9()){
                if (tb.m9()) {
                   tb.B9(true);
                }
             }else {
                j = tb.q;
                if (j != null) {
                   int i1 = 8;
                   if (j.getVisibility() != i1) {
                      n.W(tb.q, i1, 300);
                      tb.B9(true);
                      tb.X8(0);
                      tb.F.onNext(Boolean.FALSE);
                      c3.c(tb.u, z.a);
                   }
                }
             }
             if (tb.L != null) {
                if (tb.W == SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.CURRENT_POSITION_DISABLE) {
                   if (tb.R != null && tb.R8()) {
                      tb.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
                   }else if(tb.R == null && tb.K9(l, l1)){
                      tb.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
                   }
                }else if(tb.a9()){
                   if (tb.R != null && tb.R8()) {
                      tb.Y = true;
                      tb.G9();
                      tb.E9();
                   }else if(tb.R == null && tb.K9(l, l1)){
                      tb.Y = true;
                      tb.G9();
                      tb.E9();
                   }
                }
             }
             tb.M = l;
          }
       }catch(java.lang.Exception e1){
          if (PatchProxy.applyVoidOneRefs(e1, tb, SlidePlayAutoPlayNextPresenter.class, "18")) {
          }else {
             u1.R("AutoPlayNextCrash", tb.c1+","+tb.L+","+tb.d1+","+tb.G.getLifecycle().getCurrentState()+","+e1.getMessage(), 14);
             if (tb instanceof SlideAutoPlaySwitchPhotoPresenter ^ true) {
                tb.G9();
                SlidePlayAutoPlayNextPresenter u0 = tb.U0;
                if (u0 != null) {
                   u0.e();
                }
             }
          }
       }
       return;
    }
}
