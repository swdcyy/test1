package ox0.a0;
import xd1.g$a;
import ox0.x;
import android.app.Activity;
import lp3.e;
import rp5.a;
import xp5.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.a;
import nw1.b;
import lp3.c;
import java.util.Map;
import op1.b;
import op1.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import f22.m;
import androidx.fragment.app.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import f22.g;
import java.util.Objects;
import f22.g$a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import rd1.b;
import rd1.b$a;
import u07.t$a;
import rd1.a;
import u07.u;
import u07.t;
import u07.j;

public class a0 implements g$a	// class@0035b5
{
    public final Activity a;
    public final e b;
    public final a c;
    public final i d;
    public final x e;

    public void a0(x p0,Activity p1,e p2,a p3,i p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a0.class, "3")) {
          return;
       }
       this.e.cp(this.b, "BEAUTIFY");
       a0 te = this.e;
       d.b(this.e.Po().a(b.class), this.e.Po().a(i.class), te.r, te.ep());
       return;
    }
    public void b(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, a0.class, str)) {
          return;
       }
       b.Z(LiveLogTag.MULTI_CHAT, " onInvitationSettingAction");
       m om = new m(this.c.getChildFragmentManager(), this.d.getPage(), this.d.a(), null, "CHAT_POPUP", null, null);
       v0.a();
       e0 page = this.d.getPage();
       ClientContent$LiveStreamPackage liveStreamPa = this.d.a();
       if (!PatchProxy.applyVoidTwoRefs(page, liveStreamPa, objArray, g.class, str)) {
          g$a a = g.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(page, liveStreamPa, a, g$a.class, "4")) {
             a.p(page, "logPage");
             a.p(liveStreamPa, "liveStreamPackage");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MIC_SELECT_POPUP";
             i3 oi3 = i3.f();
             oi3.c("btn_name", Integer.valueOf(15));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.L("", page, 1, uElementPack, uContentPack);
          }
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0.class, "1")) {
          return;
       }
       a0 ta = this.a;
       a0 tb = this.b;
       if (!PatchProxy.applyVoidTwoRefs(ta, tb, objArray, b.class, "2")) {
          b$a a = b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(ta, tb, a, b$a.class, "2")) {
             a.p(ta, "activity");
             a.p(tb, "liveServiceManager");
             b.Z(LiveLogTag.MULTI_CHAT, "GuestHelper leave");
             t$a uoa = new t$a(ta);
             uoa.W0(R.string.arg_RES_7f101f17);
             uoa.S0(R.string.arg_RES_7f103a83);
             uoa.Q0(R.string.cancel);
             uoa.u0(new a(tb));
             j.d(uoa);
          }
       }
       return;
    }
    public void d(){
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a0.class, "4")) {
          return;
       }
       this.e.cp(this.b, "TURN_OVER");
       a0 te = this.e;
       if (te.r != null) {
          te.Po().a(b.class).switchCamera();
          this.e.r.switchCamera();
       }
       return;
    }
    public void onCancel(){
    }
    public void onDismiss(){
    }
}
