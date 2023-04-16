package com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter$a;
import android.view.View$OnClickListener;
import lyb.l;
import tkd.b;
import tkd.d;
import nl9.u;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter$onBind$2;
import com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter$onBind$3;
import msd.a;
import crd.b;

public final class SearchAdLiveConversionPresenter extends PresenterV2	// class@001561
{
    public l p;
    public QPhoto q;
    public b r;

    public void SearchAdLiveConversionPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SearchAdLiveConversionPresenter.class, "6")) {
          return;
       }
       SearchAdLiveConversionPresenter tq = this.q;
       String str = "photo";
       if (tq == null) {
          a.S(str);
       }
       if (tq.isAd()) {
          tq = this.p;
          String str1 = "fragment";
          if (tq == null) {
             a.S(str1);
          }
          tq.h8(new SearchAdLiveConversionPresenter$a(this));
          u ou = d.a(-1694791652);
          SearchAdLiveConversionPresenter tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          Objects.requireNonNull(tp, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
          SearchAdLiveConversionPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          b uob = ou.f30(tp, tq1, SearchAdLiveConversionPresenter$onBind$2.INSTANCE, new SearchAdLiveConversionPresenter$onBind$3(this));
          this.r = uob;
          if (uob != null) {
             this.X7(uob);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SearchAdLiveConversionPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       return;
    }
}
