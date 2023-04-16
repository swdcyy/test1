package af4.h$a;
import java.lang.Runnable;
import af4.h;
import java.lang.String;
import android.content.Context;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import android.net.Uri;
import java.util.Map;
import ot3.h0;
import dm4.b;
import com.kuaishou.merchant.preload.net.MethodRequest;
import qa4.f;
import ekd.x0;
import java.lang.StringBuilder;
import java.util.concurrent.ConcurrentHashMap;

public class h$a implements Runnable	// class@0000b8
{
    public final String b;
    public final Context c;
    public final LiveMerchantBaseContext d;
    public final h e;

    public void h$a(h p0,String p1,Context p2,LiveMerchantBaseContext p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$a.class, "1")) {
          return;
       }
       h$a te = this.e;
       h$a tb = this.b;
       h$a tc = this.c;
       h$a td = this.d;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidThreeRefs(tb, tc, td, te, h.class, "2")) {
          HashMap obj = PatchProxy.applyOneRefs(tb, te, h.class, "4");
          String str = "kwai://merchant/halfselfdetail";
          String str1 = "kwai://merchant/selfdetail";
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!TextUtils.x(tb) && (tb.startsWith(str1) || tb.startsWith(str))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             obj = new HashMap();
             obj.putAll(h0.a(Uri.parse(te.Ee(tb, td))));
             obj.put("cashierParam", b.a(tc));
             MethodRequest methodReques = new MethodRequest(obj, objArray);
             f a = f.a;
             Uri obj1 = PatchProxy.applyOneRefs(tb, te, h.class, "5");
             if (obj1 != PatchProxyResult.class) {
             }else if(TextUtils.x(tb)){
                obj1 = x0.f(tb);
                if (obj1 != null) {
                   String str2 = obj1.getScheme()+"://"+obj1.getHost()+obj1.getPath();
                   if (!TextUtils.x(te.b.get(str2))) {
                      str2 = te.b.get(str2);
                   }else {
                      Objects.requireNonNull(str2);
                      if (!str2.equals(str1)) {
                         if (str2.equals(str)) {
                            te.b.put(str2, "MERCHANT_ITEMSELF_DETAIL_HALF");
                            str2 = "MERCHANT_ITEMSELF_DETAIL_HALF";
                         }
                      }else {
                         te.b.put(str2, "MERCHANT_ITEMSELF_DETAIL");
                         str2 = "MERCHANT_ITEMSELF_DETAIL";
                      }
                   }
                }
             }
             obj1 = "UNKNOWN";
             a.a(obj1, methodReques);
          }
       }
       return;
    }
}
