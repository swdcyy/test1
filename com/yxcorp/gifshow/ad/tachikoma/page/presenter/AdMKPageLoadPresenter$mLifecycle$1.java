package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$mLifecycle$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ukd.a;
import java.lang.Throwable;
import yx.j0;
import java.util.HashMap;
import a59.a;
import a59.a$a;

public final class AdMKPageLoadPresenter$mLifecycle$1 implements DefaultLifecycleObserver	// class@001853
{
    public final AdMKPageLoadPresenter b;

    public void AdMKPageLoadPresenter$mLifecycle$1(AdMKPageLoadPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       Object[] obj;
       boolean b;
       Boolean uBoolean;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMKPageLoadPresenter$mLifecycle$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       AdMKPageLoadPresenter$mLifecycle$1 tb = this.b;
       Objects.requireNonNull(tb);
       AdMKPageLoadPresenter uAdMKPageLoa = AdMKPageLoadPresenter.class;
       if (!PatchProxy.applyVoid(null, tb, uAdMKPageLoa, "2")) {
          if (PatchProxy.isSupport(uAdMKPageLoa)) {
             obj = PatchProxy.applyOneRefs(Boolean.FALSE, tb, uAdMKPageLoa, "3");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                try{
                label_003d :
                   Object[] objArray = new Object[0];
                   uBoolean = a.a(tb.getActivity(), "isTopOfTask", objArray);
                }catch(java.lang.Exception e0){
                   Object[] objArray1 = new Object[0];
                   j0.d("AdMKLoadPresenter", e0, objArray1);
                   uBoolean = null;
                }
                b = (uBoolean != null)? uBoolean.booleanValue(): false;
             }
          }else {
             goto label_003d ;
          }
          if (!b) {
             obj = new Object[0];
             j0.f("AdMKLoadPresenter", "onLeave", obj);
             a uoa = tb.D.get("native_leave");
             if (uoa != null) {
                a$a.a(uoa, null, null, 2, null);
             }
          }
       }
    label_0074 :
       return;
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
