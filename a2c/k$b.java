package a2c.k$b;
import erd.g;
import a2c.k;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a2c.l;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;

public final class k$b implements g	// class@000047
{
    public final k b;
    public final ProfileBgVideoInfo c;

    public void k$b(k p0,ProfileBgVideoInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
       }else {
          this.c.setStatus(3);
          this.b.a.b.s();
          this.b.a.b.l();
       }
       return;
    }
}
