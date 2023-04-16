package com.yxcorp.gifshow.profile.presenter.profile.MyProfileKMoviePosterStatusTipPresenter$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.profile.presenter.profile.MyProfileKMoviePosterStatusTipPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import o3c.l;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import j4c.t;
import com.yxcorp.gifshow.profile.presenter.profile.v;
import erd.g;
import crd.b;

public class MyProfileKMoviePosterStatusTipPresenter$1 implements DefaultLifecycleObserver	// class@001451
{
    public final MyProfileKMoviePosterStatusTipPresenter b;

    public void MyProfileKMoviePosterStatusTipPresenter$1(MyProfileKMoviePosterStatusTipPresenter p0){
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
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileKMoviePosterStatusTipPresenter$1.class, "1")) {
          return;
       }
       MyProfileKMoviePosterStatusTipPresenter$1 tb = this.b;
       Objects.requireNonNull(tb);
       MyProfileKMoviePosterStatusTipPresenter myProfileKMo = MyProfileKMoviePosterStatusTipPresenter.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, myProfileKMo, "4") && tb.getActivity() != null) {
          Intent intent = tb.getActivity().getIntent();
          Uri obj = PatchProxy.applyOneRefs(intent, tb, myProfileKMo, "5");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(intent == null || intent.getData() == null){
             obj = intent.getData();
             if (TextUtils.n(x0.a(obj, "source"), "ky_upload")) {
                String str = x0.a(obj, "ky_photoId");
                if (str != null) {
                   intent.setData(objArray);
                }
                objArray = str;
             }
          }
          if (objArray != null) {
             tb.X7(b.a(0x37313f08).E(objArray).map(new e()).observeOn(d.a).subscribe(new t(tb), v.b));
          }
       }
    label_008f :
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
