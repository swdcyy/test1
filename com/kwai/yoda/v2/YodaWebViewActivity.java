package com.kwai.yoda.v2.YodaWebViewActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.kwai.yoda.controller.YodaWebViewActivityController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import mz7.a;
import com.kwai.yoda.controller.YodaWebViewController;
import nz7.e;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import yb7.b;
import java.lang.System;
import android.os.SystemClock;
import sz7.l;
import java.lang.Long;
import yz7.l;

public class YodaWebViewActivity extends AppCompatActivity	// class@0012f7
{
    public YodaWebViewActivityController b;
    public a c;
    public int d;
    public static final int e;

    public void YodaWebViewActivity(){
       super();
       this.d = -9999;
    }
    public YodaWebViewActivityController E2(){
       return this.b;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "4")) {
          return;
       }
       YodaWebViewActivityController yodaWebViewA = new YodaWebViewActivityController(this);
       this.b = yodaWebViewA;
       yodaWebViewA.setContainerSession(this.c);
       this.b.onCreate();
       YodaWebViewActivity tc = this.c;
       if (tc != null) {
          tc.c().w("page_show");
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, YodaWebViewActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(YodaWebViewActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, YodaWebViewActivity.class, "6")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       this.b.interceptActivityResult(p0, p1, p2);
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "5")) {
          return;
       }
       if (!this.b.interceptBackPress()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebViewActivity.class, "2")) {
          return;
       }
       Intent intent = this.getIntent();
       String str = "userIntentTimestamp";
       if (intent != null) {
          b.a(intent.getExtras(), str);
       }
       if (intent != null) {
          intent.putExtra("pageStartTimestamp", System.currentTimeMillis());
          intent.putExtra("pageStartRealTime", SystemClock.elapsedRealtime());
          a uoa = new a();
          this.c = uoa;
          e uoe = uoa.c();
          uoe.k().m("activity");
          uoe.k().l(this.getClass().getSimpleName());
          l = 0;
          long longExtra = intent.getLongExtra(str, l);
          if (longExtra - l > 0) {
             uoe.x("user_click", Long.valueOf(longExtra));
          }
          uoe.w("page_start");
          intent.putExtra("hasSessionId", this.c.b());
       }
       l ol = new l();
       int i = ol.c(this);
       super.onCreate(p0);
       l ol1 = l.class;
       if (PatchProxy.isSupport(ol1) && (!PatchProxy.applyVoidTwoRefs(this, Integer.valueOf(i), ol, ol1, "4") && -9999 != i)) {
          ol.a(this, i);
       }
       this.setContentView(R.layout.arg_RES_7f0d079d);
       this.F2();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "7")) {
          return;
       }
       this.b.onDestroy();
       super.onDestroy();
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebViewActivity.class, "3")) {
          return;
       }
       super.onNewIntent(p0);
       this.setIntent(p0);
       this.F2();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "8")) {
          return;
       }
       this.b.onPause();
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "10")) {
          return;
       }
       super.onResume();
       this.b.onResume();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "9")) {
          return;
       }
       super.onStart();
       this.b.onStart();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewActivity.class, "11")) {
          return;
       }
       super.onStop();
       this.b.onStop();
       return;
    }
}
