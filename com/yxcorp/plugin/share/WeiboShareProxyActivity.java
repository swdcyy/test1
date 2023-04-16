package com.yxcorp.plugin.share.WeiboShareProxyActivity;
import com.sina.weibo.sdk.share.WbShareCallback;
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
import android.content.Intent;
import java.lang.Integer;
import com.sina.weibo.sdk.openapi.IWBAPI;
import android.os.Bundle;
import pic.h;
import java.util.Objects;
import pic.h$a;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.sina.weibo.sdk.auth.AuthInfo;
import wkd.b;
import mhc.y;
import mhc.f2;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import android.os.Parcelable;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.common.UiError;

public class WeiboShareProxyActivity extends GifshowActivity implements WbShareCallback	// class@000942
{
    public IWBAPI y;
    public boolean z;

    public void WeiboShareProxyActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, WeiboShareProxyActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://weiboshareproxy";
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(WeiboShareProxyActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, WeiboShareProxyActivity.class, "2")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       WeiboShareProxyActivity ty = this.y;
       if (ty != null) {
          ty.doResultIntent(p2, this);
       }
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, WeiboShareProxyActivity.class, "8")) {
          return;
       }
       this.setResult(1, new Intent().putExtra("result_data", "cancel"));
       this.finish();
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, WeiboShareProxyActivity.class, "6")) {
          return;
       }
       this.setResult(0, new Intent().putExtra("result_data", "success"));
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       WeiboShareProxyActivity weiboSharePr = WeiboShareProxyActivity.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, weiboSharePr, str)) {
          return;
       }
       super.onCreate(p0);
       h$a b0 = h.B0;
       Objects.requireNonNull(b0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h$a uoa = h$a.class;
       IWBAPI iWBAPI = PatchProxy.applyOneRefs(this, b0, uoa, "2");
       if (iWBAPI != patchProxyRe) {
       }else {
          a.p(this, "activity");
          iWBAPI = WBAPIFactory.createWBAPI(this);
          str = PatchProxy.apply(null, b0, uoa, str);
          if (str != patchProxyRe) {
          }else {
             f2 obj = b.a(0x91df3e4);
             a.o(obj, "Singleton.get\(ForwardService::class.java\)");
             obj = obj.a();
             a.o(obj, "Singleton.get\(ForwardSer¡­::class.java\).shareConfig");
             str = obj.d();
             a.o(str, "Singleton.get\(ForwardSer¡­a\).shareConfig.weiboAppId");
          }
          iWBAPI.registerApp(this, new AuthInfo(this, str, "http://www.gifshow.com/i/connect/cbsina", "email,friendships_groups_read,,statuses_to_me_read,follow_app_official_microblog,invitation_write"));
          a.o(iWBAPI, "WBAPIFactory.createWBAPI¡­CALLBACK, SCOPE\)\)\n      }");
       }
       this.y = iWBAPI;
       if (p0 != null) {
          iWBAPI.doResultIntent(this.getIntent(), this);
       }else {
          this.z = true;
       }
       if (!PatchProxy.applyVoid(null, this, weiboSharePr, "4")) {
          if (this.y.isWBAppInstalled()) {
             String str1 = "share_text";
             String str2 = "share_image";
             if (!this.getIntent().hasExtra(str1) && (this.getIntent().hasExtra(str2) || this.getIntent().hasExtra("share_web_page"))) {
                if (!PatchProxy.applyVoid(null, this, weiboSharePr, "5")) {
                   WeiboMultiMessage weiboMultiMe = new WeiboMultiMessage();
                   if (this.getIntent().hasExtra(str1)) {
                      weiboMultiMe.textObject = this.getIntent().getParcelableExtra(str1);
                   }
                   if (this.getIntent().hasExtra(str2)) {
                      ImageObject parcelableEx = this.getIntent().getParcelableExtra(str2);
                      Bitmap uBitmap = BitmapUtil.q(new File(parcelableEx.imagePath));
                      if (uBitmap != null) {
                         parcelableEx.imageData = BitmapUtil.B(uBitmap);
                         parcelableEx.imagePath = null;
                      }
                      weiboMultiMe.imageObject = parcelableEx;
                   }
                   if (this.getIntent().hasExtra("share_web_page")) {
                      weiboMultiMe.mediaObject = this.getIntent().getParcelableExtra("share_web_page");
                   }
                   this.y.shareMessage(this, weiboMultiMe, true);
                }
             }
          }
          this.finish();
       }
       return;
    }
    public void onError(UiError p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WeiboShareProxyActivity.class, "7")) {
          return;
       }
       this.setResult(2, new Intent().putExtra("result_data", "fail"));
       this.finish();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, WeiboShareProxyActivity.class, "3")) {
          return;
       }
       super.onResume();
       if (this.z != null) {
          this.z = false;
       }else {
          this.setResult(3, new Intent().putExtra("result_data", this.getString(R.string.arg_RES_7f104f67)));
          this.finish();
       }
       return;
    }
}
