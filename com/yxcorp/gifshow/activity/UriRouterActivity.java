package com.yxcorp.gifshow.activity.UriRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import jd6.g;
import com.kwai.framework.plugin.PluginManager;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.net.Uri;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.net.Uri$Builder;
import wkd.b;
import nf6.f;
import android.content.Context;
import nf6.e;
import xh7.b;
import java.lang.Boolean;
import xh7.a;
import o56.f;
import fw8.t;
import com.kwai.sdk.switchconfig.a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import wd6.a;
import fw8.y;
import qh7.b;
import qh7.a;

public class UriRouterActivity extends GifshowActivity	// class@001037
{
    public boolean y;
    public static final int z;

    static {
       if (g.d("live_audience_plugin")) {
          PluginManager.H.P("live_audience_plugin", 1);
       }
    }
    public void UriRouterActivity(){
       super();
       this.y = true;
    }
    public void G2(Intent p0){
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, UriRouterActivity.class, "2")) {
          return;
       }
       if (this.y != null) {
          super.f3();
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UriRouterActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://uri_router";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UriRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Uri data = this.getIntent().getData();
       boolean b = false;
       this.o3(b);
       String str = 2;
       int i = 0x4e47d439;
       boolean b1 = true;
       if (data != null) {
          Log.g("UriRouterActivity", "scheme: "+data.toString());
          if (("wx9227d48257374438").equals(data.getScheme())) {
             Uri$Builder uBuilder = data.buildUpon();
             uBuilder.scheme("kwai");
             data = uBuilder.build();
          }
          i = b.a(i).c(this, data, this.getIntent());
          if (i != b1) {
             this.y = b;
             if (i == str) {
                this.finish();
             }
             return;
          }else {
             e.e(data);
             b uob = b.j(this, data.toString());
             uob.h("UriRouterActivity", Boolean.TRUE);
             uob.h("com.kwai.platform.krouter.UriRouterActivityHandler", "blank");
             if (f.c(f.a())) {
                uob.o(0x10000000);
             }
             if (this.getIntent().getExtras() != null) {
                uob.h("com.kwai.platform.krouter.handler.extra_intent", this.getIntent().getExtras());
             }
             String str1 = t.a(uob);
             if (str1 != null) {
                Log.g("UriRouterActivity", "dynamicFeature: "+str1);
             }
             boolean b2 = a.t().d("openPluginRouterHandler", b1);
             Log.g("UriRouterActivity", "switch open : "+b2);
             if (!b2 && t.b(uob)) {
                Log.g("UriRouterActivity", "start PluginLinkInterceptActivity");
                a.a(Dva.instance().getPluginInstallManager(), str1, this, this.getIntent());
                this.finish();
             }else {
                a.b(uob, new y(this, uob));
             }
             return;
          }
       }else {
          int i1 = b.a(i).b(this, this.getIntent());
          if (i1 != b1) {
             this.y = b;
             if (i1 == str) {
                this.finish();
             }
             return;
          }else {
             this.finish();
             return;
          }
       }
    }
}
