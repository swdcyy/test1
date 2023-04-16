package com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity;
import qb9.w;
import com.yxcorp.gifshow.camera.record.e$a;
import ml8.d;
import q46.a;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.camera.record.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q46.e;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import com.yxcorp.gifshow.widget.record.ArcScaleView;
import lnc.a1;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import java.lang.Boolean;
import sm6.b;
import android.content.res.Configuration;
import s8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import fd9.a;
import android.os.Bundle;
import wh5.c;
import e17.i;
import android.content.Intent;
import com.kwai.framework.model.feed.BaseFeed;
import r8c.x;
import lnc.s6;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.view.Window;
import oa0.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootFragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import lq.i;
import ekd.j0;
import tkd.b;
import tkd.d;
import bq.a;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity$a;
import kq.b;
import com.kwai.feature.post.api.util.g;

public class FollowShootActivity extends BasePostActivity implements w, e$a, d, a	// class@000dc4
{
    public RelativeLayout O;
    public AdjustableCameraView P;
    public ArcScaleView Q;
    public FrameLayout R;
    public CameraFragment S;
    public j T;
    public e U;
    public Configuration V;
    public final e W;
    public static final int X;

    public void FollowShootActivity(){
       super();
       this.U = new e(this);
       this.W = new e(this);
    }
    public String B3(){
       return "FOLLOW_SHOOT";
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
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowShootActivity.class, "1")) {
          return;
       }
       this.O = m1.f(p0, 0x7f0a369f);
       this.R = m1.f(p0, 0x7f0a0931);
       AdjustableCameraView uAdjustableC = m1.f(p0, R.id.camera_preview_layout);
       this.P = uAdjustableC;
       if (uAdjustableC != null) {
          uAdjustableC.setEnableFrameNewRule(this.o1());
       }
       this.Q = m1.f(p0, 0x7f0a0236);
       if (this.o1()) {
          this.O.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
       }
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "8")) {
          return;
       }
       super.finish();
       this.W.b(this);
       this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       return;
    }
    public int getPage(){
       return 282;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FollowShootActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://record_follow_shoot";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public j k(){
       Object obj = PatchProxy.apply(null, this, FollowShootActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U.a();
    }
    public CameraBaseFragment o0(){
       return this.S;
    }
    public boolean o1(){
       Object obj = PatchProxy.apply(null, this, FollowShootActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.d();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "12")) {
          return;
       }
       if (this.o0() == null || !this.o0().onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowShootActivity.class, "14")) {
          return;
       }
       super.onConfigurationChanged(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FollowShootActivity", "onConfigurationChanged...Configuration:"+p0, objArray);
       int i1 = this.V.diff(p0);
       this.V = new Configuration(this.getResources().getConfiguration());
       if (!(i1 & 0x0800) && (!(i1 & 0x0400) && ((i1 & 0x0100) || (i1 & 0x0080)))) {
          Object[] objArray1 = new Object[i];
          a.D().w("FollowShootActivity", "onConfigurationChanged...Configuration post", objArray1);
          RxBus.f.b(new a(p0));
       }
       return;
    }
    public void onCreate(Bundle p0){
       FollowShootActivity uFollowShoot = FollowShootActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFollowShoot, "2")) {
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
          BaseFeed uBaseFeed = x.b(this.getIntent());
          if (!s6.H()) {
             String str = x.a(this.getIntent());
             if (uBaseFeed == null) {
                this.finish();
                return;
             }else if(TextUtils.x(str) || !new File(str).exists()){
                this.finish();
                return;
             }
          }
          this.setContentView(R.layout.arg_RES_7f0d046c);
          this.W.a(this);
          this.doBindView(this.getWindow().getDecorView());
          a.r1(0);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uFollowShoot = PatchProxy.applyOneRefs(uBaseFeed, this, uFollowShoot, "4");
          if (uFollowShoot != PatchProxyResult.class) {
          }else {
             this.S = new FollowShootFragment();
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "source_photo_origin_photo", uBaseFeed);
             uBundle.putBoolean("show_magic_face_select", true);
             this.S.setArguments(uBundle);
             this.S.Oh(0);
             uFollowShoot = this.S;
          }
          uoe.v(R.id.container_layout, uFollowShoot);
          uoe.m();
          this.V = new Configuration(this.getResources().getConfiguration());
          if (i.h()) {
             i.m().Q("SHOW_SNACK_BAR_AFTER_SAVE", Boolean.FALSE).Q("conversionTaskList", j0.f(this.getIntent(), "conversionTaskList")).Q("disableUploadCompletedToast", Boolean.valueOf(j0.a(this.getIntent(), "disableUploadCompletedToast", 0)));
          }
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "9")) {
          return;
       }
       super.onDestroy();
       FollowShootActivity tU = this.U;
       if (tU != null) {
          tU.b();
          this.U = null;
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0,Configuration p1){
       FollowShootActivity uFollowShoot = FollowShootActivity.class;
       if (PatchProxy.isSupport(uFollowShoot) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uFollowShoot, "13")) {
          return;
       }
       super.onMultiWindowModeChanged(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FollowShootActivity", "onMultiWindowModeChanged...isInMultiWindowMode:"+p0+" , newConfig:"+p1, objArray);
       FollowShootActivity tS = this.S;
       if (tS != null && tS.isAdded()) {
          this.getSupportFragmentManager().beginTransaction().p(this.S).m();
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.k(this.S);
          uoe.m();
          if (this.U.a().B() || this.U.a().isRecording()) {
             Object[] objArray1 = new Object[i];
             a.D().A("FollowShootActivity", "CameraFragment has RecordInfo when changing multi-window mode, cancel all recording!", objArray1);
             this.U.a().E(true);
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "7")) {
          return;
       }
       super.onPause();
       this.U.c();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "6")) {
          return;
       }
       super.onResume();
       this.W.a(this);
       this.U.d();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "5")) {
          return;
       }
       super.onStart();
       d.a(0x7c418b06).E50(this, 291, new FollowShootActivity$a(this));
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, FollowShootActivity.class, "3")) {
          return;
       }
       super.y3();
       if (this.o1()) {
          g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0606b3));
       }else {
          g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0619d6));
       }
       return;
    }
}
