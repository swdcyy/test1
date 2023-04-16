package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.FSVideoActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.FSVideoActivity$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.kpop.ext.model.VideoConfig;
import java.lang.CharSequence;
import zsd.u;
import android.os.Bundle;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.growth.kpop.ext.model.KPopExtConfig;
import cra.w;
import q87.c;
import com.yxcorp.utility.RomUtils;
import ekd.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.FSVideoActivity$b;
import java.lang.Runnable;

public final class FSVideoActivity extends GifshowActivity	// class@0013fe
{
    public PresenterV2 A;
    public KPopExtConfig y;
    public VideoConfig z;
    public static final FSVideoActivity$a B;

    static {
       FSVideoActivity.B = new FSVideoActivity$a(null);
    }
    public void FSVideoActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, FSVideoActivity.class, "8")) {
          return;
       }
       super.finish();
       this.getWindow().setFlags(2048, 2048);
       this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FSVideoActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       FSVideoActivity obj = PatchProxy.apply(null, this, FSVideoActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null) {
          a.m(obj);
          if (u.S1(obj.getPage2()) ^ 0x01) {
             obj = this.z;
             a.m(obj);
             return obj.getPage2();
          }
       }
       return "GROWTH_FS_VIDEO";
    }
    public void onCreate(Bundle p0){
       FSVideoActivity uFSVideoActi = FSVideoActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFSVideoActi, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       if (this.getIntent() != null) {
          Intent intent = this.getIntent();
          String str = "intent";
          a.o(intent, str);
          if (intent.getExtras() != null) {
             intent = this.getIntent();
             a.o(intent, str);
             intent = intent.getExtras();
             a.m(intent);
             Serializable serializable = SerializableHook.getSerializable(intent, "kpop_ext_config");
             VideoConfig videoConfig = null;
             if (!serializable instanceof KPopExtConfig) {
                serializable = videoConfig;
             }
             if (serializable != null) {
                videoConfig = serializable.getVideoConfig();
             }
             if (videoConfig == null || u.S1(serializable.getVideoConfig().getVideoUrl())) {
                this.finish();
                return;
             }else {
                Object[] objArray = new Object[0];
                w.C().w("FSVideoActivity", "onCreate", objArray);
                this.y = serializable;
                this.z = serializable.getVideoConfig();
                if (!PatchProxy.applyVoidOneRefs(this, this, uFSVideoActi, "5")) {
                   Window window = this.getWindow();
                   int i = 1024;
                   if (RomUtils.q()) {
                      window.clearFlags(i);
                      i.h(this, 0, this.isDarkImmersiveMode());
                   }else {
                      a.o(window, "window");
                      View decorView = window.getDecorView();
                      a.o(decorView, "window.decorView");
                      View decorView1 = window.getDecorView();
                      a.o(decorView1, "window.decorView");
                      decorView1.setSystemUiVisibility((decorView.getSystemUiVisibility() | 0x0404));
                      window.clearFlags(2048);
                      window.addFlags(i);
                   }
                }
                this.setContentView(R.layout.arg_RES_7f0d002e);
                this.u3();
                PresenterV2 presenterV2 = new PresenterV2();
                this.A = presenterV2;
                presenterV2.U7(new FSVideoPresenter(serializable.getKwaiBubbleId(), serializable.getVideoConfig()));
                presenterV2.f(this.findViewById(R.id.fs_video_root_view));
                Object[] objArray1 = new Object[]{presenterV2};
                presenterV2.i(objArray1);
                return;
             }
          }
       }
       this.finish();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FSVideoActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       FSVideoActivity tA = this.A;
       if (tA != null) {
          tA.destroy();
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       FSVideoActivity uFSVideoActi = FSVideoActivity.class;
       if (PatchProxy.isSupport(uFSVideoActi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFSVideoActi, "3")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.u3();
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, FSVideoActivity.class, "6")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (l1.a(uoc.a())) {
          Window window = this.getWindow();
          a.o(window, "window");
          window.getDecorView().post(new FSVideoActivity$b(this));
       }
       return;
    }
}
