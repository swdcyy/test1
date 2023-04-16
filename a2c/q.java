package a2c.q;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;

public final class q implements g	// class@00004e
{
    public final ProfileBackgroundPublishManager b;

    public void q(ProfileBackgroundPublishManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else {
          ProfileBackgroundPublishManager c = this.b.c;
          if (c != null) {
             c.setLocalCoverFile(p0);
          }
       }
       return;
    }
}
