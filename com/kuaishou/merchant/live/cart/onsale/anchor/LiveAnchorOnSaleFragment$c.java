package com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import im8.g;
import java.lang.Object;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import js3.a;
import r54.a;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b34.b;
import lnc.c3$b;
import lnc.c3;
import com.kuaishou.merchant.live.cart.onsale.anchor.q;
import java.util.Map;

public class LiveAnchorOnSaleFragment$c implements g	// class@001901
{
    public LiveMerchantBaseContext b;
    public LiveMerchantAnchorOnSaleCommodityResponse c;
    public Throwable d;
    public LiveAnchorOnSaleFragment e;
    public c$b f;
    public k0 g;
    public e h;
    public x i;
    public l j;
    public List k;
    public RecyclerView l;
    public e m;
    public g n;
    public u$b o;
    public PublishSubject p;
    public a q;
    public a r;
    public c$a s;
    public HashMap t;

    public void LiveAnchorOnSaleFragment$c(){
       super();
       this.k = new ArrayList();
       this.p = PublishSubject.g();
       this.q = new a();
       this.r = new a();
       this.t = new HashMap();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorOnSaleFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c3.a(this.b, b.a);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorOnSaleFragment$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorOnSaleFragment$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAnchorOnSaleFragment$c.class, new q());
       }else {
          obj.put(LiveAnchorOnSaleFragment$c.class, null);
       }
       return obj;
    }
}
