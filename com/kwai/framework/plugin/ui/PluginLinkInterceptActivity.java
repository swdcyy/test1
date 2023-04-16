package com.kwai.framework.plugin.ui.PluginLinkInterceptActivity;
import mi7.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity$a;
import nsd.u;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import kotlin.LazyThreadSafetyMode;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity$isSpecifiedIntent$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity$mPluginNameFromSpecifiedIntent$2;
import android.content.Intent;
import java.lang.String;
import kotlin.jvm.internal.a;
import mi7.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.NullPointerException;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import java.lang.Throwable;
import qj7.d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import com.kwai.framework.activitycontext.ActivityContext;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import e17.i;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import java.lang.System;
import android.os.Parcelable;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity$d;
import java.lang.Runnable;
import java.lang.Long;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.text.TextUtils;
import com.kwai.dva.design.PluginInstallerUIHandler$e;
import android.os.Bundle;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity$b;
import t45.c;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.framework.plugin.PluginManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor;
import android.content.Context;
import com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor$a;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity$c;
import android.view.Window;
import android.view.View;

public final class PluginLinkInterceptActivity extends GifshowActivity implements e	// class@000cc4
{
    public final Handler A;
    public int B;
    public Intent C;
    public String D;
    public long E;
    public final p F;
    public final p G;
    public boolean y;
    public List z;
    public static final PluginLinkInterceptActivity$a H;

