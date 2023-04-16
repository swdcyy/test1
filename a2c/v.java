package a2c.v;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v implements g	// class@000053
{
    public final ProfileBackgroundPublishManager b;
    public final ProfileBgVideoInfo c;

    public void v(ProfileBackgroundPublishManager p0,ProfileBgVideoInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
       }else {
          this.b.m(this.c);
       }
       return;
    }
}
