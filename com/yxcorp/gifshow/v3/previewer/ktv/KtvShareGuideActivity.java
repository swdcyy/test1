package com.yxcorp.gifshow.v3.previewer.ktv.KtvShareGuideActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.String;
import lnc.a1;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import ooc.p0;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import zf6.l;
import ekd.i;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvShareGuideFragment;

public class KtvShareGuideActivity extends SingleFragmentActivity	// class@0015ad
{
    public static String y;

    static {
       KtvShareGuideActivity.y = a1.p(0x7f101b76);
    }
    public void KtvShareGuideActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KtvShareGuideActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://ktv_share_guide";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       return "KARAOKE_SAVED";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, KtvShareGuideActivity.class, "4")) {
          return;
       }
       p0.e();
       this.setResult(0, new Intent());
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvShareGuideActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       i.h(this, l.o(-1), l.r());
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, KtvShareGuideActivity.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KtvShareGuideActivity.y;
       KtvShareGuideFragment ktvShareGuid = PatchProxy.applyOneRefs(obj, objArray, KtvShareGuideFragment.class, "1");
       if (ktvShareGuid != patchProxyRe) {
       }else {
          ktvShareGuid = new KtvShareGuideFragment();
          Bundle uBundle = new Bundle();
          uBundle.putString("ktv_share_guide_fragment_key", obj);
          ktvShareGuid.setArguments(uBundle);
       }
       return ktvShareGuid;
    }
    public boolean y3(){
       return false;
    }
}
