package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$1;
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
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public final class AdMKPageLoadPresenter$initBridge$1 extends Lambda implements l	// class@00184c
{
    public final AdMKPageLoadPresenter this$0;

    public void AdMKPageLoadPresenter$initBridge$1(AdMKPageLoadPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       AdMKPageLoadPresenter obj = PatchProxy.applyOneRefs(p0, this, AdMKPageLoadPresenter$initBridge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       this.this$0.R8().c("pageTitle "+p0);
       obj = this.this$0.q;
       if (obj == null) {
          a.S("mKwaiActionBar");
       }
       obj.r(p0.optString("title"));
       return "";
    }
}
