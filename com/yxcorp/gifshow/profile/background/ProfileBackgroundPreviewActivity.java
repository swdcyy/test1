package com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import lnc.a1;
import z5c.k1;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class ProfileBackgroundPreviewActivity extends SingleFragmentActivity	// class@001229
{
    public HashMap y;
    public static final ProfileBackgroundPreviewActivity$a z;

    static {
       ProfileBackgroundPreviewActivity.z = new ProfileBackgroundPreviewActivity$a(null);
    }
    public void ProfileBackgroundPreviewActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundPreviewActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       k1.f(this, a1.a(R.color.arg_RES_7f06076b), false);
       return;
    }
    public Fragment u3(){
       ProfileBackgroundImagePreviewFragment profileBackg1;
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, ProfileBackgroundPreviewActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       String str = "PROFILE_PREVIEW_VIDEO_INFO";
       if (this.getIntent().hasExtra(str)) {
          SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
          ProfileBackgroundVideoPreviewFragment profileBackg = new ProfileBackgroundVideoPreviewFragment();
          profileBackg.setArguments(obj);
          return profileBackg;
       }else {
          str = "PROFILE_PREVIEW_IMAGE_URLS";
          if (this.getIntent().hasExtra(str)) {
             SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
             profileBackg1 = new ProfileBackgroundImagePreviewFragment();
             profileBackg1.setArguments(obj);
             return profileBackg1;
          }else if(this.getIntent().hasExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH")){
             obj.putString("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", this.getIntent().getStringExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH"));
             profileBackg1 = new ProfileBackgroundImagePreviewFragment();
             profileBackg1.setArguments(obj);
             return profileBackg1;
          }else {
             this.finish();
             return objArray;
          }
       }
    }
}
