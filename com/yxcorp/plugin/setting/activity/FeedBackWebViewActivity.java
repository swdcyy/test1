package com.yxcorp.plugin.setting.activity.FeedBackWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import java.lang.Integer;
import jyc.b;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.os.SystemClock;
import java.lang.System;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;

public class FeedBackWebViewActivity extends KwaiWebViewActivity	// class@000806
{

    public void FeedBackWebViewActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FeedBackWebViewActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedBackWebViewActivity.class, "1")) {
          return;
       }
       Intent intent = KwaiWebViewActivity.N3(this, b.e(WebEntryUrls.e, Integer.parseInt(x0.a(this.getIntent().getData(), "channel")))).o("ks://feedback").a();
       this.setIntent(intent);
       intent.addFlags(0x10000000);
       intent.putExtra("userIntentRealTime", SystemClock.elapsedRealtime());
       intent.putExtra("userIntentTimestamp", System.currentTimeMillis());
       super.onCreate(p0);
       return;
    }
}
