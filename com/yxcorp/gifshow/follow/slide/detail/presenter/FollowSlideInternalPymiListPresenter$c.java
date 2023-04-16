package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class FollowSlideInternalPymiListPresenter$c extends RecyclerView$r	// class@001118
{
    public final FollowSlideInternalPymiListPresenter a;

    public void FollowSlideInternalPymiListPresenter$c(FollowSlideInternalPymiListPresenter p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       FollowSlideInternalPymiListPresenter$c uoc = FollowSlideInternalPymiListPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1) {
          return;
       }
       this.a.Y8();
       return;
    }
}
