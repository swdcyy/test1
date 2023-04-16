package a2c.k$a;
import erd.g;
import a2c.k;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a2c.l;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import ekd.k1;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;

public final class k$a implements g	// class@000046
{
    public final k b;
    public final ProfileBgVideoInfo c;

    public void k$a(k p0,ProfileBgVideoInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
       }else {
          p0 = this.b.a.b;
          k$a tc = this.c;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tc, p0, ProfileBackgroundPublishManager.class, "10")) {
             g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "image modify success "+tc.getZtPhotoId());
             tc.setModifyTimeStamp(k1.i());
             p0.r();
             p0.t();
             p0 = p0.g().iterator();
             while (p0.hasNext()) {
                p0.next().a(tc);
             }
          }
       }
       return;
    }
}
