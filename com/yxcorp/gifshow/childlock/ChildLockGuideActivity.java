package com.yxcorp.gifshow.childlock.ChildLockGuideActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.Intent;
import android.content.Context;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.childlock.fragment.ChildLockGuideFragment;

public class ChildLockGuideActivity extends SingleFragmentActivity	// class@001075
{
    public ChildLockGuideFragment y;

    public void ChildLockGuideActivity(){
       super();
    }
    public static void A3(Activity p0){
       ChildLockGuideActivity uChildLockGu = ChildLockGuideActivity.class;
       Intent obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uChildLockGu, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(uChildLockGu) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, obj, uChildLockGu, "2")) {
          obj = new Intent(p0, uChildLockGu);
          obj.putExtra("key_guide_mode", false);
          p0.startActivity(obj);
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChildLockGuideActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://safe_lock";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockGuideActivity.class, "3")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       ChildLockGuideFragment obj = PatchProxy.apply(null, this, ChildLockGuideActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ChildLockGuideFragment();
       this.y = obj;
       obj.setArguments(this.getIntent().getExtras());
       return this.y;
    }
}
