package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$scrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$scrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter;
import e50.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;
import nsd.r0;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import java.util.Arrays;
import v40.b;

public final class HomeHotEveRankPresenter$scrollListener$2$a extends RecyclerView$r	// class@0018c0
{
    public final HomeHotEveRankPresenter$scrollListener$2 a;

    public void HomeHotEveRankPresenter$scrollListener$2$a(HomeHotEveRankPresenter$scrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       HomeHotEveRankPresenter$scrollListener$2$a oscrollListe = HomeHotEveRankPresenter$scrollListener$2$a.class;
       if (PatchProxy.isSupport(oscrollListe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oscrollListe, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          g.l(this.a.this$0.y, null, null, 2, null);
          HomeHotEveRankPresenter$scrollListener$2 this$0 = this.a.this$0;
          Objects.requireNonNull(this$0);
          Boolean uBoolean = PatchProxy.apply(null, this$0, HomeHotEveRankPresenter.class, "3");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = this$0.t.getValue();
          }
          if (uBoolean.booleanValue()) {
             Object[] objArray = new Object[]{this.a.this$0.y.b().getTaskId()};
             String str = String.format("custom_infer_%s", Arrays.copyOf(objArray, 1));
             a.o(str, "java.lang.String.format\(format, *args\)");
             b.b(str, "SCROLLIDLE");
          }
       }
       return;
    }
}
