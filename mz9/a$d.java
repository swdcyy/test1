package mz9.a$d;
import qp7.y0;
import mz9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;

public final class a$d extends y0	// class@0030a9
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$d.class, "1")) {
          return;
       }
       a$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "15")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "INTERNAL_FEEDBACK_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          a u = ta.u;
          if (u == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(u.getEntity());
          a w = ta.w;
          if (w == null) {
             a.S("mFragment");
          }
          u1.C0("", w, 6, uElementPack, uContentPack);
       }
       return;
    }
}
