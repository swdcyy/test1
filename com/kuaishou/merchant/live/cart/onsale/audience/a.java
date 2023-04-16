package com.kuaishou.merchant.live.cart.onsale.audience.a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.base.rmc.e;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ds3.a;
import a44.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.List;
import k34.m;
import java.util.Map;
import java.util.HashMap;

public class a implements g	// class@001922
{
    public a b;
    public l c;
    public m d;
    public Fragment e;
    public g0 f;
    public CommodityListGuestResponse g;
    public RecyclerView h;
    public PublishSubject i;
    public n j;
    public d$e k;
    public a$b l;
    public f m;
    public e0 n;
    public a$c o;
    public e p;
    public a q;
    public a$a r;
    public boolean s;

    public void a(){
       super();
       this.i = PublishSubject.g();
       this.p = new e();
    }
    public LiveMerchantBaseContext a(){
       return this.b.b;
    }
    public d b(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a tg = this.g;
       return new d(tg.mVersion, tg.mCloseMenu);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new m());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
