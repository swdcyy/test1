package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity$a;
import nsd.u;
import jy4.a;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import tkd.b;
import tkd.d;
import qy4.b;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import qka.a;
import rka.b;
import kotlin.jvm.internal.a;
import rka.d;
import android.view.Window;
import android.content.Intent;
import android.os.Parcelable;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.util.Objects;
import android.os.SystemClock;
import com.kuaishou.tuna.plc.dynamic_container.logger.model.PlcDynamicPerformanceInfo;
import moc.b;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.x;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$a;
import androidx.fragment.app.Fragment;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicBizActionLogger;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import ey4.b;
import java.lang.Integer;
import java.util.Map;
import my4.a;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity$c;
import android.view.View$OnClickListener;
import android.view.KeyEvent;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment;
import java.lang.Number;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import android.content.Context;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;

public final class PlcDynamicContainerActivity extends SingleFragmentActivity	// class@000fc9
{
    public String A;
    public ViewGroup B;
    public QPhoto C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public String H;
    public a I;
    public PlcDynamicBizActionLogger J;
    public final PlcDynamicContainerActivity$b K;
    public HashMap L;
    public PlcDynamicContainerFragment y;
    public PlcDynamicContainerConfig z;
    public static final PlcDynamicContainerActivity$a M;

