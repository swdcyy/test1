package com.yxcorp.gifshow.activity.web.WebFullScreenVideoActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.WebVideoParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.utility.RomUtils;
import ekd.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import kx8.t;
import java.lang.Runnable;

public class WebFullScreenVideoActivity extends GifshowActivity	// class@0014b8
{
    public PresenterV2 y;
    public WebVideoParam z;
    public static final int A;

    public void WebFullScreenVideoActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoActivity.class, "9")) {
          return;
       }
       super.finish();
       this.getWindow().setFlags(2048, 2048);
       this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       return;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       WebFullScreenVideoActivity obj = PatchProxy.apply(null, this, WebFullScreenVideoActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       String str = "";
       if (obj == null) {
          return str;
       }
       if (!TextUtils.x(obj.pageParams)) {
          str = "&"+this.z.pageParams;
       }
       return "splash_id="+TextUtils.I(this.z.mVideoId)+str;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, WebFullScreenVideoActivity.class, "10");
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
       return "YODA_SPLASH_VIDEO";
    }
    public void onCreate(Bundle p0){
       WebFullScreenVideoActivity webFullScree = WebFullScreenVideoActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, webFullScree, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       if (this.getIntent() == null || this.getIntent().getExtras() == null) {
          this.finish();
          return;
       }else {
          WebVideoParam serializable = SerializableHook.getSerializable(this.getIntent().getExtras(), "key_video_param");
          this.z = serializable;
          if (serializable != null && (!TextUtils.x(serializable.mVideoId) && (j.h(this.z.mVideoUrl) || TextUtils.x(this.z.mVideoUrl[0].mUrl)))) {
             this.finish();
             return;
          }else if(PatchProxy.applyVoidOneRefs(this, this, webFullScree, "6")){
             Window window = this.getWindow();
             int i = 1024;
             if (RomUtils.q()) {
                window.clearFlags(i);
                i.h(this, 0, this.isDarkImmersiveMode());
             }else {
                window.getDecorView().setSystemUiVisibility((window.getDecorView().getSystemUiVisibility() | 0x0404));
                window.clearFlags(2048);
                window.addFlags(i);
             }
          }
          this.setContentView(R.layout.arg_RES_7f0d003a);
          this.u3();
          PresenterV2 presenterV2 = new PresenterV2();
          this.y = presenterV2;
          presenterV2.U7(new WebFullScreenVideoPresenter(this.z));
          this.y.f(this.findViewById(R.id.web_preview_video_container));
          Object[] objArray = new Object[]{this};
          this.y.i(objArray);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       WebFullScreenVideoActivity ty = this.y;
       if (ty != null) {
          ty.destroy();
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       WebFullScreenVideoActivity webFullScree = WebFullScreenVideoActivity.class;
       if (PatchProxy.isSupport(webFullScree) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, webFullScree, "4")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.u3();
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, WebFullScreenVideoActivity.class, "7")) {
          return;
       }
       if (l1.a(a.a().a())) {
          this.getWindow().getDecorView().post(new t(this));
       }
       return;
    }
}
