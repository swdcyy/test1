package ki9.m;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.lang.Integer;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;

public final class m implements PopupInterface$h	// class@002c9a
{
    public final PendantAvatarDialog b;

    public void m(PendantAvatarDialog p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, CameraLogger.class, "41")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "PRODUCE_HEAD_PENDANT_DIALOG";
          i3 oi3 = i3.f();
          oi3.d("dialog_type", "FUNCTION");
          uElementPack.params = oi3.e();
          u1.u0(10, uElementPack, objArray);
       }
       m tb = this.b;
       PendantAvatarDialog d = tb.d;
       if (d != null) {
          d.b(tb, p0);
       }
       return;
    }
    public void H(c p0,int p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, om, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       om = this.b;
       om.f.u(om.d());
       om = this.b;
       PendantAvatarDialog d = om.d;
       if (d != null) {
          d.a(om, p0, p1);
       }
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "3")) {
          return;
       }
       a.p(p0, "popup");
       o.a(this, p0);
       m tb = this.b;
       tb.f.u(tb.d());
       tb = this.b;
       PendantAvatarDialog d = tb.d;
       if (d != null) {
          d.a(tb, p0, 1);
       }
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
