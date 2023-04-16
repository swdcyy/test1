package com.kuaishou.merchant.transaction.purchase.presenter.l0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.l0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import vm4.e;
import com.kuaishou.merchant.transaction.purchase.model.PoiInfo;

public class l0$a implements l0$b	// class@000989
{
    public final l0 a;

    public void l0$a(l0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, l0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.i(this.a.q, "poiInfo");
    }
    public String getPoiId(){
       PoiInfo id;
       l0 r = this.a.r;
       if (r != null) {
          id = r.id;
          if (id != null) {
          label_000d :
             return id;
          }
       }
       id = "";
       goto label_000d ;
    }
}
