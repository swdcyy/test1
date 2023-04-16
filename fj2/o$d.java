package fj2.o$d;
import fj2.t$a;
import fj2.o;
import java.lang.Object;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wkd.b;
import com.kuaishou.screencast.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import fj2.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public class o$d implements t$a	// class@00297a
{
    public final o a;

    public void o$d(o p0){
       this.a = p0;
       super();
    }
    public void a(int p0,ScreencastDeviceInfo p1){
       boolean b;
       o$d uod = o$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "1")) {
          return;
       }
       if (this.a.Y8()) {
          b.a(-1851168653).g();
          this.a.E = p1;
       }else {
          this.a.h9(p1);
       }
       p0++;
       p1 = p1.mDeviceName;
       b = y.d(this.a.getActivity());
       o r = this.a.r;
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(b), r, null, c.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_SCREENCAST_SELECT_PANEL";
          i3 oi3 = i3.f();
          oi3.c("item_index", Integer.valueOf(p0));
          oi3.d("item_name", p1);
          uElementPack.params = oi3.e();
          ClickMetaData uClickMetaDa = new ClickMetaData();
          uClickMetaDa.setContentPackage(c.b(b, r));
          uClickMetaDa.setElementPackage(uElementPack);
          u1.B(uClickMetaDa);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, o$d.class, "2")) {
          return;
       }
       b.a(-1851168653).f();
       return;
    }
}
