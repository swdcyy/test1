package kz8.d;
import agc.e;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.util.Map;
import agc.d;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.q;
import yx.j0;
import f4a.r;
import com.yxcorp.utility.TextUtils;
import agc.a;

public class d implements e	// class@002c59
{

    public void d(){
       super();
    }
    public String a(){
       return "merchant";
    }
    public boolean b(Uri p0,Map p1){
       return d.b(this, p0, p1);
    }
    public String c(){
       return "kwai";
    }
    public void d(Activity p0,Map p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "2")) {
          return;
       }
       if (q.h(p1)) {
          Object[] objArray = new Object[0];
          j0.c("VideoMerchantPurchasePanel", "merchantPurchasePanel", objArray);
          return;
       }else {
          r.a().c(true);
          String str = TextUtils.e("kwai://merchant/purchasepanel", p1);
          Object[] objArray1 = new Object[0];
          j0.f("VideoMerchantPurchasePanel", str, objArray1);
          a.c(p0, str, p2);
          return;
       }
    }
    public String getPath(){
       return "/purchasepanel";
    }
}