    static {
       PlcDynamicContainerActivity.M = new PlcDynamicContainerActivity$a(null);
    }
    public void PlcDynamicContainerActivity(){
       super();
       this.A = "";
       this.G = -1;
       this.H = "UNKNOWN";
       this.I = new a();
       this.K = new PlcDynamicContainerActivity$b(this);
    }
    public final a A3(){
       return this.I;
    }
    public final void B3(boolean p0){
       PlcDynamicContainerActivity plcDynamicCo = PlcDynamicContainerActivity.class;
       if (PatchProxy.isSupport(plcDynamicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, plcDynamicCo, "14")) {
          return;
       }
       if (this.F == p0) {
          return;
       }
       this.F = p0;
       PlcDynamicContainerActivity obj = PatchProxy.apply(null, this, plcDynamicCo, "15");
       if (obj != PatchProxyResult.class) {
          obj = obj.booleanValue();
       }else {
          obj = this.z;
          plcDynamicCo = 1;
          obj = (obj != null && obj.getKeepPlayerPause() == plcDynamicCo)? true: false;
       }
       if (!obj) {
          d.a(-1301622019).ad(this.C, this.F, this.hashCode());
       }
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerActivity.class, "9")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       PlcDynamicContainerActivity tK;
       String stringExtra;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerActivity.class, str)) {
          return;
       }
       if (a.a()) {
          b uob = b.b();
          a.o(uob, "HoleFactory.getInstance\(\)");
          uob.a().b(this.getWindow());
       }
       PlcDynamicContainerConfig plcDynamicCo = PatchProxy.apply(null, this, PlcDynamicContainerActivity.class, "8");
       if (plcDynamicCo == patchProxyRe) {
          plcDynamicCo = this.getIntent().getParcelableExtra("CONTAINER_CONFIG");
       }
       this.z = plcDynamicCo;
       if (plcDynamicCo == null) {
          PlcDynamicLogger.c("容器 mConfig 为null,直接返回!");
          super.onCreate(p0);
          if (!this.isFinishing()) {
             super.finish();
          }
          return;
       }else {
          PlcDynamicContainerActivity tI = this.I;
          Objects.requireNonNull(tI);
          if (!PatchProxy.applyVoid(null, tI, uoa, "4")) {
             tI.b.mContainerCreateStartTimestamp = SystemClock.elapsedRealtime();
          }
          try{
             if (!PatchProxy.applyVoid(null, this, PlcDynamicContainerActivity.class, "7")) {
                PlcDynamicLogger.b(this.z, "容器activity收到序列化后的配置");
                int intExtra = this.getIntent().getIntExtra("SOURCE_PHOTO_SAVE_ID", -1);
                this.G = intExtra;
                Object[] objArray = b.b(intExtra);
                if (objArray != null) {
                   if (!objArray instanceof QPhoto) {
                      objArray = null;
                   }
                   if (objArray != null) {
                      this.C = objArray;
                   }
                }
                String str1 = TextUtils.I(this.getIntent().getStringExtra("PlcDynamicContainerToken"));
                a.o(str1, "TextUtils.sanityCheckNul…\(EXTRA_KEY_SOURCE_TOKEN\)\)");
                this.A = str1;
                long l = 0;
                this.I.b.mHandleRouteStartTimestamp = this.getIntent().getLongExtra("EXTRA_KEY_ROUTE_HANDLE_START_TIMESTAMP", l);
                this.I.b.mHandleRouteFinishTimestamp = this.getIntent().getLongExtra("EXTRA_KEY_ROUTE_HANDLE_FINISH_TIMESTAMP", l);
                tI = this.I;
                tK = this.z;
                Objects.requireNonNull(tI);
                if (!PatchProxy.applyVoidOneRefs(tK, tI, uoa, "2")) {
                   if (tK != null) {
                      stringExtra = a.a.q(tK);
                      if (stringExtra != null) {
                      label_00f0 :
                         tI.b.mUsingParams = TextUtils.I(stringExtra);
                      }
                   }
                   stringExtra = "";
                   goto label_00f0 ;
                }
                tI = this.I;
                stringExtra = this.getIntent().getStringExtra("EXTRA_KEY_SOURCE_URI");
                Objects.requireNonNull(tI);
                if (!PatchProxy.applyVoidOneRefs(stringExtra, tI, uoa, str)) {
                   tI.b.mSourceUri = TextUtils.I(stringExtra);
                }
                str = this.getIntent().getStringExtra("codSourcePage");
                if (str != null) {
                   a.o(str, "it");
                   str1 = (str.length() > 0)? 1: null;
                   if (!str1) {
                      Object[] objArray1 = null;
                   }
                   if (str != null) {
                      a.o(str, "sourcePage");
                      this.H = str;
                   }
                }
             }
          }catch(java.lang.Exception e3){
             PlcDynamicLogger.i("dynamic container activity parse config failed!", e3);
          }
          if (!PatchProxy.applyVoid(null, this, PlcDynamicContainerActivity.class, "11")) {
             this.n.i(0);
          }
          if (!PatchProxy.applyVoid(null, this, PlcDynamicContainerActivity.class, "6")) {
             PlcDynamicContainerActivity tz = this.z;
             if (tz != null) {
                tz.setToken(this.A);
                PlcDynamicContainerFragment$a i = PlcDynamicContainerFragment.I;
                tK = this.K;
                Objects.requireNonNull(i);
                PlcDynamicContainerFragment plcDynamicCo1 = PatchProxy.applyTwoRefs(tz, tK, i, PlcDynamicContainerFragment$a.class, "1");
                if (plcDynamicCo1 != patchProxyRe) {
                }else {
                   a.p(tz, "config");
                   a.p(tK, "operateDelegate");
                   plcDynamicCo1 = new PlcDynamicContainerFragment();
                   Bundle uBundle = new Bundle();
                   uBundle.putParcelable("DIALOG_CONFIG", tz);
                   plcDynamicCo1.q = tK;
                   plcDynamicCo1.setArguments(uBundle);
                }
                PlcDynamicBizActionLogger plcDynamicBi = new PlcDynamicBizActionLogger(tz, this.C, this.H);
                plcDynamicCo1.getLifecycle().addObserver(plcDynamicBi);
                this.J = plcDynamicBi;
                tz = this.I;
                PlcDynamicBizActionLogger f = plcDynamicBi.f;
                Objects.requireNonNull(tz);
                if (!PatchProxy.applyVoidOneRefs(f, tz, uoa, "1")) {
                   tz.b.mSessionId = TextUtils.I(f);
                }
                b uob1 = new b(this, plcDynamicBi, plcDynamicCo1);
                if (!PatchProxy.applyVoidOneRefs(uob1, plcDynamicCo1, PlcDynamicContainerFragment.class, "14")) {
                   a.p(uob1, "listener");
                   plcDynamicCo1.r.put(Integer.valueOf(uob1.hashCode()), uob1);
                }
                plcDynamicCo1.u = this.G;
                this.y = plcDynamicCo1;
             }
          }
          if (!PatchProxy.applyVoid(null, this, PlcDynamicContainerActivity.class, "5")) {
             Window window = this.getWindow();
             a.o(window, "this.window");
             a.a(window, 0, 0);
          }
          super.onCreate(p0);
          this.overridePendingTransition(0, 0);
          ViewGroup viewGroup = this.findViewById(this.v3());
          this.B = viewGroup;
          if (viewGroup != null) {
             viewGroup.setOnClickListener(new PlcDynamicContainerActivity$c(this));
          }
          return;
       }
    }
    public void onDestroy(){
       PlcDynamicContainerActivity plcDynamicCo = PlcDynamicContainerActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, plcDynamicCo, "17")) {
          return;
       }
       super.onDestroy();
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, plcDynamicCo, "18")) {
          plcDynamicCo = this.J;
          if (plcDynamicCo != null) {
             try{
                PlcDynamicContainerActivity ty = this.y;
                if (ty != null && plcDynamicCo.d != b) {
                   a.m(ty);
                   int i = ty.J4();
                   ty = this.J;
                   if (ty != null) {
                      ty.c(i, -3);
                   }
                   this.I.b(i);
                   this.I.a();
                }
             }catch(java.lang.Exception e0){
                PlcDynamicLogger.j("reUpload close failed!", e0);
             }
          }
       }
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       Object[] obj;
       Fragment uFragment1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcDynamicContainerActivity plcDynamicCo = PlcDynamicContainerActivity.class;
       if (PatchProxy.isSupport(plcDynamicCo)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, plcDynamicCo, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = null;
       Object[] objArray = PatchProxy.apply(obj, this, plcDynamicCo, "2");
       if (objArray != patchProxyRe) {
       }else {
          Fragment uFragment = this.w3();
          if (uFragment != null) {
             if (!uFragment instanceof AbsPlcDynamicMVPsFragment) {
                uFragment = obj;
             }
             if (uFragment != null) {
                uFragment1 = uFragment;
             }
          }
          objArray = uFragment1;
       }
       boolean b = (objArray != null)? objArray.onKeyDown(p0, p1): super.onKeyDown(p0, p1);
       return b;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerActivity.class, "16")) {
          return;
       }
       super.onPause();
       if (this.E != null) {
          PlcDynamicLogger.c("keepPlaying when Container Activity onPause");
          return;
       }else if(this.D != null){
          this.B3(false);
       }
       return;
    }
    public void onResume(){
       Integer obj;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicContainerActivity.class, "13")) {
          return;
       }
       super.onResume();
       PlcDynamicContainerActivity ty = this.y;
       if (ty != null) {
          obj = PatchProxy.apply(objArray, ty, PlcDynamicContainerFragment.class, "23");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             PlcDynamicContainerFragment v = ty.v;
             i = (v != null)? v.getFixedDragStatus(): 0;
          }
          obj = Integer.valueOf(i);
       }
       i = 5;
       if (obj == null || obj.intValue() != i) {
          i = 2;
          if (obj == null || obj.intValue() != i) {
             this.B3(true);
          }
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerActivity.class, "19")) {
          return;
       }
       a.p(p0, "outState");
       PlcDynamicLogger.c("PlcDynamicContainerActivity onSaveInstanceState");
       return;
    }
    public Fragment u3(){
       PlcDynamicContainerActivity obj = PatchProxy.apply(null, this, PlcDynamicContainerActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj;
       }
       PlcDynamicUtils.h(this, this.z, this.C, null, null, 24, null);
       this.finish();
       return null;
    }
    public int v3(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f0a0fe6;
    }
}
