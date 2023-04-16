package m8a.b$a;
import qvb.q;
import m8a.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import e17.i;
import android.view.View;
import qvb.p;
import qvb.i;
import android.app.Activity;
import lnc.i3;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.lang.Runnable;
import qvb.j;

public class b$a implements q	// class@002f6e
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       if (!ExceptionHandler.handleException(a.a().a(), p1) && (this.b.getContext() != null && !p0.C(this.b.getContext()))) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }
    label_0040 :
       if (p0) {
          this.b.s.setVisibility(8);
          this.b.t.setVisibility(8);
          this.b.v.setVisibility(0);
          this.b.u.setVisibility(0);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.b.r.isEmpty()) {
          this.b.getActivity().finish();
          i3 oi3 = i3.f();
          oi3.d("reason", "Can not get data fetcher!");
          u1.R("reminder_detail_flow", oi3.e(), 13);
          return;
       }else {
          int i = 0;
          if (p0) {
             int i1 = 8;
             this.b.s.setVisibility(i1);
             this.b.t.setVisibility(i1);
             this.b.v.setVisibility(i);
             this.b.u.setVisibility(i);
          }
          if (p0) {
             QPhoto item = this.b.r.getItem(i);
             if (item != null) {
                b$a tb = this.b;
                b q = tb.q;
                PhotoDetailParam mPhoto = q.mPhoto;
                if (mPhoto != null) {
                   if (tb.y.f(mPhoto) == -1) {
                      tb.mPhoto = item;
                   }
                }else {
                   q.mPhoto = item;
                }
             }
             this.b.P8();
             this.b.p.run();
             b$a tb1 = this.b;
             tb1.r.f(tb1.B);
          }
          return;
       }
    }
}
