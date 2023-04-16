package kgd.u0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import oe6.b;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import uxb.j;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import kgd.u0$a;
import com.yxcorp.plugin.setting.presenter.c;
import android.view.View;
import k2b.e0;
import nc5.i;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u0 implements c	// class@0017bc
{
    public final String a;
    public final String b;
    public b c;
    public GifshowActivity d;
    public c e;
    public d f;

    public void u0(GifshowActivity p0){
       super();
       this.a = "SHOW_ORIGINALPROTECTION_SETTING";
       this.b = "CLICK_ORIGINALPROTECTION_SETTING";
       this.d = p0;
       b uob = new b();
       this.c = uob;
       uob.c = p0.getString(0x7f1046ff);
       u0 tc = this.c;
       tc.f = 0x7f081084;
       tc.h = b.z();
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.c;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, u0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new d();
       }
       return this.f;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, u0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(0x44d68c91).i7();
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, u0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          obj = new PresenterV2();
          this.e = obj;
          obj.add(new a());
          this.e.add(new u0$a(this));
          this.e.add(new c(1005));
       }
       return this.e;
    }
    public void r(View p0){
       u0 ou0 = u0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ou0, "4")) {
          return;
       }
       i.b(1005, this.d);
       this.d.startActivity(b.a(0x66dce92a).a(this.d, w0.f(this.c.h)));
       if (!PatchProxy.applyVoid(null, this, ou0, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_ORIGINALPROTECTION_SETTING";
          u1.u(1, uElementPack, null);
       }
       return;
    }
    public int y0(){
       return 0x7f0d14ca;
    }
}
