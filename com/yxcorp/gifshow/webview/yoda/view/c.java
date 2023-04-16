package com.yxcorp.gifshow.webview.yoda.view.c;
import com.kwai.yoda.controller.YodaWebViewFragmentController;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.yoda.view.b;
import my7.j;
import myc.h;
import my7.o;
import com.yxcorp.gifshow.webview.yoda.c;
import my7.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.yoda.e;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.webview.view.c;
import android.app.Activity;
import my7.k;
import myc.i;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import gy7.l;
import com.kwai.yoda.controller.YodaWebViewController;
import mz7.a;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.model.LaunchModel;
import dz7.q;
import qyc.c;
import qyc.d;
import java.lang.Number;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.app.Application;
import android.util.DisplayMetrics;
import cw9.c;
import lnc.a1;
import com.kwai.yoda.model.LaunchModelInternal;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import pyc.c;
import android.net.Uri;
import ekd.x0;
import java.lang.Boolean;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gifshow.webview.yoda.g;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.yoda.view.c$a;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.yoda.model.LaunchModel$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import yb7.b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import android.text.TextUtils;
import java.util.Objects;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public class c extends YodaWebViewFragmentController	// class@0017e7
{
    public final KwaiYodaWebViewFragment f;
    public h g;
    public l h;
    public c i;
    public i j;
    public c$a k;

    public void c(KwaiYodaWebViewFragment p0){
       super(p0);
       this.k = b.a;
       this.f = p0;
    }
    public j a(){
       return this.f();
    }
    public o b(){
       return this.g();
    }
    public l c(){
       Object obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = new e(this.e().getActivity(), this.f.vh());
       }
       return this.h;
    }
    public k d(){
       Object obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.j == null) {
          this.j = new i(this.e().getActivity(), this.f.Ch());
       }
       return this.j;
    }
    public h f(){
       Object obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = new h(this.e().getActivity(), this.getWebView());
       }
       return this.g;
    }
    public YodaBaseWebView findWebView(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       YodaBaseWebView yodaBaseWebV = l.d().b(this.e().requireActivity(), this.mContainerSession);
       yodaBaseWebV.setScrollBarStyle(0);
       m1.f(this.e().getView(), R.id.webView).addView(yodaBaseWebV);
       return yodaBaseWebV;
    }
    public c g(){
       YodaWebViewController obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          obj = this.mWebView;
          if (obj != null && obj.getLaunchModel() != null) {
             this.mWebView.getLaunchModel().getLoadingType();
          }
          this.i = new c(this.f, this.e().getView(), this.i(this.e().getView()), new c(this.f, this.e().getView()));
       }
       return this.i;
    }
    public int getStatusBarHeight(){
       Object obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)n.A(a.B) / c.c(a.B.getResources()).density);
    }
    public int getTitleBarHeight(){
       Object obj = PatchProxy.apply(null, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)a1.d(0x7f070fdf) / c.c(a.B.getResources()).density);
    }
    public String h(){
       LaunchModel obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getLaunchModel();
       if (obj != null) {
          return obj.getUrl();
       }
       return "";
    }
    public q i(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       YodaLoadingView yodaLoadingV = (p0 != null)? p0.findViewById(R.id.loading_view): null;
       return new c(yodaLoadingV);
    }
    public void initStatusPlace(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (Boolean.parseBoolean(x0.a(x0.f(this.h()), "statusSpace"))) {
          super.initStatusPlace();
       }
       return;
    }
    public YodaBaseWebView initWebView(){
       Object[] objArray = null;
       YodaBaseWebView obj = PatchProxy.apply(objArray, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.initWebView();
       WebViewClient webViewClien = this.f.sh();
       if (webViewClien instanceof g) {
          objArray = webViewClien;
       }
       if (objArray != null && obj instanceof KwaiYodaWebView) {
          obj.setYodaWebViewClient(objArray);
       }
       this.k.a(obj);
       return obj;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       IllegalArgumentException illegalArgum = new IllegalArgumentException();
       this.f.getActivity().finish();
       return;
    }
    public boolean k(){
       boolean b;
       String str1;
       FragmentActivity obj1;
       boolean b1;
       String str2;
       LaunchModel launchModel = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       GradientDrawable obj = PatchProxy.apply(objArray, launchModel, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, launchModel, uoc, "9");
       String str = "12";
       if (obj != patchProxyRe) {
       }else {
          Bundle arguments1 = launchModel.f.getArguments();
          if (arguments1 != null) {
             c uoc1 = c.class;
             if (!PatchProxy.applyVoidOneRefs(arguments1, objArray, uoc1, "21") && SerializableHook.getSerializable(arguments1, "model") == null) {
                String str3 = arguments1.getString("KEY_URL");
                LaunchModel launchModel3 = c.c(str3, arguments1.getString("KEY_BIZ_ID")).a();
                LaunchModel launchModel4 = launchModel3;
                String str4 = str3;
                LaunchModel launchModel5 = launchModel3;
                str2 = str3;
                c uoc2 = uoc1;
                Object obj2 = PatchProxy.applyThreeRefs(launchModel4, arguments1, str4, 0, c.class, "9");
                if (obj2 != patchProxyRe) {
                   launchModel3 = obj2;
                }else {
                   c.b(launchModel5, str2);
                   if (PatchProxy.applyTwoRefs(launchModel5, arguments1, null, uoc2, str) != patchProxyRe) {
                   }else {
                      str1 = arguments1.getString("ACTIONBAR_TITLE_COLOR");
                      if (!TextUtils.x(str1)) {
                         launchModel5.getExtras().put("ACTIONBAR_TITLE_COLOR", str1);
                      }
                      str1 = "KEY_HIDE_ACTIONBAR";
                      if (arguments1.containsKey(str1)) {
                         launchModel5.getExtras().put(str1, Boolean.toString(arguments1.getBoolean(str1, false)));
                      }
                      str1 = "KEY_ENABLE_SWIPE_BACK";
                      if (arguments1.containsKey(str1)) {
                         launchModel5.getExtras().put(str1, Boolean.toString(arguments1.getBoolean(str1, true)));
                      }
                   }
                   launchModel3 = launchModel5;
                }
                SerializableHook.putSerializable(arguments1, "model", launchModel3);
             }
          }
          LaunchModel launchModel1 = PatchProxy.apply(null, launchModel, YodaWebViewFragmentController.class, "6");
          if (launchModel1 != patchProxyRe) {
          }else {
             Bundle arguments2 = launchModel.e.getArguments();
             launchModel1 = (b.a(arguments2, "model"))? b.c(arguments2, "model"): launchModel.mLaunchModel;
          }
          LaunchModel launchModel2 = launchModel1;
          if (launchModel2 != null) {
             if (!PatchProxy.applyVoidOneRefs(launchModel2, launchModel, uoc, "10")) {
                obj1 = this.e().getActivity();
                str2 = (obj1 instanceof WebViewFragment$b)? obj1.T1(): null;
                if (!TextUtils.isEmpty(str2)) {
                   launchModel2.setUrl(str2);
                }
             }
             obj1 = PatchProxy.applyTwoRefs(launchModel2.getUrl(), launchModel2.getLoadHeaders(), launchModel, uoc, "11");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                Objects.requireNonNull(launchModel.f);
                b1 = true;
             }
             if (!b1) {
             label_00ed :
                launchModel2 = null;
             }
          }
       }
       launchModel.mLaunchModel = obj;
       if (this.invalidLaunchModel()) {
          this.j();
          return false;
       }else {
          objArray = null;
          obj = PatchProxy.apply(objArray, launchModel, uoc, str);
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             b = super.onCreate();
             if (!PatchProxy.applyVoid(objArray, launchModel, uoc, "13")) {
                Bundle arguments = this.e().getArguments();
                if (arguments != null) {
                   str1 = "KEY_ACTIONBAR_TOP_ROUND_DP";
                   str = "KEY_ACTIONBAR_BACKGROUND_SHAPE";
                   if (!arguments.containsKey(str1) && (arguments.containsKey("KEY_ACTIONBAR_BACKGROUND_COLOR") || arguments.containsKey(str))) {
                      obj = new GradientDrawable();
                      obj.setShape(0);
                      obj.setColor(a1.a(R.color.arg_RES_7f060028));
                      float f = (float)a1.e(arguments.getFloat(str1, 0));
                      float[] uofloatArray = new float[]{f,f,f,f,0,0,0,0};
                      obj.setCornerRadii(uofloatArray);
                      obj.setColor(a1.a(arguments.getInt("KEY_ACTIONBAR_BACKGROUND_COLOR", R.color.arg_RES_7f061e52)));
                      int i = 0;
                      obj.setShape(arguments.getInt(str, i));
                      launchModel.f.vh().l.setBackground(obj);
                      int intx = arguments.getInt("ACTIONBAR_TITLE_COLOR", i);
                      if (intx) {
                         launchModel.f.vh().l.s(intx);
                      }else {
                         launchModel.f.vh().l.s(R.color.arg_RES_7f061d77);
                      }
                      int intx1 = arguments.getInt("KEY_ACTIONBAR_LEFT_BUTTON_DRAWABLE", 0);
                      if (intx1) {
                         launchModel.f.vh().l.j(a1.f(intx1));
                      }
                   }
                }
             }
          }
          return b;
       }
    }
    public void loadUrl(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       super.loadUrl();
       return;
    }
    public boolean onCreate(){
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.onCreate();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          Bundle arguments = this.e().getArguments();
          if (arguments != null) {
             String str = "KEY_ACTIONBAR_TOP_ROUND_DP";
             if (!arguments.containsKey(str) && (arguments.containsKey("KEY_ACTIONBAR_BACKGROUND_COLOR") || arguments.containsKey("KEY_ACTIONBAR_BACKGROUND_SHAPE"))) {
                GradientDrawable gradientDraw = new GradientDrawable();
                gradientDraw.setShape(0);
                gradientDraw.setColor(a1.a(R.color.arg_RES_7f060028));
                float f = (float)a1.e(arguments.getFloat(str, 0));
                float[] uofloatArray = new float[]{f,f,f,f,0,0,0,0};
                gradientDraw.setCornerRadii(uofloatArray);
                gradientDraw.setColor(a1.a(arguments.getInt("KEY_ACTIONBAR_BACKGROUND_COLOR", R.color.arg_RES_7f061e52)));
                gradientDraw.setShape(arguments.getInt("KEY_ACTIONBAR_BACKGROUND_SHAPE", 0));
                this.f.vh().l.setBackground(gradientDraw);
                int intx = arguments.getInt("ACTIONBAR_TITLE_COLOR", 0);
                if (intx) {
                   this.f.vh().l.s(intx);
                }else {
                   this.f.vh().l.s(R.color.arg_RES_7f061d77);
                }
                int intx1 = arguments.getInt("KEY_ACTIONBAR_LEFT_BUTTON_DRAWABLE", 0);
                if (intx1) {
                   this.f.vh().l.j(a1.f(intx1));
                }
             }
          }
       }
       return b;
    }
    public LaunchModel resolveLaunchModel(){
       String str;
       c uoc = c.class;
       Bundle obj = PatchProxy.apply(null, this, uoc, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.getArguments();
       boolean b = true;
       if (obj != null && (!PatchProxy.applyVoidOneRefs(obj, null, c.class, "21") && SerializableHook.getSerializable(obj, "model") == null)) {
          String str1 = obj.getString("KEY_URL");
          LaunchModel launchModel1 = c.c(str1, obj.getString("KEY_BIZ_ID")).a();
          Object obj2 = PatchProxy.applyThreeRefs(launchModel1, obj, str1, null, c.class, "9");
          if (obj2 != PatchProxyResult.class) {
             launchModel1 = obj2;
          }else {
             c.b(launchModel1, str1);
             if (PatchProxy.applyTwoRefs(launchModel1, obj, null, c.class, "12") != PatchProxyResult.class) {
             }else {
                str = "ACTIONBAR_TITLE_COLOR";
                String str2 = obj.getString(str);
                if (!TextUtils.x(str2)) {
                   launchModel1.getExtras().put(str, str2);
                }
                str = "KEY_HIDE_ACTIONBAR";
                if (obj.containsKey(str)) {
                   launchModel1.getExtras().put(str, Boolean.toString(obj.getBoolean(str, false)));
                }
                str = "KEY_ENABLE_SWIPE_BACK";
                if (obj.containsKey(str)) {
                   launchModel1.getExtras().put(str, Boolean.toString(obj.getBoolean(str, b)));
                }
             }
          }
          SerializableHook.putSerializable(obj, "model", launchModel1);
       }
    label_00a8 :
       LaunchModel launchModel = PatchProxy.apply(null, this, YodaWebViewFragmentController.class, "6");
       if (launchModel != PatchProxyResult.class) {
       }else {
          obj = this.e.getArguments();
          launchModel = (b.a(obj, "model"))? b.c(obj, "model"): this.mLaunchModel;
       }
       if (launchModel == null) {
          return null;
       }else if(PatchProxy.applyVoidOneRefs(launchModel, this, uoc, "10")){
          FragmentActivity activity = this.e().getActivity();
          str = (activity instanceof WebViewFragment$b)? activity.T1(): null;
          if (!TextUtils.isEmpty(str)) {
             launchModel.setUrl(str);
          }
       }
       Object obj1 = PatchProxy.applyTwoRefs(launchModel.getUrl(), launchModel.getLoadHeaders(), this, uoc, "11");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          Objects.requireNonNull(this.f);
       }
       if (b) {
          return launchModel;
       }else {
          return null;
       }
    }
}
