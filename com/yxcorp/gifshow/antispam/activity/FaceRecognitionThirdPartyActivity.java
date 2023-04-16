package com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.yxcorp.gifshow.antispam.activity.FaceRecognitionThirdPartyActivity$a;
import du5.g;
import du5.f;

public class FaceRecognitionThirdPartyActivity extends GifshowActivity	// class@001b80
{

    public void FaceRecognitionThirdPartyActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FaceRecognitionThirdPartyActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceRecognitionThirdPartyActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d002d);
       Uri data = this.getIntent().getData();
       if (data != null && data.isHierarchical()) {
          String queryParamet = data.getQueryParameter("recognitionUrl");
          if (TextUtils.x(queryParamet)) {
             Log.g("FaceRecognitionThirdPartyActivity", "recognitionUrl = null");
             this.finish();
             return;
          }else {
             queryParamet = Uri.decode(queryParamet);
             Log.g("FaceRecognitionThirdPartyActivity", "recognitionUrl  = "+queryParamet+", appId = "+data.getQueryParameter("appId"));
             q.b(a.a().a());
             FaceRecognitionThirdPartyActivity$a uoa = new FaceRecognitionThirdPartyActivity$a(this, queryParamet);
             f.a(this, uoa, "ft-platform-FaceRecognition");
          }
       }else {
          this.finish();
       }
       return;
    }
}
