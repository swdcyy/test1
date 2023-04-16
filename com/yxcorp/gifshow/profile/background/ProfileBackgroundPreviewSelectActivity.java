package com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import z5c.k1;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import ekd.j0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment;
import java.lang.CharSequence;

public final class ProfileBackgroundPreviewSelectActivity extends SingleFragmentActivity	// class@00122c
{
    public int y;
    public HashMap z;
    public static final ProfileBackgroundPreviewSelectActivity$a A;

    static {
       ProfileBackgroundPreviewSelectActivity.A = new ProfileBackgroundPreviewSelectActivity$a(null);
    }
    public void ProfileBackgroundPreviewSelectActivity(){
       super();
       this.y = 1;
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewSelectActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "background_type="+this.y;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewSelectActivity.class, "6");
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
       return "SET_PROFILE_BACKGROUND";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundPreviewSelectActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       k1.f(this, 0, 0);
       return;
    }
    public Fragment u3(){
       ProfileBackgroundImagePreviewSelectFragment profileBackg1;
       Bundle obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewSelectActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       boolean b = false;
       obj.putBoolean("from_mine", j0.a(this.getIntent(), "from_mine", b));
       String str = "PROFILE_PREVIEW_VIDEO_INFO";
       if (this.getIntent().hasExtra(str)) {
          obj.putLong("PROFILE_PREVIEW_VIDEO_PROGRESS", this.getIntent().getLongExtra("PROFILE_PREVIEW_VIDEO_PROGRESS", 0));
          SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
          if (this.getIntent().hasExtra("PROFILE_PREVIEW_PHOTO_LAST_UID")) {
             obj.putString("PROFILE_PREVIEW_PHOTO_LAST_UID", this.getIntent().getStringExtra("PROFILE_PREVIEW_PHOTO_LAST_UID"));
          }
          ProfileBackgroundVideoPreviewSelectFragment profileBackg = new ProfileBackgroundVideoPreviewSelectFragment();
          profileBackg.setArguments(obj);
          return profileBackg;
       }else {
          str = "PROFILE_PREVIEW_IMAGE_URLS";
          int i = 1;
          if (this.getIntent().hasExtra(str)) {
             SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
             str = "PROFILE_PREVIEW_PHOTO_FEED";
             if (this.getIntent().hasExtra(str)) {
                SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
             }
             if (this.getIntent().hasExtra("PROFILE_PREVIEW_PHOTO_LAST_UID")) {
                obj.putString("PROFILE_PREVIEW_PHOTO_LAST_UID", this.getIntent().getStringExtra("PROFILE_PREVIEW_PHOTO_LAST_UID"));
             }
             str = "PROFILE_PREVIEW_PHOTO_USER";
             if (this.getIntent().hasExtra(str)) {
                SerializableHook.putSerializable(obj, str, SerializableHook.getSerializableExtra(this.getIntent(), str));
             }
             if (j0.a(this.getIntent(), "PROFILE_PREVIEW_IMAGE_DEFAULT", b)) {
                i = 3;
             }
             this.y = i;
             profileBackg1 = new ProfileBackgroundImagePreviewSelectFragment();
             profileBackg1.setArguments(obj);
             return profileBackg1;
          }else if(this.getIntent().hasExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH")){
             obj.putString("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", this.getIntent().getStringExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH"));
             String stringExtra = this.getIntent().getStringExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH");
             if (stringExtra == null || !stringExtra.length()) {
                b = true;
             }
             if (b) {
                this.y = 2;
             }
             if (this.getIntent().hasExtra("PROFILE_PREVIEW_PHOTO_LAST_UID")) {
                obj.putString("PROFILE_PREVIEW_PHOTO_LAST_UID", this.getIntent().getStringExtra("PROFILE_PREVIEW_PHOTO_LAST_UID"));
             }
             profileBackg1 = new ProfileBackgroundImagePreviewSelectFragment();
             profileBackg1.setArguments(obj);
             return profileBackg1;
          }else {
             return new ProfileBackgroundImagePreviewSelectFragment();
          }
       }
    }
}
