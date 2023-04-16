package com.yxcorp.gifshow.growth.activity.DeepLinkRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.j0;
import android.net.Uri;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import wkd.b;
import nf6.f;
import android.content.Context;
import nf6.i;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.yxcorp.gifshow.log.h;

public class DeepLinkRouterActivity extends GifshowActivity	// class@0012e8
{
    public boolean y;

    public void DeepLinkRouterActivity(){
       super();
       this.y = true;
    }
    public void G2(Intent p0){
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, DeepLinkRouterActivity.class, "2")) {
          return;
       }
       if (this.y != null) {
          super.f3();
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DeepLinkRouterActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://deeplink_router";
    }
    public void onCreate(Bundle p0){
       Uri uri;
       boolean b;
       DeepLinkRouterActivity uDeepLinkRou = DeepLinkRouterActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDeepLinkRou, "1")) {
          return;
       }
       super.onCreate(p0);
       String str = j0.f(this.getIntent(), "customAppUri");
       if (str != null) {
          uri = Uri.parse(str);
          this.setResult(-1);
       }else {
          uri = this.getIntent().getData();
       }
       if (uri != null) {
          Object[] objArray = new Object[0];
          w.C().w("DeepLinkRouterActivity", "scheme: "+uri.toString(), objArray);
          int i = b.a(0x4e47d439).c(this, uri, this.getIntent());
          if (i != 1) {
             this.y = false;
             if (i == 2) {
                this.finish();
             }
             return;
          }else {
             Intent intent = b.a(0x66dce92a).a(this, uri);
             ComponentName obj = PatchProxy.applyOneRefs(intent, this, uDeepLinkRou, "3");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(intent == null || intent.resolveActivity(this.getPackageManager()) == null){
                try{
                   obj = intent.getComponent();
                   if (obj == null || !(obj.getClassName()).equals(uDeepLinkRou.getName())) {
                      b = this.getPackageManager().getActivityInfo(obj, 0).exported;
                   }
                }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                   e0.printStackTrace();
                }
             }
             if (b != null) {
                intent.addFlags(0x10000000);
                this.y = false;
                this.startActivity(intent);
                b.a(0x4b316083).p0("URI", true);
                this.finish();
                return;
             }else {
                this.finish();
                return;
             }
          }
       }else {
          this.finish();
          return;
       }
    }
}
