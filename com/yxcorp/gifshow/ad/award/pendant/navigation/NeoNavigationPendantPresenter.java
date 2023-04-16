package com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter$mLifecycleObserver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ekd.x0;
import java.lang.Integer;
import zsd.t;
import hy8.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hy8.a$a;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;

public final class NeoNavigationPendantPresenter extends PresenterV2	// class@001520
{
    public a p;
    public String q;
    public String r;
    public int s;
    public final LifecycleObserver t;
    public static final NeoNavigationPendantPresenter$a u;

    static {
       NeoNavigationPendantPresenter.u = new NeoNavigationPendantPresenter$a(null);
    }
    public void NeoNavigationPendantPresenter(){
       super();
       this.t = new NeoNavigationPendantPresenter$mLifecycleObserver$1(this);
    }
    public void E8(){
       a$a f;
       NeoNavigationPendantPresenter ts;
       int i;
       NeoNavigationPendantPresenter neoNavigatio = NeoNavigationPendantPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, neoNavigatio, "2")) {
          return;
       }
       NeoNavigationPendantPresenter tq = this.q;
       if (!PatchProxy.applyVoidOneRefs(tq, this, neoNavigatio, "6")) {
          f = null;
          ts = (tq == null || !tq.length())? 1: null;
          if (!ts) {
             Uri uri = x0.f(tq);
             if (uri != null) {
                this.r = x0.a(uri, "neoNavigationPendant");
                String str = x0.a(uri, "entrySource");
                if (str != null) {
                   Integer integer = t.X0(str);
                   if (integer != null) {
                      i = integer.intValue();
                   }
                }
                this.s = i;
             }
          }
       }
    label_0049 :
       f = a.f;
       tq = this.r;
       ts = this.s;
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       a uoa = f.a(tq, ts, activity);
       if (uoa != null) {
          this.p = uoa;
          Activity activity1 = this.getActivity();
          if (activity1 instanceof GifshowActivity) {
             objArray = activity1;
          }
          if (objArray != null) {
             Lifecycle lifecycle = objArray.getLifecycle();
             if (lifecycle != null) {
                lifecycle.addObserver(this.t);
             }
          }
       }
    label_007b :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NeoNavigationPendantPresenter.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.t);
          }
       }
       this.P8();
       this.p = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, NeoNavigationPendantPresenter.class, "5")) {
          return;
       }
       NeoNavigationPendantPresenter tp = this.p;
       if (tp != null) {
          tp.c();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NeoNavigationPendantPresenter.class, "1")) {
          return;
       }
       this.q = this.t8("LINK_URL");
       return;
    }
}
