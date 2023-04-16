package com.yxcorp.gifshow.camera.record.preview.PreviewVideoActivity;
import ml8.d;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pg9.a;
import android.view.View$OnClickListener;
import ekd.m1;
import android.view.Window;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.camera.record.preview.VideoPlayerPresenter;

public class PreviewVideoActivity extends BasePostActivity implements d	// class@000efc
{
    public PresenterV2 O;
    public static final int P;

    public void PreviewVideoActivity(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewVideoActivity.class, "1")) {
          return;
       }
       m1.a(p0, new a(this), R.id.preview_video_container);
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PreviewVideoActivity.class, "4")) {
          return;
       }
       super.finish();
       this.getWindow().setFlags(2048, 2048);
       this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PreviewVideoActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://h5_preview_video";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PreviewVideoActivity.class, "2")) {
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
          p0 = this.getIntent().getExtras();
          this.setContentView(R.layout.arg_RES_7f0d05a1);
          this.doBindView(this.getWindow().getDecorView());
          PresenterV2 presenterV2 = new PresenterV2();
          this.O = presenterV2;
          String str = p0.getString("video_file_path");
          String str1 = p0.getString("video_cover_file_path");
          presenterV2.U7(new VideoPlayerPresenter(str, str1, p0.getInt("camera_page_source")));
          this.O.f(this.findViewById(R.id.preview_video_container));
          Object[] objArray = new Object[]{this};
          this.O.i(objArray);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PreviewVideoActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       PreviewVideoActivity tO = this.O;
       if (tO != null) {
          tO.unbind();
          this.O.destroy();
       }
       return;
    }
}
