package com.yxcorp.gifshow.camera.record.sameframe.SameFrameActivity;
import qb9.w;
import com.yxcorp.gifshow.camera.record.e$a;
import ml8.d;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.camera.record.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import qka.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import android.content.res.Configuration;
import w8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import fd9.a;
import android.os.Bundle;
import wh5.c;
import e17.i;
import oa0.a;
import android.content.Intent;
import com.kwai.framework.model.feed.BaseFeed;
import r8c.x;
import lnc.s6;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.record.sameframe.SameFrameFragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import lq.i;
import java.lang.Boolean;
import ekd.j0;
import tkd.b;
import tkd.d;
import bq.a;
import com.yxcorp.gifshow.camera.record.sameframe.SameFrameActivity$a;
import kq.b;
import lnc.a1;
import com.kwai.feature.post.api.util.g;

public class SameFrameActivity extends BasePostActivity implements w, e$a, d	// class@000f01
{
    public AnimCameraView O;
    public BaseFeed P;
    public String Q;
    public CameraFragment R;
    public j S;
    public e T;
    public Configuration U;
    public View V;
    public static final int W;

    public void SameFrameActivity(){
       super();
       this.T = new e(this);
    }
    public String B3(){
       return "SAME_FRAME";
    }
    public String E7(){
       return "CameraPage";
    }
    public int P2(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SameFrameActivity.class, "1")) {
          return;
       }
       this.O = m1.f(p0, 0x7f0a0631);
       this.V = m1.f(p0, 0x7f0a369f);
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "10")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SameFrameActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://record_same_frame";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public j k(){
       Object obj = PatchProxy.apply(null, this, SameFrameActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.T.a();
    }
    public CameraBaseFragment o0(){
       return this.R;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "9")) {
          return;
       }
       SameFrameActivity tR = this.R;
       if (tR == null || !tR.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SameFrameActivity.class, "15")) {
          return;
       }
       super.onConfigurationChanged(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("SameFrameActivity", "onConfigurationChanged...Configuration:"+p0, objArray);
       int i1 = this.U.diff(p0);
       this.U = new Configuration(p0);
       if (!(i1 & 0x0800) && (!(i1 & 0x0400) && ((i1 & 0x0100) || (i1 & 0x0080)))) {
          Object[] objArray1 = new Object[i];
          a.D().w("SameFrameActivity", "onConfigurationChanged...Configuration post", objArray1);
          RxBus.f.b(new a(p0));
       }
       return;
    }
    public void onCreate(Bundle p0){
       int i;
       SameFrameActivity sameFrameAct = SameFrameActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, sameFrameAct, "4")) {
          return;
       }
       this.overridePendingTransition(R.anim.arg_RES_7f010105, 0);
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       if (!c.g()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
          return;
       }else {
          a.r1(0);
          this.P = x.b(this.getIntent());
          this.Q = x.a(this.getIntent());
          if (this.P == null && !s6.H()) {
             this.finish();
             return;
          }else if(TextUtils.x(this.Q) || (!new File(this.Q).exists() && !s6.H())){
             this.finish();
             return;
          }else {
             this.setContentView(R.layout.arg_RES_7f0d1333);
             b.a(this.getWindow());
             this.doBindView(this.getWindow().getDecorView());
             e uoe = this.getSupportFragmentManager().beginTransaction();
             i = 0x7f0a0fe6;
             sameFrameAct = PatchProxy.apply(null, this, sameFrameAct, "5");
             if (sameFrameAct != PatchProxyResult.class) {
             }else {
                this.R = new SameFrameFragment();
                Bundle uBundle = new Bundle();
                SerializableHook.putSerializable(uBundle, "source_photo_origin_photo", this.P);
                this.R.setArguments(uBundle);
                this.R.Oh(0);
                sameFrameAct = this.R;
             }
             uoe.v(i, sameFrameAct);
             uoe.m();
             this.U = new Configuration(this.getResources().getConfiguration());
             if (i.h()) {
                i.m().Q("SHOW_SNACK_BAR_AFTER_SAVE", Boolean.FALSE).Q("conversionTaskList", j0.f(this.getIntent(), "conversionTaskList")).Q("disableUploadCompletedToast", Boolean.valueOf(j0.a(this.getIntent(), "disableUploadCompletedToast", 0)));
             }
             return;
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "11")) {
          return;
       }
       super.onDestroy();
       SameFrameActivity tT = this.T;
       if (tT != null) {
          tT.b();
          this.T = null;
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0,Configuration p1){
       SameFrameActivity sameFrameAct = SameFrameActivity.class;
       if (PatchProxy.isSupport(sameFrameAct) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, sameFrameAct, "14")) {
          return;
       }
       super.onMultiWindowModeChanged(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("SameFrameActivity", "onMultiWindowModeChanged...isInMultiWindowMode:"+p0+" , newConfig:"+p1, objArray);
       SameFrameActivity tR = this.R;
       if (tR != null && tR.isAdded()) {
          this.getSupportFragmentManager().beginTransaction().p(this.R).m();
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.k(this.R);
          uoe.m();
          if (this.T.a().B() || this.T.a().isRecording()) {
             Object[] objArray1 = new Object[i];
             a.D().A("SameFrameActivity", "CameraFragment has RecordInfo when changing multi-window mode, cancel all recording!", objArray1);
             this.T.a().E(true);
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "8")) {
          return;
       }
       super.onPause();
       this.T.c();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "7")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       this.T.d();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "6")) {
          return;
       }
       super.onStart();
       d.a(0x7c418b06).E50(this, 291, new SameFrameActivity$a(this));
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, SameFrameActivity.class, "3")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0606b3));
       return;
    }
}
