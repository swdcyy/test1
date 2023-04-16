package com.kwai.yoda.controller.YodaWebViewFragmentController;
import com.kwai.yoda.controller.YodaWebViewController;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.yoda.controller.YodaWebViewFragmentController$titleBarManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.controller.YodaWebViewFragmentController$statusBarManager$2;
import com.kwai.yoda.controller.YodaWebViewFragmentController$viewComponentManager$2;
import com.kwai.yoda.controller.YodaWebViewFragmentController$pageActionManager$2;
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
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import com.kwai.yoda.model.LaunchModel;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources;
import android.os.Bundle;
import yb7.b;
import java.io.Serializable;

public class YodaWebViewFragmentController extends YodaWebViewController	// class@0011bd
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final Fragment e;

    public void YodaWebViewFragmentController(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.e = p0;
       this.a = s.c(new YodaWebViewFragmentController$titleBarManager$2(this));
       this.b = s.c(new YodaWebViewFragmentController$statusBarManager$2(this));
       this.c = s.c(new YodaWebViewFragmentController$viewComponentManager$2(this));
       this.d = s.c(new YodaWebViewFragmentController$pageActionManager$2(this));
    }
    public j a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewFragmentController yodaWebViewF = YodaWebViewFragmentController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewF, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewF, "4");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.d.getValue();
       }
       return obj1;
    }
    public o b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewFragmentController yodaWebViewF = YodaWebViewFragmentController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewF, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewF, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.c.getValue();
       }
       return obj1;
    }
    public l c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewFragmentController yodaWebViewF = YodaWebViewFragmentController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewF, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewF, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       return obj1;
    }
    public k d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       YodaWebViewFragmentController yodaWebViewF = YodaWebViewFragmentController.class;
       Object obj = PatchProxy.apply(null, this, yodaWebViewF, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, yodaWebViewF, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.b.getValue();
       }
       return obj1;
    }
    public final Fragment e(){
       return this.e;
    }
    public View findStatusSpace(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, YodaWebViewFragmentController.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.getView();
       if (obj != null) {
          objArray = obj.findViewById(R.id.status_space);
       }
       return objArray;
    }
    public YodaBaseWebView findWebView(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, YodaWebViewFragmentController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.getView();
       SwipeRefreshLayout swipeRefresh = (obj != null)? obj.findViewById(R.id.yoda_refresh_layout): objArray;
       YodaBaseWebView yodaBaseWebV = l.d().a(this.e.requireActivity());
       if (yodaBaseWebV != null) {
          ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
          if (swipeRefresh != null) {
             swipeRefresh.addView(yodaBaseWebV, layoutParams);
          }
          objArray = yodaBaseWebV;
       }
       return objArray;
    }
    public Context getContext(){
       Context obj = PatchProxy.apply(null, this, YodaWebViewFragmentController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.requireContext();
       a.h(obj, "fragment.requireContext\(\)");
       return obj;
    }
    public LaunchModel getLaunchModel(){
       return this.mLaunchModel;
    }
    public int getTitleBarHeight(){
       TypedValue obj = PatchProxy.apply(null, this, YodaWebViewFragmentController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new TypedValue();
       this.e.getResources().getValue(R.dimen.arg_RES_7f070fdc, obj, true);
       return (int)TypedValue.complexToFloat(obj.data);
    }
    public YodaBaseWebView getWebView(){
       return this.mWebView;
    }
    public LaunchModel resolveLaunchModel(){
       Bundle obj = PatchProxy.apply(null, this, YodaWebViewFragmentController.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.getArguments();
       LaunchModel launchModel = (b.a(obj, "model"))? b.c(obj, "model"): this.mLaunchModel;
       return launchModel;
    }
}
