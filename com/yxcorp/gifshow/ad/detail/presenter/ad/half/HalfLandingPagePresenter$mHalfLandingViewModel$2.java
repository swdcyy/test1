package com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter$mHalfLandingViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter;
import bz8.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;

public final class HalfLandingPagePresenter$mHalfLandingViewModel$2 extends Lambda implements a	// class@0015a9
{
    public final HalfLandingPagePresenter this$0;

    public void HalfLandingPagePresenter$mHalfLandingViewModel$2(HalfLandingPagePresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final o invoke(){
       Activity obj = PatchProxy.apply(null, this, HalfLandingPagePresenter$mHalfLandingViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getActivity();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       ViewModel viewModel = ViewModelProviders.of(obj).get(o.class);
       a.o(viewModel, "ViewModelProviders.of\(ac¡­ingViewModel::class.java\)");
       return viewModel;
    }
    public Object invoke(){
       return this.invoke();
    }
}
