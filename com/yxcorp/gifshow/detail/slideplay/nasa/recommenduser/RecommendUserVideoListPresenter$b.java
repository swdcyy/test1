package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$b;
import qvb.q;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
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
import g9c.a;
import java.util.ArrayList;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import io.reactivex.subjects.PublishSubject;
import k6a.u;

public class RecommendUserVideoListPresenter$b implements q	// class@001756
{
    public final RecommendUserVideoListPresenter b;

    public void RecommendUserVideoListPresenter$b(RecommendUserVideoListPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport2(RecommendUserVideoListPresenter$b.class, "3") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, RecommendUserVideoListPresenter$b.class, "3")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       RecommendUserVideoListPresenter w = this.b.w;
       if (w != null) {
          w.setVisibility(8);
          this.b.w.f();
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$b.class, "3");
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport2(RecommendUserVideoListPresenter$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecommendUserVideoListPresenter$b.class, "1")) {
          return;
       }
       RecommendUserVideoListPresenter w = this.b.w;
       if (w != null) {
          w.setVisibility(0);
          this.b.w.e();
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$b.class, "1");
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
       if (PatchProxy.isSupport2(RecommendUserVideoListPresenter$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, RecommendUserVideoListPresenter$b.class, "2")) {
          return;
       }
       RecommendUserVideoListPresenter w = this.b.w;
       if (w != null) {
          w.setVisibility(8);
          this.b.w.f();
       }
       RecommendUserVideoListPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(null, tb, RecommendUserVideoListPresenter.class, "8")) {
          List items = tb.y.getItems();
          if (items == null || items.isEmpty()) {
             i.a(R.style.arg_RES_7f110668, 0x7f100a19);
             u.f();
             PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "8");
          }else {
             RecommendUserVideoListPresenter t = tb.t;
             if (t != null && t.Q0() != null) {
                tb.t.W0(items);
                i = new ArrayList(tb.t.Q0()).size() - items.size();
                tb.t.p0(0, items.size());
                if (i > 0) {
                   tb.t.s0(items.size(), i);
                }
             }
             w = tb.A;
             if (w != null) {
                w.onNext(Boolean.TRUE);
             }
             PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "8");
          }
       }
       PatchProxy.onMethodExit(RecommendUserVideoListPresenter$b.class, "2");
       return;
    }
}
