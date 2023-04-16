package com.kuaishou.live.gzone.v2.imagepreview.GzoneImagePreviewActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.os.Parcelable;
import ekd.j;
import com.yxcorp.gifshow.model.PreviewModel;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import ekd.j0;
import com.kuaishou.live.gzone.v2.imagepreview.GzoneImagePreviewFragment;

public class GzoneImagePreviewActivity extends SingleFragmentActivity	// class@001cc2
{
    public static final int y;

    public void GzoneImagePreviewActivity(){
       super();
    }
    public int M(){
       return 5;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, GzoneImagePreviewActivity.class, "6")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public String getPageParams(){
       String stringExtra;
       Intent obj = PatchProxy.apply(null, this, GzoneImagePreviewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       String str = "";
       if (obj != null) {
          stringExtra = obj.getStringExtra("KEY_PATTERN_TYPE");
          Parcelable[] parcelableAr = obj.getParcelableArrayExtra("PREVIEW_KEY_MODELS");
          if (!j.h(parcelableAr)) {
             int i = 0;
             if (parcelableAr[i] instanceof PreviewModel) {
                str = parcelableAr[i].d;
             }
          }
       }else {
          stringExtra = str;
       }
       return "activity_name=CNY2022&url="+str+"&gzone_live_type="+stringExtra;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GzoneImagePreviewActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://detail/gameimagepreview";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       return "OP_ACTIVITY_CNY2022_PICTURE_GIF_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzoneImagePreviewActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.overridePendingTransition(0, 0);
       i.h(this, 0xff000000, 0);
       return;
    }
    public Fragment u3(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GzoneImagePreviewActivity gzoneImagePr = GzoneImagePreviewActivity.class;
       Parcelable[] obj = PatchProxy.apply(null, this, gzoneImagePr, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Intent obj1 = PatchProxy.apply(null, this, gzoneImagePr, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Intent intent = this.getIntent();
          obj1 = null;
          if (intent != null) {
             obj = intent.getParcelableArrayExtra("PREVIEW_KEY_MODELS");
             if (!j.h(obj)) {
                int i = j0.b(intent, "PREVIEW_KEY_POSITION", obj1);
                if (i < 0 || i > obj.length) {
                   intent.putExtra("PREVIEW_KEY_POSITION", i);
                }
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          this.finish();
          return null;
       }else {
          GzoneImagePreviewFragment gzoneImagePr1 = new GzoneImagePreviewFragment();
          gzoneImagePr1.setArguments(this.getIntent().getExtras());
          return gzoneImagePr1;
       }
    }
}
