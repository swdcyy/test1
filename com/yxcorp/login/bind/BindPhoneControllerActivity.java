package com.yxcorp.login.bind.BindPhoneControllerActivity;
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
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.Exception;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import tkd.b;
import tkd.d;
import ou5.b;
import c1d.a;
import android.content.Context;
import java.util.Map;
import n3d.a;

public class BindPhoneControllerActivity extends GifshowActivity	// class@001a3d
{
    public BindPhoneParams A;
    public String y;
    public boolean z;
    public static final int B;

    public void BindPhoneControllerActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, BindPhoneControllerActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       BindPhoneControllerActivity uBindPhoneCo = BindPhoneControllerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBindPhoneCo, "1")) {
          return;
       }
       super.onCreate(p0);
       Uri data = this.getIntent().getData();
       if (!PatchProxy.applyVoidOneRefs(data, this, uBindPhoneCo, "2")) {
          String str = w0.a(data, "bindSource");
          this.y = str;
          if (TextUtils.x(str)) {
             this.y = "schema";
          }
          try{
             this.z = Boolean.parseBoolean(w0.a(data, "isDialog"));
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
          }
          BindPhoneParams$b uob = new BindPhoneParams$b();
          BindPhoneParams$FirstStepPageStyle pHONE_ONEKEY = (this.z != null)? BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_DIALOG_FIRST: BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_PAGE_FIRST;
          uob.f(pHONE_ONEKEY);
          this.A = uob.a();
       }
       d.a(-1712118428).ew(this, this.A, null, this.y, new a(this));
       return;
    }
}
