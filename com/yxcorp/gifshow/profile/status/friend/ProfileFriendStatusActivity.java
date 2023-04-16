package com.yxcorp.gifshow.profile.status.friend.ProfileFriendStatusActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.status.friend.ProfileFriendStatusActivity$a;
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
import java.util.LinkedHashMap;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import lnc.o5;
import java.util.Map;
import q3c.d;
import z5c.k0;
import android.content.Context;

public final class ProfileFriendStatusActivity extends GifshowActivity	// class@0015b1
{
    public HashMap y;
    public static final ProfileFriendStatusActivity$a z;

    static {
       ProfileFriendStatusActivity.z = new ProfileFriendStatusActivity$a(null);
    }
    public void ProfileFriendStatusActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfileFriendStatusActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFriendStatusActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Intent intent = this.getIntent();
       Uri data = (intent != null)? intent.getData(): null;
       int i = -1;
       int i1 = o5.b(x0.b(data, "topStatusType", ""), i);
       if (i1 != i) {
          linkedHashMa.put("topMoodType", String.valueOf(i1));
       }
       if (!PatchProxy.applyVoidTwoRefs(this, linkedHashMa, null, d.class, "3")) {
          if (!k0.d()) {
             str = "0";
          }
          linkedHashMa.put("enableProfileStatusV2", str);
          d.a(this, "SocialProfileStatus", "ProfileFriendStatus", linkedHashMa);
       }
       this.finish();
       return;
    }
}
