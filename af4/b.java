package af4.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.net.URLEncoder;
import java.lang.StringBuilder;
import com.kuaishou.merchant.router.b;

public class b	// class@0000b2
{

    public void b(){
       super();
    }
    public static void a(Activity p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "1")) {
          return;
       }
       if (!TextUtils.x(p1) && !TextUtils.x(p2)) {
          try{
             p2 = URLEncoder.encode(p2, "UTF-8");
          }catch(java.lang.Exception e0){
             p2 = "";
          }
          b.k(p0, p1+"&"+"promotionInfo"+"="+p2);
       }
       return;
    }
}
