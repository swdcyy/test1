package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class AdMKPageLoadPresenter$initBridge$4 extends Lambda implements l	// class@00184e
{
    public final AdMKPageLoadPresenter this$0;

    public void AdMKPageLoadPresenter$initBridge$4(AdMKPageLoadPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMKPageLoadPresenter$initBridge$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Activity activity = this.this$0.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return "";
    }
}
