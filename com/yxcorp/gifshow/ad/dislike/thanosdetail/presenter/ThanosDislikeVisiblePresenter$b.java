package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import kotlin.jvm.internal.a;

public final class ThanosDislikeVisiblePresenter$b implements View$OnClickListener	// class@001752
{
    public final ThanosDislikeVisiblePresenter b;
    public final int c;

    public void ThanosDislikeVisiblePresenter$b(ThanosDislikeVisiblePresenter p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ThanosDislikeVisiblePresenter$b.class, "1")) {
          return;
       }
       ThanosDislikeVisiblePresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       ThanosDislikeVisiblePresenter thanosDislik = PatchProxy.apply(null, tb, ThanosDislikeVisiblePresenter.class, "2");
       if (thanosDislik != PatchProxyResult.class) {
       }else {
          thanosDislik = tb.p;
          if (thanosDislik == null) {
             a.S("mDislikeViewModel");
          }
       }
       thanosDislik.f();
       PatchProxy.onMethodExit(ThanosDislikeVisiblePresenter$b.class, "1");
       return;
    }
}
