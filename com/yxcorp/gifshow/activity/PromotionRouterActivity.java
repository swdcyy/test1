package com.yxcorp.gifshow.activity.PromotionRouterActivity;
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
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.security.LogEncryptor;
import wkd.b;
import ugc.a;
import s00.b$b;
import s00.b;
import brd.t;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import cjd.e;
import erd.o;
import fw8.w;
import fw8.v;
import erd.g;
import crd.b;
import ekd.w0;
import java.lang.CharSequence;
import java.lang.Throwable;
import java.lang.Boolean;
import nf6.f;
import nf6.i;
import android.content.pm.PackageManager;
import android.content.ComponentName;

public class PromotionRouterActivity extends GifshowActivity	// class@001337
{
    public static final int y;

    public void PromotionRouterActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PromotionRouterActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "kwai://promotion";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PromotionRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Uri data = this.getIntent().getData();
       if (data == null) {
          this.finish();
          return;
       }else {
          this.setContentView(R.layout.arg_RES_7f0d0036);
          b.a(-1641220124).a(data.toString(), a.a, b.b().a(LogEncryptor.c.a((TextUtils.k(SystemUtil.m(a.B))).getBytes()))).compose(this.E2(ActivityEvent.DESTROY)).map(new e()).subscribe(new w(this), new v(this));
          return;
       }
    }
    public final Uri u3(){
       Object[] objArray = null;
       Uri obj = PatchProxy.apply(objArray, this, PromotionRouterActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent().getData();
       if (obj == null) {
          return objArray;
       }
       String str = w0.a(obj, "url");
       if (!TextUtils.x(str)) {
          objArray = w0.f(str);
       }
       return objArray;
    }
    public final void v3(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PromotionRouterActivity.class, "3")) {
          return;
       }
       this.w3(this.u3());
       this.finish();
       return;
    }
    public final boolean w3(Uri p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PromotionRouterActivity promotionRou = PromotionRouterActivity.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, promotionRou, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (b.a(0x4e47d439).c(this, p0, null) != 1) {
          return true;
       }
       Intent intent = b.a(0x66dce92a).a(this, p0);
       obj = PatchProxy.applyOneRefs(intent, this, promotionRou, "6");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(intent == null || intent.resolveActivity(this.getPackageManager()) == null){
          ComponentName component = intent.getComponent();
          if (component == null || !(component.getClassName()).equals(promotionRou.getName())) {
             b = true;
          }
       }
       b = false;
       if (b) {
          this.startActivity(intent);
          return true;
       }else {
          return false;
       }
    }
}
