package d82.n;
import im8.g;
import k51.c;
import java.util.ArrayList;
import d82.n$a;
import d82.n$b;
import d82.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c$b;
import kq5.b;
import t02.a0;
import com.kuaishou.livestream.message.nano.SCLiveEntrustOpened;
import d82.j;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveEntrustClosed;
import d82.k;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import android.app.Dialog;
import java.util.List;
import h91.d;
import h91.c;
import brd.t;
import cjd.e;
import erd.o;
import d82.l;
import d82.m;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import d82.f;
import d82.h;
import d82.f$a;
import d82.g;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import jg1.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import d82.q;
import java.util.Map;
import java.util.HashMap;
import iv1.a;

public class n extends c implements g	// class@00249a
{
    public a0 p;
    public b q;
    public a r;
    public f s;
    public boolean t;
    public boolean u;
    public List v;
    public n$c w;
    public final c$b x;
    public final g y;
    public static String sLivePresenterClassName = "LiveAudienceEscrowEntryPresenter";

    public void n(){
       super();
       this.t = false;
       this.u = false;
       this.v = new ArrayList();
       this.w = new n$a(this);
       this.x = new n$b(this);
       this.y = new i(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.q.c(this.x);
       this.p.C.u0(689, SCLiveEntrustOpened.class, new j(this));
       this.p.C.u0(690, SCLiveEntrustClosed.class, new k(this));
       this.p.C.u0(300, LiveStreamMessages$SCEnterRoomAck.class, this.y);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       this.q.a(this.x);
       this.p.C.o(300, this.y);
       n ts = this.s;
       if (ts != null && ts.isShowing()) {
          this.s.dismiss();
       }
       this.t = false;
       this.u = false;
       this.v.clear();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       this.X7(c.b().b().map(new e()).subscribe(new l(this), m.b));
       return;
    }
    public final void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "7")) {
          return;
       }
       if (this.getActivity() != null) {
          f uof = new f(this.getActivity(), this.p, new h(this));
          this.s = uof;
          uof.setOnDismissListener(new g(this));
          this.s.show();
          BaseFragment uBaseFragmen = this.p.Z2.b();
          ClientContent$LiveStreamPackage liveStreamPa = this.p.Z2.a();
          if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, liveStreamPa, objArray, b.class, "16")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ASSISTANT_TRUSTEESHIP_CARD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.D0("2447274", uBaseFragmen, 4, uElementPack, uContentPack, null);
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new q());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.r = this.q8(a.class);
       return;
    }
}
