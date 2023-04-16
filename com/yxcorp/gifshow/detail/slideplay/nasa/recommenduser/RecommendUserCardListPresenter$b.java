package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter$b;
import qvb.q;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import e17.i;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import qvb.p;
import java.util.Objects;
import java.util.List;
import qvb.a;
import k6a.u;
import java.util.ArrayList;
import g9c.a;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import io.reactivex.subjects.PublishSubject;

public class RecommendUserCardListPresenter$b implements q	// class@001752
{
    public final RecommendUserCardListPresenter b;

    public void RecommendUserCardListPresenter$b(RecommendUserCardListPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport2(RecommendUserCardListPresenter$b.class, "3") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, RecommendUserCardListPresenter$b.class, "3")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       this.b.s.setVisibility(8);
       this.b.s.f();
       PatchProxy.onMethodExit(RecommendUserCardListPresenter$b.class, "3");
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport2(RecommendUserCardListPresenter$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecommendUserCardListPresenter$b.class, "1")) {
          return;
       }
       this.b.s.setVisibility(0);
       this.b.s.e();
       PatchProxy.onMethodExit(RecommendUserCardListPresenter$b.class, "1");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       int i;
       if (PatchProxy.isSupport2(RecommendUserCardListPresenter$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecommendUserCardListPresenter$b.class, "2")) {
          return;
       }
       this.b.s.setVisibility(8);
       this.b.s.f();
       RecommendUserCardListPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(null, tb, RecommendUserCardListPresenter.class, "7")) {
          List items = tb.u.getItems();
          if (items.isEmpty()) {
             i.a(R.style.arg_RES_7f110668, 0x7f100a19);
             u.f();
             PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "7");
          }else {
             tb.p.W0(items);
             i = new ArrayList(tb.p.Q0()).size() - items.size();
             tb.p.p0(0, items.size());
             if (i > 0) {
                tb.p.s0(items.size(), i);
             }
             tb.w.onNext(Boolean.TRUE);
             PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "7");
          }
       }
       PatchProxy.onMethodExit(RecommendUserCardListPresenter$b.class, "2");
       return;
    }
}
