package dlc.r0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.r0$a;
import dlc.r0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import android.view.View;
import dlc.q0;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import android.widget.FrameLayout;
import ekd.m1;
import tkc.f;
import tkc.i;

public class r0 extends PresenterV2	// class@00226a
{
    public KwaiPlayerFailedStateView p;
    public View q;
    public f r;
    public i s;
    public q t;
    public q u;

    public void r0(){
       super();
       this.t = new r0$a(this);
       this.u = new r0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r0.class, "4")) {
          return;
       }
       this.s.h(this.t);
       this.r.h(this.u);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, r0.class, "3")) {
          return;
       }
       if (!p0.C(a.a().a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }
       this.q.setVisibility(0);
       this.p.f(new q0(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r0.class, "5")) {
          return;
       }
       this.s.f(this.t);
       this.r.f(this.u);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, r0.class, "6")) {
          return;
       }
       this.p.setVisibility(0);
       this.q.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a310e);
       this.q = m1.f(p0, 0x7f0a4072);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r0.class, "1")) {
          return;
       }
       this.r = this.r8("TRENDING_FEED_PAGE_LIST");
       this.s = this.r8("TRENDING_LIST_PAGE_LIST");
       return;
    }
}
