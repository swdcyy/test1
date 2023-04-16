package com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import kz8.a;
import brd.t;
import t45.d;
import brd.z;
import y09.o;
import erd.g;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;

public class PhotoAdSimilarBuyLoggerPresenter$a extends a	// class@001654
{
    public b b;
    public final PhotoAdSimilarBuyLoggerPresenter c;

    public void PhotoAdSimilarBuyLoggerPresenter$a(PhotoAdSimilarBuyLoggerPresenter p0){
       this.c = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, PhotoAdSimilarBuyLoggerPresenter$a.class, "2")) {
          return;
       }
       this.c.p = 0;
       b9.a(this.b);
       this.c.P8();
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoAdSimilarBuyLoggerPresenter$a.class, "1")) {
          return;
       }
       this.b = RxBus.f.f(a.class).observeOn(d.a).subscribe(new o(this.c));
       PhotoAdSimilarBuyLoggerPresenter$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, PhotoAdSimilarBuyLoggerPresenter.class, "4") && tc.getActivity() != null) {
          tc.getActivity().getLifecycle().addObserver(tc.v);
       }
       return;
    }
}
