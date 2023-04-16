package etb.d$a;
import qvb.q;
import etb.d;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import qvb.n0;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxResponse;
import java.util.Collection;
import ekd.q;
import android.view.View;
import android.view.ViewStub;
import etb.e;
import java.util.List;
import g9c.a;
import z8c.a;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import etb.c;
import java.lang.Runnable;

public class d$a implements q	// class@0027ed
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
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
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          d$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, d.class, "5")) {
             NoticeBoxResponse mTabs = tb.p.L0().mTabs;
             if (q.f(mTabs)) {
                if (tb.u != null) {
                   tb.r.setVisibility(8);
                   tb.s.setVisibility(8);
                }
             }else {
                d u = tb.u;
                int i = 0;
                if (u == null) {
                   tb.r = tb.r.inflate();
                   tb.s = tb.s.inflate();
                   e uoe = new e(tb);
                   tb.u = uoe;
                   uoe.W0(mTabs);
                   a uoa1 = new a(i, i, i);
                   uoa1.r(a1.e(16.00f), a1.e(16.00f), i);
                   tb.r.addItemDecoration(uoa1);
                   GridLayoutManager gridLayoutMa = new GridLayoutManager(tb.getContext(), mTabs.size());
                   tb.v = gridLayoutMa;
                   tb.r.setLayoutManager(gridLayoutMa);
                   tb.r.setAdapter(tb.u);
                }else {
                   u.W0(mTabs);
                   tb.v.setSpanCount(mTabs.size());
                   tb.u.k0();
                }
                tb.r.setVisibility(i);
                tb.s.setVisibility(i);
                tb.r.post(new c(tb, mTabs));
             }
          }
       }
       return;
    }
}
