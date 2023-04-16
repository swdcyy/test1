package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeGesturePresenter$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeGesturePresenter;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import iz.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;

public final class ThanosDislikeGesturePresenter$a extends GestureDetector$SimpleOnGestureListener	// class@00174b
{
    public final ThanosDislikeGesturePresenter b;

    public void ThanosDislikeGesturePresenter$a(ThanosDislikeGesturePresenter p0){
       this.b = p0;
       super();
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeGesturePresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "e");
       ThanosDislikeGesturePresenter s = this.b.s;
       if (s == null) {
          a.S("mSlidePlayViewModel");
       }
       if (s.r()) {
          return;
       }else if(!a.b() || this.b.p != null){
          ThanosDislikeGesturePresenter$a tb = this.b;
          Objects.requireNonNull(tb);
          ThanosDislikeGesturePresenter thanosDislik = PatchProxy.apply(null, tb, ThanosDislikeGesturePresenter.class, "2");
          if (thanosDislik != PatchProxyResult.class) {
          }else {
             thanosDislik = tb.q;
             if (thanosDislik == null) {
                a.S("mDislikeModel");
             }
          }
          thanosDislik.h(p0);
       }
       return;
    }
}
