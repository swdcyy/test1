package com.yxcorp.gifshow.profile.preview.ProfilePreviewScreenActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import android.content.Intent;
import fg6.a;
import com.kwai.framework.model.user.UserProfile;
import com.google.gson.Gson;
import z5c.k1;
import com.yxcorp.gifshow.profile.preview.ProfilePreviewFragment;
import qa9.q;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import qa9.s;

public final class ProfilePreviewScreenActivity extends GifshowActivity	// class@001595
{
    public UserProfile y;
    public HashMap z;

    public void ProfilePreviewScreenActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewScreenActivity.class, "5");
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
       return "VISITOR_PREVIEW_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewScreenActivity.class, "1")) {
          return;
       }
       int i = 0;
       this.overridePendingTransition(i, i);
       super.onCreate(p0);
       if (this.getIntent() != null) {
          this.y = a.a.h(this.getIntent().getStringExtra("userProfile"), UserProfile.class);
          boolean b = true;
          k1.f(this, i, b);
          this.setContentView(R.layout.arg_RES_7f0d04ac);
          ProfilePreviewScreenActivity ty = this.y;
          if (PatchProxy.applyTwoRefs(this, ty, null, ProfilePreviewFragment.class, "6") != PatchProxyResult.class) {
          }else {
             ProfilePreviewFragment.l = ty;
             ProfilePreviewFragment.m = s.c(this.getSupportFragmentManager(), ProfilePreviewFragment.class, "ProfilePreviewFragment", null, BottomSheetParams.ofStateless().setCancelable(b, b).setNeedPageLogger(i).setContainerLayout(0x7f0d11cc));
          }
       }else {
          this.finish();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewScreenActivity.class, "2")) {
          return;
       }
       this.overridePendingTransition(0, 0);
       super.onPause();
       return;
    }
}
