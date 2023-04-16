package com.yxcorp.gifshow.camera.record.mix.StoryMixRecordActivity;
import qb9.w;
import com.yxcorp.gifshow.camera.record.e$a;
import ml8.d;
import q46.a;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.camera.record.mix.StoryMixRecordActivity$a;
import nsd.u;
import com.yxcorp.gifshow.camera.record.mix.StoryMixRecordActivity$cameraManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import q46.e;
import com.yxcorp.gifshow.camera.record.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import java.lang.Boolean;
import sm6.b;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import android.content.res.Configuration;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.os.Bundle;
import com.kwai.camerasdk.models.CameraApiVersion;
import android.view.Window;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import android.content.Intent;
import pi9.p;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import ld9.b;
import com.yxcorp.gifshow.camera.record.mix.MixCameraFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.kwai.feature.post.api.util.g;

public final class StoryMixRecordActivity extends BasePostActivity implements w, e$a, d, a	// class@000e67
{
    public AnimCameraView O;
    public final p P;
    public CameraFragment Q;
    public final e R;
    public j S;
    public Boolean T;
    public Configuration U;
    public static final StoryMixRecordActivity$a V;

    static {
       StoryMixRecordActivity.V = new StoryMixRecordActivity$a(null);
    }
    public void StoryMixRecordActivity(){
       super();
       this.P = s.c(new StoryMixRecordActivity$cameraManager$2(this));
       this.R = new e(this);
    }
    public final e G3(){
       Object obj = PatchProxy.apply(null, this, StoryMixRecordActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.getValue();
    }
    public int P2(){
       return 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryMixRecordActivity.class, "3")) {
          return;
       }
       if (this.o1() && p0 != null) {
          p0.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
       }
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, StoryMixRecordActivity.class, "12")) {
          return;
       }
       super.finish();
       this.R.b(this);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, StoryMixRecordActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public j k(){
       Object obj = PatchProxy.apply(null, this, StoryMixRecordActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G3().a();
    }
    public CameraBaseFragment o0(){
       return this.Q;
    }
    public boolean o1(){
       StoryMixRecordActivity obj = PatchProxy.apply(null, this, StoryMixRecordActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.T;
       boolean b = (obj != null)? obj.booleanValue(): b.d();
       Boolean uBoolean = Boolean.valueOf(b);
       this.T = uBoolean;
       b = (uBoolean != null)? uBoolean.booleanValue(): false;
       return b;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, StoryMixRecordActivity.class, "9")) {
          return;
       }
       StoryMixRecordActivity tQ = this.Q;
       if (tQ != null && tQ.onBackPressed() == true) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryMixRecordActivity.class, "15")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("StoryMixRecordActivity", "onConfigurationChanged...Configuration:"+p0, objArray);
       StoryMixRecordActivity tU = this.U;
       int i1 = (tU != null)? tU.diff(p0): 0;
       if (!(i1 & 0x0800) && (!(i1 & 0x0400) && ((i1 & 0x0100) || (i1 & 0x0080)))) {
          Object[] objArray1 = new Object[i];
          a.D().w("StoryMixRecordActivity", "onConfigurationChanged...Configuration post", objArray1);
          this.finish();
       }
       this.U = new Configuration(p0);
       return;
    }
    public void onCreate(Bundle p0){
       StoryMixRecordActivity storyMixReco = StoryMixRecordActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, storyMixReco, "4")) {
          return;
       }
       j oj = this.G3().a();
       a.o(oj, "this.cameraSDK");
       Object[] objArray = new Object[0];
       a.D().w("StoryMixRecordActivity", "init  cameraManager "+oj.getCameraApiVersion(), objArray);
       super.onCreate(p0);
       Resources resources = this.getResources();
       a.o(resources, "resources");
       this.U = new Configuration(resources.getConfiguration());
       this.getWindow().addFlags(128);
       this.setContentView(R.layout.arg_RES_7f0d0fd5);
       this.R.a(this);
       AnimCameraView uAnimCameraV = this.findViewById(R.id.camera_preview_layout);
       this.O = uAnimCameraV;
       boolean b = true;
       if (uAnimCameraV != null && p.e(this.getIntent())) {
          CameraPageType vIDEO = CameraPageType.VIDEO;
          b.c(uAnimCameraV, this, b, this.o1(), vIDEO);
          b.d(this.O, this, vIDEO);
       }
       MixCameraFragment mixCameraFra = PatchProxy.apply(null, this, storyMixReco, "10");
       if (mixCameraFra != PatchProxyResult.class) {
       }else {
          mixCameraFra = new MixCameraFragment();
          mixCameraFra.setArguments(new Bundle());
          mixCameraFra.Oh(b);
       }
       this.Q = mixCameraFra;
       e uoe = this.getSupportFragmentManager().beginTransaction();
       StoryMixRecordActivity tQ = this.Q;
       a.m(tQ);
       uoe.v(R.id.fragment_container, tQ);
       uoe.m();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, StoryMixRecordActivity.class, "7")) {
          return;
       }
       super.onDestroy();
       this.G3().b();
       return;
    }
    public void onMultiWindowModeChanged(boolean p0,Configuration p1){
       StoryMixRecordActivity storyMixReco = StoryMixRecordActivity.class;
       if (PatchProxy.isSupport(storyMixReco) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, storyMixReco, "8")) {
          return;
       }
       super.onMultiWindowModeChanged(p0, p1);
       StoryMixRecordActivity tQ = this.Q;
       if (tQ != null && tQ.isAdded()) {
          this.getSupportFragmentManager().beginTransaction().p(tQ).m();
          this.getSupportFragmentManager().beginTransaction().k(tQ);
          j oj = this.G3().a();
          if (oj != null && (oj.B() || oj.isRecording())) {
             oj.E(true);
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, StoryMixRecordActivity.class, "6")) {
          return;
       }
       super.onPause();
       this.G3().c();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, StoryMixRecordActivity.class, "5")) {
          return;
       }
       super.onResume();
       this.R.a(this);
       this.G3().d();
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       StoryMixRecordActivity storyMixReco = StoryMixRecordActivity.class;
       if (PatchProxy.isSupport(storyMixReco) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, storyMixReco, "13")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       if (p0) {
          this.R.a(this);
       }
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, StoryMixRecordActivity.class, "14")) {
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
