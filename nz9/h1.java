package nz9.h1;
import uf5.i0$a;
import nz9.z0;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Throwable;
import uf5.h0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import tkd.b;
import tkd.d;
import jyb.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import u07.t$a;
import android.app.Activity;
import u07.f;
import nz9.h0;
import u07.u;
import uf5.i0;
import nz9.g1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class h1 implements i0$a	// class@003224
{
    public final User a;
    public final z0 b;

    public void h1(z0 p0,User p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Throwable p0){
       h0.a(this, p0);
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h1.class, "1")) {
          return;
       }
       h1 tb = this.b;
       h1 ta = this.a;
       Objects.requireNonNull(tb);
       z0 oz0 = z0.class;
       if (!PatchProxy.applyVoidOneRefs(ta, tb, oz0, "18") && !d.a(-1079301847).Tp()) {
          if (!PatchProxy.applyVoid(objArray, tb, oz0, "72")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SUCCESS_TOAST";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.u.mEntity);
             u1.u0(4, uElementPack, uContentPack);
          }
          t$a uoa = new t$a(tb.C);
          uoa.W0(R.string.arg_RES_7f100e54);
          int i = (ta.isFemale())? 0x7f100e5a: 0x7f100e5b;
          uoa.y0(i);
          uoa.S0(R.string.arg_RES_7f1012a9);
          uoa = f.e(uoa);
          uoa.u0(new h0(tb));
          tb.Z.a();
          uoa.Y(new g1(tb));
       }
       this.b.P0();
       return;
    }
    public void c(){
       h0.b(this);
    }
}
