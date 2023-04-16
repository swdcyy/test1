package ak9.a;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.uiconfig.childlock.model.TeenageToolsConfig;
import k2b.e0;
import java.lang.Object;
import xgc.b;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import ck9.a;
import android.view.View;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import bk9.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class a implements c	// class@0000e2
{
    public b a;
    public d b;
    public c c;
    public GifshowActivity d;
    public int e;
    public e0 f;

    public void a(GifshowActivity p0,TeenageToolsConfig p1,boolean p2,int p3,e0 p4){
       super();
       this.d = p0;
       this.e = p3;
       this.f = p4;
       b uob = new b();
       this.a = uob;
       uob.g = p1.mIconUrl;
       uob.c = p1.mDesc;
       uob.h = p1.mActionUrl;
       uob.f = 0x7f081083;
       p1 = (p2)? p1.mCorner2: p1.mCorner1;
       uob.d = p1;
       return;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new d();
       }
       return this.b;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new a(this.a.c, this.e, this.f));
       }
       return this.c;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.d.startActivity(b.a(0x66dce92a).a(this.d, w0.f(this.a.h)));
       b c = this.a.c;
       a te = this.e;
       a tf = this.f;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(c, Integer.valueOf(te), tf, null, a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.params = a.a(c, te);
          uElementPack.action2 = "TOOLS_LIST_ENTRANCE";
          u1.M("2632093", tf, 3, uElementPack, null, null);
       }
       return;
    }
    public int y0(){
       return 0x7f0d01a9;
    }
}
