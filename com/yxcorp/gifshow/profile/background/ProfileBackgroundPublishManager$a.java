package com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$a;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import exc.l$d;

public final class ProfileBackgroundPublishManager$a implements g	// class@00122d
{
    public final ProfileBackgroundPublishManager b;

    public void ProfileBackgroundPublishManager$a(ProfileBackgroundPublishManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ProfileBackgroundPublishManager g;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBackgroundPublishManager$a.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ProfileBackgroundPublishManager.class, "27")) {
             g.a(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "upload cancelTask");
             g = p0.g;
             if (g != null) {
                g.onCancel();
             }
             p0.t();
             p0.r();
             p0.s();
             p0.g = null;
          }
       }
       return;
    }
}
