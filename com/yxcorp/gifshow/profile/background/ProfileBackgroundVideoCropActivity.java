package com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropActivity$a;
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
import z5c.k1;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoCropFragment;

public final class ProfileBackgroundVideoCropActivity extends SingleFragmentActivity	// class@001238
{
    public HashMap y;
    public static final ProfileBackgroundVideoCropActivity$a z;

    static {
       ProfileBackgroundVideoCropActivity.z = new ProfileBackgroundVideoCropActivity$a(null);
    }
    public void ProfileBackgroundVideoCropActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundVideoCropActivity.class, "5");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundVideoCropActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       k1.f(this, 0, 0);
       return;
    }
    public Fragment u3(){
       Bundle obj = PatchProxy.apply(null, this, ProfileBackgroundVideoCropActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       String str = "PROFILE_PREVIEW_VIDEO_INFO";
       if (this.getIntent().hasExtra(str)) {
          SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
          SerializableHook.putSerializable(obj, "PROFILE_PREVIEW_PHOTO_FEED", SerializableHook.getSerializableExtra(this.getIntent(), "PROFILE_PREVIEW_PHOTO_FEED"));
       }
       ProfileBackgroundVideoCropFragment profileBackg = new ProfileBackgroundVideoCropFragment();
       profileBackg.setArguments(obj);
       return profileBackg;
    }
}
