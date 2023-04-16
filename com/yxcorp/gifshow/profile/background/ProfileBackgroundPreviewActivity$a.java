package com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivityTablet;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity;
import android.app.Activity;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.ArrayList;

public final class ProfileBackgroundPreviewActivity$a	// class@001228
{

    public void ProfileBackgroundPreviewActivity$a(){
       super();
    }
    public void ProfileBackgroundPreviewActivity$a(u p0){
       super();
    }
    public final Class a(){
       ProfileBackgroundPreviewActivity profileBackg;
       ProfileBackgroundPreviewActivityTablet obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewActivity$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (b.g())? ProfileBackgroundPreviewActivityTablet.class: ProfileBackgroundPreviewActivity.class;
       return obj;
    }
    public final void b(Activity p0,ProfileBgVideoInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileBackgroundPreviewActivity$a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "videoInfo");
       Intent intent = new Intent(p0, this.a());
       SerializableHook.putExtra(intent, "PROFILE_PREVIEW_VIDEO_INFO", p1);
       p0.startActivity(intent);
       return;
    }
    public final void c(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileBackgroundPreviewActivity$a.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "localPath");
       Intent intent = new Intent(p0, this.a());
       intent.putExtra("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", p1);
       p0.startActivity(intent);
       return;
    }
    public final void d(Activity p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileBackgroundPreviewActivity$a.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "headerUrls");
       Intent intent = new Intent(p0, this.a());
       SerializableHook.putExtra(intent, "PROFILE_PREVIEW_IMAGE_URLS", p1);
       p0.startActivity(intent);
       return;
    }
}
