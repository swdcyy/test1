package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeSwipeLayoutPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeSwipeLayoutPresenter;
import java.lang.Object;
import fy8.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import androidx.fragment.app.Fragment;
import ro5.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uo5.a;
import joc.q;

public final class ThanosDislikeSwipeLayoutPresenter$onBind$1 extends Lambda implements l	// class@00174f
{
    public final ThanosDislikeSwipeLayoutPresenter this$0;

    public void ThanosDislikeSwipeLayoutPresenter$onBind$1(ThanosDislikeSwipeLayoutPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       ThanosDislikeSwipeLayoutPresenter$onBind$1 tthis$0;
       ThanosDislikeSwipeLayoutPresenter t;
       ThanosDislikeSwipeLayoutPresenter thanosDislik = ThanosDislikeSwipeLayoutPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeSwipeLayoutPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.a;
       String str = "mSlidePlayViewModel";
       if (p0 != null) {
          boolean b = true;
          if (p0 != b) {
             if (p0 == 3) {
                tthis$0 = this.this$0;
                Objects.requireNonNull(tthis$0);
                if (!PatchProxy.applyVoid(null, tthis$0, thanosDislik, "11")) {
                   thanosDislik = tthis$0.u;
                   if (thanosDislik == null) {
                      a.S(str);
                   }
                   thanosDislik.d(b, 4);
                   thanosDislik = tthis$0.q;
                   if (thanosDislik == null) {
                      a.S("mSwipeToProfileFeedMovement");
                   }
                   thanosDislik.F(b, 5);
                   thanosDislik = tthis$0.p;
                   if (thanosDislik == null) {
                      a.S("mFragment");
                   }
                   a.o(thanosDislik, b, 5);
                   thanosDislik = tthis$0.s;
                   if (thanosDislik != null) {
                      thanosDislik.n(b, 6);
                   }
                   a.c(tthis$0.getActivity(), b, 2);
                   t = tthis$0.t;
                   if (t != null) {
                      t.e(2);
                   }
                }
             }
          }else {
          label_006c :
             tthis$0 = this.this$0;
             Objects.requireNonNull(tthis$0);
             if (!PatchProxy.applyVoid(null, tthis$0, thanosDislik, "10")) {
                thanosDislik = tthis$0.u;
                if (thanosDislik == null) {
                   a.S(str);
                }
                thanosDislik.d(false, 4);
                thanosDislik = tthis$0.q;
                if (thanosDislik == null) {
                   a.S("mSwipeToProfileFeedMovement");
                }
                thanosDislik.F(false, 5);
                thanosDislik = tthis$0.p;
                if (thanosDislik == null) {
                   a.S("mFragment");
                }
                a.o(thanosDislik, false, 5);
                thanosDislik = tthis$0.s;
                if (thanosDislik != null) {
                   thanosDislik.n(false, 6);
                }
                a.c(tthis$0.getActivity(), false, 2);
                t = tthis$0.t;
                if (t != null) {
                   t.a(2);
                }
             }
          }
       }else {
          goto label_006c ;
       }
       return;
    }
}
