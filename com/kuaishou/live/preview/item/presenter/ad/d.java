package com.kuaishou.live.preview.item.presenter.ad.d;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.presenter.ad.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tkd.b;
import tkd.d;
import nl9.u;
import el3.i;
import el3.h;
import msd.a;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import el3.l;
import java.util.Map;
import java.util.HashMap;
import wk3.f;

public class d extends PresenterV2 implements g	// class@000e0d
{
    public QPhoto p;
    public f q;
    public a r;

    public void d(){
       super();
       this.r = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (k.B(this.p) == null) {
          return;
       }
       this.X7(d.a(-1694791652).of(this.p, new i(this), new h(this)));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new l());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("LIVE_PREVIEW_LIFECYCLE_SERVICE");
       return;
    }
}
