package com.yxcorp.gifshow.growth.applink.GrowthAppLinkActivity;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import zma.a;
import android.content.Intent;
import android.net.Uri;
import o56.f;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.content.Context;

public final class GrowthAppLinkActivity extends Activity	// class@0012f1
{

    public void GrowthAppLinkActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GrowthAppLinkActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       Object obj = this;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, GrowthAppLinkActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       Uri uri = null;
       if (!PatchProxy.applyVoidOneRefs(obj, uri, a.class, str)) {
          Intent intent = this.getIntent();
          Uri data = (intent != null)? intent.getData(): uri;
          if (data == null) {
             a.b(a.b, f.a(), null, null, false, 1001, null, 32, null);
          }
          if (data != null) {
             a b = a.b;
             a.o(data, "uri");
             if (b.a(data)) {
                try{
                   uri = Uri.parse(a.a+Uri.encode(data.toString()));
                }catch(java.lang.Exception e0){
                   a.b(a.b, f.a(), data.toString(), null, false, 1002, null, 32, null);
                }
             }else {
                a.b(b, f.a(), data.toString(), null, false, 1002, null, 32, null);
             }
          }
       }
       this.finish();
       return;
    }
}
