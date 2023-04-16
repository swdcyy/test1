package com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$6;
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
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import g59.h;

public final class WebViewFollowToolBarPresenter$initClickListener$6 extends Lambda implements l	// class@0018af
{
    public final r2 this$0;

    public void WebViewFollowToolBarPresenter$initClickListener$6(r2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewFollowToolBarPresenter$initClickListener$6.class, "1")) {
          return;
       }
       a.p(p0, "it");
       PhotoAdvertisement photoAdverti = k.B(r2.P8(this.this$0));
       Activity activity = this.this$0.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       r2 p = this.this$0.p;
       if (p == null) {
          a.S("mFeed");
       }
       h.a(activity, p, photoAdverti);
       return;
    }
}
