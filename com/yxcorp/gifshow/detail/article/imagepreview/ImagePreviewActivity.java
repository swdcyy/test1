package com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import android.content.Intent;
import android.os.Parcelable;
import ekd.j;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment;

public class ImagePreviewActivity extends SingleFragmentActivity	// class@001348
{
    public QPhoto y;
    public static final int z;

    public void ImagePreviewActivity(){
       super();
    }
    public int M(){
       return 4;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, ImagePreviewActivity.class, "6")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public int getPage(){
       return 7;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ImagePreviewActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://detail/imagepreview";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImagePreviewActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.overridePendingTransition(0, 0);
       i.h(this, 0, 0);
       return;
    }
    public Fragment u3(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ImagePreviewActivity imagePreview = ImagePreviewActivity.class;
       Object obj = PatchProxy.apply(null, this, imagePreview, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, imagePreview, "5");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          Intent intent = this.getIntent();
          int i = 0;
          if (intent != null) {
             Parcelable[] parcelableAr = intent.getParcelableArrayExtra("PREVIEW_KEY_MODELS");
             if (!j.h(parcelableAr)) {
                QPhoto qPhoto = j0.e(intent, "PREVIEW_KEY_QPHOTO");
                this.y = qPhoto;
                if (qPhoto != null) {
                   if (!PatchProxy.applyVoid(null, this, imagePreview, "3") && this.y != null) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "DOWNLOAD_BUTTON";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(this.y.mEntity);
                      u1.u0(6, uElementPack, uContentPack);
                   }
                   String str = "PREVIEW_KEY_POSITION";
                   i = j0.b(intent, str, i);
                   if (i < 0 || i > parcelableAr.length) {
                      intent.putExtra(str, i);
                   }
                   b = true;
                }
             }
          }
          b = false;
       }
       if (!b) {
          this.finish();
          return null;
       }else {
          ImagePreviewFragment imagePreview1 = new ImagePreviewFragment();
          imagePreview1.setArguments(this.getIntent().getExtras());
          return imagePreview1;
       }
    }
}
