package com.yxcorp.gifshow.ad.webview.jshandler.b;
import zl9.b;
import p59.t;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import mxb.i;
import zl9.e;
import com.yxcorp.gifshow.ad.webview.AdWebInterceptUtil;
import com.kuaishou.android.model.feed.VideoFeed;
import tw.g;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.yxcorp.gifshow.photoad.model.AdUrlDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import tw.j;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import com.kwai.sdk.switchconfig.a;
import p59.q;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Exception;
import zl9.a;

public class b implements b	// class@0018f6
{
    public final t a;
    public i b;

    public void b(t p0){
       super();
       this.a = p0;
    }
    public final void a(AdUrlInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p0.mAppName)) {
          p0.mAppName = "";
          return;
       }else if(((p0.mAppName).toLowerCase()).endsWith(".apk")){
          return;
       }else {
          p0.mAppName = p0.mAppName+".apk";
          return;
       }
    }
    public void b(i p0){
       this.b = p0;
    }
    public void e(String p0,e p1){
       boolean b;
       t a;
       AdDataWrapper$AdLogParamAppender adLogParamAp;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "1")) {
          return;
       }
       int i = -1;
       try{
          if (AdWebInterceptUtil.b(this.a)) {
             return;
          }else {
             b ta = this.a;
             if (ta.d == null) {
                ta.d = g.a();
             }
             b = a.a.h(p0, AdUrlInfo.class);
             if (b == null || TextUtils.isEmpty(b.mUrl)) {
                p1.onError(i, "url is empty");
                return;
             }else {
                a = this.a.a;
                this.a(b);
                b tb = this.b;
                if (tb != null) {
                   adLogParamAp = tb.getAdLogParamAppender();
                   b.mNeedNonAdLogReport = this.b.a();
                }else {
                   adLogParamAp = null;
                }
                AdUrlDataWrapper uAdUrlDataWr = new AdUrlDataWrapper(b, this.a.d, adLogParamAp);
                int i1 = 1;
                if (!j.B(b.mType) && (n.I(a) && b.mIsLandscapeSupported == null)) {
                   a.setRequestedOrientation(i1);
                }
             label_0071 :
                AdDownloaderType uAdDownloade = PatchProxy.applyOneRefs(b, this, uob, "2");
                if (uAdDownloade != PatchProxyResult.class) {
                }else if(b.mIsFromLive == null){
                   uAdDownloade = AdDownloaderType.DOWNLOAD_FULL_SPEED;
                }else if(a.t().d("enableAdLiveUseHodor", i1)){
                   uAdDownloade = AdDownloaderType.DOWNLOAD_LIMIT_SPEED;
                }else {
                   uAdDownloade = AdDownloaderType.DOWNLOAD_FULL_SPEED;
                }
                Object obj = uAdDownloade;
                q oq = new q(this, a, uAdUrlDataWr, obj, b);
                k1.o(uAdDownloade);
                p1.onSuccess(null);
             }
          }
       }catch(java.lang.Exception e10){
          p1.onError(i, e10.getMessage());
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "handleAdUrl";
    }
    public void onDestroy(){
       a.a(this);
    }
}
