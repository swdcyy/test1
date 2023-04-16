package com.kwai.component.misc.report.ReportYodaActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Context;
import java.lang.String;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.misc.report.ReportActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.webview.c;
import java.util.HashMap;
import com.kwai.yoda.model.LaunchModel$a;
import java.util.Map;
import com.kwai.yoda.model.LaunchModel;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import android.os.Bundle;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;

public class ReportYodaActivity extends KwaiYodaWebViewActivity	// class@0009d7
{

    public void ReportYodaActivity(){
       super();
    }
    public static void M3(Context p0,String p1,ReportInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ReportYodaActivity.class, "1")) {
          return;
       }
       Intent intent = KwaiWebViewActivity.M3(p0, ReportYodaActivity.class, ReportActivity.O3(p1, p2)).a();
       intent.putExtra("key_photo", b.c(p2.mPhoto));
       c.i(p0, intent);
       return;
    }
    public static void N3(Context p0,String p1,ReportInfo p2,String p3,String p4){
       int i = 3;
       if (PatchProxy.isSupport(ReportYodaActivity.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ReportYodaActivity.class, "2")) {
             return;
          }
       }
       p1 = ReportActivity.O3(p1, p2);
       HashMap hashMap = new HashMap(i);
       hashMap.put("referUrl", p3);
       hashMap.put("referElement", p4);
       LaunchModel$a uoa = new LaunchModel$a(p1);
       uoa.d(hashMap);
       KwaiWebViewActivity$a uoa1 = KwaiWebViewActivity.M3(p0, ReportYodaActivity.class, p1);
       uoa1.h(uoa.a());
       Intent intent = uoa1.a();
       intent.putExtra("key_photo", b.c(p2.mPhoto));
       c.i(p0, intent);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ReportYodaActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, ReportYodaActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.t().d("yoda_user_report_status_bar_use_color_transparent", false)) {
          return false;
       }
       return super.getStatusColor();
    }
    public String getUrl(){
       return "ks://report";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReportYodaActivity.class, "3")) {
          return;
       }
       BaseFeed uBaseFeed = b.a(this.getIntent().getParcelableExtra("key_photo"));
       if (uBaseFeed != null) {
          this.I3("key_qphoto", new QPhoto(uBaseFeed));
       }
       super.onCreate(p0);
       return;
    }
}
