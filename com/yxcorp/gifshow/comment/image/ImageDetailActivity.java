package com.yxcorp.gifshow.comment.image.ImageDetailActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.Context;
import rk9.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.comment.image.ImageDetailFragment;

public class ImageDetailActivity extends SingleFragmentActivity	// class@0010d1
{
    public BaseFragment y;
    public static final int z;

    public void ImageDetailActivity(){
       super();
    }
    public static void A3(Context p0,m p1){
       ImageDetailActivity imageDetailA = ImageDetailActivity.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, imageDetailA, "7")) {
          return;
       }
       Intent intent = new Intent(p0, imageDetailA);
       Bundle uBundle = new Bundle();
       p1.a(uBundle);
       intent.addFlags(0x10000000);
       intent.putExtras(uBundle);
       p0.startActivity(intent);
       return;
    }
    public int M(){
       return 1;
    }
    public int f(){
       ImageDetailActivity obj = PatchProxy.apply(null, this, ImageDetailActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj == null)? 0: obj.f();
       return i;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, ImageDetailActivity.class, "6")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public int getPage(){
       ImageDetailActivity obj = PatchProxy.apply(null, this, ImageDetailActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int page = (obj != null)? obj.getPage(): 0;
       return page;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ImageDetailActivity.class, "9");
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
       ImageDetailActivity obj = PatchProxy.apply(null, this, ImageDetailActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String str = (obj != null)? obj.o(): super.o();
       return str;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDetailActivity.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.overridePendingTransition(0, 0);
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ImageDetailFragment obj = PatchProxy.apply(null, this, ImageDetailActivity.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, ImageDetailFragment.class, "7");
       if (obj != patchProxyRe) {
       }else {
          obj = new ImageDetailFragment();
       }
       this.y = obj;
       obj.setArguments(this.getIntent().getExtras());
       return this.y;
    }
}
