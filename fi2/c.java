package fi2.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import dx1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import dx1.b;
import nsd.u;
import java.util.Objects;
import java.lang.Boolean;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;
import uo3.d$a;
import fi2.b;
import hi2.c;
import hi2.d;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import com.kuaishou.live.redpacket.feature.common.popup.skin.config.resource.DynamicResource;
import zo3.d;
import hi2.g;
import uo3.l;
import ia1.j;
import java.lang.StringBuilder;
import dx1.a;

public final class c	// class@002964
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final b a(LiveConditionRedPacketInfo p0){
       LiveConditionRedPacketInfo a;
       String this;
       c uoc2;
       String str3;
       b uob2;
       String str4;
       LiveConditionRedPacketInfo liveConditio;
       String str5;
       boolean b1;
       Object[] objArray;
       String obj = p0;
       c uoc = c.class;
       c uoc1 = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj1 = PatchProxy.applyOneRefs(obj, this, uoc1, "7");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (obj != null) {
          a = obj.A;
          if (a != null) {
             a.o(a, "it");
             b uob = new b(a);
             boolean b = uob.g();
             b uob1 = new b(obj.c, obj.b, 0, 4, null);
             c a1 = c.a;
             LiveConditionRedPacketInfo a2 = obj.A;
             Objects.requireNonNull(a1);
             String str = "isNewStyle";
             String str1 = "leeeType";
             String str2 = "leeeId";
             obj1 = "redPacketData";
             if (PatchProxy.isSupport(uoc)) {
                this = str2;
                uoc2 = uoc;
                str3 = str1;
                obj = str;
                uob2 = uob;
                str4 = 3;
                liveConditio = a2;
                if (PatchProxy.applyVoidThreeRefs(v14, Boolean.valueOf(b), a2, a1, c.class, "2")) {
                label_00c5 :
                   if (b) {
                      c a3 = c.a;
                      Objects.requireNonNull(a3);
                      b uob3 = PatchProxy.applyOneRefs(v14, a3, uoc1, "1");
                      if (uob3 != patchProxyRe) {
                      }else {
                         uob3 = new b(v14);
                      }
                      a3 = c.class;
                      b uob4 = uob2;
                      ArrayList obj2 = PatchProxy.applyOneRefs(uob3, uob4, b.class, "8");
                      if (obj2 != patchProxyRe) {
                         str5 = obj;
                         b1 = obj2.booleanValue();
                      }else if(uob4.g()){
                         obj2 = PatchProxy.apply(null, uob4, d.class, "15");
                         if (obj2 != patchProxyRe) {
                         }else {
                            obj2 = new ArrayList();
                            int i = 0;
                            CDNUrl[] uCDNUrlArray3 = new CDNUrl[i];
                            Object[] objArray1 = uob4.a.toArray(uCDNUrlArray3);
                            Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                            d.a(obj2, objArray1, DynamicResource.TOP_COVER);
                            CDNUrl[] uCDNUrlArray4 = new CDNUrl[i];
                            objArray1 = uob4.b.toArray(uCDNUrlArray4);
                            Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                            d.a(obj2, objArray1, DynamicResource.BOTTOM_COVER);
                            uCDNUrlArray4 = new CDNUrl[i];
                            objArray1 = uob4.c.toArray(uCDNUrlArray4);
                            Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                            d.a(obj2, objArray1, DynamicResource.BACKGROUND);
                            uCDNUrlArray4 = new CDNUrl[i];
                            objArray1 = uob4.d.toArray(uCDNUrlArray4);
                            Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                            d.a(obj2, objArray1, DynamicResource.TOP_AMBIENT);
                            uCDNUrlArray4 = new CDNUrl[i];
                            objArray1 = uob4.e.toArray(uCDNUrlArray4);
                            Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                            d.a(obj2, objArray1, DynamicResource.BOTTOM_AMBIENT);
                         }
                         uob = uob4.f;
                         if (uob != null) {
                            ArrayList uArrayList = PatchProxy.apply(null, uob, a3, "9");
                            if (uArrayList != patchProxyRe) {
                               str5 = obj;
                            }else {
                               uArrayList = new ArrayList();
                               str5 = obj;
                               CDNUrl[] uCDNUrlArray2 = new CDNUrl[0];
                               objArray = uob.a().toArray(uCDNUrlArray2);
                               Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                               d.a(uArrayList, objArray, DynamicResource.CONDITION_JOIN_BUTTON_BG);
                            }
                            if (uArrayList != null) {
                               obj2.addAll(uArrayList);
                            }
                         }else {
                            str5 = obj;
                         }
                         b g = uob4.g;
                         if (g != null) {
                            ArrayList uArrayList1 = PatchProxy.apply(null, g, g.class, "2");
                            if (uArrayList1 != patchProxyRe) {
                            }else {
                               uArrayList1 = new ArrayList();
                               CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
                               objArray = g.a.toArray(uCDNUrlArray1);
                               Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                               d.a(uArrayList1, objArray, DynamicResource.INNER_PAGE);
                            }
                            if (uArrayList1 != null) {
                               obj2.addAll(uArrayList1);
                            }
                         }
                         g = uob4.i;
                         if (g != null) {
                            ArrayList uArrayList2 = PatchProxy.apply(null, g, a3, "8");
                            if (uArrayList2 != patchProxyRe) {
                            }else {
                               uArrayList2 = new ArrayList();
                               CDNUrl[] uCDNUrlArray = new CDNUrl[0];
                               objArray = g.a().toArray(uCDNUrlArray);
                               Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                               d.a(uArrayList2, objArray, DynamicResource.CONDITION_SEND_GIFT_BUTTON_BG);
                            }
                            if (uArrayList2 != null) {
                               obj2.addAll(uArrayList2);
                            }
                         }
                         b1 = j.d().f(obj2, uob3);
                      }else {
                         str5 = obj;
                         b1 = false;
                      }
                      LiveConditionRedPacketInfo liveConditio1 = p0;
                      String str6 = str5;
                      liveConditio1.z = b1;
                      Objects.requireNonNull(a1);
                      if (!PatchProxy.isSupport(uoc2) || !PatchProxy.applyVoidTwoRefs(v14, Boolean.valueOf(b1), a1, uoc2, "5")) {
                         a.p(v14, obj1);
                         i3 oi3 = i3.f();
                         oi3.d(this, v14.a());
                         oi3.c(str3, Integer.valueOf(a1.c(v14.b())));
                         oi3.c(str6, Integer.valueOf(v14.c()));
                         oi3.c("result", Integer.valueOf(b1));
                         u1.R("LEEE_SKIN_APPLY_ACTION", oi3.e(), 3);
                      }
                      a.a("条件红包，信令带皮肤信息，且完整性校验通过mEnableApplySkin:"+liveConditio1.z);
                      return uob4;
                   }else {
                      a.a("条件红包，信令带皮肤信息，但是完整性校验没有过");
                   }
                }
             }else {
                uoc2 = uoc;
                uob2 = uob;
                this = str2;
                str3 = str1;
                obj = str;
                liveConditio = a2;
                str4 = 3;
             }
             a.p(v14, obj1);
             String str7 = (liveConditio != null)? Base64.encodeToString(MessageNano.toByteArray(liveConditio), 0): "";
             i3 oi31 = i3.f();
             oi31.d(this, v14.a());
             oi31.c(str3, Integer.valueOf(a1.c(v14.b())));
             oi31.c(obj, Integer.valueOf(v14.c()));
             oi31.c("skinValid", Integer.valueOf(b));
             oi31.d("skinTheme", str7);
             str7 = oi31.e();
             u1.R("LEEE_SKIN_CHECK_VALID", str7, str4);
             goto label_00c5 ;
          }
       }
       a.a("条件红包，信令没有带皮肤信息");
       return null;
    }
}
