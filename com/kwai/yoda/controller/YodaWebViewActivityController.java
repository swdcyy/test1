package com.kwai.yoda.controller.YodaWebViewActivityController;
import com.kwai.yoda.controller.YodaWebViewController;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.yoda.controller.YodaWebViewActivityController$titleBarManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.controller.YodaWebViewActivityController$statusBarManager$2;
import com.kwai.yoda.controller.YodaWebViewActivityController$viewComponentManager$2;
import com.kwai.yoda.controller.YodaWebViewActivityController$pageActionManager$2;
import my7.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dz7.l;
import my7.o;
import dz7.f;
import my7.l;
import dz7.n;
import my7.k;
import dz7.m;
import android.view.View;
import com.kwai.yoda.bridge.YodaBaseWebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import gy7.l;
import mz7.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources;
import java.lang.Boolean;
import com.kwai.yoda.model.LaunchModel;
import android.content.Intent;
import android.os.Bundle;
import yb7.b;
import java.io.Serializable;
import com.kwai.yoda.util.a;
import java.lang.Exception;
import com.kwai.yoda.helper.WebViewMemOptHelper;
import com.kwai.yoda.model.LaunchModelInternal;

public class YodaWebViewActivityController extends YodaWebViewController	// class@0011b7
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final Activity e;

    public void YodaWebViewActivityController(Activity p0){
       a.q(p0, "activity");
       super();
       this.e = p0;
       this.a = s.c(new YodaWebViewActivityController$titleBarManager$2(this));
       this.b = s.c(new YodaWebViewActivityController$statusBarManager$2(this));
       this.c = s.c(new YodaWebViewActivityController$viewComponentManager$2(this));
       this.d = s.c(new YodaWebViewActivityController$pageActionManager$2(this));
    }
    public j a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewActivityController yodaWebViewA = YodaWebViewActivityController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewA, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewA, "4");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.d.getValue();
       }
       return obj1;
    }
    public o b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewActivityController yodaWebViewA = YodaWebViewActivityController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewA, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewA, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.c.getValue();
       }
       return obj1;
    }
    public l c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewActivityController yodaWebViewA = YodaWebViewActivityController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewA, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewA, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       return obj1;
    }
    public k d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewActivityController yodaWebViewA = YodaWebViewActivityController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewA, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewA, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.b.getValue();
       }
       return obj1;
    }
    public final Activity e(){
       return this.e;
    }
    public View findStatusSpace(){
       View obj = PatchProxy.apply(null, this, YodaWebViewActivityController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.findViewById(R.id.status_space);
       a.h(obj, "activity.findViewById<View>\(R.id.status_space\)");
       return obj;
    }
    public YodaBaseWebView findWebView(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, YodaWebViewActivityController.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.findViewById(R.id.yoda_refresh_layout);
       a.h(obj, "activity.findViewById\(R.бн    .yoda_refresh_layout\)");
       YodaBaseWebView yodaBaseWebV = l.d().b(this.e, this.mContainerSession);
       if (yodaBaseWebV != null) {
          obj.addView(yodaBaseWebV, new ViewGroup$LayoutParams(-1, -1));
          objArray = yodaBaseWebV;
       }
       return objArray;
    }
    public Context getContext(){
       return this.e;
    }
    public int getTitleBarHeight(){
       TypedValue obj = PatchProxy.apply(null, this, YodaWebViewActivityController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new TypedValue();
       this.e.getResources().getValue(R.dimen.arg_RES_7f070fdc, obj, true);
       return (int)TypedValue.complexToFloat(obj.data);
    }
    public boolean onCreate(){
       LaunchModel launchModel1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewActivityController yodaWebViewA = YodaWebViewActivityController.class;
       Object[] objArray = null;
       YodaWebViewController obj = PatchProxy.apply(objArray, this, yodaWebViewA, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       LaunchModel launchModel = PatchProxy.apply(objArray, this, yodaWebViewA, "7");
       if (launchModel != patchProxyRe) {
       }else {
          Intent intent = this.e.getIntent();
          Bundle extras = (intent != null)? intent.getExtras(): objArray;
          String str = "model";
          if (b.a(extras, str)) {
             Bundle extras1 = (intent != null)? intent.getExtras(): objArray;
             launchModel1 = b.c(extras1, str);
          }else {
             launchModel1 = this.mLaunchModel;
          }
          launchModel = launchModel1;
       }
       this.mLaunchModel = launchModel;
       try{
          a.a(this.e);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (this.invalidLaunchModel()) {
          this.e.finish();
          return true;
       }else {
          WebViewMemOptHelper g = WebViewMemOptHelper.g;
          yodaWebViewA = this.e;
          obj = this.mLaunchModel;
          if (obj != null) {
             objArray = obj.getUrl();
          }
          g.h(yodaWebViewA, objArray);
          return super.onCreate();
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaWebViewActivityController.class, "6")) {
          return;
       }
       WebViewMemOptHelper g = WebViewMemOptHelper.g;
       YodaWebViewActivityController te = this.e;
       YodaWebViewController tmLaunchMode = this.mLaunchModel;
       if (tmLaunchMode != null) {
          objArray = tmLaunchMode.getUrl();
       }
       g.i(te, objArray);
       super.onDestroy();
       return;
    }
    public LaunchModel resolveLaunchModel(){
       LaunchModel launchModel;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, YodaWebViewActivityController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.getIntent();
       Bundle extras = (obj != null)? obj.getExtras(): objArray;
       if (b.a(extras, "model")) {
          if (obj != null) {
             objArray = obj.getExtras();
          }
          launchModel = b.c(objArray, "model");
       }else {
          launchModel = this.mLaunchModel;
       }
       return launchModel;
    }
}
