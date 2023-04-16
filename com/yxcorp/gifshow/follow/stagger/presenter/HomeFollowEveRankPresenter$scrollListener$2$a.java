package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$scrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$scrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter;
import e50.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import nsd.r0;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import java.util.Arrays;
import v40.b;

public final class HomeFollowEveRankPresenter$scrollListener$2$a extends RecyclerView$r	// class@0011ef
{
    public final HomeFollowEveRankPresenter$scrollListener$2 a;

    public void HomeFollowEveRankPresenter$scrollListener$2$a(HomeFollowEveRankPresenter$scrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       HomeFollowEveRankPresenter$scrollListener$2$a oscrollListe = HomeFollowEveRankPresenter$scrollListener$2$a.class;
       if (PatchProxy.isSupport(oscrollListe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oscrollListe, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          g.l(this.a.this$0.v, null, null, 2, null);
          Object[] objArray = new Object[]{this.a.this$0.v.b().getTaskId()};
          String str = String.format("custom_infer_%s", Arrays.copyOf(objArray, 1));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.b(str, "SCROLLIDLE");
       }
       return;
    }
}
