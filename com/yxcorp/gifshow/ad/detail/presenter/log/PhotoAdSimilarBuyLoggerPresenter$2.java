package com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.ad.detail.presenter.log.PhotoAdSimilarBuyLoggerPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import y09.p;
import erd.g;

public class PhotoAdSimilarBuyLoggerPresenter$2 implements DefaultLifecycleObserver	// class@001653
{
    public final PhotoAdSimilarBuyLoggerPresenter b;

    public void PhotoAdSimilarBuyLoggerPresenter$2(PhotoAdSimilarBuyLoggerPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdSimilarBuyLoggerPresenter$2.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdSimilarBuyLoggerPresenter$2.class, "1")) {
          return;
       }
       if (!this.b.p) {
          return;
       }
       o.z().e(401, this.b.q.mEntity).d(new p(this)).a();
       p0.p = 0;
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
