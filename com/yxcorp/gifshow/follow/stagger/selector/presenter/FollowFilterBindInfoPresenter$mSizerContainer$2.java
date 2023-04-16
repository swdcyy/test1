package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$mSizerContainer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter;
import com.yxcorp.gifshow.panel.sizer.view.MaxHeightFrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import kotlin.jvm.internal.a;

public final class FollowFilterBindInfoPresenter$mSizerContainer$2 extends Lambda implements a	// class@001230
{
    public final FollowFilterBindInfoPresenter this$0;

    public void FollowFilterBindInfoPresenter$mSizerContainer$2(FollowFilterBindInfoPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final MaxHeightFrameLayout invoke(){
       View obj = PatchProxy.apply(null, this, FollowFilterBindInfoPresenter$mSizerContainer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = m1.f(this.this$0.m8(), R.id.mhf_sizer);
       a.o(obj, "ViewBindUtils.bindWidget\(rootView, R.id.mhf_sizer\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
