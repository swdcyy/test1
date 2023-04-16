package com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter$b;
import androidx.lifecycle.Observer;
import zz5.d;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class AdNeoLiveVideoPendantPresenter extends PresenterV2	// class@0015df
{
    public QPhoto p;
    public View q;
    public NeoLiveCountDown r;
    public BaseFragment s;
    public boolean t;
    public final DefaultLifecycleObserver u;
    public static final AdNeoLiveVideoPendantPresenter$a v;

    static {
       AdNeoLiveVideoPendantPresenter.v = new AdNeoLiveVideoPendantPresenter$a(null);
    }
    public void AdNeoLiveVideoPendantPresenter(){
       super();
       this.u = new AdNeoLiveVideoPendantPresenter$mLifecycleObserver$1(this);
    }
    public void E8(){
       AdNeoLiveVideoPendantPresenter ts;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdNeoLiveVideoPendantPresenter.class, "2")) {
          return;
       }
       AdNeoLiveVideoPendantPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       PhotoAdvertisement photoAdverti = k.B(tp);
       if (photoAdverti != null) {
          objArray = photoAdverti.mReservationId;
       }
       if (objArray != null) {
          return;
       }else {
          int i = 0x691527a8;
          r or = d.a(i);
          AdNeoLiveVideoPendantPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          if (or.DH(tp1.mEntity)) {
             tp = this.s;
             if (tp == null) {
                a.S("mFragment");
             }
             tp.getLifecycle().addObserver(this.u);
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             ts = this.s;
             if (ts == null) {
                a.S("mFragment");
             }
             d.b(tp, ts, new AdNeoLiveVideoPendantPresenter$b(this));
          }else {
             r or1 = d.a(i);
             ts = this.p;
             if (ts == null) {
                a.S(str);
             }
             if (or1.Ea(ts.mEntity)) {
                tp = this.s;
                if (tp == null) {
                   a.S("mFragment");
                }
                tp.getLifecycle().addObserver(this.u);
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdNeoLiveVideoPendantPresenter.class, "4")) {
          return;
       }
       AdNeoLiveVideoPendantPresenter tr = this.r;
       if (tr != null) {
          tr.reset();
       }
       tr = this.s;
       if (tr == null) {
          a.S("mFragment");
       }
       tr.getLifecycle().removeObserver(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdNeoLiveVideoPendantPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       return;
    }
}
