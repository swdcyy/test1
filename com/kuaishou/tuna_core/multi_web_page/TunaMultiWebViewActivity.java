package com.kuaishou.tuna_core.multi_web_page.TunaMultiWebViewActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.util.Log;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.multi_web_page.TunaMultiWebViewActivity$finish$1;
import msd.a;
import c15.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import android.view.View;
import com.kwai.yoda.util.a;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import b05.a;
import java.util.Objects;
import b05.a$a;
import fg6.a;
import ekd.x0;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo;
import com.google.gson.Gson;
import com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment;
import com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment$a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class TunaMultiWebViewActivity extends SingleFragmentActivity	// class@0010e5
{
    public TunaMultiWebConfigInfo y;

    public void TunaMultiWebViewActivity(){
       super();
    }
    public int O2(){
       return 1;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, TunaMultiWebViewActivity.class, "2")) {
          return;
       }
       super.finish();
       String stackTraceSt = Log.getStackTraceString(new IllegalArgumentException("TunaMultiWebViewActivity onFinish"));
       a.o(stackTraceSt, "Log.getStackTraceString\(¡­bViewActivity onFinish\"\)\)");
       b.b(KsLogTunaCoreTag.TUNA_MULTI_WEB_VIEW.appendTag("JsInjectKwai"), new TunaMultiWebViewActivity$finish$1(stackTraceSt));
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "BUSINESS_CONSULTATION_COMMODITY";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebViewActivity.class, "3")) {
          return;
       }
       super.onCreate(p0);
       Window window = this.getWindow();
       a.o(window, "window");
       View decorView = window.getDecorView();
       a.o(decorView, "window.decorView");
       Window window1 = this.getWindow();
       a.o(window1, "window");
       View decorView1 = window1.getDecorView();
       a.o(decorView1, "window.decorView");
       decorView1.setSystemUiVisibility((decorView.getSystemUiVisibility() | 0x2000));
       window = this.getWindow();
       a.o(window, "window");
       window.setStatusBarColor(-1);
       a.a(this);
       return;
    }
    public Fragment u3(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, TunaMultiWebViewActivity.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null) {
          Uri data = obj.getData();
          if (data != null) {
             a$a b = a.b;
             Objects.requireNonNull(b);
             a obj1 = PatchProxy.applyOneRefs(data, b, a$a.class, "1");
             if (obj1 != patchProxyRe) {
             }else {
                try{
                   obj1 = new a();
                   obj1.b(a.a.h(x0.a(data, "config"), TunaMultiWebConfigInfo.class));
                   if (obj1.a() != null) {
                      TunaMultiWebConfigInfo tunaMultiWeb1 = obj1.a();
                      tunaMultiWeb1 = (tunaMultiWeb1 != null)? tunaMultiWeb1.mDefaultTab: null;
                      TunaMultiWebConfigInfo tunaMultiWeb2 = obj1.a();
                      if (tunaMultiWeb2 != null) {
                         tunaMultiWeb2 = tunaMultiWeb2.mTabInfos;
                         if (tunaMultiWeb2 != null) {
                            i = tunaMultiWeb2.size();
                         label_0065 :
                            if (tunaMultiWeb1 >= i) {
                               tunaMultiWeb1 = obj1.a();
                               if (tunaMultiWeb1 != null) {
                                  tunaMultiWeb1.mDefaultTab = 0;
                               }
                            }
                         }
                      }
                      i = 0;
                      goto label_0065 ;
                   }
                }catch(java.lang.Exception e0){
                   obj1.b(objArray);
                }
             }
          }
       }
       if (this.y == null) {
          this.finish();
       }
       TunaMultiWebFragment$a u = TunaMultiWebFragment.u;
       TunaMultiWebViewActivity ty = this.y;
       Objects.requireNonNull(u);
       TunaMultiWebFragment tunaMultiWeb = PatchProxy.applyOneRefs(ty, u, TunaMultiWebFragment$a.class, "1");
       if (tunaMultiWeb != patchProxyRe) {
       }else {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "config", ty);
          tunaMultiWeb = new TunaMultiWebFragment();
          tunaMultiWeb.setArguments(uBundle);
       }
       return tunaMultiWeb;
    }
}
