package be1.k;
import java.lang.Object;
import be1.k$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import lnc.a1;

public class k	// class@000360
{
    public static k$a a;

    public void k(){
       super();
    }
    public static k$a a(){
       Object obj = PatchProxy.apply(null, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.a == null) {
          k.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), k$a.class);
       }
       return k.a;
    }
    public static void b(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, k.class, "2")) {
          return;
       }
       if (p1 instanceof KwaiException) {
          if (!p0.equals("n/live/interactiveChat/ready")) {
             if (p0.equals("n/live/interactiveChat/accept")) {
                switch (p1.mErrorCode){
                    case 0x1408c:
                    case 0x14090:
                    case 0x14091:
                      i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101f09), true);
                      break;
                    case 0x1408d:
                    case 0x1408f:
                      i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1016d9), true);
                      break;
                    case 0x14092:
                      i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1016da), true);
                      break;
                    default:
                   label_0032 :
                      if (!TextUtils.isEmpty(p1.mErrorMessage)) {
                         i.f(R.style.arg_RES_7f11066a, p1.mErrorMessage, true);
                      }
                }
             }
          }else {
             switch (p1.mErrorCode){
                 case 0x1408c:
                   i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101f09), true);
                   break;
                 case 0x1408d:
                 case 0x1408f:
                   i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1016d9), true);
                   break;
                 default:
                label_0060 :
                   if (!TextUtils.isEmpty(p1.mErrorMessage)) {
                      i.f(R.style.arg_RES_7f11066a, p1.mErrorMessage, true);
                   }
             }
          }
       }
       return;
    }
}