    static {
       PluginLinkInterceptActivity.H = new PluginLinkInterceptActivity$a(null);
    }
    public void PluginLinkInterceptActivity(){
       super();
       this.z = new ArrayList();
       this.A = new Handler(Looper.getMainLooper());
       this.B = 2;
       this.D = "";
       this.F = s.b(LazyThreadSafetyMode.NONE, new PluginLinkInterceptActivity$isSpecifiedIntent$2(this));
       this.G = s.c(new PluginLinkInterceptActivity$mPluginNameFromSpecifiedIntent$2(this));
    }
    public static final Intent u3(PluginLinkInterceptActivity p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mIntent");
       }
       return p0;
    }
    public void A1(){
       b.e(this);
    }
    public boolean D0(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginLinkInterceptActivity pluginLinkIn = PluginLinkInterceptActivity.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, pluginLinkIn, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, this, pluginLinkIn, "11");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = a.t().c("dvaLinkInterceptUseCustomActivityStack", "com.yxcorp.gifshow.message.imchat.acivity.IMChatActivity");
          if (obj == null) {
             obj = "";
          }
          char[] uocharArray = new char[true];
          uocharArray[b] = ',';
          List list1 = StringsKt__StringsKt.G4(obj, uocharArray, false, 0, 6, null);
          ArrayList uArrayList = new ArrayList(u.Y(list1, 10));
          Iterator iterator1 = list1.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                String str = iterator1.next();
                if (str != null) {
                   uArrayList.add(StringsKt__StringsKt.o5(str).toString());
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
             }else {
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator2 = uArrayList.iterator();
                while (iterator2.hasNext()) {
                   Object obj2 = iterator2.next();
                   Object obj3 = ((obj2).length() > 0)? 1: null;
                   if (obj3) {
                      uArrayList1.add(obj2);
                   }else {
                      continue ;
                   }
                }
                Set set = CollectionsKt___CollectionsKt.L5(uArrayList1);
                b1 = set.contains(this.b0());
             }
          }
       }
       if (b1) {
          d.c("useCustomActivityStack: true");
          Object obj1 = PatchProxy.apply(objArray, this, pluginLinkIn, "12");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             List list = uActivityCon.b();
             a.o(list, "activityStack");
             Iterator iterator = list.iterator();
             int i = 0;
             while (true) {
                if (iterator.hasNext()) {
                   Activity uActivity = iterator.next().get();
                   if (uActivity != null && (!uActivity.isDestroyed() && !uActivity.isFinishing())) {
                      i = i + 1;
                      if (i > 1) {
                         b2 = false;
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }else {
                   b2 = true;
                }
             }
          }
       }else {
          b2 = this.a3();
       }
       if (b2) {
          return true;
       }else {
          ActivityInfo activityInfo = this.getPackageManager().getActivityInfo(this.getComponentName(), 128);
          a.o(activityInfo, "packageManager.getActivi¡­ageManager.GET_META_DATA\)");
          if (a.g(activityInfo.taskAffinity, activityInfo.packageName) ^ true) {
             return true;
          }else {
             activityInfo = activityInfo.launchMode;
             if (activityInfo != 2 && (activityInfo == true || activityInfo == 3)) {
                b = true;
             }
             return b;
          }
       }
    }
    public boolean F1(){
       return this.y;
    }
    public void G0(){
       if (PatchProxy.applyVoid(null, this, PluginLinkInterceptActivity.class, "16")) {
          return;
       }
       CharSequence text = this.getResources().getText(R.string.arg_RES_7f102f5d);
       a.o(text, "resources.getText\(R.string.loading_failed\)");
       i.d(R.style.arg_RES_7f110668, text);
       return;
    }
    public long H1(){
       return 800;
    }
    public boolean N1(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginLinkInterceptActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SplitLoaderManager.a.a() != null) {
          return b.a(this, p0);
       }
       return false;
    }
    public void U(){
       b.f(this);
    }
    public void W(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginLinkInterceptActivity.class, "20")) {
          return;
       }
       System.currentTimeMillis();
       if (this.x3()) {
          PluginLinkInterceptActivity$d uod = null;
          if (this.D0()) {
             uod = 1;
             this.t0();
          }
          PluginLinkInterceptActivity tC = this.C;
          if (tC == null) {
             a.S("mIntent");
          }
          Parcelable parcelableEx = tC.getParcelableExtra("specified_data");
          a.m(parcelableEx);
          a.o(parcelableEx, "mIntent.getParcelableExt¡­nt>\(KEY_SPECIFIED_DATA\)!!");
          this.v3(parcelableEx);
          this.startActivity(parcelableEx);
          if (!uod) {
             this.b1(new PluginLinkInterceptActivity$d(this), 500);
          }
       }else {
          this.v3(this.w0());
          b.j(this, p0);
       }
       return;
    }
    public String b0(){
       return b.b(this);
    }
    public void b1(Runnable p0,long p1){
       PluginLinkInterceptActivity pluginLinkIn = PluginLinkInterceptActivity.class;
       if (PatchProxy.isSupport(pluginLinkIn) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, pluginLinkIn, "13")) {
          return;
       }
       a.p(p0, "task");
       this.A.postDelayed(p0, p1);
       this.z.add(p0);
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PluginLinkInterceptActivity.class, "9")) {
          return;
       }
       this.y = true;
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          this.A.removeCallbacks(iterator.next());
       }
       super.finish();
       return;
    }
    public void finishActivity(){
       if (PatchProxy.applyVoid(null, this, PluginLinkInterceptActivity.class, "14")) {
          return;
       }
       if (!this.isFinishing()) {
          this.finish();
       }
       return;
    }
    public Activity getActivity(){
       return this;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PluginLinkInterceptActivity.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void i2(){
       b.g(this);
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, PluginLinkInterceptActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.equals("miniapp", this.D)) {
          return true;
       }
       return false;
    }
    public boolean l2(){
       return b.h(this);
    }
    public void n(PluginInstallerUIHandler$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginLinkInterceptActivity.class, "18")) {
          return;
       }
       a.p(p0, "executor");
       p0.a();
       return;
    }
    public void onCreate(Bundle p0){
       PluginLinkInterceptActivity tC;
       String str;
       boolean b;
       PluginLinkInterceptActivity pluginLinkIn = PluginLinkInterceptActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, pluginLinkIn, "3")) {
          return;
       }
       Intent intent = this.getIntent();
       if (intent == null) {
          intent = new Intent();
       }
       this.C = new Intent(intent);
       Intent intent1 = this.getIntent();
       if (intent1 != null) {
          intent1.replaceExtras(null);
       }
       if (p0 != null) {
          p0.putParcelable("android:support:fragments", null);
       }
       if (!this.x3()) {
          tC = this.C;
          if (tC == null) {
             a.S("mIntent");
          }
          if (!this.N1(tC)) {
          label_0050 :
             d.c("AppLink intercept page: can\'t install plugin.");
             super.onCreate(p0);
             this.G0();
             this.finishActivity();
             return;
          }
       }
       if (this.x3() && this.w3() == null) {
          goto label_0050 ;
       }else if(this.x3()){
          str = this.x1(null);
       }else {
          str = this.x1(this.b0());
       }
       this.D = str;
       c.a(new PluginLinkInterceptActivity$b(this));
       PluginDownloadExtension k = PluginDownloadExtension.k;
       k.s(this.D, 40);
       k.a(this.D);
       tC = this.D;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(tC, this, pluginLinkIn, "6")) {
          PluginManager h = PluginManager.H;
          Objects.requireNonNull(h);
          Integer integer = PatchProxy.applyOneRefs(tC, h, PluginManager.class, "79");
          if (integer == patchProxyRe) {
             a.p(tC, "plugin");
             integer = PluginManager.G.get(tC);
          }
          if (integer != null) {
             this.B = integer.intValue();
          }else {
             Object obj = PatchProxy.applyOneRefs(tC, this, pluginLinkIn, "8");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!this.l2()){
                obj = PatchProxy.applyOneRefs(tC, this, pluginLinkIn, "24");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   Dva uDva = Dva.instance();
                   a.o(uDva, "Dva.instance\(\)");
                   b = uDva.getPluginInstallManager().t(tC);
                }
                if (b && !PluginConfigReadyInterceptor.c.a(this)) {
                   b = true;
                }
             }
          label_0102 :
             b = false;
             if (b) {
                this.B = 3;
             }
          }
       }
       tC = this.B;
       patchProxyRe = 4;
       if (tC != 2) {
          if (tC != patchProxyRe) {
             this.overridePendingTransition(0, 0);
          }else {
             this.setTheme(R.style.arg_RES_7f11018b);
          }
       }else {
          this.setTheme(R.style.arg_RES_7f110186);
       }
       super.onCreate(p0);
       PluginLinkInterceptActivity tB = this.B;
       if (tB != 1) {
          if (tB != 2) {
             if (tB == 3 || tB == patchProxyRe) {
                d.c("AppLink intercept page: installPluginOnBackground\(\) "+this.D);
                this.A1();
             }
          }else {
             d.c("AppLink intercept page: installPluginWithLoadingPage\(\) "+this.D);
             this.b1(new PluginLinkInterceptActivity$c(this), 50);
          }
       }else {
          d.c("AppLink intercept page: installPluginWithLoadingDialog\(\) "+this.D);
          this.U();
       }
       if (!PatchProxy.applyVoid(null, this, pluginLinkIn, "25")) {
          Window window = this.getWindow();
          a.o(window, "window");
          View decorView = window.getDecorView();
          a.o(decorView, "window.decorView");
          decorView.setSystemUiVisibility(0x2f02);
       }
       this.E = System.currentTimeMillis();
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginLinkInterceptActivity.class, "5")) {
          return;
       }
       if (p0 != null) {
          p0.replaceExtras(null);
       }
       super.onNewIntent(p0);
       return;
    }
    public void p2(){
       if (PatchProxy.applyVoid(null, this, PluginLinkInterceptActivity.class, "17")) {
          return;
       }
       this.o3(false);
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, PluginLinkInterceptActivity.class, "15")) {
          return;
       }
       if (!this.isFinishing()) {
          this.L2();
       }
       return;
    }
    public final void v3(Intent p0){
       boolean b;
       PluginLinkInterceptActivity pluginLinkIn = PluginLinkInterceptActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, pluginLinkIn, "21")) {
          return;
       }
       long l = System.currentTimeMillis();
       Bundle obj = PatchProxy.applyOneRefs(p0, this, pluginLinkIn, "22");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = p0.getExtras();
          if (obj != null) {
             obj.get("none");
          }
          b = true;
       }
       if (!b) {
          return;
       }else {
          p0.putExtra("feature_intercept_page", true);
          p0.putExtra("feature_name", this.D);
          p0.putExtra("feature_page_creation_time", this.E);
          p0.putExtra("feature_plugin_page_start_time", l);
          p0.putExtra("feature_page_loading_type", this.B);
          return;
       }
    }
    public Intent w0(){
       PluginLinkInterceptActivity obj = PatchProxy.apply(null, this, PluginLinkInterceptActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == null) {
          a.S("mIntent");
       }
       return obj;
    }
    public final String w3(){
       Object obj = PatchProxy.apply(null, this, PluginLinkInterceptActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public String x1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginLinkInterceptActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x3()) {
          p0 = this.w3();
          if (p0 == null) {
             p0 = "";
          }
       }else {
          p0 = b.d(this, p0);
          a.o(p0, "super.getSplitName\(activityToLaunch\)");
       }
       return p0;
    }
    public final boolean x3(){
       Object obj = PatchProxy.apply(null, this, PluginLinkInterceptActivity.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.F.getValue();
       }
       return obj.booleanValue();
    }
}
