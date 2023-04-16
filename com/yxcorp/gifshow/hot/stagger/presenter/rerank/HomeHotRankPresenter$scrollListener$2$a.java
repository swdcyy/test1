package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$scrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$scrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import com.kwai.framework.model.feed.BaseFeed;
import ff6.d;

public final class HomeHotRankPresenter$scrollListener$2$a extends RecyclerView$r	// class@0018ce
{
    public final HomeHotRankPresenter$scrollListener$2 a;

    public void HomeHotRankPresenter$scrollListener$2$a(HomeHotRankPresenter$scrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       HomeHotRankPresenter$scrollListener$2$a oscrollListe = HomeHotRankPresenter$scrollListener$2$a.class;
       if (PatchProxy.isSupport(oscrollListe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oscrollListe, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          this.a.this$0.x.j(null);
       }
       return;
    }
}
