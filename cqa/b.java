package cqa.b;
import ayb.r;
import java.lang.Object;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedInitModule;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import cra.w;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;

public class b implements r	// class@00236a
{

    public void b(){
       super();
    }
    public a Fx(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PreEmbeddedInitModule();
    }
    public QPhoto KH(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreEmbeddedManager.b();
    }
    public void Wg(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, PreEmbeddedManager.class, "4")) {
          PreEmbeddedManager.g = true;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LOCAL_PRE_BURY_PHOTO_ITEM";
          i3 oi3 = i3.f();
          oi3.d("photo_id", PreEmbeddedManager.k);
          uElementPack.params = oi3.e();
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "FEATURED_PAGE";
          u1.y0(urlPackage, 8, uElementPack, null);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean z00(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, PreEmbeddedManager.class, "5");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          Object[] objArray1 = new Object[0];
          w.C().w(PreEmbeddedManager.d, "Call canShowFeed\(\) spend ms = "+(System.currentTimeMillis() - PreEmbeddedManager.e), objArray1);
          PreEmbeddedManager l = PreEmbeddedManager.l;
          b = (l.f() || l.e())? false: true;
       }
       return b;
    }
}
