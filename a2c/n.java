package a2c.n;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class n implements g	// class@00004b
{
    public final ProfileBackgroundPublishManager b;
    public final ProfileBgVideoInfo c;

    public void n(ProfileBackgroundPublishManager p0,ProfileBgVideoInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          this.b.m(this.c);
       }
       return;
    }
}
