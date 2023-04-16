package a2c.o;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class o implements g	// class@00004c
{
    public final ProfileBackgroundPublishManager b;
    public final ProfileBgVideoInfo c;

    public void o(ProfileBackgroundPublishManager p0,ProfileBgVideoInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          this.c.setStatus(3);
          this.b.k(this.c, -1, p0.getMessage(), p0);
       }
       return;
    }
}
