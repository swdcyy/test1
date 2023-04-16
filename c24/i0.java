package c24.i0;
import cb4.e;
import c24.i0$a;
import nsd.u;
import ls3.b;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.net.Uri;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import lnc.o5;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$IntRef;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import trd.t0;
import qrd.l1;
import hu4.h;
import hu4.j;
import c24.l0;
import hu4.f;
import java.lang.Long;
import ms3.c;
import c24.k0;
import com.kuaishou.merchant.api.live.service.pendant.model.PendantArea;
import ekd.x0;

public final class i0 implements e	// class@00047f
{
    public final b a;
    public static final i0$a b;

    static {
       i0.b = new i0$a(null);
    }
    public void i0(b p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Object obj3;
       i0 a;
       Object obj = this;
       Map obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i0 oi0 = i0.class;
       Uri obj2 = PatchProxy.applyOneRefs(obj1, obj, oi0, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       if (obj1 != null) {
          obj2 = p0.d();
          MerchantCommonLogBiz rOUTER = MerchantCommonLogBiz.ROUTER;
          String str = null;
          String str1 = (obj2 != null)? obj2.toString(): str;
          String str2 = "LivePendantActionHandler";
          a.t(rOUTER, str2, "handler pendant action url", "url", str1);
          str1 = "action";
          String str3 = obj.d(obj2, str1);
          String str4 = "materialId";
          String str5 = obj.d(obj2, str4);
          int i = str3.hashCode();
          if (i != -907680051) {
             if (i == 0x11b189e9 && str3.equals("showBubble")) {
                if (!PatchProxy.applyVoidOneRefs(obj1, obj, oi0, "2")) {
                   obj2 = p0.d();
                   str4 = obj.d(obj2, str4);
                   long l = o5.c(obj.d(obj2, "duration"));
                   Ref$ObjectRef objectRef = new Ref$ObjectRef();
                   objectRef.element = "";
                   Ref$IntRef intRef = new Ref$IntRef();
                   int i1 = 0;
                   intRef.element = i1;
                   Ref$IntRef intRef1 = new Ref$IntRef();
                   intRef1.element = i1;
                   RouterConfig routerConfig = p0.c();
                   if (routerConfig != null) {
                      Map map = routerConfig.c();
                      if (map != null) {
                         obj3 = map.get("renderUrl");
                         if (!obj3 instanceof String) {
                            obj3 = str;
                         }
                         objectRef.element = obj3;
                         obj3 = map.get("bubbleInfo");
                         Object obj4 = map.get("width");
                         if (!obj4 instanceof String) {
                            obj4 = str;
                         }
                         int i2 = (obj4 != null)? Integer.parseInt(obj4): 0;
                         intRef.element = i2;
                         Object obj5 = map.get("height");
                         if (obj5 instanceof String) {
                            str = obj5;
                         }
                         if (str != null) {
                            i1 = Integer.parseInt(str);
                         }
                         intRef1.element = i1;
                         str = obj3;
                      }
                   }
                   if (!TextUtils.x(objectRef.element) && str != null) {
                      Ref$ObjectRef element = objectRef.element;
                      a.m(element);
                      obj1 = t0.J0(p0.c().c());
                      obj1.put("forceShareEngine", Boolean.TRUE);
                      h oh = j.a(p0.a(), element, obj1);
                      if (oh != null) {
                         l0 ol0 = new l0(oh, this, str4, l, intRef, intRef1, objectRef);
                         oh.k(obj3);
                      }
                   }else {
                      String str6 = obj.d(obj2, "content");
                      String str7 = obj.d(obj2, "iconUrl");
                      a.u(rOUTER, "LivePendantActionHandler", "handler show pendant bubble", "pendantId", str4, "content", str6);
                      a = obj.a;
                      if (PatchProxy.isSupport(oi0)) {
                         k0 ok0 = PatchProxy.applyFourRefs(str4, str6, str7, Long.valueOf(l), this, i0.class, "5");
                         if (ok0 != patchProxyRe) {
                         label_0166 :
                            a.a(ok0, PendantArea.AREA_RIGHT);
                         }
                      }
                      k0 ok01 = new k0(str6, l, str4, str7);
                      goto label_0166 ;
                   }
                }
             }
          }else if(str3.equals("scroll")){
             obj.a.e(str5, PendantArea.AREA_RIGHT);
             a.t(rOUTER, str2, "scroll to pendant", "pendantId", str5);
          }
          a.t(rOUTER, str2, "unknown action", str1, str3);
       }
    label_0188 :
       return true;
    }
    public final String d(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return x0.b(p0, p1, "");
    }
    public String getName(){
       return d.b(this);
    }
}
