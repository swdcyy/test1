package a2c.k;
import exc.l$a;
import a2c.l;
import java.lang.Object;
import exc.l$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import kotlin.jvm.internal.a;
import exc.l$b;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import wkd.b;
import o3c.l;
import brd.t;
import a2c.k$a;
import a2c.k$b;
import erd.g;
import crd.b;

public final class k implements l$a	// class@000048
{
    public final l a;

    public void k(l p0){
       this.a = p0;
       super();
    }
    public void a(int p0,l$f p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, k.class, "2")) {
          return;
       }
       this.a.b.s();
       this.a.b.l();
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       a.p(p0, "action");
       return;
    }
    public void c(l$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "response");
       ProfileBackgroundPublishManager d = this.a.b.d;
       if (d != null) {
          d.setZtPhotoId(String.valueOf(p0.a()));
          g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "image publish success "+d.getZtPhotoId());
          b.a(0x37313f08).o(d.getZtPhotoId()).subscribe(new k$a(this, d), new k$b(this, d));
       }
       return;
    }
}
