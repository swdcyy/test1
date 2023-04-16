package com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$g;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;

public final class ProfileBackgroundPublishManager$g implements g	// class@001233
{
    public final ProfileBackgroundPublishManager b;
    public final GifshowActivity c;
    public final File d;

    public void ProfileBackgroundPublishManager$g(ProfileBackgroundPublishManager p0,GifshowActivity p1,File p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ProfileBackgroundPublishManager$g.class, "1")) {
       }else {
          a.p(obj, "data");
          ProfileBackgroundPublishManager.d(this.b, this.c, this.d, obj, null, 8, null);
       }
       return;
    }
}
