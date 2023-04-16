package al4.e;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.api.core.model.MerchantEventLoggerParam;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.e0;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;

public class e	// class@000097
{

    public void e(){
       super();
    }
    public static ClientEvent$UrlPackage a(String p0,ClientEvent$UrlPackage p1){
       ClientEvent$UrlPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.k();
       if (obj == null) {
          return obj;
       }
       if (p1 == null) {
          return p1;
       }
       if (!TextUtils.x(p1.page2) && !TextUtils.n("UNKNOWN2", p1.page2)) {
          obj.page2 = p1.page2;
          if (!TextUtils.x(p1.params)) {
             obj.params = p1.params;
          }
          return obj;
       }else if(!TextUtils.x(p0)){
          obj.page2 = p0;
       }
       return obj;
    }
    public static void b(MerchantEventLoggerParam p0,ClientEvent$UrlPackage p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, e.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       MerchantEventLoggerParam mEventType = p0.mEventType;
       if (mEventType != 1) {
          if (mEventType != 2) {
             if (mEventType == 3) {
                mEventType = p0.mAction;
                MerchantEventLoggerParam mElementPara = p0.mElementParams;
                p0 = p0.mPage2;
                if (!PatchProxy.applyVoidFourRefs(mEventType, mElementPara, p0, p1, null, e.class, "6") && !TextUtils.x(mEventType)) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = mEventType;
                   if (!TextUtils.x(mElementPara)) {
                      uElementPack.params = mElementPara;
                   }
                   h$b uob = h$b.e(7, mEventType);
                   uob.k(uElementPack);
                   uob.h(new ClientContent$ContentPackage());
                   uob.u(e.a(p0, p1));
                   u1.p0("", obj, uob);
                }
             }
          }else {
             e.c(p0.mAction, p0.mElementParams, p0.mPage2, p1);
          }
       }else {
          e.e(p0.mAction, p0.mElementParams, p0.mShowEventType, p0.mPage2, p1);
       }
       return;
    }
    public static void c(String p0,String p1,String p2,ClientEvent$UrlPackage p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, e.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       if (!TextUtils.x(p1)) {
          uElementPack.params = p1;
       }
       u1.A(e.a(p2, p3), "", 1, uElementPack, new ClientContent$ContentPackage());
       return;
    }
    public static void d(int p0,String p1,ClientEvent$UrlPackage p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, e.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "QUERY_RESULT";
       i3 oi3 = i3.f();
       oi3.c("result_status", Integer.valueOf(p0));
       if (!TextUtils.x(p1)) {
          oi3.d("order_id", p1);
       }
       uElementPack.params = oi3.e();
       h$b uob = h$b.e(7, "QUERY_RESULT");
       uob.k(uElementPack);
       uob.h(new ClientContent$ContentPackage());
       uob.u(e.a("", p2));
       u1.p0("", null, uob);
       return;
    }
    public static void e(String p0,String p1,int p2,String p3,ClientEvent$UrlPackage p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoe, "4")) {
             return;
          }
       }
       if (TextUtils.x(p0)) {
          return;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = p0;
          if (!TextUtils.x(p1)) {
             uElementPack.params = p1;
          }
          u1.y0(e.a(p3, p4), p2, uElementPack, new ClientContent$ContentPackage());
          return;
       }
    }
}
