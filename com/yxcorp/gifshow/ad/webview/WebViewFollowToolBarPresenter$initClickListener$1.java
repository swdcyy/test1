package com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import k59.r2;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class WebViewFollowToolBarPresenter$initClickListener$1 extends Lambda implements l	// class@0018aa
{
    public final r2 this$0;

    public void WebViewFollowToolBarPresenter$initClickListener$1(r2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewFollowToolBarPresenter$initClickListener$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Activity activity = this.this$0.getActivity();
       if (activity != null) {
          activity.onBackPressed();
       }
       return;
    }
}
