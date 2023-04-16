package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$g;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.utility.n;
import bia.h;
import g9c.a;
import com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.follow.slide.detail.presenter.a;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.slide.detail.presenter.b;
import erd.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.c;
import kga.c;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.List;

public final class FollowSlideInternalPymiListPresenter$g implements g	// class@00111d
{
    public final FollowSlideInternalPymiListPresenter b;

    public void FollowSlideInternalPymiListPresenter$g(FollowSlideInternalPymiListPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter$g.class, "1")) {
       }else {
          a.p(p0, "pymiTipsShowResponse");
          if (p0.mPymiUserBar == null) {
             View[] viewArray = new View[]{this.b.t};
             n.Z(8, viewArray);
          }else if(this.b.V8().R0() || !this.b.R8().h()){
             this.b.P8(p0.mPymiUserBar.mInfos);
          }else {
             b9.a(this.b.y);
             this.b.y = t.fromCallable(new a(this)).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).doOnTerminate(new b(this)).subscribe(new c(this, p0), c.a);
          }
       }
       return;
    }
}
