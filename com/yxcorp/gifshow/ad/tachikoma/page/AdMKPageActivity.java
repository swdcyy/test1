package com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageActivity$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yx.j0;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.os.Parcelable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import java.lang.Integer;
import moc.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKFragment;
import java.util.Objects;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKFragment$a;
import kotlin.jvm.internal.a;

public final class AdMKPageActivity extends SingleFragmentActivity	// class@001833
{
    public HashMap y;
    public static final AdMKPageActivity$a z;

    static {
       AdMKPageActivity.z = new AdMKPageActivity$a(null);
    }
    public void AdMKPageActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AdMKPageActivity.class, "2")) {
          return;
       }
       super.finish();
       Object[] objArray = new Object[0];
       j0.f("AdMKActivity", "AdMKActivity finish", objArray);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AdMKPageActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return -1;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public boolean isDarkImmersiveMode(){
       return true;
    }
    public String o(){
       return "AD_MK_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMKPageActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       j0.f("AdMKActivity", "AdMKActivity onCreate", objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdMKPageActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdMKActivity", "AdMkActivity onDestroy", objArray);
       AdMKPageConfig parcelableEx = this.getIntent().getParcelableExtra("ad_mk_config");
       if (parcelableEx != null) {
          Object[] objArray1 = new Object[i];
          j0.f("AdMKActivity", "AdMkActivity remove feed", objArray1);
          Integer integer = parcelableEx.c();
          if (integer != null) {
             i = integer.intValue();
          }
          b.f(i);
       }
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdMKFragment$a obj = PatchProxy.apply(objArray, this, AdMKPageActivity.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = AdMKFragment.o;
       Objects.requireNonNull(obj);
       AdMKFragment uAdMKFragmen = PatchProxy.apply(objArray, obj, AdMKFragment$a.class, "1");
       if (uAdMKFragmen != patchProxyRe) {
       }else {
          uAdMKFragmen = new AdMKFragment();
       }
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       uAdMKFragmen.setArguments(intent.getExtras());
       return uAdMKFragmen;
    }
}
