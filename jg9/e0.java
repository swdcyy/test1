package jg9.e0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jg9.z0;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import j8c.a;
import q87.c;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import java.lang.Iterable;
import brd.t;
import jg9.h0;
import erd.o;
import brd.a0;
import jg9.j0;
import t45.d;
import brd.z;
import jg9.k0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$recommend$4;
import brd.d0;

public final class e0 implements View$OnClickListener	// class@002a90
{
    public final MultiTakePictureController b;

    public void e0(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e0.class, "1")) {
          return;
       }
       z0 a = z0.a;
       d e = this.b.e;
       a.o(e, "mActivity");
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(e, a, z0.class, "10")) {
          a.p(e, "page");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AI_CHECK_PICTURE";
          u1.M("", e, 1, uElementPack, null, null);
       }
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, MultiTakePictureController.class, "50")) {
          Object[] objArray = new Object[0];
          a.D().w(MultiTakePictureController.U, "recommend", objArray);
          MultiTakePictureController x = tb.x;
          if (x != null) {
             t.fromIterable(x.K0()).flatMapSingle(h0.b).toList().C(j0.b).T(d.c).G(d.a).r(new k0(x)).b(new MultiTakePictureController$recommend$4(tb));
          }
       }
       PatchProxy.onMethodExit(e0.class, "1");
       return;
    }
}
